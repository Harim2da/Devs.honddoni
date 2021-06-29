package com.devs.honddoni.member.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.UIManager;

public class ResignMember extends JFrame {
	
	private JPasswordField passwordField;
	
	public ResignMember() {
		this.setForeground(Color.WHITE);
		this.setLayout(null);
		
		JButton honddoniLogo = new JButton("");
		honddoniLogo.setIcon(new ImageIcon(ResignMember.class.getResource("/common/honddoniLogo.png")));
		honddoniLogo.setContentAreaFilled(false);
		honddoniLogo.setBorderPainted(false);
		honddoniLogo.setBounds(302, 28, 173, 71);
		this.add(honddoniLogo);
		
		JButton sidebarOpenButton = new JButton("");
		sidebarOpenButton.setIcon(new ImageIcon(ResignMember.class.getResource("/common/Group 1014.png")));
		sidebarOpenButton.setContentAreaFilled(false);
		sidebarOpenButton.setBorderPainted(false);
		sidebarOpenButton.setBounds(35, 33, 34, 20);
		this.add(sidebarOpenButton);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(UIManager.getColor("Button.background"));
		passwordField.setBorder(null);
		passwordField.setBounds(145, 353, 321, 37);
		this.add(passwordField);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(ResignMember.class.getResource("/member/deleteMember/resign.png")));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBounds(260, 517, 178, 63);
		this.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setIcon(new ImageIcon(ResignMember.class.getResource("/member/deleteMember/cancleButton.png")));
		btnNewButton.setBounds(60, 517, 178, 63);
		this.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ResignMember.class.getResource("/member/deleteMember/delete.png")));
		lblNewLabel.setBounds(0, 0, 500, 870);
		this.add(lblNewLabel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 909);
	}
}
