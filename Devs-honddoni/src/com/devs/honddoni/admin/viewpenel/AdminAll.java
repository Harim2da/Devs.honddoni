 package com.devs.honddoni.admin.viewpenel;

import java.awt.Color; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;




public class AdminAll {
	
		//관리자 모든 게시글 조회
		
		MainFrame1 MainFrame = new MainFrame1();
		
//		private JButton btn1, btn2, btn3, btn4, btn5;
		private JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10, lb11, lb12, lb13, lb14, lb15, lb16,
		lb17, lb18, lb19, lb20, lb21; 
		
		public AdminAll() {

			/* 하단 패널 생성 */
			JPanel bottomPanel = new JPanel();

			bottomPanel.setBounds(0, 100, 500, 770);
			bottomPanel.setLayout(null);
			bottomPanel.setBackground(Color.WHITE);
			MainFrame.add(bottomPanel);
			
//			   ImageIcon img1 = new ImageIcon ("image\\admin\\Side.png");
//		       JButton btn1 = new JButton(img1);
//		       
//		       ImageIcon  img2 = new ImageIcon ("image\\\\admin\\\\Side.png");
//		       JButton btn2 = new JButton(img2);
//		       
//		       ImageIcon  img3 = new ImageIcon ("image\\\\admin\\\\Side.png");
//		       JButton btn3 = new JButton(img3);
//		       
//		       ImageIcon  img4 = new ImageIcon ("image\\\\admin\\\\Side.png");
//		       JButton btn4 = new JButton(img4);
//		       
//		       ImageIcon  img5 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Side.png");
//		       JButton btn5 = new JButton(img5);
//		       
//		       ImageIcon  img6 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Delite.png");
//		       JLabel lb1 = new JLabel();
			
				JLabel lb2 = new JLabel("사진");//프로필사진 
				JLabel lb3 = new JLabel("닉네임:");//닉네임
		       
				JLabel lb6 = new JLabel("사진");//프로필사진
			    JLabel lb7 = new JLabel("닉네임:");//닉네임
			    
			    JLabel lb10 = new JLabel("사진");//프로필사진  
			    JLabel lb11 = new JLabel("닉네임:");//닉네임
		       
			    JLabel lb14 = new JLabel("사진");//프로필사진   
			    JLabel lb15 = new JLabel("닉네임:");//닉네임
			    
			    JTextField t1 = new JTextField("제목");//글제목
			    JTextField t2 = new JTextField("제목");
			    JTextField t3 = new JTextField("제목");
			    JTextField t4 = new JTextField("제목");
			    
			    
			    
		       //패널에 버튼 추가
//		       bottomPanel.add(btn1);
//		       bottomPanel.add(btn2);
//		       bottomPanel.add(btn3);
//		       bottomPanel.add(btn4);
//		       bottomPanel.add(btn5);
//		       bottomPanel.add(lb1);
			    
			    bottomPanel.add(lb2);//프로필
			    bottomPanel.add(lb3);//닉네임
		   
			    bottomPanel.add(lb6);//프로필
			    bottomPanel.add(lb7);//닉네임
			    
			    bottomPanel.add(lb10);//프로필
			    bottomPanel.add(lb11);//닉네임
			       
			    bottomPanel.add(lb14);//프로필
			    bottomPanel.add(lb15);//닉네임 
			    
			    bottomPanel.add(t1);//글제목
			    bottomPanel.add(t2);//글제목
			    bottomPanel.add(t3);//글제목
			    bottomPanel.add(t4);//글제목
		    
		       //버튼 위치 조정
//		       btn1.setBounds(35, 143, 430, 121);
//		       btn2.setBounds(34, 262, 430, 121);
//		       btn3.setBounds(34, 380, 430, 121);
//		       btn4.setBounds(33, 498, 430, 121);
//		       btn5.setBounds(34, 616, 430, 104);
//		       lb1.setBounds(56, 0, 263, 33);
			    
			    lb2.setBounds(53, 172, 36, 39);//프로필 위치
			    lb3.setBounds(92, 168, 100, 43);//닉네임 위치
		   

			    lb6.setBounds(53, 290, 36, 39);//프로필 위치
			    lb7.setBounds(92, 286, 100, 43);//닉네임 위치
			    
			    lb10.setBounds(53, 390, 36, 39);//프로필 위치
			    lb11.setBounds(92, 386, 100, 43);//닉네임 위치
			    
			    lb14.setBounds(53, 490, 36, 39);//프로필 위치
			    lb15.setBounds(92, 486, 100, 43);//닉네임 위치
			    
			    t1.setBounds(54, 204, 395, 28);//제목위치
			    t2.setBounds(54, 323, 395, 28);//제목위치
			    t3.setBounds(54, 441, 395, 28);//제목위치
			    t4.setBounds(54, 559, 395, 28);//제목위치
			    
//		       //컨테이너에 패널 추가
//		       MainFrame.add(bottomPanel);
//		       MainFrame.setVisible(true); //창을 보이게함
//		       
//		       btn1.addActionListener(new ActionListener() {
//		    	   @Override
//		    	   public void actionPerformed(ActionEvent e) {
////		    		   login2 login2 = new login2();
////		    		   JPanel.add(login2);
////		    		   new login2();
////		    		   bottomPanel.setVisible(false);
//		    		   
//		    		   new Login2();
//		    		   bottomPanel.setVisible(false);
////		    		  MainFrame.setVisible(false);
//		    	   }
//		       });
		}
	}

			