package com.devs.honddoni.memberLog.view;

import javax.swing.JFrame;

import com.devs.honddoni.common.mainframe.FrameManager;

public class TestFrame extends JFrame{
	
	SearchId searchId; //newPanel
	TestFrame testFrame;	
	
	public TestFrame() {
		
//		this.testFrame = this; //필요없남
		
		this.setBounds(100, 100, 516, 909);
		this.setLayout(null);
		this.setTitle("혼또니(혼자 또 여행왔니?)");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
//		searchId = new SearchId(this);
//		this.add(searchId);
		
		searchId= new SearchId(this);
		
		this.add(searchId);
		System.out.println(searchId); //확인용출력
		
//		new SearchPwd(this);
		
	}

}
