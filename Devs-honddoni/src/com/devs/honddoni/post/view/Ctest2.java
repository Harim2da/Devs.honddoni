package com.devs.honddoni.post.view;

import javax.swing.JFrame;

public class Ctest2 {

	public static JFrame frame1 = new JFrame();
	
	public static void main(String[] args) {
		
		frame1.setBounds(100, 100, 516, 909);
		frame1.setLayout(null);
		
		/*-----------------전달할 패널------------------*/
		SelectedComment cm = new SelectedComment();
		frame1.add(cm.getUpPanel());
		frame1.add(cm.getDownPanel());
		/*-------------------------------------------*/

		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
}
