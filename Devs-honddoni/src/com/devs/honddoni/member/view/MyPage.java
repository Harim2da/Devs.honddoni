package com.devs.honddoni.member.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPage extends JFrame {

	public Sidebar side;
	
	
	public MyPage() {
		this.setBounds(100, 100, 516, 909);
		this.setLayout(null);
		this.setTitle("혼또니(혼자 또 여행왔니?)");
		this.setVisible(true);
		
		/* 상단 패널 */
		JPanel upsidePanel = new JPanel();
		upsidePanel.setBounds(0, 0, 500, 100);
		upsidePanel.setBackground(Color.WHITE);
		
		/* 하단 패널 */
		JPanel downsidePanel = new JPanel();
		downsidePanel.setBounds(0, 100, 500, 770);
		downsidePanel.setBackground(Color.WHITE);
		
		
		/* 사이드 바 오픈 버튼 */
		JButton sidebarOpenButton = new JButton("");
		sidebarOpenButton.setIcon(new ImageIcon("image/common/Group 1014.png"));
		sidebarOpenButton.setContentAreaFilled(false);	//배경 투명
		sidebarOpenButton.setBorderPainted(false);	  	//윤곽선 투명
		sidebarOpenButton.setBounds(35, 33, 34, 20);
		upsidePanel.add(sidebarOpenButton);
		
		/* 사이드바 오픈 버튼 클릭 시 */
		sidebarOpenButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("버튼 클릭");
				new Sidebar();
			}

		});
		
		JButton honddoniLogo = new JButton("");
		honddoniLogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/* 메인메뉴 화면으로 이동하기 */
				
			}
		});
		
		/* 혼또니 상단 로고 버튼 */
		honddoniLogo.setContentAreaFilled(false);
		honddoniLogo.setBorderPainted(false);
		honddoniLogo.setIcon(new ImageIcon("image/common/honddoniLogo.png"));
		honddoniLogo.setBounds(302, 28, 173, 71);
		honddoniLogo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				/* 메인화면 호출 */
				System.out.println("메인화면 호출");
			}
		});
		
		/* 새로고침 */
		this.repaint();
		this.revalidate();
		
		this.add(honddoniLogo);
		this.add(upsidePanel);
		this.add(downsidePanel);
		
	}
	
}
