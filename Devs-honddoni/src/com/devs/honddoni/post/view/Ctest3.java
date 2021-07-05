package com.devs.honddoni.post.view;

import javax.swing.JFrame;

public class Ctest3 {

	public static JFrame frame2 = new JFrame();
	
	public static void main(String[] args) {
		
		frame2.setBounds(100, 100, 516, 909);
		frame2.setLayout(null);
		
		/*-----------------전달할 패널------------------*/
		SelectAllHonPost2 sh = new SelectAllHonPost2();
//		frame2.add(sh.getUpPanel());
		frame2.add(sh.getDownPanel());
		/*-------------------------------------------*/

		frame2.setVisible(true);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
}
