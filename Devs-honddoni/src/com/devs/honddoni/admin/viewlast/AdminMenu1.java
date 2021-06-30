package com.devs.honddoni.admin.viewlast;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AdminMenu1 extends JFrame {
	Container c;
	JPanel pal;
	JButton button = new JButton();
	
	
	AdminMenu1()
	{
		setTitle("혼또니");
		setBounds(100, 100, 516, 909);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setButton();
		setVisible(true);
		
//		Container c = getContentPane();
//		c.setLayout(new GridLayout());
		
//		JPanel p = new JPanel();
//		setBounds(0, 0, 498, 862);
//		JButton j = new JButton("회원탈퇴데이터조회");
//		setBounds(35, 129, 430, 121);
//		JButton j2 = new JButton("회원가입자전체데이터");
//		setBounds(34, 293, 430, 121);
//		JButton j3 = new JButton("회원업적관리");
//		setBounds(334, 456, 430, 121);
//		JButton j4 = new JButton("공지사항관리");
//		setBounds(33, 620, 430, 121);
		
		
		
//		
//		c.add(p);
//		c.add(j);
//		c.add(j2);
//		c.add(j3);
//		c.add(j4);
//		setVisible(true);
	}
	
	
	void setButton() {
		
		c=getContentPane();
		pal= new JPanel();
		pal.setLayout(new GridLayout());
		setBounds(0, 0, 498, 862);
		button = new JButton("회원탈퇴데이터조회");
		setBounds(35, 129, 430, 121);
		pal.add(button);
		
		c.add(pal);
}

	public static void main(String[] args) {
		
		new AdminMenu1();
		

	}

}
