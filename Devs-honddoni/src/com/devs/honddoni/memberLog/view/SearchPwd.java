package com.devs.honddoni.memberLog.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.devs.honddoni.common.font.FontManager;
import com.devs.honddoni.common.mainframe.MainFrame;
import com.devs.honddoni.memberLog.controller.MemberLogController;
import com.devs.honddoni.memberLog.model.dto.SearchPwdDTO;

public class SearchPwd extends JPanel{
	
	private MainFrame frame; 
	private SearchPwd searchPwd;
	
	private MemberLogView memberLogView; //newPanel로 쓸 것 
	
	private MemberLogController memberLogController = new MemberLogController();;
	private SearchPwdDTO searchPwdDTO;
	
	FontManager font = new FontManager();
	
	public SearchPwd(MainFrame frame) {	
	
		this.frame = frame;
		this.searchPwd = this;
						
		/* 제일 기본 패널 */
		searchPwd.setBounds(0, 0, 500, 870);
		searchPwd.setLayout(null);
		searchPwd.setBackground(Color.WHITE);
		frame.add(this);
		
		/* 혼또니 로고버튼(오른쪽 상단) */
		JButton honddoniBtn = new JButton("");
		honddoniBtn.setBounds(303, 29, 173, 71);
		honddoniBtn.setIcon(new ImageIcon("image/common/honddoniLogo.png"));
		honddoniBtn.setBorderPainted(false);
		honddoniBtn.setContentAreaFilled(false);
		honddoniBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				/* 로고버튼 누를 시, 로그인 창으로 이동 */			
				if(e.getSource() == honddoniBtn) {
					searchPwd.setVisible(false);
					frame.remove(searchPwd);
					memberLogView = new MemberLogView(frame);
					frame.repaint();
					frame.revalidate();
				}
				
			}
		});
		
		/* 이름, 아이디, 핸드폰번호 적을 공간 라벨 */
		JLabel searchPwdLb = new JLabel();
		searchPwdLb.setBounds(35, 145, 431, 641);
		searchPwdLb.setBackground(null);
		searchPwdLb.setIcon(new ImageIcon("image/memberLog/findPassword/findpassword_1.png"));
		
		/* 이름, 아이디, 핸드폰번호 입력 텍스트 필드 */
		JTextField nameTf = new JTextField();
		nameTf.setBounds(160, 213, 220, 40);
		nameTf.setBorder(null);
		nameTf.setOpaque(false);
		nameTf.setFont(font.customFont12);
		JTextField idTf = new JTextField();
		idTf.setBounds(160, 300, 220, 40);
		idTf.setBorder(null);
		idTf.setOpaque(false);
		idTf.setFont(font.customFont12);
		JTextField phoneTf = new JTextField();		
		phoneTf.setBounds(165, 387, 215, 40);
		phoneTf.setBorder(null);
		phoneTf.setOpaque(false);
		phoneTf.setFont(font.customFont12);
		
		/* 확인하기 버튼 */
		JButton agreeBtn = new JButton();
		agreeBtn.setBounds(88, 496, 111, 41);
		agreeBtn.setIcon(new ImageIcon("image/memberLog/findPassword/findpassword_2_accept_btn.png"));
		agreeBtn.setContentAreaFilled(false);
		agreeBtn.setBorderPainted(false);
		agreeBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				/* 비밀번호 조회기능 */				
				searchPwdDTO = new SearchPwdDTO();				
				searchPwdDTO.setName(nameTf.getText());
				searchPwdDTO.setId(idTf.getText());
				searchPwdDTO.setPhone(phoneTf.getText());
				
				int result = memberLogController.searchPwd(searchPwdDTO);
				
				/* 3가지 모두 일치한다면, 난수 발생시켜 6자리의 무작위 비밀번호(String) 생성 */
				if(result > 0) {					
					
					String newPwd = "";					
					for(int i = 0; i < 6; i++) {
						int randomNum = (int)(Math.random() * 10);
						newPwd += randomNum;
					}
					
					/* 새 비밀번호 DTO에 담고, 수정하기 */
					searchPwdDTO.setNewPwd(newPwd);
					int result2 = memberLogController.editPwd(searchPwdDTO);
					
				}
			}
		});
		
		JButton cancelBtn = new JButton();
		cancelBtn.setBounds(232, 496, 111, 41);
		cancelBtn.setIcon(new ImageIcon("image/memberLog/findPassword/findpassword_3_cancel_btn.png"));
		cancelBtn.setContentAreaFilled(false);
		cancelBtn.setBorderPainted(false);
		cancelBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {	
				
				/* 로그인창으로 이동 */
				searchPwd.setVisible(false);
				frame.remove(searchPwd);
				memberLogView = new MemberLogView(frame);
				frame.repaint();
				frame.revalidate();
			}
		});
		
		
		/* 컴포넌트 붙이기 */
		searchPwdLb.add(nameTf);
		searchPwdLb.add(idTf);		
		searchPwdLb.add(phoneTf);
		searchPwdLb.add(agreeBtn);
		searchPwdLb.add(cancelBtn);		
		searchPwd.add(honddoniBtn);
		searchPwd.add(searchPwdLb);		
				
		searchPwd.setVisible(true);
		
		frame.repaint();
		frame.revalidate();		
	}

}