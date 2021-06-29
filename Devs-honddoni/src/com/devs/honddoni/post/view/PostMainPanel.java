package com.devs.honddoni.post.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PostMainPanel extends JPanel{

	private JLabel bottomLabel;

	public PostMainPanel() {
		bottomInit();
		createPostComponents();
		addPostComponents();

	}

	private void bottomInit() {
		this.setBounds(0, 100, 500, 770);
		this.setLayout(null);
		this.setBackground(Color.WHITE);

		bottomLabel = new JLabel("");
		bottomLabel.setBackground(Color.WHITE);
		bottomLabel.setLayout(null);
		bottomLabel.setBounds(35, 14, 431, 648);            
		bottomLabel.setIcon(new ImageIcon(PostView.class.getResource("/post/postbtmpanel.png")));
	}

	private void createPostComponents() {

	}
	
	private void addPostComponents() {
		
	}
	
	
	
	
	
	
	
	
}
