package com.devs.honddoni.common.mainframe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.devs.honddoni.member.view.MyPage;

public class MainFrame {
	
	private static JFrame mainframe = new JFrame();
	
	public MainFrame() {
		mainframe.setBounds(100, 100, 516, 909);
		mainframe.setLayout(null);
		mainframe.setTitle("혼또니(혼자 또 여행왔니?)");
		
		topPanel();
		
		mainframe.setVisible(true);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public void topPanel() {
		/* 상단 패널 생성 */
		JPanel topPanel = new JPanel();
		topPanel.setBounds(0, 0, 500, 100);
		topPanel.setLayout(null);
		topPanel.setBackground(Color.WHITE);
		mainframe.add(topPanel);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.WHITE);
		mainframe.add(bottomPanel);
		
		/* 상단 패널 뒷배경 생성 */
		JLabel backgroundImage = new JLabel();
		backgroundImage.setBounds(0, 0, 500, 100);
		backgroundImage.setIcon(new ImageIcon("image/common/toppanel/backgroundImage.png"));
		backgroundImage.setVisible(true); 
		topPanel.add(backgroundImage);
		
		
		/* My혼또니 버튼 생성 */
		JButton myHonddoniBtn = new JButton();
		myHonddoniBtn.setBounds(171,23,56,56);
		myHonddoniBtn.setIcon(new ImageIcon("image/common/toppanel/myHonddoniBtn.png"));
		myHonddoniBtn.setBorderPainted(false);
		myHonddoniBtn.setContentAreaFilled(false);
		myHonddoniBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("my혼또니 버튼 클릭");
				changePanel(this., new MyPage());
			}
		});
		backgroundImage.add(myHonddoniBtn);
		
		/* 혼또니 찾기 버튼 생성*/
		JButton searchHonddoniBtn = new JButton();
		searchHonddoniBtn.setBounds(234,23,56,56);
		searchHonddoniBtn.setIcon(new ImageIcon("image/common/toppanel/SearchHonddoniBtn.png"));
		searchHonddoniBtn.setBorderPainted(false);
		searchHonddoniBtn.setContentAreaFilled(false);
		searchHonddoniBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("혼또니 찾기 버튼 클릭");
			}
		});
		backgroundImage.add(searchHonddoniBtn);

		/* Home 버튼 생성 */
		JButton homeBtn = new JButton();
		homeBtn.setBounds(298,23,56,56);
		homeBtn.setIcon(new ImageIcon("image/common/toppanel/HomeBtn.png"));
		homeBtn.setBorderPainted(false);
		homeBtn.setContentAreaFilled(false);
		homeBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("홈  버튼 클릭");
			}
		});
		backgroundImage.add(homeBtn);
		
		/* 관심금 목록 버튼 생성 */
		JButton interestingBtn = new JButton();
		interestingBtn.setBounds(362,23,56,56);
		interestingBtn.setIcon(new ImageIcon("image/common/toppanel/InterestingBtn.png"));
		interestingBtn.setBorderPainted(false);
		interestingBtn.setContentAreaFilled(false);
		interestingBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("관심글 목록 버튼 클릭");
			}
		});
		backgroundImage.add(interestingBtn);
		
		/* 공지사항 버튼 생성 */
		JButton noticeBtn = new JButton();
		noticeBtn.setBounds(426,23,56,56);
		noticeBtn.setIcon(new ImageIcon("image/common/toppanel/NoticeBtn.png"));
		noticeBtn.setBorderPainted(false);
		noticeBtn.setContentAreaFilled(false);
		noticeBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("공지사항 버튼 클릭");
			}
		});
		backgroundImage.add(noticeBtn);
		
		

	}
	public static JFrame getFrame() {
		return mainframe;
	}
	
	public static void initPanel(JFrame frame, JPanel panel) {
		if(mainframe == null) {
			mainframe = frame;
		}
		
		mainframe.add(panel);
		
		mainframe.setVisible(true);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void changePanel(JPanel oldPanel, JPanel newPanel) {
		mainframe.remove(oldPanel);
		mainframe.add(newPanel);
		mainframe.repaint();
		mainframe.revalidate();
	}
	
	public static void refresh() {
		mainframe.repaint();
		mainframe.revalidate();
	}
	
	
	
	
}
