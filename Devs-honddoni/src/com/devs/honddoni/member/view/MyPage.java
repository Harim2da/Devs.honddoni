package com.devs.honddoni.member.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPage extends JFrame {

	public MyPage() {
		this.setBounds(100, 100, 516, 909);
		this.setLayout(null);
		this.setTitle("혼또니(혼자 또 여행왔니?)");
		this.setVisible(true);
		
		JPanel upsidePanel = new JPanel();
		upsidePanel.setBounds(0, 0, 500, 100);
		upsidePanel.setBackground(Color.black);
		
		JPanel downsidePanel = new JPanel();
		downsidePanel.setBounds(0, 100, 500, 770);
		downsidePanel.setBackground(Color.WHITE);
		
		
		JButton sidebarOpenButton = new JButton("");
		sidebarOpenButton.setIcon(new ImageIcon(MyPage.class.getResource("common/Group 1014.png")));
//		sidebarOpenButton.setContentAreaFilled(false);
		sidebarOpenButton.setBorderPainted(false);
		sidebarOpenButton.setBackground(Color.red);
		sidebarOpenButton.setBounds(35, 33, 34, 20);
		upsidePanel.add(sidebarOpenButton);
		
		
		this.add(upsidePanel);
		this.add(downsidePanel);
		
	}
	
}
