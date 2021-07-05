package com.devs.honddoni.admin.viewpenel;

import java.awt.Color;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

//관리자목록2

public class AdminList1 {
	
	MainFrame1 MainFrame = new MainFrame1();
	
	private JButton btn1, btn2, btn3, btn4, btn5;
	
	public AdminList1() {

		/* 하단 패널 생성 */
		JPanel bottomPanel = new JPanel();

		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.WHITE);
		MainFrame.add(bottomPanel);
		
		
		/* 상단 패널 생성 */
		JPanel topPanel = new JPanel();
		topPanel.setBounds(0, 0, 500, 100);
		topPanel.setLayout(null);
		topPanel.setBackground(Color.WHITE);
		MainFrame.add(topPanel);
		
		 ImageIcon img0 = new ImageIcon ("image\\admin\\HondoniWrite.png");//상단 혼또니 마크
	     JButton btn0 = new JButton(img0);
	     
	     topPanel.add(btn0);
	     btn0.setBounds(303, 27, 172, 70);
	     btn0.setContentAreaFilled(false);
	     btn0.setBorderPainted(false);
	       //게시글 관리
		   ImageIcon img1 = new ImageIcon ("image\\admin\\Admin2-1.png");
	       JButton btn1 = new JButton(img1);
	       //신고처리-게시글
	       ImageIcon  img2 = new ImageIcon ("image\\\\admin\\\\Admin2-2.png");
	       JButton btn2 = new JButton(img2);
	       //신고처리-사용자
	       ImageIcon  img3 = new ImageIcon ("image\\\\admin\\\\Admin2-3.png");
	       JButton btn3 = new JButton(img3);
	       
	       //신고된 댓글
	       ImageIcon  img4 = new ImageIcon ("image\\\\admin\\\\Admin2-4.png");
	       JButton btn4 = new JButton(img4);
	       //관리자 로그 아웃
	       ImageIcon  img5 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Admin2-5.png");
	       JButton btn5 = new JButton(img5);
	       
	       ImageIcon  img6 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Next2.png");
	       JButton btn6 = new JButton(img6);
	       
	       //패널에 버튼 추가
	       bottomPanel.add(btn1);
	       bottomPanel.add(btn2);
	       bottomPanel.add(btn3);
	       bottomPanel.add(btn4);
	       bottomPanel.add(btn5);
	       bottomPanel.add(btn6);
	    
	       //버튼 위치 조정
	       btn1.setBounds(35, 24, 430, 96);
	       btn2.setBounds(33, 153, 430, 96);
	       btn3.setBounds(33, 283, 430, 96);
	       btn4.setBounds(33, 413, 430, 96);
	       btn5.setBounds(33, 543, 430, 96);
	       btn6.setBounds(221, 698, 56, 25);
	       btn1.setBorderPainted(false);
	       btn2.setBorderPainted(false);
	       btn3.setBorderPainted(false);
	       btn4.setBorderPainted(false);
	       
	       //컨테이너에 패널 추가
	       MainFrame.add(bottomPanel);
	       MainFrame.setVisible(true); //창을 보이게함
	       
//	       btn5.addActionListener(new ActionListener() {
//	    	   @Override
//	    	   public void actionPerformed(ActionEvent e) {
////	    		   login2 login2 = new login2();
////	    		   JPanel.add(login2);
////	    		   new login2();
////	    		   bottomPanel.setVisible(false);
//	    		   
//	    		   new AdminList2();
//	    		   bottomPanel.setVisible(false);
//	    		   MainFrame.setVisible(false);
//	    	   }
//	       });
	       
	       btn6.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   new AdminList();
	    		   bottomPanel.setVisible(false);
	    		   MainFrame.setVisible(false);
	    	   }
	       });
	       
	       btn1.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   new AdminAll();
	    		   bottomPanel.setVisible(false);
	    		   MainFrame.setVisible(false);
	    	   }
	       });
	       
	       btn2.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   new AdminPost();
	    		   bottomPanel.setVisible(false);
	    		   MainFrame.setVisible(false);
	    	   }
	       });
	       
	       btn3.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   new AdminUser();
	    		   bottomPanel.setVisible(false);
	    		   MainFrame.setVisible(false);
	    	   }
	       });
	       
	       btn0.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   new AdminList1();
	    		   bottomPanel.setVisible(false); 
	    		   MainFrame.setVisible(false);
	    	   }
	       });
	       
	       btn4.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   new AdminComment();
	    		   bottomPanel.setVisible(false); 
	    		   MainFrame.setVisible(false);
	    	   }
	       });
	}
}