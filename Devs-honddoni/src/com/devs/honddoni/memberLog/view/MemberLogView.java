 package com.devs.honddoni.memberLog.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.devs.honddoni.admin.viewpenel.AdminList;
import com.devs.honddoni.common.font.FontManager;
import com.devs.honddoni.common.mainframe.MainFrame;
import com.devs.honddoni.common.mainframe.PopupFrame;
import com.devs.honddoni.member.view.MyPage;
import com.devs.honddoni.member.view.RegistMember;
import com.devs.honddoni.memberLog.controller.LoginController;
import com.devs.honddoni.memberLog.model.dto.LoginDataDTO;
import com.devs.honddoni.search.view.MainBottomPanel;

public class MemberLogView extends JPanel {
	
	private MainFrame frame;
	private MemberLogView memberLogView;	
	
	SearchId searchId; 					//newPanel로 사용할 것
	SearchPwd searchPwd; 				//newPanel로 사용할 것
	RegistMember registMember; 			//newPanel로 사용할 것
	AdminList adminList; 				//newPanel로 사용할 것
	MainBottomPanel mainBottomPanel;	//newPanel로 사용할 것
	
	private LoginController loginController = new LoginController(); //MVC에서 다음으로 넘길 컨트롤러
	private LoginDataDTO loginDataDTO; //컨트롤러에 넘겨줄 DTO
	
	private JTextField idTf;
	private JPasswordField pwPf;
	private String password;
	
	FontManager font = new FontManager();

	public MemberLogView(MainFrame frame) {

		this.frame = frame;
		this.memberLogView = this;

		/* 로그인창 전체패널 생성 */		
		this.setBounds(0, 0, 500, 870);
		this.setBackground(Color.WHITE);
		this.setLayout(null);
		frame.add(this);

		/* 로고라벨 */
		JLabel adminLoginlb = new JLabel();
		adminLoginlb.setBounds(174, 82, 152, 154);
		adminLoginlb.setIcon(new ImageIcon("image/memberLog/login/login_1_logo.png"));
		JLabel honddoniLogo = new JLabel();
		honddoniLogo.setBounds(130, 258, 241, 99);
		honddoniLogo.setIcon(new ImageIcon("image/memberLog/login/login_2_logo2.png"));

		
		/* 아이디, 비밀번호 구역 */
		JLabel idPwdArea = new JLabel();
		idPwdArea.setBounds(35, 432, 431, 143);
		idPwdArea.setIcon(new ImageIcon("image/memberLog/login/login_3_id_and_password.png"));
		idPwdArea.grabFocus();

		idTf = new JTextField();
		idTf.setBounds(100, 4, 300, 55);		
		idTf.setBorder(null);
		idTf.setOpaque(false);
		idTf.setFont(font.customFont12);
		pwPf = new JPasswordField();
		pwPf.setBounds(100, 84, 300, 55);
		pwPf.setBorder(null);
		pwPf.setOpaque(false);


		/* 로그인 버튼 */
		JButton loginBtn = new JButton();
		loginBtn.setBounds(35, 593, 431, 63);
		loginBtn.setBorderPainted(false);
		loginBtn.setContentAreaFilled(false);
		loginBtn.setIcon(new ImageIcon("image/memberLog/login/login_4_login_btn.png"));

		loginBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == loginBtn) {
					//DTO생성
					makeDTO(); 					
					
					//로그인 컨트롤러 실행
					int result = loginController.userLogin(loginDataDTO);
					
					//로그인실패 : 0, 로그인성공(일반사용자 : 1, 관리자 : 2) 반환함
					if(result == 0) {
						PopupFrame.popup("image/popup/checkidAndPwd.png");
						System.out.println("LoginFail팝업");
						
					} else if(result == 1) {
						frame.remove(memberLogView);
						memberLogView.setVisible(false);
						mainBottomPanel = new MainBottomPanel(frame);
						frame.repaint();
						frame.revalidate();						
						
					} else {
						PopupFrame.popup("image/memberLog/login/login_8_admin_popup.png");
						frame.remove(memberLogView);
						memberLogView.setVisible(false);
						adminList = new AdminList(frame);
						frame.repaint();
						frame.revalidate();						
						
					}
					
				}
			}
		});

		/* 아이디찾기 버튼 */
		JButton searchIdBtn = new JButton();
		searchIdBtn.setBounds(58, 725, 111, 41);
		searchIdBtn.setBorderPainted(false);
		searchIdBtn.setContentAreaFilled(false);
		searchIdBtn.setIcon(new ImageIcon("image/memberLog/login/login_5_find_id_btn.png"));
		searchIdBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {				
				frame.remove(memberLogView);
				memberLogView.setVisible(false);
				searchId = new SearchId(frame);	
				frame.repaint();
				frame.revalidate();	

			}
		});

		/* 비밀번호찾기 버튼 */
		JButton searchPasswordBtn = new JButton();
		searchPasswordBtn.setBounds(196, 725, 111, 41);
		searchPasswordBtn.setBorderPainted(false);
		searchPasswordBtn.setContentAreaFilled(false);
		searchPasswordBtn.setIcon(new ImageIcon("image/memberLog/login/login_5_find_password_btn.png"));
		searchPasswordBtn.addActionListener(new ActionListener() {				
			@Override
			public void actionPerformed(ActionEvent e) {				
				frame.remove(memberLogView);
				memberLogView.setVisible(false);
				searchPwd = new SearchPwd(frame);
				frame.repaint();
				frame.revalidate();	
				
			}
		});

		/* 회원가입버튼 */
		JButton registBtn = new JButton();
		registBtn.setBounds(334, 725, 111, 41);
		registBtn.setBorderPainted(false);
		registBtn.setContentAreaFilled(false);
		registBtn.setIcon(new ImageIcon("image/memberLog/login/login_6_regist_btn.png"));
		registBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {				
				frame.remove(memberLogView);
				memberLogView.setVisible(false);
				registMember = new RegistMember(frame);
				frame.repaint();
				frame.revalidate();	

			}
		});


		/* 패널에 컴포넌트 올리기 */		
		idPwdArea.add(idTf);
		idPwdArea.add(pwPf);
		this.add(adminLoginlb);
		this.add(honddoniLogo);
		this.add(idPwdArea);
		this.add(loginBtn);
		this.add(searchIdBtn);
		this.add(searchPasswordBtn);
		this.add(registBtn);
		
		this.setVisible(true);
		
		frame.repaint();
		frame.revalidate();
		
	}

	public void makeDTO() {
		
		//로그인정보를 넘길 DTO를 생성함
		loginDataDTO = new LoginDataDTO();
		
		//아이디와 비밀번호를 받아서 DTO로 뭉침
		loginDataDTO.setMemberId(idTf.getText());
		
		/* 비밀번호 추출 */
		password = ""; //필드에서 초기화까지 해둘 경우, 한번 로그인 실패이후 이전에 쳤던 비밀번호가 남아있는다.
		char[] pass = pwPf.getPassword();
		for(int i = 0; i < pass.length; i++) {
			password += pass[i];
		}
		
		loginDataDTO.setMemberPassword(password);
	}


}
