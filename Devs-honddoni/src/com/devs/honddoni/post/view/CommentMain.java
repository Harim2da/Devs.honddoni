package com.devs.honddoni.post.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CommentMain extends JFrame {

	private JFrame jf = new JFrame();

	public CommentMain() {
		
		jf.setBounds(100, 100, 516, 909);
		jf.setLayout(null);
		jf.setResizable(false);
		
		JButton sidebarBtn = new JButton("");
		sidebarBtn.setIcon(new ImageIcon(PostView.class.getResource("image/common/Group 1014.png")));
		sidebarBtn.setContentAreaFilled(false);
		sidebarBtn.setBorderPainted(false);
		sidebarBtn.setBounds(35, 33, 34, 20);
		
		JPanel upPanel = new JPanel();
		upPanel = new JPanel();
		upPanel.setBounds(0, 0, 500, 100);
		upPanel.setLayout(null);
		upPanel.setBackground(Color.WHITE);
	
		upPanel.add(sidebarBtn);
		jf.add(upPanel);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
