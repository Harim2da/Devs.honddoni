package com.devs.honddoni.admin.viewpenel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdminPostDelite2 {
	
	//전체게시글 조회
	
	MainFrame1 MainFrame = new MainFrame1();
	
	private JButton btn1, btn2, btn3, btn4, btn5;
	private JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10, lb11, lb12, lb13, lb14, lb15, lb16,
	lb17, lb18, lb19, lb20, lb21; 
	
	public AdminPostDelite2() {

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
		
		//상단패널의 두로가기버튼
		 ImageIcon img0 = new ImageIcon ("image\\admin\\HondoniWrite.png");//상단 혼또니 마크
	     JButton btn0 = new JButton(img0);
	     
	     //상단패널 뒤로가기버튼
	     topPanel.add(btn0);
	     btn0.setBounds(303, 27, 172, 70);
	     btn0.setContentAreaFilled(false);
	     btn0.setBorderPainted(false);
	     
	     //버튼만들기
	     	
	       //게시글쪽 라벨
		   ImageIcon img1 = new ImageIcon ("image\\admin\\AdminPostDelite1.png");
	       JLabel btn1 = new JLabel(img1);
	       
		   ImageIcon img2 = new ImageIcon ("image\\admin\\AdminPostDelite2.png");
	       JLabel btn2 = new JLabel(img2);
	       
		   ImageIcon img3 = new ImageIcon ("image\\admin\\AdminPostDelite3.png");
	       JLabel btn3 = new JLabel(img3);
	       
		   ImageIcon img4 = new ImageIcon ("image\\admin\\AdminPostDelite4.png");
	       JLabel btn4 = new JLabel(img4);
	       
		   ImageIcon img5 = new ImageIcon ("image\\admin\\AdminPostDelite5.png");
	       JLabel btn5 = new JLabel(img5);
	       
		   ImageIcon img6 = new ImageIcon ("image\\admin\\AdminPostDelite6.png");
	       JLabel btn6 = new JLabel(img6);
	       
	       //확인,수정,삭제 버튼
		   ImageIcon img7 = new ImageIcon ("image\\admin\\AdminPostDelite7.png");
	       JButton btn7 = new JButton(img7);
	       
		   ImageIcon img8 = new ImageIcon ("image\\admin\\AdminPostDelite8.png");
		   JButton btn8 = new JButton(img8);
	       
		   ImageIcon img9 = new ImageIcon ("image\\admin\\AdminPostDelite9.png");
		   JButton btn9 = new JButton(img9);
		   
		   ImageIcon img10 = new ImageIcon ("image\\admin\\AdminPostDelite10.png");
		   JButton btn10 = new JButton(img10);
		   
		   
	       
	       
		    
		    
		    
	      // 패널에 버튼 추가
	       bottomPanel.add(btn1);
	       bottomPanel.add(btn2);
	       bottomPanel.add(btn3);
	       bottomPanel.add(btn4);
	       bottomPanel.add(btn5);
	       bottomPanel.add(btn6);
	       bottomPanel.add(btn7);
	       bottomPanel.add(btn8);
	       bottomPanel.add(btn9);
	       bottomPanel.add(btn10);
	       
	    
	       //첫번째부터 다섯번째까지 게시글버튼
	       btn1.setBounds(35, 15, 431, 42);
	       btn2.setBounds(35, 77, 211, 42);
	       btn3.setBounds(255, 77, 211, 42);
	       btn4.setBounds(35, 140, 431, 42);
	       btn5.setBounds(35, 202, 431, 42);
	       btn6.setBounds(35, 263, 431, 401);
	       btn7.setBounds(35, 687, 139, 41);
	       btn8.setBounds(180, 687, 139, 41);
	       btn9.setBounds(326, 687, 139, 41);
		   btn7.setContentAreaFilled(false);
		   btn7.setBorderPainted(false);
		   btn8.setContentAreaFilled(false);
		   btn8.setBorderPainted(false);
		   btn9.setContentAreaFilled(false);
		   btn9.setBorderPainted(false);
		   btn10.setBounds(28, 241, 443, 232);
	       
	       
	       
	       

		    
	       //컨테이너에 패널 추가
	       MainFrame.add(bottomPanel);
	       MainFrame.setVisible(true); //창을 보이게함
	       
	       //뒤로가기 액션
	       btn0.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   new AdminList1();
	    		   bottomPanel.setVisible(false);
//	    		  MainFrame.setVisible(false);
	    	   }
	       });
	       
	       btn10.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   new AdminList1();
	    		   bottomPanel.setVisible(false);
//	    		  MainFrame.setVisible(false);
	    	   }
	       });
	       

	}
}