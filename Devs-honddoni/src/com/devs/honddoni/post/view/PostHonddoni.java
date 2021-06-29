package com.devs.honddoni.post.view;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PostHonddoni extends JFrame{
	
	private JFrame mainFrame;
	private JPanel topPanel;
	private JPanel bottomPanel;

	
	/*프레임 불러오기*/
	public PostHonddoni() {
		this.setBounds(100, 100, 516, 909);
		this.setLayout(null);

		selectPost();
	
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	/*상단 패널 생성*/
	public void topPanel() {
		topPanel = new JPanel();
		topPanel.setBounds(0, 0, 500, 100);
		topPanel.setLayout(null);
		topPanel.setBackground(Color.WHITE);
		this.add(topPanel);
	}
	
	/*하단 패널 생성*/
	public void bottomPanel() {
		bottomPanel = new JPanel();
		bottomPanel.setBounds(0, 0, 500, 870);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.WHITE);
		this.add(bottomPanel);
		
	}
	
	/*게시판 종류 선택*/
	private void selectPost() {
		bottomPanel();
		JButton postTypebtn = new JButton();
		postTypebtn.setIcon(new ImageIcon(PostView.class.getResource("/post/postcategory.png")));
		postTypebtn.setContentAreaFilled(false);
		postTypebtn.setBorderPainted(false);
		postTypebtn.setBounds(43, 120, 56, 30);
		bottomPanel.add(postTypebtn);
	
		postTypebtn.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// 클릭하면 자유게시판으로 전환 (?) 카드 변환처럼
				
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {		
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			
			
		});
	
	
	}
	
}
