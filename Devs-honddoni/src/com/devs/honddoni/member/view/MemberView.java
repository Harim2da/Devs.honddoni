package com.devs.honddoni.member.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class MemberView extends JFrame{
	
	public MemberView() {
		getContentPane().setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 909);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 500, 870);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		/* 사이드바 열기 버튼 */
		JButton sidebarOpenButton = new JButton("");
		sidebarOpenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/* 사이드바 열기  */
				
			}
		});
		
		/* 매칭 알림 표시 */
		JLabel matchingSign = new JLabel("");
		matchingSign.setIcon(new ImageIcon(MemberView.class.getResource("/member/myPage/matchingSign.png")));
		matchingSign.setBounds(254, 583, 41, 41);
		getContentPane().add(matchingSign);
		
		/* 혼또니 로고 버튼 */
		JButton honddoniLogo = new JButton("");
		honddoniLogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/* 메인메뉴 화면으로 이동하기 */
				
			}
		});
		honddoniLogo.setContentAreaFilled(false);
		honddoniLogo.setBorderPainted(false);
		honddoniLogo.setIcon(new ImageIcon(MemberView.class.getResource("/common/honddoniLogo.png")));
		honddoniLogo.setBounds(304, 27, 173, 71);
		getContentPane().add(honddoniLogo);
		sidebarOpenButton.setContentAreaFilled(false);
		sidebarOpenButton.setBorderPainted(false);
		sidebarOpenButton.setIcon(new ImageIcon(MemberView.class.getResource("/common/Group 1014.png")));
		sidebarOpenButton.setBounds(35, 33, 34, 20);
		getContentPane().add(sidebarOpenButton);
		
		/* 비밀번호 변경 버튼 */
		JButton changePwdButton = new JButton("");
		changePwdButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/* 비밀번호 변경 버튼 클릭 후 */
//				new ChangePwd();
				
			}
		});
		changePwdButton.setIcon(new ImageIcon(MemberView.class.getResource("/member/myPage/pwdchange.png")));
		changePwdButton.setContentAreaFilled(false);
		changePwdButton.setBorderPainted(false);
		changePwdButton.setBounds(92, 153, 137, 137);
		getContentPane().add(changePwdButton);
		
		/* 개인정보 변경 버튼 */
		JButton changeMemberinfo = new JButton("");
		changeMemberinfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/* 개인정보 변경 클릭 후 */
				
			}
		});
		changeMemberinfo.setIcon(new ImageIcon(MemberView.class.getResource("/member/myPage/changeInfo.png")));
		changeMemberinfo.setContentAreaFilled(false);
		changeMemberinfo.setBorderPainted(false);
		changeMemberinfo.setBounds(272, 153, 137, 137);
		getContentPane().add(changeMemberinfo);
		
		/* 탈퇴하기 버튼 */
		JButton resignMemberButton = new JButton("");
		resignMemberButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/* 탈퇴하기 버튼 클릭 후 */
				
			}
		});
		resignMemberButton.setIcon(new ImageIcon(MemberView.class.getResource("/member/myPage/resign.png")));
		resignMemberButton.setContentAreaFilled(false);
		resignMemberButton.setBorderPainted(false);
		resignMemberButton.setBounds(92, 380, 137, 137);
		getContentPane().add(resignMemberButton);
		
		/* 관심글 모아보기 버튼 */
		JButton InterestingPostButton = new JButton("");
		InterestingPostButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/* 관심글 모아보기 클릭 후 */
				
			}
		});
		InterestingPostButton.setIcon(new ImageIcon(MemberView.class.getResource("/member/myPage/heart.png")));
		InterestingPostButton.setContentAreaFilled(false);
		InterestingPostButton.setBorderPainted(false);
		InterestingPostButton.setBounds(272, 380, 137, 137);
		getContentPane().add(InterestingPostButton);
		
		/* 업적 & 포인트 버튼 */
		JButton rewardButton = new JButton("");
		rewardButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/* 업적 및 포인트 버튼 클릭 후 */
				
			}
		});
		rewardButton.setIcon(new ImageIcon(MemberView.class.getResource("/member/myPage/medal.png")));
		rewardButton.setContentAreaFilled(false);
		rewardButton.setBorderPainted(false);
		rewardButton.setBounds(92, 601, 137, 137);
		getContentPane().add(rewardButton);
		
		/* 내글 모아보기 버튼 */
		JButton writtenPostButton = new JButton("");
		writtenPostButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/* 내글 모아보기 클릭 후 */
				
			}
		});
		writtenPostButton.setIcon(new ImageIcon(MemberView.class.getResource("/member/myPage/moabogi.png")));
		writtenPostButton.setContentAreaFilled(false);
		writtenPostButton.setBorderPainted(false);
		writtenPostButton.setBounds(272, 601, 137, 137);
		getContentPane().add(writtenPostButton);
		
		/* 마이페이지에 있는 버튼 밑에 글씨들 */
		JLabel menuNameLabel = new JLabel("");
		menuNameLabel.setIcon(new ImageIcon(MemberView.class.getResource("/member/myPage/mypageName2.png")));
		menuNameLabel.setBounds(0, 0, 500, 870);
		getContentPane().add(menuNameLabel);
		
		
	}
	
	
}
