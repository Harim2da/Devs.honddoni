package com.devs.honddoni.member.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegistMember extends JFrame {
	
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
		
		registFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		registFrame.setVisible(true);
		
	}
	
	public void setPanel() {
		
		/* 제일 기본 패널 */
		firstPanel = new JPanel();
		firstPanel.setBounds(0, 0, 500, 870);
		firstPanel.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* 로고 들어갈 상단부 패널 */
		JPanel upsidePanel = new JPanel();
		upsidePanel.setBounds(0, 0, 500, 100);
		upsidePanel.setBackground(Color.BLACK);
		
		/* 세부내용 들어갈 나머지 패널 */
		JPanel downsidePanel = new JPanel();
		downsidePanel.setBounds(0, 100, 500, 770);
		downsidePanel.setBackground(Color.WHITE);
		
		/* 혼또니 로고버튼 */
		JButton honddoniBtn = new JButton("");
		honddoniBtn.setBounds(305, 29, 173, 71);
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
		nameTf.setBounds(108, 138, 49, 26);
		
		
		
		/* 버튼 추가 */
		JButton agreeBtn = new JButton();
		agreeBtn.setBounds(123, 773, 111, 41);
		agreeBtn.setContentAreaFilled(false);
		agreeBtn.setBorderPainted(false);
		
		JButton cancelBtn = new JButton();
		
		
		
		/* 컴포넌트 올리기 */
		memberDataLb.add(nameTf);
		
		upsidePanel.add(honddoniBtn);
		downsidePanel.add(memberDataLb);		
		
		firstPanel.add(upsidePanel);
		firstPanel.add(downsidePanel);		
	}	
	
	
	

}
