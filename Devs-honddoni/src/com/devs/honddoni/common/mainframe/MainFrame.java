package com.devs.honddoni.common.mainframe;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
	
	private JPanel topPanel;
	
	public MainFrame() {
		this.setBounds(100, 100, 516, 909);
		this.setLayout(null);
		
		this.add(topPanel);
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public void topPanel() {
		topPanel = new JPanel();
		topPanel.setBounds(0, 0, 500, 100);
		topPanel.setLayout(null);
		topPanel.setBackground(Color.WHITE);

	}
	
	
	
	
}
