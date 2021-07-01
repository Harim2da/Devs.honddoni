package com.devs.honddoni.post.view;

import javax.swing.JFrame;

public class CommentView {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();

		
		jf.setBounds(100, 100, 516, 909);
		jf.setLayout(null);
		jf.setResizable(false);
		
		CommentMain cm = new CommentMain();
		cm.collect();
		
		jf.add(cm.getUpPanel());
		jf.add(cm.getDownPanel());
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
