package com.devs.honddoni.admin.viewpenel;

import java.awt.Color; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		ImageIcon  img1 = new ImageIcon ("image\\admin\\Login.png");
	       JButton btn1 = new JButton(img1);
	       
	       ImageIcon  img2 = new ImageIcon ("image\\admin\\FindId.png");
	       JButton btn2 = new JButton(img2);
	       
	       ImageIcon  img3 = new ImageIcon ("image\\admin\\FindPss.png");
	       JButton btn3 = new JButton(img3);
	       
	       ImageIcon  img4 = new ImageIcon ("image\\admin\\Enjoy.png");
	       JButton btn4 = new JButton(img4);
	       
	       ImageIcon  img5 = new ImageIcon ("image\\admin\\ImageMark.png");
	       JLabel label1 = new JLabel(img5);
	       
	       ImageIcon  img6 = new ImageIcon ("image\\admin\\Mark.png");
	       JLabel label2 = new JLabel(img6);
	       
	       JLabel jl = new JLabel("아이디 : ");
	       JTextField jt = new JTextField();
	       
	       JLabel jl1 = new JLabel("패스워드 : ");
	       JTextField jt1 = new JTextField();
	       
	       ImageIcon  img7 = new ImageIcon ("image\\admin\\AdminLogin.png");
	       JButton btn5 = new JButton(img7);
	  
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
	       label1.setBounds(174, 0, 151, 153);
	       label2.setBounds(130, 257, 240, 98);
	       jl.setBounds(34, 431, 430, 62);
	       jt.setBounds(34, 431, 430, 62);
	       jl1.setBounds(34, 512, 430, 62);
	       jt1.setBounds(34, 512, 430, 62);
	     
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
	    		   
	    		   new AdminList();
	    		   bottomPanel.setVisible(false);
	    		   MainFrame.setVisible(false);
	    	   }
	       });
	}
}