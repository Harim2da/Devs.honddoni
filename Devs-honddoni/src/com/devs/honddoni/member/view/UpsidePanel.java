package com.devs.honddoni.member.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class UpsidePanel extends JPanel {

	public UpsidePanel() {
	}
	
	private void panelInit() {
		this.setBounds(0, 0, 500, 100);
		this.setBackground(Color.WHITE);
		this.setLayout(null);
		this.setVisible(true);
	}
	
	private void addSideButton() {
		
		JButton sidebarOpenButton = new JButton("");
		sidebarOpenButton.setIcon(new ImageIcon("image/common/Group 1014.png"));
		sidebarOpenButton.setContentAreaFilled(false);	//배경 투명
		sidebarOpenButton.setBorderPainted(false);	  	//윤곽선 투명
		sidebarOpenButton.setBounds(35, 33, 34, 20);
		this.add(sidebarOpenButton);
		
		/* 사이드바 오픈 버튼 클릭 시 */
		sidebarOpenButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("버튼 클릭");
			}
			
		});
	}
	
	private void addLogoButton() {
		/* 혼또니 상단 로고 버튼 */
		JButton honddoniLogo = new JButton("");
		honddoniLogo.setContentAreaFilled(false);
		honddoniLogo.setBorderPainted(false);
		honddoniLogo.setIcon(new ImageIcon("image/common/honddoniLogo.png"));
		honddoniLogo.setBounds(302, 28, 173, 71);
		this.add(honddoniLogo);	
		honddoniLogo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				/* 메인화면 호출 */
				System.out.println("메인화면 호출");
			}
		});
		
	}
	
	public UpsidePanel getUpsidePanel() {
		return this;
	}
}
