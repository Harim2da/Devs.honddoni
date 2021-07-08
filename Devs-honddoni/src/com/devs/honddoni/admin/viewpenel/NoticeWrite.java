package com.devs.honddoni.admin.viewpenel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.devs.honddoni.admin.controller.NoticeController;
import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.common.font.FontManager;
import com.devs.honddoni.common.mainframe.MainFrame;
import com.devs.honddoni.common.mainframe.PopupFrame;

/* 공지사항 글쓰기 창 */
public class NoticeWrite extends JPanel{
	
	private MainFrame frame;
	private NoticeWrite noticeWrite;
	
	private AdminList adminList; //newPanel로 쓸 것
	
	private NoticeController noticeController = new NoticeController();
	
	FontManager font = new FontManager();
	
	public NoticeWrite(MainFrame frame) {
		
		this.frame = frame;
		this.noticeWrite = this;		
		
		/* 제일 기본 패널 */
		this.setBounds(0, 0, 500, 870);
		this.setLayout(null);
		this.setBackground(Color.WHITE);
		frame.add(this);

		/* 혼또니 로고버튼 */
		JButton honddoniBtn = new JButton("");
		honddoniBtn.setBounds(305, 29, 173, 71);
		honddoniBtn.setIcon(new ImageIcon("image/admin/HondoniWrite.png"));
		honddoniBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.remove(noticeWrite);
				noticeWrite.setVisible(false);
				adminList = new AdminList(frame);
				frame.repaint();
				frame.revalidate();
				
			}
		});
		
		/* 공지겸 내용 라벨 */
		JLabel writeLb = new JLabel();
		writeLb.setBounds(35, 115, 433, 652);
		writeLb.setBackground(null);
		writeLb.setIcon(new ImageIcon("image/admin/noticeWrite_area.png"));		
		
		/* 제목텍필, 내용텍필 */
		JTextField titleTf = new JTextField();
		titleTf.setBounds(70, 7, 335, 26);
		titleTf.setOpaque(false);			//배경투명
		titleTf.setFont(font.customFont12);		
		JTextArea contentTa = new JTextArea();
		contentTa.setBounds(20, 116, 396, 515);
		contentTa.setOpaque(false);
		contentTa.setLineWrap(true); 
		contentTa.setFont(font.customFont12);
				
		/* 작성완료 버튼 */
		JButton completeBtn = new JButton();
		completeBtn.setBounds(130, 789, 245, 42);
		completeBtn.setIcon(new ImageIcon("image/admin/noticeWrite_complete_btn.png"));
		completeBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//저장할 제목, 내용을 DTO로 뭉친다
				PostDTO postDTO = new PostDTO();
				postDTO.setPostName(titleTf.getText());
				postDTO.setPostContents(contentTa.getText());
				
				//컨트롤러로 작성내용 넘김
				int result = noticeController.writeNoticeBoardPost(postDTO);
				
				//작성완료 팝업
				if(result > 0) {
					PopupFrame.popup("image/popup/noticeWriteSuccess.png");
					
					frame.remove(noticeWrite);
					noticeWrite.setVisible(false);
					adminList = new AdminList(frame);
					frame.repaint();
					frame.revalidate();
					
				} else {
					PopupFrame.popup("image/popup/writingFail.png");
				}
				
			}
		});
		
		/* 컴포넌트 붙이기 */
		noticeWrite.add(honddoniBtn);
		noticeWrite.add(completeBtn);		
		writeLb.add(titleTf);
		writeLb.add(contentTa);		
		noticeWrite.add(writeLb);
		
		frame.repaint();
		frame.revalidate();
	}

}
