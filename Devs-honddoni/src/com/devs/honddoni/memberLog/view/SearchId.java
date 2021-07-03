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
import com.devs.honddoni.memberLog.model.dto.SearchIdDTO;

public class SearchId extends JPanel{
	
//	MainFrame frame; 나중엔 여기로 이동
	TestFrame frame; //임시
	
	private MemberLogController memberLogController = new MemberLogController();
	private MemberLogView memberLogView;
	private SearchIdDTO searchIdDTO;
	
	private JPanel firstPanel;
	
	public SearchId(TestFrame testFrame) {
		
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
										
//					FrameManager.changePanel(mainframe, firstPanel, newPanel);
				}
				
			}
		});
		
		/* 이름과 핸드폰번호 적을 공간 라벨 */
		JLabel searchIdLb = new JLabel();
		searchIdLb.setBounds(35, 145, 431, 641);
		searchIdLb.setBackground(null);
		searchIdLb.setIcon(new ImageIcon("image/memberLog/findid/findid_1.png"));
		
		//이름입력과 휴대폰번호입력 텍필
		JTextField nameTf = new JTextField();
		nameTf.setBounds(267, 453, 150, 26);		
		JTextField phoneTf = new JTextField();		
		phoneTf.setBounds(267, 453, 150, 26);
		
		JButton agreeBtn = new JButton();
		agreeBtn.setBounds(123, 773, 111, 41);
		agreeBtn.setIcon(new ImageIcon("image/memberLog/findid/findid_2_agree_btn.png"));
		agreeBtn.setContentAreaFilled(false);
		agreeBtn.setBorderPainted(false);
		agreeBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//아이디 조회기능
				System.out.println("아이디 조회기능으로~");
				
				searchIdDTO = new SearchIdDTO();
				
				searchIdDTO.setName(nameTf.getText());
				searchIdDTO.setPhone(phoneTf.getText());
				
				System.out.println("searchIdDTO 입력값 : " + searchIdDTO); //아무것도 입력 안 하면 null인가?
				
				//실행하고나서, 맞다면 해당하는 아이디를, 아니라면 "입력오류"를 돌려줌
				String result = memberLogController.searchId(searchIdDTO);
				
				//제대로 일치하면 아이디를 출력해주기
				if(result.equals("입력오류")) {
					System.out.println("이름 또는 핸드폰 번호가 잘못입력되었습니다.");
				} else {
					System.out.println("회원님의 아이디는" + result + "입니다.");					
				}				
				
			}
		});
		
		JButton cancelBtn = new JButton();
		cancelBtn.setBounds(123, 773, 111, 41);
		cancelBtn.setIcon(new ImageIcon("image/memberLog/findid/findid_3_cancel_btn.png"));
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
		firstPanel.add(searchIdLb);
		firstPanel.add(nameTf);
		firstPanel.add(phoneTf);
		firstPanel.add(agreeBtn);
		firstPanel.add(cancelBtn);		
				
		firstPanel.setVisible(true);
		
//		frame.add(firstPanel);		
		
	}
	
	

}
