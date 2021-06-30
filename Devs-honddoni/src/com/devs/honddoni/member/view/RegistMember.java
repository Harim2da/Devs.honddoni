package com.devs.honddoni.member.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.devs.honddoni.member.controller.MemberController;

import com.devs.honddoni.member.model.dto.MemberDTO;

public class RegistMember extends JFrame {
	
	private MemberController memberController;

	private MemberDTO memberRegistDTO;

	private JFrame registFrame;
	private JPanel firstPanel;
	
	/* 확인용 메소드 */
	public static void main(String[] args) {
		new RegistMember();
	}
	
	public RegistMember() {
		
		/* 프레임 설정 */
		registFrame = new JFrame();		
		registFrame.setForeground(Color.WHITE);
		registFrame.setBounds(100, 100, 516, 909);
		
		setPanel();
		
		registFrame.add(firstPanel);		 
		
		

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		
		this.repaint();
		this.revalidate();		
	}
	
	public void setPanel() {
		
		memberController = new MemberController();
		
		/* 제일 기본 패널 */
		firstPanel = new JPanel();
		firstPanel.setBounds(0, 0, 500, 870);
		firstPanel.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* 로고 들어갈 상단부 패널 */
		JPanel upsidePanel = new JPanel();
		upsidePanel.setBounds(0, 0, 500, 100);
		upsidePanel.setLayout(null);
		upsidePanel.setBackground(Color.BLACK); //나중에 지울 거
		
		/* 세부내용 들어갈 나머지 패널 */
		JPanel downsidePanel = new JPanel();
		downsidePanel.setBounds(0, 100, 500, 770);
//		downsidePanel.setLayout(null); //원래 했어야 하는데, 안 하고 xy를 재버려서 일단 끕니다..
		downsidePanel.setBackground(Color.YELLOW);
		
		/* 혼또니 로고버튼 */
		JButton honddoniBtn = new JButton("");
		honddoniBtn.setBounds(305, 29, 173, 71);
		honddoniBtn.setIcon(new ImageIcon(MemberView.class.getResource("/common/honddoniLogo.png")));
		honddoniBtn.addActionListener(new ActionListener() {
			
			/* 로고버튼 누를 시, 로그인 창으로 이동 */			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		/* 개인정보 입력하는 라벨 */
		JLabel memberDataLb = new JLabel();
		memberDataLb.setBounds(29, 125, 443, 617);
		memberDataLb.setBackground(null);
		memberDataLb.setIcon(new ImageIcon(MemberView.class.getResource("/member/regist/regist_1.png")));
		
		/* 입력받는 텍스트필드들 */
		JTextField nameTf = new JTextField();
		nameTf.setBounds(80, 12, 348, 26);
//		nameTf.setContentAreaFilled(F2, F2, F2);
		
		JTextField idTf = new JTextField();
		idTf.setBounds(80, 74, 348, 26);
		
		JPasswordField passwordPf = new JPasswordField();
		passwordPf.setBounds(95, 136, 333, 26);
		
		JPasswordField passwordRePf = new JPasswordField();
		passwordRePf.setBounds(125, 199, 303, 26);
		

		JTextField birthdayTf = new JTextField();
		birthdayTf.setBounds(125, 261, 192, 26);
        
		/* 라디오 버튼에 따라 gender 설정 */
		String gender;
        JRadioButton genderMRb = new JRadioButton("남");
        genderMRb.setBounds(330, 260, 55, 26);
        genderMRb.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == genderMRb) {
//					gender = "남";
				}
			}
		});
        
		JRadioButton genderFRb = new JRadioButton("여");
        genderFRb.setBounds(385, 260, 55, 26);
        genderFRb.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == genderFRb) {
//					gender = "여";
				}
			}
		});

        
		ButtonGroup genderRb = new ButtonGroup();
		genderRb.add(genderMRb);
		genderRb.add(genderFRb);

		
		JTextField nicknameTf = new JTextField();
		nicknameTf.setBounds(80, 324, 348, 26);
		
		JTextField addressTf = new JTextField();
		addressTf.setBounds(80, 387, 348, 26);
		

		JTextField phoneTf = new JTextField();
		phoneTf.setBounds(100, 451, 348, 26);
		
		JTextField emailTf = new JTextField();
		emailTf.setBounds(80, 514, 348, 26);
		
		
		/* 버튼 추가 */
		JButton agreeBtn = new JButton();
		agreeBtn.setBounds(123, 773, 111, 41);
		agreeBtn.setIcon(new ImageIcon(MemberView.class.getResource("/member/regist/regist_9_agree_btn.png")));
		agreeBtn.setContentAreaFilled(false);
		agreeBtn.setBorderPainted(false);
		agreeBtn.addActionListener(new ActionListener() {
			
			/* DTO만들고 정보 전달...? */
			@Override
			public void actionPerformed(ActionEvent e) {

				
				if(e.getSource() == agreeBtn) {
					memberRegistDTO = new MemberDTO();
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
//					memberRegistDTO.setMemberGender(gender);
					memberRegistDTO.setMemberAddress(addressTf.getText());
					memberRegistDTO.setMemberNickname(nicknameTf.getText());
					memberRegistDTO.setMemberPhone(phoneTf.getText());
					memberRegistDTO.setMemberEmail(emailTf.getText());
					
					/* 등록하는 오늘 날짜 추출 */
					java.util.Date today = new java.util.Date(System.currentTimeMillis());
					SimpleDateFormat registFormat = new SimpleDateFormat("yyMMdd");
					String registDate = registFormat.format(today);
					memberRegistDTO.setMemRegistDate(registDate);
					
					System.out.println(memberRegistDTO);
					
//					memberController.registMember(memberRegistDTO);
				}

			}
		});
		
		JButton cancelBtn = new JButton();
		cancelBtn.setBounds(123, 773, 111, 41);
		cancelBtn.setIcon(new ImageIcon(MemberView.class.getResource("/member/regist/regist_10_cancel_btn.png")));
		cancelBtn.setContentAreaFilled(false);
		cancelBtn.setBorderPainted(false);
		
		
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
		
		
		upsidePanel.add(honddoniBtn);
		downsidePanel.add(memberDataLb);	
		downsidePanel.add(agreeBtn);
		downsidePanel.add(cancelBtn);
		
		firstPanel.add(upsidePanel);
		firstPanel.add(downsidePanel);	
		
		this.repaint();
		this.revalidate();	
	}	
	
	
	

}