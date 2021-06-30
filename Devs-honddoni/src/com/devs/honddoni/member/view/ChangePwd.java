package com.devs.honddoni.member.view;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class ChangePwd extends JPanel {
	
	public ChangePwd() {
		this.setForeground(Color.WHITE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 516, 909);
		this.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(null);
		panel.setBounds(0, 0, 500, 870);
		getContentPane().add(panel);
	}
}
