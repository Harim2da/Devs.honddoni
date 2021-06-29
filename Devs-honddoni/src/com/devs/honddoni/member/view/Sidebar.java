package com.devs.honddoni.member.view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Sidebar extends JPanel {

	public Sidebar() {
		/* 사이드바 */
		this.setBounds(0, 0, 153, 870);
		this.setVisible(true);
		this.setLayout(null);
		System.out.println("사이드바");
		
		JLabel label = new JLabel();
		label.setBounds(0, 0, 153, 870);
		label.setIcon(new ImageIcon("image/common/sidebar_panel.png"));
		this.add(label);
		label.setVisible(true);
		
		this.repaint();
		this.revalidate();
		
	}
	
	public void openSidebar() {
		
		
	}
	
}
