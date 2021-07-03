package com.devs.honddoni.common.mainframe;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PopupFrame {

	public static void popup(String imageAddress) {
		/* 팝업 */
		ImageIcon popup = new ImageIcon(imageAddress);
		JFrame popupFrame = new JFrame();
		JPanel popupPanel = new JPanel();
		popupFrame.setVisible(true); 
		popupFrame.setBounds(130,400,458,271);
		JLabel popupLabel = new JLabel();
		popupLabel.setSize(458,271);
		popupLabel.setIcon(popup);
		popupFrame.add(popupPanel);
		popupFrame.add(popupLabel);
	}
	
}
