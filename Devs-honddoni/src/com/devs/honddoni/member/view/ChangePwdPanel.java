package com.devs.honddoni.member.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import com.devs.honddoni.common.mainframe.PopupFrame;
import com.devs.honddoni.member.controller.MemberController;
import com.devs.honddoni.member.model.dto.ChangePwdDTO;

public class ChangePwdPanel extends JPanel {
	
	private JPanel changePwdPanel;
	private ChangePwdDTO changePwdDTO;
	private MemberController memberController;
	
	/* 비밀번호변경 */
	public ChangePwdPanel() {
		changePwdPanel = this;
		
		changePwdPanel.setLayout(null);
		changePwdPanel.setBounds(0, 100, 500, 770);
		changePwdPanel.setVisible(true);
		changePwdPanel.setBackground(Color.white);
		this.setVisible(false);
		
		/* 기존 비밀번호 입력창 */
		JPasswordField cpPF1 = new JPasswordField();	//비밀번호 변경 기존비번 입력창
		cpPF1.setBorder(null);
		cpPF1.setOpaque(false);
		cpPF1.setBounds(195, 288, 270, 45);
		changePwdPanel.add(cpPF1);
		
		/* 새 비밀번호 입력창 */
		
		JPasswordField cpPF2 = new JPasswordField();	//비밀번호 변경 새비번 입력창
		cpPF2.setBorder(null);
		cpPF2.setOpaque(false);
		cpPF2.setBounds(195, 366, 270, 45);
		changePwdPanel.add(cpPF2);
		
		/* 새 비밀번호 확인창 */
		JPasswordField cpPF3 = new JPasswordField();	//비밀번호 변경 새비번 확인창
		cpPF3.setBorder(null);
		cpPF3.setOpaque(false);
		cpPF3.setBounds(195, 441, 270, 45);
		changePwdPanel.add(cpPF3);
		
		/* 입력창 라벨 */
		JLabel cpL1 = new JLabel(); 					//비밀번호 변경 입력창 이미지
		cpL1.setBounds(0, 0, 500, 770);
		cpL1.setVisible(true);
		cpL1.setIcon(new ImageIcon("image/member/updatePwd/Group 878.png"));
		changePwdPanel.add(cpL1);
		
		
		changePwdPanel.revalidate();
		changePwdPanel.repaint();
		
		/* 취소 버튼 */
		JButton cpB1 = new JButton();					//비밀번호 변경 취소버튼
		MyPage.btnRemove(cpB1);
		cpB1.setVisible(true);
		cpB1.setBounds(58, 595, 178, 63);
		cpB1.setIcon(new ImageIcon("image/member/updatePwd/Group 677.png"));
		cpB1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("취소 버튼 클릭");
				changePwdPanel.setVisible(false);
				this.setVisible(true);
//			FrameManager.changePanel(frame, changePwdPanel, new MyPage(frame));
				
			}
		});
		changePwdPanel.add(cpB1);
		
		
		/* 변경 버튼 */
		JButton cpB2 = new JButton();					//비밀번호 변경 변경버튼
		MyPage.btnRemove(cpB2);
		cpB2.setVisible(true);
		cpB2.setBounds(264, 595, 178, 63);
		cpB2.setIcon(new ImageIcon("image/member/updatePwd/Group 879.png"));
		changePwdPanel.add(cpB2); 
		cpB2.addActionListener(new ActionListener() {
			
			@Override
			/* 입력한 비밀번호가 현재 비밀번호와 일치하는치 확인 */
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == cpB2) {
					
					String password = "";
					char[] pass = cpPF1.getPassword();
					for(int i = 0; i < pass.length; i++) {
						password += pass[i];
					}         
					changePwdDTO = new ChangePwdDTO();
					changePwdDTO.setMemberOldPassword(password);
					boolean checkP = memberController.pwdCheck(changePwdDTO);		 //입력값 일치 확인
					
					/* 새로 입력한 비밀번호와 비밀번호 재확인이 일치한지 확인*/
					if(checkP) {
						String newPassword = "";
						char[] newPass = cpPF2.getPassword();
						for(int i = 0; i < newPass.length; i++) {
							newPassword += newPass[i];
						}         
						
						String newPasswordReCheck = "";
						char[] newPassRc = cpPF3.getPassword();
						for(int i = 0; i < newPassRc.length; i++) {
							newPasswordReCheck += newPassRc[i];
						}         
						changePwdDTO.setMemberNewPassword(newPassword);
						changePwdDTO.setMemberNewPasswordRecheck(newPasswordReCheck);
						
						memberController.newPwdEqualCheck(changePwdDTO);
						
					} else {
						/* 입력정보 다를 시 팝업 출력 */
						PopupFrame.popup("image/popup/FailMessage.png");
						
					}
					
					
				}
			}
		});
		

}
}

