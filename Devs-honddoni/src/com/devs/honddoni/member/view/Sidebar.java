package com.devs.honddoni.member.view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Sidebar extends JPanel {
	

	public Sidebar(JLayeredPane j) {
		/* 사이드바 */
		this.setBounds(0, 0, 153, 870);
		this.setVisible(true);
		System.out.println("사이드바");
		
		JLabel label = new JLabel();
		label.setBounds(0, 0, 153, 870);
		label.setIcon(new ImageIcon("image/common/sidebar_panel.png"));
		label.setVisible(true);
		j.add(label);
		
		JButton btn1 = new JButton();
		btn1.setSize(50,50);
		
		label.add(btn1);
		this.repaint();
		this.revalidate();
		
	}
	
}
