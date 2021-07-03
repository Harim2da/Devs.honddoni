package com.devs.honddoni.memberLog.view;

import javax.swing.JFrame;

import com.devs.honddoni.common.mainframe.FrameManager;

public class TestFrame extends JFrame{
	
	private FirstView firstView;
	private SearchId searchId;
	
	public TestFrame() {
		
		this.setBounds(100, 100, 516, 909);
		this.setLayout(null);
		this.setTitle("혼또니(혼자 또 여행왔니?)");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
//		firstView = new FirstView(this);
		
		searchId = new SearchId(this);
		System.out.println(searchId);
		
		this.add(searchId);
		
//		new SearchPwd(this);
		
	}

}
