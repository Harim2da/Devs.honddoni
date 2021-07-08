package com.devs.honddoni.admin.viewpenel;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.devs.honddoni.common.mainframe.MainFrame;




public class AdminComment extends JPanel {
	
	//신고된 댓글 확인
	private MainFrame frame;
	private AdminComment admincomment;
	private JButton btn1, btn2, btn3, btn4, btn5;
	
	public AdminComment(MainFrame frame) {
		//프레임, 패널설정
		this.frame = frame;
		this.admincomment = this;
		
		//전체 패널 생성
		admincomment.setBounds(0, 0, 500, 870);
		admincomment.setLayout(null);
		admincomment.setBackground(Color.white);
		frame.add(admincomment);
		
		

		/* 하단 패널 생성 */
		JPanel bottomPanel = new JPanel();

		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.WHITE);
		admincomment.add(bottomPanel);
		
		/* 상단 패널 생성 */
		JPanel topPanel = new JPanel();
		topPanel.setBounds(0, 0, 500, 100);
		topPanel.setLayout(null);
		topPanel.setBackground(Color.WHITE);
		admincomment.add(topPanel);
		
		 ImageIcon img0 = new ImageIcon ("image\\admin\\HondoniWrite.png");//상단 혼또니 마크
	     JButton btn0 = new JButton(img0);
	     
	     //뒤로가기 버튼
	     topPanel.add(btn0);
	     btn0.setBounds(303, 27, 172, 70);
	     btn0.setContentAreaFilled(false);
	     btn0.setBorderPainted(false);
	       //첫번쨰신고 댓글
		   ImageIcon img1 = new ImageIcon ("image\\admin\\AdminCommentNew1.png");
	       JButton btn1 = new JButton(img1);
	       //두번쨰 신고 댓글
	       ImageIcon  img2 = new ImageIcon ("image\\\\admin\\\\AdminCommentNew2.png");
	       JButton btn2 = new JButton(img2);
	       //세번째 신고 댓글
	       ImageIcon  img3 = new ImageIcon ("image\\\\admin\\\\AdminCommentNew3.png");
	       JButton btn3 = new JButton(img3);
	       //댓글작성 버튼
	       ImageIcon  img4 = new ImageIcon ("image\\\\admin\\\\CommentWriteNew.png");
	       JButton btn4 = new JButton(img4);
	       
	       ImageIcon img01 = new ImageIcon ("image\\admin\\Emergency.png");
	       JLabel btn01 = new JLabel(img01);

	       
	       
	   
	  
	       //패널에 버튼 추가
	       bottomPanel.add(btn1);
	       bottomPanel.add(btn2);
	       bottomPanel.add(btn3);
	       bottomPanel.add(btn4);
	       bottomPanel.add(btn01);
	      
	       
	    
	       //버튼 위치 조정
	       btn1.setBounds(35, 52, 433, 61);
	       btn2.setBounds(35, 119, 433, 61);
	       btn3.setBounds(34, 186, 433, 61);
	       btn4.setBounds(35, 17, 71, 21);
	       btn01.setBounds(437, 78, 22, 22);
		   btn4.setContentAreaFilled(false);
		   btn4.setBorderPainted(false);
	      
	   
	     
//	       //컨테이너에 패널 추가
//	       MainFrame.add(bottomPanel);
//	       MainFrame.setVisible(true); //창을 보이게함
	       
	       btn1.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   new AdminComment2(frame);
	    		   admincomment.setVisible(false);
//	    		  MainFrame.setVisible(false);
	    	   }
	       });
	       
	       btn0.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   new AdminList1(frame);
	    		   admincomment.setVisible(false);
//	    		  MainFrame.setVisible(false);
	    	   }
	       });
	}
}
