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
public class NoticeModify extends JPanel{
	
	private MainFrame frame;
	private NoticeModify noticeModify;
	
	private AdminList adminList; //newPanel로 쓸 것
	
	private PostDTO postDTO;
	private NoticeController noticeController = new NoticeController();
	
	FontManager font = new FontManager();
	
	public NoticeModify(MainFrame frame, PostDTO postinfoDTO) {
		
		this.frame = frame;
		this.noticeModify = this;
		this.postDTO = postinfoDTO;
		
		
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
				System.out.println("관리자메인 페이지로 나감");
				noticeModify.setVisible(false);
				adminList = new AdminList(frame);
//				FrameManagerYs.changePanel(notice, new 관리자메인());
//				frame.remove(notice);
//				frame.add(adminList);
//				frame.repaint();
//				frame.revalidate();
				
			}
		});
		
		/* 공지겸 내용 라벨 */
		JLabel searchLb = new JLabel();
		searchLb.setBounds(35, 115, 433, 652);
		searchLb.setBackground(null);
		searchLb.setIcon(new ImageIcon("image/admin/noticeWrite_area.png"));		
		
		/* 제목텍필, 내용텍필 */
		JTextField titleTf = new JTextField();
		titleTf.setBounds(70, 7, 335, 26);
		titleTf.setText(postDTO.getPostName());
		JTextArea contentTf = new JTextArea();
		contentTf.setBounds(20, 116, 396, 515);
		contentTf.setText(postDTO.getPostContents());
				
		/* 작성완료 버튼 */
		JButton completeBtn = new JButton();
		completeBtn.setBounds(130, 789, 245, 42);
		completeBtn.setIcon(new ImageIcon("image/admin/noticeWrite_complete_btn.png"));
		completeBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//저장할 제목, 내용
				String getTitle = titleTf.getText();
				String getContent = contentTf.getText();				
				
				//수정할 내용만 DTO로 뭉친다
				postDTO.setPostName(getTitle);
				postDTO.setPostContents(getContent);
				
				//컨트롤러로 수정내용 넘김
				int result = noticeController.modifyNotice(postDTO);				
				
				//작성완료 팝업
				if(result > 0) {
					PopupFrame.popup("image/popup/noticeWriteSuccess.png");
					
					//완료 시, 다시 공지사항게시판으로
					System.out.println("관리자메인 페이지로 나감");
					noticeModify.setVisible(false);
					adminList = new AdminList(frame);
//					frame.remove(NoticeWrite);
//					frame.add(new Notice());
//					frame.repaint();
//					frame.revalidate();
					
				} else {
					PopupFrame.popup("image/popup/writingFail.png");
					
				}
			}
		});
		
		
		
		/* 컴포넌트 붙이기 */		
		noticeModify.add(honddoniBtn);
		noticeModify.add(searchLb);
		noticeModify.add(completeBtn);		
		searchLb.add(contentTf);		
		searchLb.add(titleTf);
		
		
	}
	
	

}
