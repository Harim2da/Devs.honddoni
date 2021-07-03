package com.devs.honddoni.memberLog.view;

import javax.swing.JFrame;

import com.devs.honddoni.common.mainframe.FrameManager;

public class TestFrame extends JFrame{
	
	TestFrame testFrame;
	private FirstView firstView;
	private SearchId searchId;
	
	public TestFrame() {
		
		this.testFrame = this;
		
		this.setBounds(100, 100, 516, 909);
		this.setLayout(null);
		this.setTitle("혼또니(혼자 또 여행왔니?)");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
//		firstView = new FirstView(this);
//		this.add(searchId);
		
		searchId = new SearchId(this);
		System.out.println(searchId); //확인용출력
		
		FrameManager.initPanel(testFrame, searchId);
		
		
//		new SearchPwd(this);
		
	}

}
