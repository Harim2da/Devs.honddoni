package com.devs.honddoni.admin.viewpenel;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.devs.honddoni.common.mainframe.MainFrame;
import com.devs.honddoni.memberLog.view.MemberLogView;

//관리자 로그아웃 화면

public class AdminList2 extends JPanel {
	
	private MainFrame frame;
	private AdminList2 adminList;
	private JButton btn1, btn2, btn3, btn4, btn5;
	
	private JLabel lb1, lb2;
	
	public AdminList2(MainFrame frame) {
		//프레임, 패널설정
		this.frame = frame;
		this.adminList = this;
		
		//전체패널 생성
		adminList.setBounds(0, 0, 500, 870);
		adminList.setLayout(null);
		adminList.setBackground(Color.white);
		frame.add(adminList);
		
		/* 상단 패널 생성 */
		JPanel topPanel = new JPanel();
		topPanel.setBounds(0, 0, 500, 100);
		topPanel.setLayout(null);
		topPanel.setBackground(Color.WHITE);
		adminList.add(topPanel);
		
		/* 하단 패널 생성 */
		JPanel bottomPanel = new JPanel();

		adminList.setBounds(0, 100, 500, 770);
		adminList.setLayout(null);
		adminList.setBackground(Color.WHITE);
		adminList.add(bottomPanel);
		
		
		
		 ImageIcon img0 = new ImageIcon ("image\\admin\\HondoniWrite.png");//상단 혼또니 마크
	     JButton btn0 = new JButton(img0);
	     
	     topPanel.add(btn0);
	     btn0.setBounds(303, 27, 172, 70);
	     btn0.setContentAreaFilled(false);
	     btn0.setBorderPainted(false);
	     
		
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
	       
	       ImageIcon  img6 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\AdminNext.png");
	       JButton btn6 = new JButton(img6);
	       

	       ImageIcon  img7 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\LogoutGroup.png");
	       JButton btn7 = new JButton(img7);
	       
	     
	       
	       
	       
	       
	       
	       
	   
	  
	       //패널에 버튼 추가
	       adminList.add(btn1);
	       adminList.add(btn2);
	       adminList.add(btn3);
	       adminList.add(btn4);
	       adminList.add(btn5);
	       adminList.add(btn6);
	       adminList.add(btn7);
	       
	    
	       //버튼 위치 조정
	       btn1.setBounds(35, 24, 430, 96);
	       btn2.setBounds(33, 153, 430, 96);
	       btn3.setBounds(33, 283, 430, 96);
	       btn4.setBounds(33, 413, 430, 96);
	       btn5.setBounds(33, 543, 430, 96);
	       btn6.setBounds(221, 698, 56, 25);
	       btn7.setBounds(29, 218, 445, 223);
	       btn1.setBorderPainted(false);
	       btn2.setBorderPainted(false);
	       btn3.setBorderPainted(false);
	       btn4.setBorderPainted(false);
	       
	       
	       
	   
	     
	       //컨테이너에 패널 추가
//	       MainFrame.add(bottomPanel);
//	       MainFrame.setVisible(true); //창을 보이게함
	       
	       btn7.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   
	    		   adminList.setVisible(false); 
//	    		   MainFrame.setVisible(false);
	    		   new MemberLogView(frame);
	    		   
	    	   }
	       });
	}
}