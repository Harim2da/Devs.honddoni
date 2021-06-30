package com.devs.honddoni.post.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CommentUpperPanel extends JFrame {

	CommentButton cbtn = new CommentButton();
	
	public CommentUpperPanel() {
		
		JPanel upPanel = new JPanel();
		upPanel = new JPanel();
		upPanel.setBounds(0, 0, 500, 100);
		upPanel.setLayout(null);
		upPanel.setBackground(Color.WHITE);
		cbtn.sideBarBtn();
		upPanel.add(cbtn);
	}
}
