package com.devs.honddoni.post.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.devs.honddoni.admin.viewpenel.NoticeModify;
import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.common.mainframe.MainFrame;

/* 공지사항 내용 확인 패널 */
public class PostNoticeView extends JPanel{

	private MainFrame frame;
	private PostNoticeView postNoticeView;

	private PostNotice postnotice; //newPanel로 쓴 것

	private PostDTO postDTO;

	/* 공지내용 확인 겸, 수정버튼 */
	public PostNoticeView(MainFrame frame, PostDTO postinfoDTO) {

		this.frame = frame;
		this.postNoticeView = this;
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
				System.out.println("공지사항 게시판으로 나감");

				frame.remove(postNoticeView);
				postNoticeView.setVisible(false);
				postnotice = new PostNotice(frame);
				frame.repaint();
				frame.revalidate();

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

		/* 뒤로가기 버튼 */
		JButton backBtn = new JButton("");
		backBtn.setBounds(130, 789, 245, 42);
		backBtn.setIcon(new ImageIcon("image/post/noticepostbtn.png.png"));
		backBtn.addActionListener(new ActionListener() {	

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("공지사항 게시판으로 나감");

				frame.remove(postNoticeView);
				postNoticeView.setVisible(false);
				postnotice = new PostNotice(frame);
				frame.repaint();
				frame.revalidate();

			}
		});				


		/* 컴포넌트 붙이기 */		
		this.add(backBtn);			
		this.add(honddoniBtn);
		this.add(searchLb);
		searchLb.add(titleLb);
		searchLb.add(contentLb);	

	}



}
