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

public class AdminAll extends JPanel{
	
		/*전체게시글 조회*/
		private MainFrame frame;
		private AdminAll adminall;
		private JButton btn1, btn2, btn3, btn4, btn5;
		
		public AdminAll(MainFrame frame) {
			/*프레임, 패널설정*/
			this.frame = frame;
			this.adminall = this;
			
			/*전체 패널 생성*/
			adminall.setBounds(0, 0, 500, 870);
			adminall.setLayout(null);
			adminall.setBackground(Color.white);
			frame.add(adminall);

			/* 하단 패널 생성 */
			JPanel bottomPanel = new JPanel();

			bottomPanel.setBounds(0, 100, 500, 770);
			bottomPanel.setLayout(null);
			bottomPanel.setBackground(Color.WHITE);
			adminall.add(bottomPanel);
			
			/* 상단 패널 생성 */
			JPanel topPanel = new JPanel();
			topPanel.setBounds(0, 0, 500, 100);
			topPanel.setLayout(null);
			topPanel.setBackground(Color.WHITE);
			adminall.add(topPanel);
			
			//상단패널의 두로가기버튼
			 ImageIcon img0 = new ImageIcon ("image\\admin\\HondoniWrite.png");//상단 혼또니 마크
		     JButton btn0 = new JButton(img0);
		     
		     //상단패널 뒤로가기버튼
		     topPanel.add(btn0);
		     btn0.setBounds(303, 27, 172, 70);
		     btn0.setContentAreaFilled(false);
		     btn0.setBorderPainted(false);
		     
		     //버튼만들기
		     	
		       //첫번째 게시글
			   ImageIcon img1 = new ImageIcon ("image\\admin\\AllPost1.png");
		       JButton btn1 = new JButton(img1);
		       
		       //두번째 게시글
		       ImageIcon  img2 = new ImageIcon ("image\\\\admin\\\\AllPost2.png");
		       JButton btn2 = new JButton(img2);
		       
		       //세번째 게시글
		       ImageIcon  img3 = new ImageIcon ("image\\\\admin\\\\AllPost3.png");
		       JButton btn3 = new JButton(img3);
		       
		       //네번째 게시글
		       ImageIcon  img4 = new ImageIcon ("image\\\\admin\\\\AllPost4.png");
		       JButton btn4 = new JButton(img4);
		       
		       //5번째 게시글
		       ImageIcon  img5 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\AllPost5.png");
		       JButton btn5 = new JButton(img5);
		       
		       ImageIcon  img10 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Find.png");//검색
		       JButton btn10 = new JButton(img10);
		       
		       ImageIcon  img11 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Findnext.png");//다음페이지
		       JButton btn11 = new JButton(img11);
		       
		      // 패널에 버튼 추가
		       bottomPanel.add(btn1);
		       bottomPanel.add(btn2);
		       bottomPanel.add(btn3);
		       bottomPanel.add(btn4);
		       bottomPanel.add(btn5);
		       bottomPanel.add(btn10);
		       bottomPanel.add(btn11);
		    
		       //첫번째부터 다섯번째까지 게시글버튼
		       btn1.setBounds(35, 144, 430, 104);
		       btn2.setBounds(34, 262, 430, 104);
		       btn3.setBounds(34, 380, 430, 104);
		       btn4.setBounds(33, 498, 430, 104);
		       btn5.setBounds(34, 616, 430, 104);
		       btn10.setBounds(31, 19, 430, 62);
		       btn11.setBounds(181, 95, 136, 21);
			   btn11.setContentAreaFilled(false);
			   btn11.setBorderPainted(false);
			   btn10.setContentAreaFilled(false);
			   btn10.setBorderPainted(false);

		       //뒤로가기 액션
		       btn0.addActionListener(new ActionListener() {
		    	   @Override
		    	   public void actionPerformed(ActionEvent e) {
		    		   
		    		   new AdminList1(frame);
		    		   adminall.setVisible(false);
		    	   }
		       });
		       
		       btn11.addActionListener(new ActionListener() {
		    	   @Override
		    	   public void actionPerformed(ActionEvent e) {

		    		   new AdminAll2(frame);
		    		   adminall.setVisible(false);

		    	   }
		       });
		}
	}

			