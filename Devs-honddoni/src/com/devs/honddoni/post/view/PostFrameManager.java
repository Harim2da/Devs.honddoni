package com.devs.honddoni.post.view;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class PostFrameManager {

	private static JFrame frame = new PostBottomFrame();
	
	public static JFrame getFrame() {
		return PostFrameManager.frame;
	}
	
	public static void initPanel(JFrame frame, JPanel panel) {
		if(PostFrameManager.frame == null) {
			PostFrameManager.frame = frame;
		}
		
		PostFrameManager.frame.add(panel);
		
		PostFrameManager.frame.setVisible(true);
		PostFrameManager.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void changePanel(JPanel oldPanel, JPanel newPanel) {
		frame.remove(oldPanel);
		frame.add(newPanel);
		frame.repaint();
		frame.revalidate();
	}
	
	public static void refresh() {
		frame.repaint();
		frame.revalidate();
	}
}
	
	

