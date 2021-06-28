package com.devs.honddoni.member.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberView extends JFrame{
	
	public MemberView() {
		getContentPane().setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 909);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 500, 870);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\yhg92\\Downloads\\Group 1014.png"));
		btnNewButton.setBounds(35, 33, 34, 20);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\yhg92\\Downloads\\마이페이지.png"));
		lblNewLabel.setBounds(0, 0, 500, 870);
		getContentPane().add(lblNewLabel);
		
		
	}
	
	public void MemberMyPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 909);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 500, 870);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
