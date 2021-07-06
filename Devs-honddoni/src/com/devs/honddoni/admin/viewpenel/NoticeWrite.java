package com.devs.honddoni.admin.viewpenel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.devs.honddoni.admin.controller.NoticeController;
import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.common.font.FontManager;
import com.devs.honddoni.common.mainframe.MainFrame;

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
		this.setBackground(Color.yellow);
		frame.add(this);

		/* 혼또니 로고버튼 */
		JButton honddoniBtn = new JButton("");
		honddoniBtn.setBounds(305, 29, 173, 71);
		honddoniBtn.setIcon(new ImageIcon("image/admin/HondoniWrite.png"));
		honddoniBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//관리자메인 페이지로 나감
				System.out.println("관리자메인 페이지로 나감");
				noticeWrite.setVisible(false);
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
		titleTf.setBounds(107, 121, 335, 26);
		JTextField contentTf = new JTextField();
		contentTf.setBounds(55, 230, 396, 515);
				
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
				postDTO.setPostContents(contentTf.getText());
				
				noticeController.writeNoticeBoardPost(postDTO);				
				
				//완료 시, 다시 공지사항게시판으로
				System.out.println("관리자메인 페이지로 나감");
				noticeWrite.setVisible(false);
				adminList = new AdminList(frame);
//				frame.remove(NoticeWrite);
//				frame.add(new Notice());
//				frame.repaint();
//				frame.revalidate();
			}
		});
				
		
		/* 컴포넌트 붙이기 */
		noticeWrite.add(honddoniBtn);
		noticeWrite.add(searchLb);
		noticeWrite.add(titleTf);
		noticeWrite.add(contentTf);		
		noticeWrite.add(completeBtn);		
	}

}
