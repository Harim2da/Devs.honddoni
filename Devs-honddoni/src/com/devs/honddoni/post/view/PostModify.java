package com.devs.honddoni.post.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PostModify extends JFrame{
	/* 게시글 세부 조회
	 * 리스트에서 클릭 시 */
	
	private JFrame mainframe = new JFrame(); 
	private JPanel bottomPanel = new JPanel();
	private JLabel postLabel;
	private JLabel pagebarLabel;
	
	public PostModify() {
		this.setBounds(100, 100, 516, 909);
		this.setLayout(null);

		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.white);	
		this.add(bottomPanel);
		
		addComponents();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	private void addComponents() {
		
		postLabel = new JLabel();   // 하단 패널 위 게시글 라벨
		postLabel.setBackground(Color.white);
		postLabel.setLayout(null);
		postLabel.setBounds(35, 0, 500, 724); 
		postLabel.setIcon(new ImageIcon("image/post/detailpost.png"));
		bottomPanel.add(postLabel);
			
//		pagebarLabel = new JLabel("");		//페이지 표기 바
//		pagebarLabel.setLayout(null);
//		pagebarLabel.setIcon(new ImageIcon("image/post/nextPageButton.png"));
//		pagebarLabel.setBounds(182, 112, 137, 22);
//		bottomPanel.add(pagebarLabel);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
