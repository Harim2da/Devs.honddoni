package com.devs.honddoni.post.view;

import javax.swing.JFrame;

import com.devs.honddoni.common.mainframe.MainFrame;

public class Ctest2 {

	public static JFrame frame1 = new JFrame();
	
	public static void main(String[] args) {
		
		frame1.setBounds(100, 100, 516, 909);
		frame1.setLayout(null);
		
		SelectedComment cm = new SelectedComment();
//		SelectedComment2 cm2 = new SelectedComment2();
		cm.collect();
		
		frame1.add(cm.getUpPanel());
		frame1.add(cm.getDownPanel());
//		jf.add(cm.getNextPanel());
//		jf.add(cm2.getDownPanel2());
		
		
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
}
