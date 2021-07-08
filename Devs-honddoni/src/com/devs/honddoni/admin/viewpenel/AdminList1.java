package com.devs.honddoni.admin.viewpenel;

import java.awt.Color;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.devs.honddoni.admin.viewpenel.MainFrame1;
import com.devs.honddoni.common.mainframe.MainFrame;
import com.devs.honddoni.common.mainframe.PopupFrame;
import com.devs.honddoni.memberLog.view.LoginFail;
import com.devs.honddoni.memberLog.view.MemberLogView;

//관리자목록2

public class AdminList1 extends JPanel {
	

	private MainFrame frame;
	private AdminList1 adminList1;
	private JButton btn1, btn2, btn3, btn4, btn5;
	AdminAll adminall;
	
	
	public AdminList1(MainFrame frame) {
		//프레임, 패널설정
		this.frame = frame;
		this.adminList1 = this;
		
		//전체 패널 생성
		adminList1.setBounds(0, 0, 500, 870);
		adminList1.setLayout(null);
		adminList1.setBackground(Color.white);
		frame.add(adminList1);
		
		/* 하단 패널 생성 */
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.WHITE);
		adminList1.add(bottomPanel);
		
		
		/* 상단 패널 생성 */
		JPanel topPanel = new JPanel();
		topPanel.setBounds(0, 0, 500, 100);
		topPanel.setLayout(null);
		topPanel.setBackground(Color.WHITE);
		adminList1.add(topPanel);
		
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
	       btn5.setBorderPainted(false);
	       
//	       //컨테이너에 패널 추가
//	       MainFrame.add(bottomPanel);
//	       MainFrame.setVisible(true); //창을 보이게함
	       
	       btn5.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);  
	    		   
	    		   new MemberLogView(frame);
	    		   adminList1.setVisible(false);
//	    		   frame.setVisible(false);
	    	   }
	       });
	       
	       btn6.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   new AdminList(frame);
	    		   adminList1.setVisible(false);
//	    		   adminList.setVisible(false);
	    	   }
	       });
	       
	       btn1.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   adminall = new AdminAll(frame);
	    		   adminList1.setVisible(false);
//	    		   adminList.setVisible(false);
	    		   
	    		   btn1.setVisible(false);
	    		   btn2.setVisible(false);
	    		   btn3.setVisible(false);
	    		   btn4.setVisible(false);
	    		   btn5.setVisible(false);
	    		   btn6.setVisible(false);
//	    		   btn1.remove(btn1);
//	    		   btn2.remove(btn2);
//	    		   btn3.remove(btn3);
//	    		   btn4.remove(btn4);
//	    		   btn5.remove(btn5);
//	    		   btn6.remove(btn6);
//	    		   adminall.repaint();
//	    		   adminall.revalidate();
	    	   }
	       });
	       
	       btn2.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   new AdminPost(frame);
	    		   adminList1.setVisible(false);
//	    		   adminList.setVisible(false);
	    	   }
	       });
	       
	       btn3.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   new AdminUser(frame);
	    		   adminList1.setVisible(false);
//	    		   adminList.setVisible(false);
	    	   }
	       });
	       
	       btn0.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   new AdminList1(frame);
	    		   adminList1.setVisible(false); 
//	    		   adminList.setVisible(false);
	    	   }
	       });
	       
	       btn4.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   new AdminComment(frame);
	    		   adminList1.setVisible(false); 
//	    		   adminList.setVisible(false);
	    	   }
	       });
	       
	       btn5.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
//	    		   new AdminList2(frame);
	    		   adminList1.setVisible(false); 
	    		   
	    		   PopupFrame.popup("image/popup/logoutSuccess.png");
//	    		   adminList.setVisible(false);
	    	   }
	       });
	}
}