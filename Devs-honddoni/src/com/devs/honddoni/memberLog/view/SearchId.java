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
import com.devs.honddoni.common.mainframe.FrameManager;
import com.devs.honddoni.common.mainframe.MainFrame;
import com.devs.honddoni.memberLog.controller.MemberLogController;
import com.devs.honddoni.memberLog.model.dto.SearchIdDTO;

public class SearchId extends JPanel{
	
	private MainFrame frame; 
	private SearchId searchId;
	
	private MemberLogView memberLogView; //newPanel로 쓸 것 
	
	private MemberLogController memberLogController = new MemberLogController(); //이어질 기능
	private SearchIdDTO searchIdDTO;	
	FontManager font = new FontManager();
	
	public SearchId(MainFrame frame) {
		
		this.frame = frame;
		this.searchId = this;
						
		/* 제일 기본 패널 */
		searchId.setBounds(0, 0, 500, 870);
		searchId.setLayout(null);
		searchId.setBackground(Color.WHITE);
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
				if(e.getSource() == honddoniBtn) {					
					/* 로그인 창으로 이동 */			
					frame.remove(searchId);
					searchId.setVisible(false);					
					memberLogView = new MemberLogView(frame);
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
		
		/* 이름입력과 휴대폰번호입력하는 텍필 */
		JTextField nameTf = new JTextField();
		nameTf.setBounds(150, 188, 230, 44);		
		nameTf.setBorder(null);
		nameTf.setOpaque(false);
		nameTf.setFont(font.customFont12);
		JTextField phoneTf = new JTextField();		
		phoneTf.setBounds(160, 300, 230, 44);
		phoneTf.setBorder(null);
		phoneTf.setOpaque(false);
		phoneTf.setFont(font.customFont12);
		
		/* 확인버튼 */
		JButton agreeBtn = new JButton();
		agreeBtn.setBounds(96, 434, 111, 41);
		agreeBtn.setIcon(new ImageIcon("image/memberLog/findid/findid_2_agree_btn.png"));
		agreeBtn.setContentAreaFilled(false);
		agreeBtn.setBorderPainted(false);
		agreeBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				/* 입력받은 값을 DTO로 모아서 아이디조회기능으로 연결 */
				searchIdDTO = new SearchIdDTO();				
				searchIdDTO.setName(nameTf.getText());
				searchIdDTO.setPhone(phoneTf.getText());
				
				/* 실행하고나서, 맞다면 해당하는 아이디를, 아니라면 "입력오류"를 문자열로 돌려주는 기능 */
				memberLogController.searchId(searchIdDTO);				
				
			}
		});
		
		JButton cancelBtn = new JButton();
		cancelBtn.setBounds(241, 434, 111, 41);
		cancelBtn.setIcon(new ImageIcon("image/memberLog/findid/findid_3_cancel_btn.png"));
		cancelBtn.setContentAreaFilled(false);
		cancelBtn.setBorderPainted(false);
		cancelBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {				
				/* 로그인 창으로 이동 */	
				frame.remove(searchId);
				searchId.setVisible(false);					
				memberLogView = new MemberLogView(frame);
				frame.repaint();
				frame.revalidate();
				
			}
		});
		
		
		/* 컴포넌트 붙이기 */
		searchIdLb.add(nameTf);
		searchIdLb.add(phoneTf);
		searchIdLb.add(agreeBtn);
		searchIdLb.add(cancelBtn);		
		searchId.add(honddoniBtn);
		searchId.add(searchIdLb);
				
		searchId.setVisible(true);
		
		frame.repaint();
		frame.revalidate();
	}
}
