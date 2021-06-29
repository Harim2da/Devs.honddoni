package com.devs.honddoni.post.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PostMainPanel extends JPanel{

	private JLabel bottomLabel;
	private PostActionCategory actionCategory;
	private PostType postType;

	public PostMainPanel() {
		bottomInit();
		createPostComponents();
		bottomLabel();
		
	}

	private void bottomInit() {
		this.setBounds(0, 100, 500, 770);
		this.setLayout(null);
		this.setBackground(Color.WHITE);

		
	}

	private void createPostComponents() {
//		actionCategory = new PostActionCategory();
//		actionCategory.selectCategoryCombo();
		postType = new PostType();
		
		addPostComponents();
	}
	
	private void addPostComponents() {
//		this.add(actionCategory);
//		System.out.println("실행됨");
		this.add(postType);
	}
	
	
	public void bottomLabel() {
		bottomLabel = new JLabel("");
		bottomLabel.setBackground(Color.WHITE);
		bottomLabel.setLayout(null);
		bottomLabel.setBounds(35, 14, 431, 648);            
		bottomLabel.setIcon(new ImageIcon(PostView.class.getResource("/post/postbtmpanel.png")));
		this.add(bottomLabel);
	}
	
	
	
	
	
	
}
