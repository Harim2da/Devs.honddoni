package com.devs.honddoni.admin.viewpenel;

import java.awt.Color; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import com.devs.honddoni.common.mainframe.MainFrame;

public class AdminList1 {
	
	MainFrame MainFrame = new MainFrame();
	
	private JButton btn1, btn2, btn3, btn4, btn5;
	
	public AdminList1() {

		/* 하단 패널 생성 */
		JPanel bottomPanel = new JPanel();

		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.WHITE);
		MainFrame.add(bottomPanel);
		
		   ImageIcon img1 = new ImageIcon ("image\\admin\\Admin2-1.png");
	       JButton btn1 = new JButton(img1);
	       
	       ImageIcon  img2 = new ImageIcon ("image\\\\admin\\\\Admin2-2.png");
	       JButton btn2 = new JButton(img2);
	       
	       ImageIcon  img3 = new ImageIcon ("image\\\\admin\\\\Admin2-3.png");
	       JButton btn3 = new JButton(img3);
	       
	       ImageIcon  img4 = new ImageIcon ("image\\\\admin\\\\Admin2-4.png");
	       JButton btn4 = new JButton(img4);
	       
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
	       
	       //컨테이너에 패널 추가
	       MainFrame.add(bottomPanel);
	       MainFrame.setVisible(true); //창을 보이게함
	       
	       btn5.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   new AdminList2();
	    		   bottomPanel.setVisible(false);
	    		   MainFrame.setVisible(false);
	    	   }
	       });
	       
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
	    		   
	    		   new AdminPost();
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
	    		   
	    		   new AdminUser();
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
	    		   
	    		   new AdminComment();
	    		   bottomPanel.setVisible(false);
	    		   MainFrame.setVisible(false);
	    	   }
	       });
	}
}