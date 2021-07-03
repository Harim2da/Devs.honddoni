package com.devs.honddoni.memberLog.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.devs.honddoni.common.mainframe.FrameManager;
import com.devs.honddoni.common.mainframe.MainFrame;
import com.devs.honddoni.memberLog.controller.MemberLogController;
import com.devs.honddoni.memberLog.model.dto.SearchIdDTO;

public class SearchId extends JPanel{
	
	MainFrame frame; 
//	TestFrame frame; //임시
	SearchId searchId;
	
	private MemberLogView memberLogView; //newPanel로 쓸 것 
	
	private MemberLogController memberLogController;
	private SearchIdDTO searchIdDTO;	
	
	public SearchId(MainFrame mainFrame) {
		
		this.frame = mainFrame;
		this.searchId = this;
						
		/* 제일 기본 패널 */
//		searchId = new JPanel();
		searchId.setBounds(0, 0, 500, 870);
		searchId.setLayout(null);
		searchId.setBackground(Color.YELLOW);
		
		
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
										
					memberLogView = new MemberLogView(frame);
//					FrameManager.changePanel(mainframe, firstPanel, newPanel);					
					frame.remove(searchId);
					frame.add(memberLogView);
					frame.repaint();
					frame.revalidate();
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
		nameTf.setBounds(250, 346, 150, 26);		
		JTextField phoneTf = new JTextField();		
		phoneTf.setBounds(250, 453, 150, 26);
		
		JButton agreeBtn = new JButton();
		agreeBtn.setBounds(131, 581, 111, 41);
		agreeBtn.setIcon(new ImageIcon("image/memberLog/findid/findid_2_agree_btn.png"));
		agreeBtn.setContentAreaFilled(false);
		agreeBtn.setBorderPainted(false);
		agreeBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//아이디조회기능
				System.out.println("아이디 조회기능으로~");
				memberLogController = new MemberLogController();
								
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
					System.out.println("회원님의 아이디는 " + result + " 입니다.");					
				}				
				
			}
		});
		
		JButton cancelBtn = new JButton();
		cancelBtn.setBounds(278, 581, 111, 41);
		cancelBtn.setIcon(new ImageIcon("image/memberLog/findid/findid_3_cancel_btn.png"));
		cancelBtn.setContentAreaFilled(false);
		cancelBtn.setBorderPainted(false);
		cancelBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {				
				
				//로그인창으로 나감
				System.out.println("로그인 창으로~");
				
				memberLogView = new MemberLogView(frame);
//				FrameManager.changePanel(frame, firstPanel, new MemberLogView(frame));				
				frame.remove(searchId);
				frame.add(memberLogView);
				frame.repaint();
				frame.revalidate();
				
			}
		});
		
		
		/* 컴포넌트 붙이기 */
		searchId.add(honddoniBtn);
		searchId.add(searchIdLb);
		searchId.add(nameTf);
		searchId.add(phoneTf);
		searchId.add(agreeBtn);
		searchId.add(cancelBtn);		
				
		searchId.setVisible(true);
		
		frame.add(searchId);		
		frame.repaint();
		frame.revalidate();
	}
	
	

}
