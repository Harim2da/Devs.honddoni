package com.devs.honddoni.member.view;

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JFrame;

public class MemeberView {

	JFrame memberFrame = new JFrame();
	
	Rectangle fullSize = new Rectangle(0, 0, 500, 870);
	Rectangle upSize = new Rectangle(0, 0, 500, 100);
	Rectangle downSize = new Rectangle(0, 100, 500, 770);
	
	public MemeberView() {
		showMyPage();
		
	}
	public void showMyPage() {
		memberFrame.setBounds(fullSize);
		memberFrame.setVisible(true);
		memberFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
