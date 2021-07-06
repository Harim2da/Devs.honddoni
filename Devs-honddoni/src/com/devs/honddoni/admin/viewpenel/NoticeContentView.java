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

import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.common.mainframe.MainFrame;

/* 공지사항 내용 확인 패널 */
public class NoticeContentView extends JPanel{
	
	private MainFrame frame;
	private NoticeContentView noticeContentView;
	
	private AdminList adminList; //newPanel로 쓸 것
	private NoticeModify noticeModify;
	
	private PostDTO postDTO;
	
	/* 공지내용 확인 겸, 수정버튼 */
	public NoticeContentView(MainFrame frame, PostDTO postinfoDTO) {
		
		this.frame = frame;
		this.noticeContentView = this;
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
				noticeContentView.setVisible(false);
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
		
		/* 제목라벨, 내용라벨 DTO에서 내용받아서 설정 */
		JTextField titleLb = new JTextField();
		titleLb.setBounds(70, 7, 335, 26);
		titleLb.setEditable(false);
		titleLb.setText(postDTO.getPostName());
		JTextArea contentLb = new JTextArea();
		contentLb.setBounds(20, 116, 396, 515);
		contentLb.setLineWrap(true);  // 줄바꿈 처리
		contentLb.setEditable(false); //수정 불가
		contentLb.setText(postDTO.getPostContents());
		
		/* 수정완료 버튼 */
		JButton modifyBtn = new JButton("");
		modifyBtn.setBounds(130, 789, 245, 42);
		modifyBtn.setIcon(new ImageIcon("image/admin/noticeboard_5_modify_compleate_btn.png"));
		modifyBtn.addActionListener(new ActionListener() {	
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//NoticeWrite으로 넘어가야
				System.out.println("공지글 수정으로 이동");
				noticeContentView.setVisible(false);
				noticeModify = new NoticeModify(frame, postDTO);
				
			}
		});				
		
		
		/* 컴포넌트 붙이기 */		
		this.add(modifyBtn);			
		this.add(honddoniBtn);
		this.add(searchLb);
		searchLb.add(titleLb);
		searchLb.add(contentLb);	
		
	}
	
	

}
