package com.devs.honddoni.admin.viewpenel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

//신고된 게시글 관리

public class AdminPost2 {
	
	MainFrame1 MainFrame = new MainFrame1();
	
	private JButton btn1, btn2, btn3, btn4, btn5;
	
	public AdminPost2() {

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
	     
		
		   ImageIcon img1 = new ImageIcon ("image\\admin\\AdminPost1.png");
	       JButton btn1 = new JButton(img1);
	       
	       ImageIcon  img2 = new ImageIcon ("image\\\\admin\\\\AdminPost2.png");
	       JButton btn2 = new JButton(img2);
	       
	       ImageIcon  img3 = new ImageIcon ("image\\\\admin\\\\AdminPost3.png");
	       JButton btn3 = new JButton(img3);
	       
//	       ImageIcon  img4 = new ImageIcon ("image\\\\admin\\\\AdminPost4.png");
//	       JButton btn4 = new JButton(img4);
//	       
//	       ImageIcon  img5 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Side.png");
//	       JButton btn5 = new JButton(img5);
//	       
	       ImageIcon  img6 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Delite.png");
	       JLabel lb1 = new JLabel();
	       
	       ImageIcon  img10 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Find.png");//검색
	       JButton btn10 = new JButton(img10);
	       
	       ImageIcon  img11 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Findnext.png");//이전페이지
	       JButton btn11 = new JButton(img11);
	       
	       
	   
	  
	       //패널에 버튼 추가
	       bottomPanel.add(btn1);
	       bottomPanel.add(btn2);
	       bottomPanel.add(btn3);
//	       bottomPanel.add(btn4);
//	       bottomPanel.add(btn5);
	       bottomPanel.add(lb1);
	       bottomPanel.add(btn10);
	       bottomPanel.add(btn11);
	    
	       //버튼 위치 조정
	       btn1.setBounds(35, 143, 430, 121);
	       btn2.setBounds(34, 262, 430, 121);
	       btn3.setBounds(34, 380, 430, 121);
//	       btn4.setBounds(33, 498, 430, 121);
//	       btn5.setBounds(34, 616, 430, 104);
	       lb1.setBounds(56, 0, 263, 33);
	       btn10.setBounds(31, 19, 430, 62);
	       btn11.setBounds(181, 95, 136, 21);
	     
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
	       
	       btn11.addActionListener(new ActionListener() {
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
	}
}