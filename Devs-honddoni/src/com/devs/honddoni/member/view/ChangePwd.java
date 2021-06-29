package com.devs.honddoni.member.view;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class ChangePwd extends JFrame {
	
	public ChangePwd() {
		getContentPane().setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 909);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.WHITE);
		panel.setBorder(null);
		panel.setBounds(0, 0, 500, 870);
		getContentPane().add(panel);
	}
}
