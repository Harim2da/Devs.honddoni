package com.devs.honddoni.admin.viewpenel;

import java.awt.Color; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

//업적관리 화면

public class Honnest {
	
	MainFrame1 MainFrame = new MainFrame1();
	
	private JButton btn1, btn2, btn3, btn4, btn5;
	
	public Honnest() {

		/* 하단 패널 생성 */
		JPanel bottomPanel = new JPanel();

		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.WHITE);
		MainFrame.add(bottomPanel);
		
		   ImageIcon img1 = new ImageIcon ("image\\admin\\Side.png");
	       JButton btn1 = new JButton(img1);
	       
	       ImageIcon  img2 = new ImageIcon ("image\\\\admin\\\\Side.png");
	       JButton btn2 = new JButton(img2);
	       
	       ImageIcon  img3 = new ImageIcon ("image\\\\admin\\\\Side.png");
	       JButton btn3 = new JButton(img3);
	       
	       ImageIcon  img4 = new ImageIcon ("image\\\\admin\\\\Side.png");
	       JButton btn4 = new JButton(img4);
	       
	       ImageIcon  img5 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Side.png");
	       JButton btn5 = new JButton(img5);
	       
	       ImageIcon  img6 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Delite.png");
	       JLabel lb1 = new JLabel();
	       
	       
	   
	  
	       //패널에 버튼 추가
	       bottomPanel.add(btn1);
	       bottomPanel.add(btn2);
	       bottomPanel.add(btn3);
	       bottomPanel.add(btn4);
	       bottomPanel.add(btn5);
	       bottomPanel.add(lb1);
	    
	       //버튼 위치 조정
	       btn1.setBounds(35, 143, 430, 121);
	       btn2.setBounds(34, 262, 430, 121);
	       btn3.setBounds(34, 380, 430, 121);
	       btn4.setBounds(33, 498, 430, 121);
	       btn5.setBounds(34, 616, 430, 104);
	       lb1.setBounds(56, 0, 263, 33);
	   
	     
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
	}
}

		

	
