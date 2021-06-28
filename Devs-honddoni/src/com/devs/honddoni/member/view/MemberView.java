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
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		/* 사이드바 열기 버튼 */
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/* 사이드바 열기  */
				
			}
		});
		
		/* 매칭 알림 표시 */
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(MemberView.class.getResource("/member/myPage/matchingSign.png")));
		lblNewLabel_2.setBounds(254, 583, 41, 41);
		getContentPane().add(lblNewLabel_2);
		
		/* 혼또니 로고 버튼 */
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/* 메인메뉴 화면으로 이동하기 */
				
			}
		});
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setIcon(new ImageIcon(MemberView.class.getResource("/common/honddoniLogo.png")));
		btnNewButton_3.setBounds(304, 27, 173, 71);
		getContentPane().add(btnNewButton_3);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon(MemberView.class.getResource("/common/Group 1014.png")));
		btnNewButton.setBounds(35, 33, 34, 20);
		getContentPane().add(btnNewButton);
		
		/* 비밀번호 변경 버튼 */
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/* 비밀번호 변경 버튼 클릭 후 */
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(MemberView.class.getResource("/member/myPage/pwdchange.png")));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBounds(92, 153, 137, 137);
		getContentPane().add(btnNewButton_1);
		
		/* 개인정보 변경 버튼 */
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/* 개인정보 변경 클릭 후 */
				
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(MemberView.class.getResource("/member/myPage/changeInfo.png")));
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBounds(272, 153, 137, 137);
		getContentPane().add(btnNewButton_2);
		
		/* 탈퇴하기 버튼 */
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/* 탈퇴하기 버튼 클릭 후 */
				
			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon(MemberView.class.getResource("/member/myPage/resign.png")));
		btnNewButton_1_1.setContentAreaFilled(false);
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBounds(92, 380, 137, 137);
		getContentPane().add(btnNewButton_1_1);
		
		/* 관심글 모아보기 버튼 */
		JButton btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/* 관심글 모아보기 클릭 후 */
				
			}
		});
		btnNewButton_1_2.setIcon(new ImageIcon(MemberView.class.getResource("/member/myPage/heart.png")));
		btnNewButton_1_2.setContentAreaFilled(false);
		btnNewButton_1_2.setBorderPainted(false);
		btnNewButton_1_2.setBounds(272, 380, 137, 137);
		getContentPane().add(btnNewButton_1_2);
		
		/* 업적 & 포인트 버튼 */
		JButton btnNewButton_1_3 = new JButton("");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/* 업적 및 포인트 버튼 클릭 후 */
				
			}
		});
		btnNewButton_1_3.setIcon(new ImageIcon(MemberView.class.getResource("/member/myPage/medal.png")));
		btnNewButton_1_3.setContentAreaFilled(false);
		btnNewButton_1_3.setBorderPainted(false);
		btnNewButton_1_3.setBounds(92, 601, 137, 137);
		getContentPane().add(btnNewButton_1_3);
		
		/* 내글 모아보기 버튼 */
		JButton btnNewButton_1_4 = new JButton("");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/* 내글 모아보기 클릭 후 */
				
			}
		});
		btnNewButton_1_4.setIcon(new ImageIcon(MemberView.class.getResource("/member/myPage/moabogi.png")));
		btnNewButton_1_4.setContentAreaFilled(false);
		btnNewButton_1_4.setBorderPainted(false);
		btnNewButton_1_4.setBounds(272, 601, 137, 137);
		getContentPane().add(btnNewButton_1_4);
		
		/* */
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(MemberView.class.getResource("/member/myPage/mypageName2.png")));
		lblNewLabel_1.setBounds(0, 0, 500, 870);
		getContentPane().add(lblNewLabel_1);
		
		
	}
	
	
}
