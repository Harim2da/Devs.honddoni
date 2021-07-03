package com.devs.honddoni.common.mainframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;

import com.devs.honddoni.member.view.FrameTestYoon;
import com.devs.honddoni.member.view.MyPage;

public class FrameManager {

//private static JFrame frame = new MainFrame();
//	
//	public static JFrame getFrame() {
//		return FrameManager.frame;
//	}
//	
//	public static void initPanel(JFrame frame, JPanel panel) {
//		if(FrameManager.frame == null) {
//			FrameManager.frame = frame;
//		}
//		
//		FrameManager.frame.add(panel);
//		
//		FrameManager.frame.setVisible(true);
//		FrameManager.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
//	
	/* 패널 변경 메소드 */
//	public static void changePanel(MainFrame main, JPanel oldPanel, JPanel newPanel) {	
	public static void changePanel(FrameTestYoon frame, JPanel oldPanel, JPanel newPanel) {	//현기 테스트중 
		frame.remove(oldPanel);
		frame.add(newPanel);
		frame.repaint();
		frame.revalidate();
	}
	
	
static JButton home;

	public static void homeBtnChangePanel(FrameTestYoon frame, JPanel oldPanel) {	//현기 테스트중 
			home = new JButton();
			home.setBounds(298,23,56,56);
			home.setIcon(new ImageIcon("image/common/toppanel/HomeBtn.png"));
			home.setBorderPainted(false);
			home.setContentAreaFilled(false);
			home.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("홈  버튼 클릭");
					frame.remove(oldPanel);
					frame.add(new MyPage(frame));
					frame.repaint();
					frame.revalidate();
				}
			});
			backgroundImage.add(home);
		frame.remove(oldPanel);
		frame.add(new MyPage(frame));
		frame.repaint();
		frame.revalidate();
	}
	
	
}
