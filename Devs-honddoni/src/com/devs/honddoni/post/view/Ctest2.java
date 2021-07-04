package com.devs.honddoni.post.view;

import javax.swing.JFrame;

public class Ctest2 {

	static JFrame jf = new JFrame();
	
	public static void main(String[] args) {
		
//		JFrame jf = new JFrame();

		
	
		jf.setBounds(100, 100, 516, 909);
		jf.setLayout(null);
		
		SelectedComment cm = new SelectedComment();
//		SelectedComment2 cm2 = new SelectedComment2();
		cm.collect();
		
		jf.add(cm.getUpPanel());
		jf.add(cm.getDownPanel());
//		jf.add(cm.getNextPanel());
//		jf.add(cm2.getDownPanel2());
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
}
