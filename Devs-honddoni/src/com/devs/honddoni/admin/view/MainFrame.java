package com.devs.honddoni.admin.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	public MainFrame() {
		this.setLocation(300, 50);
		this.setSize(500, 800);
		
		this.setLayout(null);
		this.setTitle("개발의 민족 - 주문");
		FrameManager.initPanel(this, new MainPanel());
		
	
	}
}
