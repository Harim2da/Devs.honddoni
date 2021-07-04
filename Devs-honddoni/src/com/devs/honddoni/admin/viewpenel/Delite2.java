package com.devs.honddoni.admin.viewpenel;

import java.awt.Color; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Delite2 {
	//탈퇴요청 회원 화면
	
	MainFrame1 MainFrame = new MainFrame1();
	
	private JButton btn1, btn2, btn3, btn4, btn5;
	
	public Delite2() {

		/* 하단 패널 생성 */
		JPanel bottomPanel = new JPanel();

		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.WHITE);
		MainFrame.add(bottomPanel);
		
		   ImageIcon img1 = new ImageIcon ("image\\admin\\DeliteData1.png");//탈퇴회원정보
	       JButton btn1 = new JButton(img1);
	       
	       ImageIcon  img2 = new ImageIcon ("image\\\\admin\\\\DeliteData2.png");
	       JButton btn2 = new JButton(img2);
	       
	       
	       ImageIcon  img6 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\DeliteData5.png");
	       JLabel lb1 = new JLabel();
	       

	       ImageIcon  img8 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\FindBack.png");//다음페이지
	       JButton btn8 = new JButton(img8);
	       
	       ImageIcon  img9 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Find.png");//검색
	       JButton btn9 = new JButton(img9);
	       
	       
	   
	  
	       //패널에 버튼 추가
	       bottomPanel.add(btn1);//탈퇴회원 버튼
	       bottomPanel.add(btn2);

	       bottomPanel.add(lb1);
	       bottomPanel.add(btn8);//다음페이지
	       bottomPanel.add(btn9);//검색버튼
	       //버튼 위치 조정
	       btn1.setBounds(35, 143, 430, 121);
	       btn2.setBounds(34, 262, 430, 121);
	       lb1.setBounds(56, -17, 263, 33);
	       btn8.setBounds(181, 95, 136, 21);//다음페이지
	       btn9.setBounds(31, 19, 430, 62);//다음페이지
	   
	     
	       //컨테이너에 패널 추가
	       MainFrame.add(bottomPanel);
	       MainFrame.setVisible(true); //창을 보이게함
	       
	       btn1.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   new Login2();
	    		   bottomPanel.setVisible(false);
//	    		  MainFrame.setVisible(false);
	    	   }
	       });
	       
	       //관리자메뉴 1로 돌아가게함
	       btn8.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   new Delite();
	    		   bottomPanel.setVisible(false);
//	    		  MainFrame.setVisible(false);
	    	   }
	       });
	       
	       btn8.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   new Delite();
	    		   bottomPanel.setVisible(false);
//	    		  MainFrame.setVisible(false);
	    	   }
	       });
	}
}

		