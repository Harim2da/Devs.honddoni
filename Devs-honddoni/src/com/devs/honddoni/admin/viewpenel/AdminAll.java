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
	
		//전체게시글 조회
		private MainFrame frame;
		private AdminAll adminall;
		private JButton btn1, btn2, btn3, btn4, btn5;
		private JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10, lb11, lb12, lb13, lb14, lb15, lb16,
		lb17, lb18, lb19, lb20, lb21; 
		
		AdminList1 adminlist1;
		AdminAll2 adminall2;
		
		public AdminAll(MainFrame frame) {
			//프레임, 패널설정
			this.frame = frame;
			this.adminall = this;
			
			//전체 패널 생성
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
		       
//		       //전체게시글 조회 라벨
//		       ImageIcon  img6 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Delite.png");
//		       JLabel lb1 = new JLabel();
			
//				JLabel lb2 = new JLabel("사진");//프로필사진 
//				JLabel lb3 = new JLabel("닉네임:");//닉네임
//		       
//				JLabel lb6 = new JLabel("사진");//프로필사진
//			    JLabel lb7 = new JLabel("닉네임:");//닉네임
//			    
//			    JLabel lb10 = new JLabel("사진");//프로필사진  
//			    JLabel lb11 = new JLabel("닉네임:");//닉네임
//		       
//			    JLabel lb14 = new JLabel("사진");//프로필사진   
//			    JLabel lb15 = new JLabel("닉네임:");//닉네임
//			    
//			    JTextField t1 = new JTextField("제목");//글제목
//			    JTextField t2 = new JTextField("제목");
//			    JTextField t3 = new JTextField("제목");
//			    JTextField t4 = new JTextField("제목");
			    
			    
			    
		      // 패널에 버튼 추가
		       bottomPanel.add(btn1);
		       bottomPanel.add(btn2);
		       bottomPanel.add(btn3);
		       bottomPanel.add(btn4);
		       bottomPanel.add(btn5);
		       bottomPanel.add(btn10);
		       bottomPanel.add(btn11);
//		       topPanel.add(lb1);
			    
//			    bottomPanel.add(lb2);//프로필
//			    bottomPanel.add(lb3);//닉네임
//		   
//			    bottomPanel.add(lb6);//프로필
//			    bottomPanel.add(lb7);//닉네임
//			    
//			    bottomPanel.add(lb10);//프로필
//			    bottomPanel.add(lb11);//닉네임
//			       
//			    bottomPanel.add(lb14);//프로필
//			    bottomPanel.add(lb15);//닉네임 
//			    
//			    bottomPanel.add(t1);//글제목
//			    bottomPanel.add(t2);//글제목
//			    bottomPanel.add(t3);//글제목
//			    bottomPanel.add(t4);//글제목
		    
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
		       
		       
//		       lb1.setBounds(56, 0, 263, 33);
			    
//			    lb2.setBounds(53, 172, 36, 39);//프로필 위치
//			    lb3.setBounds(92, 168, 100, 43);//닉네임 위치
//		   
//
//			    lb6.setBounds(53, 290, 36, 39);//프로필 위치
//			    lb7.setBounds(92, 286, 100, 43);//닉네임 위치
//			    
//			    lb10.setBounds(53, 390, 36, 39);//프로필 위치
//			    lb11.setBounds(92, 386, 100, 43);//닉네임 위치
//			    
//			    lb14.setBounds(53, 490, 36, 39);//프로필 위치
//			    lb15.setBounds(92, 486, 100, 43);//닉네임 위치
//			    
//			    t1.setBounds(54, 204, 395, 28);//제목위치
//			    t2.setBounds(54, 323, 395, 28);//제목위치
//			    t3.setBounds(54, 441, 395, 28);//제목위치
//			    t4.setBounds(54, 559, 395, 28);//제목위치
			    
//		       //컨테이너에 패널 추가
//		       MainFrame.add(bottomPanel);
//		       MainFrame.setVisible(true); //창을 보이게함
		       
		       //뒤로가기 액션
		       btn0.addActionListener(new ActionListener() {
		    	   @Override
		    	   public void actionPerformed(ActionEvent e) {
//		    		   login2 login2 = new login2();
//		    		   JPanel.add(login2);
//		    		   new login2();
//		    		   bottomPanel.setVisible(false);
		    		   
		    		   adminlist1 = new AdminList1(frame);
		    		   bottomPanel.setVisible(false);
//		    		  MainFrame.setVisible(false);
		    		   bottomPanel.remove(btn1);
		    		   bottomPanel.remove(btn2);
		    		   bottomPanel.remove(btn3);
		    		   bottomPanel.remove(btn4);
		    		   bottomPanel.remove(btn5);
		    		   bottomPanel.remove(btn10);
		    		   bottomPanel.remove(btn11);
//		    		   adminlist1.repaint();
//		    		   adminlist1.revalidate();
		    	   }
		       });
		       
		       btn11.addActionListener(new ActionListener() {
		    	   @Override
		    	   public void actionPerformed(ActionEvent e) {
//		    		   login2 login2 = new login2();
//		    		   JPanel.add(login2);
//		    		   new login2();
//		    		   bottomPanel.setVisible(false);
		    		   
		    		   adminall2 = new AdminAll2(frame);
		    		   bottomPanel.setVisible(false);
//		    		  MainFrame.setVisible(false);
		    		   bottomPanel.remove(btn1);
		    		   bottomPanel.remove(btn2);
		    		   bottomPanel.remove(btn3);
		    		   bottomPanel.remove(btn4);
		    		   bottomPanel.remove(btn5);
		    		   bottomPanel.remove(btn10);
		    		   bottomPanel.remove(btn11);
		    		   adminall2.repaint();
		    		   adminall2.revalidate();
		    	   }
		       });
		}
	}

			