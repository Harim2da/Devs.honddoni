package com.devs.honddoni.memberLog.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.devs.honddoni.admin.view.MainFrame;

public class MemberLogView extends JPanel {

	public MainFrame mf;
	private JPanel bottomPanel = new JPanel();	

	public MemberLogView() {

		//로그인창 전체패널 생성		
		bottomPanel.setBounds(0, 0, 500, 870);
		bottomPanel.setLayout(null);
		
		//로고이자 
		JButton adminLoginBtn = new JButton();
		adminLoginBtn.setBounds(174, 82, 152, 154);
		adminLoginBtn.setBorderPainted(false);
		adminLoginBtn.setIcon(new ImageIcon("image/memberLog/login/login_1_logo.png"));
		adminLoginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				//관리자 로그인쪽으로 뺀다
				
			}
		});
		
		JLabel honddoniLogo = new JLabel();
		honddoniLogo.setBounds(130, 443, 241, 99);
		honddoniLogo.setIcon(new ImageIcon("image/common/honddoniLogo.png"));
		
		//아이디, 비밀번호 구역
		JLabel idPwdArea = new JLabel();
		idPwdArea.setBounds(35, 432, 431, 143);
		idPwdArea.setIcon(new ImageIcon("image/memberLog/login/login_3_id_and_password.png"));
		
		JTextField idTf = new JTextField();
		idTf.setBounds(130, 453, 200, 26);
		
		JTextField pwTf = new JTextField();
		pwTf.setBounds(130, 453, 200, 26);
		
		idPwdArea.add(idTf);
		idPwdArea.add(pwTf);
		
		//로그인 버튼
		JButton loginBtn = new JButton();
		loginBtn.setBounds(35, 593, 431, 63);
		loginBtn.setBorderPainted(false);
		loginBtn.setIcon(new ImageIcon("image/memberLog/login/login_4_login_btn.png"));
		loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				//아이디와 비밀번호를 받아서 DTO로 뭉침
				
				//로그인 메소드 실행
				
			}
		});
		
		//아이디찾기버튼
		JButton loginBtn = new JButton();
		
		//비밀번호찾기버튼
		JButton searchPasswordBtn = new JButton();
		
		//회원가입버튼
		JButton registBtn = new JButton();
		
		
		//컴포넌트올리기


	}		


}
