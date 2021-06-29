package com.devs.honddoni.post.view;

import javax.swing.JFrame;


public class PostBottomFrame extends JFrame{

	public PostBottomFrame() {
		this.setBounds(100, 100, 516, 909);
		this.setLayout(null);
		
		PostFrameManager.initPanel(this, new PostMainPanel());
	}
}
