package com.devs.honddoni.admin.viewpenel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.devs.honddoni.common.dto.PostDTO;

/* 공지사항 내용 확인 패널 */
public class NoticeContentView extends JPanel{
	
	JFrame frame;
	NoticeContentView noticeContentView;
	
	private PostDTO postDTO;
	
	/* 공지내용 확인 겸, 수정버튼 */
	public NoticeContentView(PostDTO postDTO) {
		
		this.frame = FrameManagerYs.getFrame();
		this.noticeContentView = this;
		this.postDTO = postDTO;
		
		
		/* 제일 기본 패널 */
		noticeContentView.setBounds(0, 0, 500, 870);
		noticeContentView.setLayout(null);
		noticeContentView.setBackground(Color.yellow);

		/* 혼또니 로고버튼 */
		JButton honddoniBtn = new JButton("");
		honddoniBtn.setBounds(305, 29, 173, 71);
		honddoniBtn.setIcon(new ImageIcon("image/admin/HondoniWrite.png"));
		honddoniBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//관리자메인 페이지로 이동
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
		JLabel titleLb = new JLabel();
		titleLb.setBounds(107, 121, 335, 26);
		titleLb.setText(postDTO.getPostName());
		JLabel contentLb = new JLabel();
		contentLb.setBounds(55, 230, 396, 515);
		contentLb.setText(postDTO.getPostContents());
		
		//수정버튼으로 고쳐야 할듯
		/* 작성완료 버튼 */
		JButton modifyBtn = new JButton("공지수정");
		modifyBtn.setBounds(130, 789, 245, 42);
		modifyBtn.setIcon(new ImageIcon(""));
		modifyBtn.addActionListener(new ActionListener() {	
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//NoticeWrite으로 넘어가야
				
			}
		});				
		
		
		/* 컴포넌트 붙이기 */
		this.add(honddoniBtn);
		this.add(searchLb);
		this.add(titleLb);
		this.add(contentLb);		
		this.add(modifyBtn);	
		
		
	}
	
	

}
