package com.devs.honddoni.common.mainframe;

import javax.swing.JFrame;

import com.devs.honddoni.memberLog.view.FirstView;
import com.devs.honddoni.post.view.SelectAllHonPost;

public class MainFrame extends JFrame{
	

	FirstView firstView;
	MainFrame mainFrame;
	
	public MainFrame() {
		
		this.setBounds(100, 100, 516, 909);
		this.setLayout(null);
		this.setTitle("혼또니(혼자 또 여행왔니?)");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		new FirstView(this);
//		new MyPage(this);
		new SelectAllHonPost(this);
		
//		FrameManager.initPanel(this, new SelectAllHonPost());
	}
	
}
