package com.devs.honddoni.post.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CommentMain extends JFrame {

	private JPanel upPanel; 		//상단패널
	private JPanel downPanel;		//하단패널
	private JButton sidebarBtn;		//사이드바버튼
	private JButton logoBtn;		//로고버튼
	private JButton commentWriteBtn; //댓글 작성 버튼
	private JLabel commentLongbarLabel; //페이지를 나타낼때 아래 깔래는 바
	private JButton backBtn;         //뒤로 가기
	
	/* 프레임에서 패널을 더해주기 위한 getter */
	public JPanel getUpPanel() {
		return upPanel;
	}
	public JPanel getDownPanel() {
		return downPanel;
	}
	public JButton getSidebarBtn() {
		return sidebarBtn;
	}
	public JButton getLogoBtn() {
		return logoBtn;
	}
	public JButton getCommentWriteBtn() {
		return commentWriteBtn;
	}
	public JLabel getCommentLongbarLabel() {
		return commentLongbarLabel;
	}
	public JButton getBackBtn() {
		return backBtn;
	}
	/* 프레임을 제외한 나머지를 합친 것 */
	public void collect() {
		
		upPanel();
		downPanel();
		sidebarBtn();
		logoBtn();
		commentWriteBtn();
		commentLongbarLabel();
		backBtn();
		upPanel.add(sidebarBtn);
		upPanel.add(logoBtn);
		downPanel.add(commentWriteBtn);
		downPanel.add(commentLongbarLabel);
		downPanel.add(backBtn);
		
	}
	/* 상단 패널 */
	public void upPanel() {
		
		upPanel = new JPanel();
		upPanel.setBounds(0, 0, 500, 100);
		upPanel.setLayout(null);
		upPanel.setBackground(Color.WHITE);
		
	}
	
	/* 하단 패널 */
	public void downPanel() {
		
		downPanel = new JPanel();
		downPanel.setBounds(0, 100, 500, 770);
		downPanel.setLayout(null);
		downPanel.setBackground(Color.WHITE);
		
	}
	
	/* 사이드바 3줄 버튼 */
	public void sidebarBtn() {
		
		sidebarBtn = new JButton("");
		sidebarBtn.setIcon(new ImageIcon("image/common/Group 1014.png"));
		sidebarBtn.setContentAreaFilled(false);
		sidebarBtn.setBorderPainted(false);
		sidebarBtn.setBounds(35, 33, 34, 20);
		sidebarBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("사이드바 호출");
				/* 사이드바 나타남 */
				
			}
		});
	}
	
	/* 로고 버튼*/
	public void logoBtn() {
		
		logoBtn = new JButton("");
		logoBtn.setIcon(new ImageIcon("image/post/logoButton.png"));
		logoBtn.setContentAreaFilled(false);
		logoBtn.setBorderPainted(false);
		logoBtn.setBounds(304, 28, 173, 71);
		logoBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("메인페이지 호출");
				/* 메인페이지로 이동 */
				
			}
		});
		
		
	}
	
	/* 댓글 작성 버튼 */
	public void commentWriteBtn() {
		
		commentWriteBtn = new JButton("");
		commentWriteBtn.setIcon(new ImageIcon("image/post/commentWriteButton.png"));
		commentWriteBtn.setContentAreaFilled(false);
		commentWriteBtn.setBorderPainted(false);
		commentWriteBtn.setBounds(35, 17, 72, 22);
		commentWriteBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("댓글 작성란 호출");
				/* 댓글 작성란 호출 */
			}
		});
		
	}
	
	public void commentLongbarLabel() {
		
		commentLongbarLabel = new JLabel("");
		commentLongbarLabel.setLayout(null);
		commentLongbarLabel.setIcon(new ImageIcon("image/post/nextPageButton.png"));
		commentLongbarLabel.setBounds(182, 17, 137, 22);

	}
	
	public void backBtn() {
		
		backBtn = new JButton("");
		backBtn.setIcon(new ImageIcon("image/post/backButton.png"));
		backBtn.setContentAreaFilled(false);
		backBtn.setBorderPainted(false);
		backBtn.setBounds(444, 17, 22, 22);
		backBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("게시글 조회 호출");
				/* 게시글 조회 호출 */
			}
		});
	}
	
}
