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
import com.devs.honddoni.member.controller.MemberController;

public class SearchId extends JPanel{
	
	MemberLogView memberLogView;
	private MemberController memberController = new MemberController();
	
//	MainFrame frame; 나중엔 여기로 이동
	TestFrame frame; //임시
	
	private JPanel firstPanel;
	
	public SearchId(TestFrame testFrame) {
		
		this.frame = testFrame;
						
		/* 제일 기본 패널 */
		firstPanel = new JPanel();
		firstPanel.setBounds(0, 0, 500, 870);
		firstPanel.setLayout(null);
		firstPanel.setBackground(Color.YELLOW);
		
		
		/* 혼또니 로고버튼 */
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
		nameTf.setBounds(267, 453, 105, 26);		
		JTextField phoneTf = new JTextField();		
		phoneTf.setBounds(267, 453, 105, 26);
		
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
		
		
		frame.add(firstPanel);		
		
	}
	
	

}
