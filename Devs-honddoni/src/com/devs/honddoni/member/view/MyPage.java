package com.devs.honddoni.member.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class MyPage {
	
	private JFrame frame;
	private Sidebar sidebar;

	public MyPage() {
		
		JLayeredPane j = new JLayeredPane();
		j.setBounds(100, 100, 516, 909);
		
		frame.setBounds(100, 100, 516, 909);
		frame.setLayout(null);
		frame.setTitle("혼또니(혼자 또 여행왔니?)");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		this.add(j);
		
		/* 상단 패널 */
		JPanel upsidePanel = new JPanel();
		upsidePanel.setBounds(0, 0, 500, 100);
		upsidePanel.setBackground(Color.black);
		upsidePanel.setLayout(null);
		
		/* 하단 패널 */
		JPanel downsidePanel = new JPanel();
		downsidePanel.setBounds(0, 100, 500, 770);
		downsidePanel.setBackground(Color.red);
		downsidePanel.setLayout(null);
		
//		j.add(upsidePanel);
//		j.add(downsidePanel);
		
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
				new Sidebar(j);
			}

			
		});
		
		/* 혼또니 상단 로고 버튼 */
		JButton honddoniLogo = new JButton("");
		honddoniLogo.setContentAreaFilled(false);
		honddoniLogo.setBorderPainted(false);
		honddoniLogo.setIcon(new ImageIcon("image/common/honddoniLogo.png"));
		honddoniLogo.setBounds(302, 28, 173, 71);
		upsidePanel.add(honddoniLogo);	
		honddoniLogo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				/* 메인화면 호출 */
				System.out.println("메인화면 호출");
			}
		});
		
		/* 비밀번호 변경 버튼 */
		JButton changePwdButton = new JButton("");
		changePwdButton.setContentAreaFilled(false);
		changePwdButton.setBorderPainted(false);
		changePwdButton.setIcon(new ImageIcon("image/member/myPage/pwdchange.png"));
		changePwdButton.setBounds(92, 53, 137, 137);
		changePwdButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/* 비밀번호 변경 호출 */
				System.out.println("비밀번호변경 호출");
				JPanel changePwdPanel = new JPanel();
				changePwdPanel.setBounds(0, 100, 500, 770);
				changePwdPanel.setVisible(true);
				changePwdPanel.setBackground(Color.black);
				downsidePanel.setVisible(false);
				
				frame.add(changePwdPanel);
				
			}
		});
		downsidePanel.add(changePwdButton);
		
		/* 개인정보 변경 버튼 */
		JButton changeMemberinfo = new JButton("");
		changeMemberinfo.setIcon(new ImageIcon("image/member/myPage/changeInfo.png"));
		changeMemberinfo.setContentAreaFilled(false);
		changeMemberinfo.setBorderPainted(false);
		changeMemberinfo.setBounds(272, 53, 137, 137);
		changeMemberinfo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/* 개인정보 변경 호출 */
				System.out.println("개인정보 변경 호출");
			}
		});
		downsidePanel.add(changeMemberinfo);
		
		/* 탈퇴하기 버튼 */
		JButton resignMemberButton = new JButton("");
		resignMemberButton.setIcon(new ImageIcon("image/member/myPage/resign.png"));
		resignMemberButton.setContentAreaFilled(false);
		resignMemberButton.setBorderPainted(false);
		resignMemberButton.setBounds(92, 280, 137, 137);
		resignMemberButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/* 탈퇴하기 호출 */
				System.out.println("탈퇴하기 호출");
			}
		});
		downsidePanel.add(resignMemberButton);
		
		/* 관심글 모아보기 버튼 */
		JButton InterestingPostButton = new JButton("");
		InterestingPostButton.setIcon(new ImageIcon("image/member/myPage/heart.png"));
		InterestingPostButton.setContentAreaFilled(false);
		InterestingPostButton.setBorderPainted(false);
		InterestingPostButton.setBounds(272, 280, 137, 137);
		InterestingPostButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/* 관심글 모아보기  호출 */
				System.out.println("관심글 모아보기  호출");
			}
		});
		downsidePanel.add(InterestingPostButton);
		
		
		/* 업적 & 포인트 버튼 */
		JButton rewardButton = new JButton("");
		rewardButton.setIcon(new ImageIcon("image/member/myPage/medal.png"));
		rewardButton.setContentAreaFilled(false);
		rewardButton.setBorderPainted(false);
		rewardButton.setBounds(92, 501, 137, 137);
		rewardButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/* 업적 & 포인트 호출 */
				System.out.println("업적 & 포인트 호출");
			}
		});
		downsidePanel.add(rewardButton);
		
		/* 내글 모아보기 버튼 */
		JButton writtenPostButton = new JButton("");
		writtenPostButton.setIcon(new ImageIcon("image/member/myPage/moabogi.png"));
		writtenPostButton.setContentAreaFilled(false);
		writtenPostButton.setBorderPainted(false);
		writtenPostButton.setBounds(272, 501, 137, 137);
		writtenPostButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/* 내글 모아보기 호출 */
				System.out.println("내글 모아보기 호출");
			}
		});
		downsidePanel.add(writtenPostButton);
		
		/* 마이페이지에 있는 버튼 밑에 글씨들 */
		JLabel menuNameLabel = new JLabel("");
		menuNameLabel.setIcon(new ImageIcon("image/member/myPage/myPageName.png"));
		menuNameLabel.setBounds(111, 10, 500, 870);
		downsidePanel.add(menuNameLabel);
		
		
		
		/* 새로고침 */
		frame.repaint();
		frame.revalidate();
		
		frame.add(upsidePanel);
		frame.add(downsidePanel);
		
	}
	
}
