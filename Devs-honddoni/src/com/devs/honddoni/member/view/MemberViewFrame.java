package com.devs.honddoni.member.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MemberViewFrame extends JFrame {

	public MemberViewFrame() {
		this.setBounds(100, 100, 516, 909);
		this.setLayout(null);
		this.setTitle("혼또니");
		

		FrameManager.initPanel(this, new MemberView());
	}
	
}
