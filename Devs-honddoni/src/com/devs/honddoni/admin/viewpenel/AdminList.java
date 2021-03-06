package com.devs.honddoni.admin.viewpenel;

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

public class AdminList extends JPanel {
		

		
		private MainFrame frame;
		private AdminList adminList;
		private JButton btn1, btn2, btn3, btn4, btn5;

		
		public AdminList(MainFrame frame) {
		//프레임, 패널설정
		this.frame = frame;
		this.adminList = this;
		
		/* 전체패널 생성 */
		adminList.setBounds(0, 0, 500, 870);
		adminList.setLayout(null);
		adminList.setBackground(Color.white);
		frame.add(adminList);
		
		/* 하단 패널 생성 */
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.WHITE);
		adminList.add(bottomPanel);
		
		/* 상단 패널 생성 */
		JPanel topPanel = new JPanel();
		topPanel.setBounds(0, 0, 500, 100);
		topPanel.setLayout(null);
		topPanel.setBackground(Color.WHITE);
		adminList.add(topPanel);
		
		
		//혼또니마크(뒤로가기)
		 ImageIcon img0 = new ImageIcon ("image\\admin\\HondoniWrite.png");//상단 혼또니 마크
	     JButton btn0 = new JButton(img0);
	     
	     topPanel.add(btn0);
	     btn0.setBounds(303, 27, 172, 70);
//	     btn0.setOpaque(false);
	     btn0.setContentAreaFilled(false);
	     btn0.setBorderPainted(false);
	     
	       //탈퇴 요청회원 데이터 확인
		   ImageIcon img1 = new ImageIcon ("image\\admin\\Admin1-1.png");
		   JButton btn1 = new JButton(img1);
	       
		   //회원가입자 전체데이터
	       ImageIcon  img2 = new ImageIcon ("image\\\\admin\\\\Admin1-2.png");
	       JButton btn2 = new JButton(img2);
	       
	       //회원 업적관리
	       ImageIcon  img3 = new ImageIcon ("image\\\\admin\\\\Admin1-3.png");
	       JButton btn3 = new JButton(img3);
	       
	       //공지사항관리
	       ImageIcon  img4 = new ImageIcon ("image\\\\admin\\\\Admin1-4.png");
	       JButton btn4 = new JButton(img4);
	       
	       //관리자 목록2번째로 넘거가기
	       ImageIcon  img5 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\NextButtonNew.png");
	       JButton btn5 = new JButton(img5);
	       
	   
	  
	       //패널에 버튼 추가
	       bottomPanel.add(btn1);
	       bottomPanel.add(btn2);
	       bottomPanel.add(btn3);
	       bottomPanel.add(btn4);
	       bottomPanel.add(btn5);
	    
	       //버튼 위치 조정
	       btn1.setBounds(35, 29, 430, 121);
	       btn2.setBounds(34, 193, 430, 121);
	       btn3.setBounds(34, 356, 430, 121);
	       btn4.setBounds(33, 520, 430, 121);
	       btn5.setBounds(221, 698, 56, 25);
	       //테두리제거
	       btn1.setBorderPainted(false);
	       btn2.setBorderPainted(false);
	       btn3.setBorderPainted(false);
	       btn4.setBorderPainted(false);
	       btn5.setBorderPainted(false);
	       btn5.setContentAreaFilled(false);
	       
	       //관리자목록2번째로 넘어가는 버튼
	       btn5.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
	    		   
	    		   new AdminList1(frame);
	    		   adminList.setVisible(false); 

	    	   }
	       });
	       
	       //공지사항관리로 넘어가는버튼
	       btn4.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {

	    		   new Notice(frame);
	    		   adminList.setVisible(false); 

	    	   }
	       });
	       
	       //탈퇴요청회원으로 들어가
	       btn1.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {

	    		   new Delite(frame);
	    		   adminList.setVisible(false); 
	    		   
	    	   }
	       });
	       
	       //회원가입전체데이터
	       btn2.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
	    		   	    		  
	    		   new AllData(frame);
	    		   adminList.setVisible(false); 
	    	   }
	       });
	       
	       //회원 업적관리
	       btn3.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {

	    		   new Honnest(frame);
	    		   adminList.setVisible(false); 

	    	   }
	       });
	       
	       //뒤로가게 만들기
	       btn0.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
	    		   
	    		   new AdminList(frame);
	    		   adminList.setVisible(false); 
	    	   }
	       });
		}  
	}
	



		

	

		
