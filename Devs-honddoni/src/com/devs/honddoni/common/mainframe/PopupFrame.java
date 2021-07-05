*package com.devs.honddoni.common.mainframe;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PopupFrame {

	public static void popup(String imageAddress) {
		/* 팝업 */
		ImageIcon popup = new ImageIcon(imageAddress);
		JFrame popupFrame = new JFrame();
		popupFrame.setTitle("혼또니(혼자 또 여행왔니?)");
		JPanel popupPanel = new JPanel();
		try {
			popupFrame.setIconImage(ImageIO.read(new File("image/memberLog/login/login_1_logo.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		popupFrame.setVisible(true); 
		popupFrame.setBounds(130,400,458,271);
		JLabel popupLabel = new JLabel();
		popupLabel.setSize(458,271);
		popupLabel.setIcon(popup);
		popupFrame.add(popupPanel);
		popupFrame.add(popupLabel);
	}
	
	public static void profilePopup() {
		/* 팝업 */
		ImageIcon popup = new ImageIcon();
		JFrame popupFrame = new JFrame();
		JPanel popupPanel = new JPanel();
		popupFrame.setVisible(true); 
		popupFrame.setBounds(130,400,458,271);
		JButton profile1 = new JButton();
		JButton profile2 = new JButton();
		JButton profile3 = new JButton();
		JButton profile4 = new JButton();
		JButton profile5 = new JButton();
		
		
		JLabel popupLabel = new JLabel();
		popupLabel.setSize(458,271);
		popupLabel.setIcon(popup);
		
		popupFrame.add(popupPanel);
		popupFrame.add(popupLabel);
	}
	
}
