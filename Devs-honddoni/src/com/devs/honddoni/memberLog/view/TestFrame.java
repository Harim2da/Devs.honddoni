package com.devs.honddoni.memberLog.view;

import javax.swing.JFrame;

public class TestFrame extends JFrame{
	
	FirstView firstView;
	
	public TestFrame() {
		
		this.setBounds(100, 100, 516, 909);
		this.setLayout(null);
		this.setTitle("혼또니(혼자 또 여행왔니?)");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
//		new FirstView(this);
		
		new SearchId(this);
		
//		new SearchPwd(this);
		
	}

}
