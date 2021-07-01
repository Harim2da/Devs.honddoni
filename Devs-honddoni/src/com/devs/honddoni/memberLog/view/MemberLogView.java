package com.devs.honddoni.memberLog.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.devs.honddoni.common.mainframe.MainFrame;
import com.devs.honddoni.member.view.RegistMember;
import com.devs.honddoni.memberLog.controller.LoginController;
import com.devs.honddoni.memberLog.model.dto.LoginDataDTO;

public class MemberLogView extends JPanel {
	
	private LoginController loginController;
	
	private MainFrame mf;
	private JPanel bottomPanel = new JPanel();	

	public MemberLogView() {

		//로그인창 전체패널 생성		
		bottomPanel.setBounds(0, 0, 500, 870);
		bottomPanel.setLayout(null);
		
		//로고이자 관리자로 가는 버튼
		JButton adminLoginBtn = new JButton();
		adminLoginBtn.setBounds(174, 82, 152, 154);
		adminLoginBtn.setBorderPainted(false);
		adminLoginBtn.setIcon(new ImageIcon("image/memberLog/login/login_1_logo.png"));
		adminLoginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				//관리자 로그인쪽으로 뺀다
				// 창 바꾸기...?
//				mf.changePanel(bottomPanel, 관리자로그인패널)..?
				
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
		
		JPasswordField pwPf = new JPasswordField();
		pwPf.setBounds(130, 453, 200, 26);
		
		idPwdArea.add(idTf);
		idPwdArea.add(pwPf);
		
		//로그인 버튼
		JButton loginBtn = new JButton();
		loginBtn.setBounds(35, 593, 431, 63);
		loginBtn.setBorderPainted(false);
		loginBtn.setIcon(new ImageIcon("image/memberLog/login/login_4_login_btn.png"));
		loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//로그인정보를 넘길 DTO를 생성
				LoginDataDTO loginDataDTO = new LoginDataDTO();
				
				//아이디와 비밀번호를 받아서 DTO로 뭉침
				loginDataDTO.setMemberId(idTf.getText());
				
				/* 비밀번호 추출 */
				String password = "";
				char[] pass = pwPf.getPassword();
				for(int i = 0; i < pass.length; i++) {
					password += pass[i];
				}					
				loginDataDTO.setMemberPassword(password);
				
				//로그인 메소드 실행 
				loginController.userLogin(loginDataDTO);
				
			}
		});
		
		//아이디찾기버튼
		JButton searchIdBtn = new JButton();
		searchIdBtn.setBounds(58, 725, 111, 41);
		searchIdBtn.setBorderPainted(false);
		searchIdBtn.setIcon(new ImageIcon("image/memberLog/login/login_5_find_id_btn.png"));
		searchIdBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 아이디 찾기쪽으로 간다
				// 창 바꾸기...?
//				mf.changePanel(bottomPanel, 아이디찾기패널)..?
				
			}
		});
		
		//비밀번호찾기버튼
		JButton searchPasswordBtn = new JButton();
		searchPasswordBtn.setBounds(58, 725, 111, 41);
		searchPasswordBtn.setBorderPainted(false);
		searchIdBtn.setIcon(new ImageIcon("image/memberLog/login/login_5_find_password_btn.png"));
		searchPasswordBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				//비밀번호 찾기쪽으로 간다
				// 창 바꾸기...?
//				mf.changePanel(bottomPanel, 비밀번호찾기패널)..?
				
			}
		});
		
		//회원가입버튼
		JButton registBtn = new JButton();
		registBtn.setBounds(58, 725, 111, 41);
		registBtn.setBorderPainted(false);
		registBtn.setIcon(new ImageIcon("image/memberLog/login/login_6_regist_btn.png"));
		registBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 회원가입 쪽으로 간다
				RegistMember registMember = new RegistMember();
				// 창 바꾸기...?
//				mf.changePanel(bottomPanel, 비밀번호찾기패널)..?
				
			}
		});
		
		
		
		
		//한 패널에 컴포넌트올리기		
		bottomPanel.add(adminLoginBtn);
		bottomPanel.add(honddoniLogo);
		bottomPanel.add(idPwdArea);
		bottomPanel.add(loginBtn);
		bottomPanel.add(searchIdBtn);
		bottomPanel.add(searchPasswordBtn);
		bottomPanel.add(registBtn);
		

	}		


}
