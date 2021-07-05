package com.devs.honddoni.admin.viewpenel;

import javax.swing.JFrame;

public class TestFrameAd extends JFrame{
	
//	Notice notice; //newPanel
//	TestFrameAd frame; //현재프레임
	
	public TestFrameAd() {
		
//		this.frame = this; //필요없남		
		
		this.setBounds(100, 100, 516, 909);
		this.setLayout(null);
		this.setTitle("혼또니(혼자 또 여행왔니?)");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("테스트프레임 생성");
		
//		new SearchPwd();
//		this.add(notice);
		FrameManagerYs.initPanel(this, new Notice());
		
	}

}
