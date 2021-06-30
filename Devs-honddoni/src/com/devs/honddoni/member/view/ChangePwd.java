package com.devs.honddoni.member.view;

import java.awt.Color;

import javax.swing.JPanel;


public class ChangePwd extends JPanel {
	
	private JPanel topPanel;
	private JPanel bottomPanel;
	
	/*상단 패널 생성*/
	public void topPanel() {
		topPanel = new JPanel();
		topPanel.setBounds(0, 0, 500, 100);
		topPanel.setLayout(null);
		topPanel.setBackground(Color.WHITE);
		
	}
	
	/*하단 패널 생성*/
	public void bottomPanel() {
		bottomPanel = new JPanel();
		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.WHITE);	
	}
	
	
}
