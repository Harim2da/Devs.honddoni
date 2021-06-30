package com.devs.honddoni.admin.viewfirst;
import java.awt.*;
import javax.swing.*;

public class AdminMenu1 extends JFrame {
	
	AdminMenu1()
	{
		
	setBounds(100, 100, 516, 909);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	setTitle("혼또니");
	
	ImageIcon icon = new ImageIcon("코린이.png");
//	JLabel la = new JLabel(icon);
//	setBounds(0, 0, 498, 862);
//	
	JButton j = new JButton(icon);
	setBounds(35, 129, 430, 121);
	j.setLayout(null);
	
	c.add(j);
//	c.add(la);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	

	
		
	}

	public static void main(String[] args) {
		
		new AdminMenu1();

	}

}
