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

import com.devs.honddoni.common.mainframe.FrameManager;
import com.devs.honddoni.common.mainframe.MainFrame;
import com.devs.honddoni.member.view.RegistMember;
import com.devs.honddoni.memberLog.controller.LoginController;
import com.devs.honddoni.memberLog.model.dto.LoginDataDTO;

public class MemberLogView extends JPanel {
	
	MainFrame frame;
	
	SearchId searchId; //newPanel로 사용할 것
	SearchPwd searchPwd; //newPanel로 사용할 것
	LoginFail loginFail; //newPanel로 사용할 것
	RegistMember registMember; //newPanel로 사용할 것
	//newPanel로 쓸 메인화면도 필드로 넣어줘야 함
	
	private LoginController loginController = new LoginController(); //MVC에서 다음으로 넘길 컨트롤러
	private LoginDataDTO loginDataDTO; //컨트롤러에 넘겨줄 DTO
	
	private JPanel panel;	
	private JTextField idTf;
	private JPasswordField pwPf;
	private String password = "";

	//로그인창 패널이다
	public MemberLogView(MainFrame Mainframe) {

		this.frame = Mainframe;
		this.panel = this;

		//로그인창 전체패널 생성		
		panel.setBounds(0, 0, 500, 870);
		panel.setForeground(Color.WHITE);
		panel.setLayout(null);

		//로고버튼 - 나중에 JLabel로 바꿔야 함
		JButton adminLoginBtn = new JButton();
		adminLoginBtn.setBounds(174, 82, 152, 154);
		adminLoginBtn.setBorderPainted(false);
		adminLoginBtn.setIcon(new ImageIcon("image/memberLog/login/login_1_logo.png"));
		
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
					
					makeDTO(); //DTO생성					
					System.out.println(loginDataDTO);  //DTO가 잘 만들어졌는지 확인
					System.out.println(loginController); //컨트롤러가 null인지 확인

					//한번 실행할 때 마다 텍필 칸의 내용을 지워야줘야 함...
					
					int result = loginController.userLogin(loginDataDTO); //로그인 메소드 실행 
					
					//바꿀 다음패널들을 초기화
					loginFail = new LoginFail(frame);
					
					//로그인실패 : 0, 로그인성공(일반사용자 : 1, 관리자 : 2) 반환함
					if(result == 0) {
						FrameManager.changePanel(frame, panel, loginFail);
						System.out.println("LoginFail 패널로 교체");
						
					} else if(result == 1) {
						//메인화면 쪽으로 패널교체
//						frame.topPannelBtnStart();

//						FrameManager.changePanel(frame, bottomPanel, newPanel);
						System.out.println("로그인 성공~ 메인화면 패널로 교체");
						
					} else {
						//관리자 쪽으로 패널교체
//						FrameManager.changePanel(bottomPanel, newPanel);
						System.out.println("로그인 성공~ 관리자메인화면 패널로 교체");
						
					}
					
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
				
				//아이디찾기 패널로				
				System.out.println("아이디 찾기 패널로~");
				
				// 아이디 찾기로 패널교체
//				searchId = new SearchId(frame);	
//				FrameManager.changePanel(frame, bottomPanel, searchId);

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
//				searchPwd = new SearchPwd(frame);
				
				// 창 바꾸기...?
//				FrameManager.changePanel(frame, bottomPanel, searchPwd);

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
				
				//회원가입 쪽으로 간다
				System.out.println("회원가입쪽으로");
				registMember = new RegistMember(frame);
				
				// 창 바꾸기...?
				FrameManager.changePanel(frame, panel, registMember);

			}
		});


		//한 패널에 컴포넌트올리기		
		panel.add(adminLoginBtn);
		panel.add(honddoniLogo);
		panel.add(idPwdArea);
		panel.add(loginBtn);
		panel.add(searchIdBtn);
		panel.add(searchPasswordBtn);
		panel.add(registBtn);
		panel.add(idTf); //이래야 되더라... idPwdArea에 올리면 안 보임
		panel.add(pwPf);
		
		panel.setVisible(true);

		//확인용 프레임에 올리기
//		frame.add(panel);
//		frame.setVisible(true);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
