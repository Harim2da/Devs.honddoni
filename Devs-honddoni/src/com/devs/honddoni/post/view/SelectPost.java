package com.devs.honddoni.post.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class SelectPost extends JPanel{

	private JButton postTypebtn;
	
	public SelectPost() {
		
		postTypebtn = new JButton();
		postTypebtn.setIcon(new ImageIcon(PostView.class.getResource("/post/postcategory.png")));
		postTypebtn.setContentAreaFilled(false);
		postTypebtn.setBorderPainted(false);
		postTypebtn.setBounds(43, 20, 56, 30);
		
	
		postTypebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 자유게시판으로 전환
				System.out.println("자유게시판 전환");
			}
		});
		
	}
	
	
	
}
