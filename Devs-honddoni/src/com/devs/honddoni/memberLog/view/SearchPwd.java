package com.devs.honddoni.memberLog.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.devs.honddoni.memberLog.controller.MemberLogController;
import com.devs.honddoni.memberLog.model.dto.SearchPwdDTO;

public class SearchPwd extends JPanel{
	
//	MainFrame frame; 나중엔 여기로 이동
	TestFrame frame; //임시	
	
	private MemberLogController memberLogController = new MemberLogController();
	private MemberLogView memberLogView;
	private SearchPwdDTO searchPwdDTO;
	
	private JPanel firstPanel;
	
	public SearchPwd(TestFrame testFrame) {	
	
		this.frame = testFrame;
		this.firstPanel = this;
						
		/* 제일 기본 패널 */
		firstPanel = new JPanel();
		firstPanel.setBounds(0, 0, 500, 870);
		firstPanel.setLayout(null);
		firstPanel.setBackground(Color.YELLOW);
		
		
		/* 혼또니 로고버튼(오른쪽 상단) */
		JButton honddoniBtn = new JButton("");
		honddoniBtn.setBounds(303, 29, 173, 71);
		honddoniBtn.setIcon(new ImageIcon("image/common/honddoniLogo.png"));
		honddoniBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {

				/* 로고버튼 누를 시, 로그인 창으로 이동 */			
				if(e.getSource() == honddoniBtn) {
					System.out.println("로그인창으로 이동");
										
//					FrameManager.changePanel(frame, firstPanel, newPanel);
				}
				
			}
		});
		
		/* 이름과 핸드폰번호 적을 공간 라벨 */
		JLabel searchPwdLb = new JLabel();
		searchPwdLb.setBounds(35, 145, 431, 641);
		searchPwdLb.setBackground(null);
		searchPwdLb.setIcon(new ImageIcon("image/memberLog/findPassword/findpassword_1.png"));
		
		//이름입력과 휴대폰번호입력 텍필
		JTextField nameTf = new JTextField();
		nameTf.setBounds(214, 368, 180, 26);	
		JTextField idTf = new JTextField();
		idTf.setBounds(214, 456, 180, 26);
		JTextField phoneTf = new JTextField();		
		phoneTf.setBounds(214, 543, 180, 26);
		
		
		JButton agreeBtn = new JButton();
		agreeBtn.setBounds(123, 644, 111, 41);
		agreeBtn.setIcon(new ImageIcon("image/memberLog/findPassword/findpassword_2_accept_btn.png"));
		agreeBtn.setContentAreaFilled(false);
		agreeBtn.setBorderPainted(false);
		agreeBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//비밀번호 조회기능
				System.out.println("비밀번호 조회기능으로~");
				
				searchPwdDTO = new SearchPwdDTO();
				
				searchPwdDTO.setName(nameTf.getText());
				searchPwdDTO.setId(idTf.getText());
				searchPwdDTO.setPhone(phoneTf.getText());
				
				System.out.println("searchPwdDTO 입력값 : " + searchPwdDTO);
				
				int result = memberLogController.searchPwd(searchPwdDTO);
				
				if(result > 0) {
					
					System.out.println("입력값들이 일치합니다.");
					
					//난수발생시켜 6자리의 무작위 비밀번호(String) 만들어주자...
					String newPwd = "";					
					for(int i = 0; i < 6; i++) {
						int randomNum = (int)(Math.random() * 10);
						newPwd += randomNum;
					}
					
					System.out.println("새로운 비밀번호 : " + newPwd);
					
					//새 비밀번호를 수정하
					int result2 = memberLogController.modifyPwd(newPwd);
										
					if(result2 > 0) {
						System.out.println("새 비밀번호가 잘 저장되었습니다.");
					} else {
						System.out.println("새 비밀번호 수정 오류!");
					}
					
					
				} else {
					
					System.out.println("입력값들이 일치하지 않습니다.");
					
				}
				
			}
		});
		
		JButton cancelBtn = new JButton();
		cancelBtn.setBounds(266, 643, 111, 41);
		cancelBtn.setIcon(new ImageIcon("image/memberLog/findPassword/findpassword_3_cancel_btn.png"));
		cancelBtn.setContentAreaFilled(false);
		cancelBtn.setBorderPainted(false);
		cancelBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {				
				
				//로그인창으로 나감
				System.out.println("로그인 창으로~");
				
//				FrameManager.changePanel(frame, firstPanel, MemberLogView);
				
			}
		});
		
		
		/* 컴포넌트 붙이기 */
		firstPanel.add(honddoniBtn);
		firstPanel.add(searchPwdLb);
		
		firstPanel.add(nameTf);
		firstPanel.add(idTf);		
		firstPanel.add(phoneTf);
		firstPanel.add(agreeBtn);
		firstPanel.add(cancelBtn);		
				
		firstPanel.setVisible(true);
		
//		frame.add(firstPanel);		
		
	}

}