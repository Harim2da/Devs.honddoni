package com.devs.honddoni.admin.viewpenel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//import com.devs.honddoni.admin.viewmiddle.login2;
import com.devs.honddoni.admin.viewpenel.MainFrame1;

public class AdminList {
	
	
	MainFrame mainFrame = new MainFrame();
	
	private JButton btn1, btn2, btn3, btn4, btn5;
	
	public AdminList() {

		/* 하단 패널 생성 */
		JPanel bottomPanel = new JPanel();

		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.WHITE);
		mainFrame.add(bottomPanel);
		
		   ImageIcon img1 = new ImageIcon ("image\\admin\\Admin1-1.png");
		   JButton btn1 = new JButton(img1);
	       
	       ImageIcon  img2 = new ImageIcon ("image\\\\admin\\\\Admin1-2.png");
	       JButton btn2 = new JButton(img2);
	       
	       ImageIcon  img3 = new ImageIcon ("image\\\\admin\\\\Admin1-3.png");
	       JButton btn3 = new JButton(img3);
	       
	       ImageIcon  img4 = new ImageIcon ("image\\\\admin\\\\Admin1-4.png");
	       JButton btn4 = new JButton(img4);
	       
	       ImageIcon  img5 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\AdminNext.png");
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
	   
	     
	       //컨테이너에 패널 추가
	       mainFrame.add(bottomPanel);
	       mainFrame.setVisible(true); //창을 보이게함
	       
	       btn5.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   new AdminList1();
	    		   bottomPanel.setVisible(false); 
	    		   mainFrame.setVisible(false);
	    	   }
	       });
	       
	       btn4.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   new Notice();
	    		   bottomPanel.setVisible(false); 
	    		   mainFrame.setVisible(false);
	    	   }
	       });
	       
	       btn1.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   new Delite();
	    		   bottomPanel.setVisible(false); 
	    		   mainFrame.setVisible(false);
	    	   }
	       });
	       
	       btn2.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   new AllData();
	    		   bottomPanel.setVisible(false); 
	    		   mainFrame.setVisible(false);
	    	   }
	       });
	       
	       btn3.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   new Honnest();
	    		   bottomPanel.setVisible(false); 
	    		   mainFrame.setVisible(false);
	    	   }
	       });
	       
	}
}

		

	

		
