package com.devs.honddoni.member.view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Sidebar {
	
	static JPanel sidebar;

	public Sidebar(JLayeredPane j) {
		
		/* 사이드바 */
		setBounds();
		setVisible();
		setOpaque();
		System.out.println("사이드바");
		
		JLabel label = new JLabel();
		label.setBounds(0, 0, 153, 870);
//		label.setSize(153, 870);
		label.setIcon(new ImageIcon("image/common/sidebar_panel.png"));
		label.setVisible(true);
		sidebar.add(label);
	}
	
	
	private void setOpaque() {
		sidebar.setOpaque(false);
	}


	private void setVisible() {
		sidebar.setVisible(true);
	}


	private void setBounds() {
		sidebar.setBounds(0,0,500,870);
	}


	public static JPanel getInstance() {
		return sidebar;
	}
}
