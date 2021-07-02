package com.devs.honddoni.post.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WritingComment {
	
	private JPanel panel;       //패널
	private JLabel commentList; ////댓글리스트의 밑바탕
	
	public JPanel getPanel() {
		return panel;
	}
	
	public void collect() {
		panel();
		panel.add(commentList);
	}
	
	public void panel() {

		panel = new JPanel();
		panel.setBounds(0, 0, 516, 909);
		panel.setLayout(null);
		panel.setBackground(Color.white);
		
	}
	
	public void commentList() {
		
		commentList = new JLabel("");
		commentList.setLayout(null);
		commentList.setIcon(new ImageIcon("image/post/commentWriteListLabelOne.png"));
		commentList.setBounds(35, 200, 431, 61);
		
	}
}
