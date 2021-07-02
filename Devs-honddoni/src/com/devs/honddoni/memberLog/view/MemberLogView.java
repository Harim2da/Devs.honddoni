 package com.devs.honddoni.memberLog.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.devs.honddoni.common.mainframe.MainFrame;
import com.devs.honddoni.member.view.RegistMember;
import com.devs.honddoni.memberLog.controller.LoginController;
import com.devs.honddoni.memberLog.model.dto.LoginDataDTO;

public class MemberLogView extends JPanel { //나중에 JPanel로 바꿔야 함
	
	MainFrame frame = new MainFrame();

	private LoginController loginController = new LoginController();
	private LoginDataDTO loginDataDTO;
	private RegistMember registMember;

	
	private JPanel bottomPanel = new JPanel();	
	private JTextField idTf;
	private JPasswordField pwPf;
	private String password = "";

//	/* 확인용 메소드 */
//	public static void main(String[] args) {
//		new MemberLogView(); 
//	}

	public MemberLogView() {

//		mf = this;
//		mf.setForeground(Color.WHITE);
//		mf.setBounds(100, 100, 516, 870);
//		//여기까지는 나중에 지울 거

		//로그인창 전체패널 생성		
		bottomPanel.setBounds(0, 0, 500, 870);
		bottomPanel.setForeground(Color.WHITE);
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
				System.out.println("관리자 로그인창으로 이동");
				// 창 바꾸기...?
				// mf.changePanel(bottomPanel, 관리자로그인패널)..?

			}
		});

		JLabel honddoniLogo = new JLabel();
		honddoniLogo.setBounds(130, 258, 241, 99);
		honddoniLogo.setIcon(new ImageIcon("image/memberLog/login/login_2_logo2.png"));

		//아이디, 비밀번호 구역
		JLabel idPwdArea = new JLabel();
		idPwdArea.setBounds(35, 432, 431, 143);
		idPwdArea.setIcon(new ImageIcon("image/memberLog/login/login_3_id_and_password.png"));
		idPwdArea.grabFocus();

		idTf = new JTextField();
		idTf.setBounds(130, 453, 200, 26);		
		pwPf = new JPasswordField();
		pwPf.setBounds(130, 535, 200, 26);


		//로그인 버튼
		JButton loginBtn = new JButton();
		loginBtn.setBounds(35, 593, 431, 63);
		loginBtn.setBorderPainted(false);
		loginBtn.setIcon(new ImageIcon("image/memberLog/login/login_4_login_btn.png"));


		loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == loginBtn) {

					makeDTO();
					
					System.out.println(loginDataDTO);
					System.out.println(loginController);

					//로그인 메소드 실행 
					loginController.userLogin(loginDataDTO);
					
					//한번 실행하고나서 칸을 지워야...
					
				}
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
				System.out.println("아이디찾기 패널로");
				// 아이디 찾기쪽으로 간다
				// 창 바꾸기...?
				//				mf.changePanel(bottomPanel, 아이디찾기패널)..?

			}
		});

		//비밀번호찾기버튼
		JButton searchPasswordBtn = new JButton();
		searchPasswordBtn.setBounds(196, 725, 111, 41);
		searchPasswordBtn.setBorderPainted(false);
		searchPasswordBtn.setIcon(new ImageIcon("image/memberLog/login/login_5_find_password_btn.png"));
		searchPasswordBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				//비밀번호 찾기쪽으로 간다
				System.out.println("비밀번호 찾기 쪽으로");
				// 창 바꾸기...?
				//				mf.changePanel(bottomPanel, 비밀번호찾기패널)..?

			}
		});

		//회원가입버튼
		JButton registBtn = new JButton();
		registBtn.setBounds(334, 725, 111, 41);
		registBtn.setBorderPainted(false);
		registBtn.setIcon(new ImageIcon("image/memberLog/login/login_6_regist_btn.png"));
		registBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("회원가입쪽으로");
				//				registMember = new RegistMember(); 체인지 패널로 하려면 이렇게 해야할듯
				new RegistMember();

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
		bottomPanel.add(idTf); //이래야 되더라... idPwdArea에 올리면 안 보임
		bottomPanel.add(pwPf);

		//확인용 프레임에 올리기
		frame.add(bottomPanel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void makeDTO() {
		//로그인정보를 넘길 DTO를 생성함
		loginDataDTO = new LoginDataDTO();
		
		//아이디와 비밀번호를 받아서 DTO로 뭉침
		loginDataDTO.setMemberId(idTf.getText());

		/* 비밀번호 추출 */		
		char[] pass = pwPf.getPassword();
		for(int i = 0; i < pass.length; i++) {
			password += pass[i];
		}
		
		loginDataDTO.setMemberPassword(password);
	}


}
