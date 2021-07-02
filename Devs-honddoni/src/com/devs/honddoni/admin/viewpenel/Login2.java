package com.devs.honddoni.admin.viewpenel;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.devs.honddoni.common.mainframe.MainFrame;

public class Login2 {
	
	MainFrame MainFrame = new MainFrame();
	
	public Login2() {

		/* 하단 패널 생성 */
		JPanel bottomPanel = new JPanel();

		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.WHITE);
		MainFrame.add(bottomPanel);
		
		ImageIcon  img1 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
	       JButton btn1 = new JButton("로그인");
	       
	       ImageIcon  img2 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
	       JButton btn2 = new JButton("아이디 찾기");
	       
	       ImageIcon  img3 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
	       JButton btn3 = new JButton("비밀번호 찾기");
	       
	       ImageIcon  img4 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
	       JButton btn4 = new JButton("혼또니 회원가입");
	       
	       JButton btn5 = new JButton("관리자 로그인 성공");
	       
	       JLabel label1 = new JLabel("혼또니 마크");
	       
	       JLabel label2 = new JLabel("혼또니 글씨");
	       
	       JLabel jl = new JLabel("아이디 : ");
	       JTextField jt = new JTextField();
	       
	       JLabel jl1 = new JLabel("패스워드 : ");
	       JTextField jt1 = new JTextField();
	  
	       //패널에 버튼 추가
	       bottomPanel.add(btn1);
	       bottomPanel.add(btn2);
	       bottomPanel.add(btn3);
	       bottomPanel.add(btn4);
	       bottomPanel.add(btn5);
	       bottomPanel.add(label1);
	       bottomPanel.add(label2);
	       bottomPanel.add(jl);
	       bottomPanel.add(jt);
	       bottomPanel.add(jl1);
	       bottomPanel.add(jt1);
	       
	       //버튼 위치 조정
	       btn1.setBounds(34, 592, 430, 62);
	       btn2.setBounds(57, 724, 110, 40);
	       btn3.setBounds(195, 724, 110, 40);
	       btn4.setBounds(333, 724, 110, 40);
	       btn5.setBounds(28, 253, 442, 231);
	       label1.setBounds(174, 81, 151, 153);
	       label2.setBounds(130, 257, 240, 98);
	       jl.setBounds(34, 431, 430, 62);
	       jt.setBounds(34, 431, 430, 62);
	       jl1.setBounds(34, 512, 430, 62);
	       jt1.setBounds(34, 512, 430, 62);
	     
	       //컨테이너에 패널 추가
	       MainFrame.add(bottomPanel);
	       MainFrame.setVisible(true); //창을 보이게함
	}
}