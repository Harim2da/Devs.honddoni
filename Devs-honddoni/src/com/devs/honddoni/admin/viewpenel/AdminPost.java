package com.devs.honddoni.admin.viewpenel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.devs.honddoni.common.mainframe.MainFrame;

//신고된 게시글 관리

public class AdminPost extends JPanel {
	
	private MainFrame frame;
	private AdminPost adminpost;
	private JButton btn1, btn2, btn3, btn4, btn5;
	
	public AdminPost(MainFrame frame) {
		this.frame = frame;
		this.adminpost = this;
		
		//전체 패널 생성
		adminpost.setBounds(0, 0, 500, 870);
		adminpost.setLayout(null);
		adminpost.setBackground(Color.white);
		frame.add(adminpost);
		
		/* 하단 패널 생성 */
		JPanel bottomPanel = new JPanel();

		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.WHITE);
		adminpost.add(bottomPanel);
		
		/* 상단 패널 생성 */
		JPanel topPanel = new JPanel();
		topPanel.setBounds(0, 0, 500, 100);
		topPanel.setLayout(null);
		topPanel.setBackground(Color.WHITE);
		adminpost.add(topPanel);
		
		 ImageIcon img0 = new ImageIcon ("image\\admin\\HondoniWrite.png");//상단 혼또니 마크
	     JButton btn0 = new JButton(img0);
	     
	     topPanel.add(btn0);
	     btn0.setBounds(303, 27, 172, 70);
	     btn0.setContentAreaFilled(false);
	     btn0.setBorderPainted(false);
	     
		
	     ImageIcon img1 = new ImageIcon ("image\\admin\\AdminPostNew1.png");
	       JButton btn1 = new JButton(img1);
	       
	       ImageIcon  img2 = new ImageIcon ("image\\\\admin\\\\AdminPostNew2.png");
	       JButton btn2 = new JButton(img2);
	       
	       ImageIcon  img3 = new ImageIcon ("image\\\\admin\\\\AdminPostNew3.png");
	       JButton btn3 = new JButton(img3);
	            
	       ImageIcon  img6 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Delite.png");
	       JLabel lb1 = new JLabel();
	       
	       ImageIcon  img10 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Find.png");//검색
	       JButton btn10 = new JButton(img10);
	       
	       ImageIcon  img11 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Findnext.png");//다음페이지
	       JButton btn11 = new JButton(img11);
	       
	       //패널에 버튼 추가
	       bottomPanel.add(btn1);
	       bottomPanel.add(btn2);
	       bottomPanel.add(btn3);
	       bottomPanel.add(lb1);
	       bottomPanel.add(btn10);
	       bottomPanel.add(btn11);
	       
	       //버튼 위치 조정
	       btn1.setBounds(35, 143, 430, 104);
	       btn2.setBounds(34, 262, 430, 104);
	       btn3.setBounds(34, 380, 430, 104);
	       lb1.setBounds(56, 0, 263, 33);
	       btn10.setBounds(31, 19, 430, 62);
	       btn11.setBounds(181, 95, 136, 21);
	       btn11.setContentAreaFilled(false);
		   btn11.setBorderPainted(false);
	       btn10.setContentAreaFilled(false);
		   btn10.setBorderPainted(false);
	       
	       btn0.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
	    		   
	    		   new AdminList1(frame);
	    		   adminpost.setVisible(false);
	    	   }
	       });
	       
	       btn11.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
	    		   
	    		   new AdminPost2(frame);
	    		   adminpost.setVisible(false);
	    	   }
	       });
	       
//	       btn2.addActionListener(new ActionListener() {
//	    	   @Override
//	    	   public void actionPerformed(ActionEvent e) {
//	    		   
//	    		   new AdminPostDelite(frame);
//	    		   adminpost.setVisible(false);
//	    	   }
//	       });
	}
}
