package com.devs.honddoni.member.view;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.devs.honddoni.common.mainframe.MainFrame;
import com.devs.honddoni.common.mainframe.PopupFrame;
import com.devs.honddoni.member.controller.MemberController;
import com.devs.honddoni.member.model.dto.MemberRegistDTO;
import com.devs.honddoni.memberLog.view.MemberLogView;

import com.devs.honddoni.common.font.FontManager;

public class RegistMember extends JPanel {

	private MainFrame frame;
	private RegistMember registMember;

	private MemberLogView memberLogView; //newPanel로 쓸 것

	private MemberController memberController = new MemberController();
	private MemberRegistDTO memberRegistDTO;

	private String gender = "여";	//actionListener에서 사용하는 것들
	int characterNum = 0;			//actionListener에서 사용하는 것들

//	private JLayeredPane pann; // 레이어 가능한 팝업 팬
//	private JLabel selectChartLb; //성향선택 이미지 라벨

	FontManager font = new FontManager();

	public RegistMember(MainFrame frame) {

		this.frame = frame;
		this.registMember = this;

		/* 제일 기본 패널 */
//		registMember = new JPanel(); // 빼는게 맞다.
		this.setBounds(0, 0, 500, 870);
		this.setLayout(null);
		this.setBackground(Color.WHITE);
		frame.add(this);

		/* 로고 들어갈 상단부 패널 */
		JPanel upsidePanel = new JPanel();
		upsidePanel.setBounds(0, 0, 500, 100);
		upsidePanel.setLayout(null);
		upsidePanel.setBackground(Color.WHITE); //나중에 지울 거

		/* 세부내용 들어갈 나머지 패널 */
		JPanel downsidePanel = new JPanel();
		downsidePanel.setBounds(0, 100, 500, 770);
		//downsidePanel.setLayout(null); //원래 했어야 하는데, 안 하고 xy를 재버려서 각주처리 일단 끕니다..
		downsidePanel.setBackground(Color.WHITE);

		/* 혼또니 로고버튼 */
		JButton honddoniBtn = new JButton("");
		honddoniBtn.setBounds(305, 29, 173, 71);
		honddoniBtn.setContentAreaFilled(false);
		honddoniBtn.setBorderPainted(false);
		honddoniBtn.setIcon(new ImageIcon("image/common/honddoniLogo.png"));
		honddoniBtn.addActionListener(new ActionListener() {

			/* 로고버튼 누를 시, 로그인 창으로 이동 */			
			@Override
			public void actionPerformed(ActionEvent e) {
				//로그인창으로 나감
				System.out.println("로그인창으로 이동");
				
				frame.remove(registMember);
				registMember.setVisible(false);
				memberLogView = new MemberLogView(frame);
				frame.repaint();
				frame.revalidate();
			}
		});

		/* 개인정보 입력하는 라벨 */
		JLabel memberDataLb = new JLabel();
		memberDataLb.setBounds(29, 125, 443, 617);
		memberDataLb.setBackground(null);
		memberDataLb.setIcon(new ImageIcon("image/member/regist/regist_1.png")); // 이거쓰지말아야 할듯

		/* 입력받는 텍스트필드들 */
		JTextField nameTf = new JTextField();
		nameTf.setBounds(80, 12, 348, 26);
		nameTf.setBorder(null);
		nameTf.setOpaque(false);
		nameTf.setFont(font.customFont12);
		//		nameTf.setContentAreaFilled(color(f2, f2, f2, 0.5));		

		JTextField idTf = new JTextField();
		idTf.setBounds(80, 74, 200, 26);
		idTf.setBorder(null);
		idTf.setOpaque(false);
		idTf.setFont(font.customFont12);

		JPasswordField passwordPf = new JPasswordField();
		passwordPf.setBounds(95, 136, 333, 26);
		passwordPf.setBorder(null);
		passwordPf.setOpaque(false);

		JPasswordField passwordRePf = new JPasswordField();
		passwordRePf.setBounds(125, 199, 303, 26);	
		passwordRePf.setBorder(null);
		passwordRePf.setOpaque(false);

		JTextField birthdayTf = new JTextField();
		birthdayTf.setBounds(125, 261, 192, 26);
		birthdayTf.setBorder(null);
		birthdayTf.setOpaque(false);
		birthdayTf.setFont(font.customFont12);

		/* 라디오 버튼에 따라 gender 설정 */
		/* 왜 String gender를 액션리스너에서 또 설정해줘야 되냐... 
		 * > 액션리스너는 별개의 익명클래스이기때문에, 필드에 있어야만 가져다 쓸 수 있다. */
		JRadioButton genderMRb = new JRadioButton("남");
		genderMRb.setBounds(330, 260, 55, 26);
		genderMRb.setBorder(null);
		genderMRb.setOpaque(false);
		genderMRb.setFont(font.customFont12);
		genderMRb.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == genderMRb) {
					gender = "남";
				}
			}
		});

		JRadioButton genderFRb = new JRadioButton("여");
		genderFRb.setBounds(385, 260, 55, 26);
		genderFRb.setBorder(null);
		genderFRb.setOpaque(false);
		genderFRb.setFont(font.customFont12);
		genderFRb.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == genderFRb) {
					gender = "여";
				}
			}
		});


		ButtonGroup genderRb = new ButtonGroup();
		genderRb.add(genderMRb);
		genderRb.add(genderFRb);

		JTextField nicknameTf = new JTextField();
		nicknameTf.setBounds(80, 324, 348, 26);
		nicknameTf.setBorder(null);
		nicknameTf.setOpaque(false);
		nicknameTf.setFont(font.customFont12);

		JTextField addressTf = new JTextField();
		addressTf.setBounds(80, 387, 348, 26);	
		addressTf.setBorder(null);
		addressTf.setOpaque(false);
		addressTf.setFont(font.customFont12);

		JTextField phoneTf = new JTextField();
		phoneTf.setBounds(100, 451, 348, 26);
		phoneTf.setBorder(null);
		phoneTf.setOpaque(false);
		phoneTf.setFont(font.customFont12);

		JTextField emailTf = new JTextField();
		emailTf.setBounds(80, 514, 348, 26);
		emailTf.setBorder(null);
		emailTf.setOpaque(false);
		emailTf.setFont(font.customFont12);

		/* 라벨위에 라벨 & 콤보박스를 각각 올릴 것 */
		JLabel characterSelectLb = new JLabel();
		characterSelectLb.setBounds(92, 572, 316, 41);
		characterSelectLb.setIcon(new ImageIcon("image/member/regist/regist_7_character_select.png"));
		
		//성향선택 콤보박스		
		String[] characterCategory = {" ", "리더형", "팔로워형", "계획적", "즉흥적", "외향적", "내향적", "감성적", "이성적"};
		JComboBox characterSelectCombo = new JComboBox(characterCategory);
		characterSelectCombo.setBounds(0, 0, 316, 41);
		characterSelectCombo.setSelectedIndex(0); 	//0번째 인덱스가 맨 처음에 나오도록 선택
		characterSelectCombo.setFont(font.customFont1);
		characterSelectLb.add(characterSelectCombo);
		
		characterSelectCombo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> comboBox = (JComboBox<String>) e.getSource();
				String characterCategory = (String) comboBox.getSelectedItem();
//				Integer newCharacterCode = null;
				switch(characterCategory) {
					case "리더형" : characterNum = 1; break;
					case "팔로워형": characterNum = 2; break;
					case "계획적" : characterNum = 3; break;
					case "즉흥적" : characterNum = 4; break;
					case "외향적" : characterNum = 5; break;
					case "내향적" : characterNum = 6; break;
					case "감성적" : characterNum = 7; break;
					case "이성적" : characterNum = 8; break;
					default : characterNum = 1; break;
				}
				
			}
		});
		

		/* 중복확인 버튼 */
		JButton checkDuplBtn = new JButton();
		checkDuplBtn.setBounds(325, 67, 111, 41);
		checkDuplBtn.setIcon(new ImageIcon("image/member/regist/regist_8_DuplCheck_btn.png"));
		checkDuplBtn.setContentAreaFilled(false);
		checkDuplBtn.setBorderPainted(false);
		checkDuplBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == checkDuplBtn) {

					String getUserId = idTf.getText();
					
					int result = memberController.idDuplCheck(getUserId);
					
					if(result == 0) {
						//중복되는게 0개임 = 중복아님 = 사용가능
						PopupFrame.popup("image/member/regist/regist_3_DuplCheck_1.png");
					} else {
						PopupFrame.popup("image/member/regist/regist_2_DuplCheck_1.png");
					}
				}
			}
		});

		/* '확인하기' 버튼 */
		JButton agreeBtn = new JButton();
		agreeBtn.setBounds(123, 773, 111, 41);
		agreeBtn.setIcon(new ImageIcon("image/member/regist/regist_9_agree_btn.png"));
		agreeBtn.setContentAreaFilled(false);
		agreeBtn.setBorderPainted(false);
		agreeBtn.addActionListener(new ActionListener() {

			/* DTO 만들고 정보 전달 */
			@Override
			public void actionPerformed(ActionEvent e) {

				if(e.getSource() == agreeBtn) {

					/* 회원정보를 넘길 DTO 생성 */
					memberRegistDTO = new MemberRegistDTO();

					memberRegistDTO.setMemberId(idTf.getText());

					/* 비밀번호 추출 */
					String password = "";
					char[] pass = passwordPf.getPassword();
					for(int i = 0; i < pass.length; i++) {
						password += pass[i];
					}					
					memberRegistDTO.setMemberPassword(password);

					memberRegistDTO.setMemberName(nameTf.getText());
					memberRegistDTO.setMemberBirth(birthdayTf.getText());
					memberRegistDTO.setMemberGender(gender);
					memberRegistDTO.setMemberAddress(addressTf.getText());
					memberRegistDTO.setMemberNickname(nicknameTf.getText());
					memberRegistDTO.setMemberPhone(phoneTf.getText());
					memberRegistDTO.setMemberEmail(emailTf.getText());
					memberRegistDTO.setMemberCharacter(characterNum);

					/* 등록하는 오늘 날짜 추출 */
					java.util.Date today = new java.util.Date(System.currentTimeMillis());
					SimpleDateFormat registFormat = new SimpleDateFormat("yyMMdd");
					String registDate = registFormat.format(today);
					memberRegistDTO.setMemRegistDate(registDate);

					System.out.println(memberRegistDTO);

					int result = memberController.registMember(memberRegistDTO);
					
					if(result > 0) {
						//회원가입완료팝업, 로그인창으로 이동
						PopupFrame.popup("image/member/regist/regist_4_success.png");
						System.out.println("로그인창으로 이동");
						
						frame.remove(registMember);
						registMember.setVisible(false);
						memberLogView = new MemberLogView(frame);
						frame.repaint();
						frame.revalidate();
						
						
					} else {
						PopupFrame.popup("image/member/regist/regist_6_fail.png");
					}
					
				}

			}
		});

		JButton cancelBtn = new JButton();
		cancelBtn.setBounds(123, 773, 111, 41);
		cancelBtn.setIcon(new ImageIcon("image/member/regist/regist_10_cancel_btn.png"));
		cancelBtn.setContentAreaFilled(false);
		cancelBtn.setBorderPainted(false);
		cancelBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				//로그인창으로 나감
				System.out.println("로그인창으로 이동");
				
				PopupFrame.popup("image/member/regist/regist_5_cancel.png");
				frame.remove(registMember);
				registMember.setVisible(false);
				memberLogView = new MemberLogView(frame);
				frame.repaint();
				frame.revalidate();
//							
			}
		});


		/* 컴포넌트 올리기 */		
		memberDataLb.add(nameTf);
		memberDataLb.add(idTf);
		memberDataLb.add(passwordPf);
		memberDataLb.add(passwordRePf);
		memberDataLb.add(birthdayTf);
		memberDataLb.add(genderFRb);
		memberDataLb.add(genderMRb);
		memberDataLb.add(nicknameTf);
		memberDataLb.add(addressTf);
		memberDataLb.add(phoneTf);
		memberDataLb.add(emailTf);
		memberDataLb.add(characterSelectLb);
		memberDataLb.add(checkDuplBtn);

		upsidePanel.add(honddoniBtn);
		downsidePanel.add(memberDataLb);	
		downsidePanel.add(agreeBtn);
		downsidePanel.add(cancelBtn);

		registMember.add(upsidePanel);
		registMember.add(downsidePanel);

		registMember.setVisible(true);

		frame.repaint();
		frame.revalidate();

	}	



}
