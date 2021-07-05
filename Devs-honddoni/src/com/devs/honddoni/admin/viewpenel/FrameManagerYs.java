package com.devs.honddoni.admin.viewpenel;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameManagerYs {

	private static JFrame frame = new TestFrameAd();
	
	public static JFrame getFrame() {
		return FrameManagerYs.frame;
	}
	
	public static void initPanel(JFrame frame, JPanel panel) {
		if(FrameManagerYs.frame == null) {
			FrameManagerYs.frame = frame;
		}
		
		FrameManagerYs.frame.add(panel);
		
		FrameManagerYs.frame.setVisible(true);
		FrameManagerYs.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void changePanel(JPanel oldPanel, JPanel newPanel) {
		frame.remove(oldPanel);
		frame.add(newPanel);
		frame.repaint();
		frame.revalidate();
	}
	
		
	/* 패널 변경 메소드 */
//	public static void changePanel(FrameManagerYs frame, JPanel oldPanel, JPanel newPanel) {
//		frame.remove(oldPanel);
//		frame.add(newPanel);
//		frame.repaint();
//		frame.revalidate();
//	}
	
	public static void refresh() {
		frame.repaint();
		frame.revalidate();
	}

	
}
