package com.devs.honddoni.post.view;

import javax.swing.JFrame;

public class Ctest {

	public static void main(String[] args) {

		JFrame jf = new JFrame();


		jf.setBounds(100, 100, 516, 909);
		jf.setLayout(null);
		
		WritingComment wc = new WritingComment();
		wc.collect();

		jf.add(wc.getPanel());
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
