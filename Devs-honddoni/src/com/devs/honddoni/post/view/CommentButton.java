package com.devs.honddoni.post.view;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class CommentButton {

	public void sideBarBtn() {
		JButton sidebarBtn = new JButton("");
		sidebarBtn.setIcon(new ImageIcon(PostView.class.getResource("/post/sidebarButton.png")));
		sidebarBtn.setContentAreaFilled(false);
		sidebarBtn.setBorderPainted(false);
		sidebarBtn.setBounds(35, 37, 42, 20);
		
		
	}
}
