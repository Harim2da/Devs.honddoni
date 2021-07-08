package com.devs.honddoni.admin.viewpenel;

import java.awt.Color; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.devs.honddoni.common.mainframe.MainFrame;


public class Delite extends JPanel {
	//탈퇴요청 회원 화면
	
	private MainFrame frame;
	private Delite delite;
	private JButton btn1, btn2, btn3, btn4, btn5;
	
	public Delite(MainFrame frame) {
		//프레임, 패널설정
		this.frame = frame;
		this.delite = this;
		//전체 패널 생성
		delite.setBounds(0, 0, 500, 870);
		delite.setLayout(null);
		delite.setBackground(Color.white);
		frame.add(delite);
				
		/* 하단 패널 생성 */
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.WHITE);
		delite.add(bottomPanel);
		
		/* 상단 패널 생성 */
		JPanel topPanel = new JPanel();
		topPanel.setBounds(0, 0, 500, 100);
		topPanel.setLayout(null);
		topPanel.setBackground(Color.WHITE);
		delite.add(topPanel);
		
		 ImageIcon img0 = new ImageIcon ("image\\admin\\HondoniWrite.png");//상단 혼또니 마크
	     JButton btn0 = new JButton(img0);
	     
	     ImageIcon img01 = new ImageIcon("image\\admin\\Delite.png");
	     JLabel lb01 = new JLabel(img01);
	     
	     //상단패널에 혼또니마크로 뒤로가기 버튼
	     topPanel.add(btn0);
	     btn0.setBounds(303, 27, 172, 70);
	     btn0.setContentAreaFilled(false);
	     btn0.setBorderPainted(false);
	     //상단에 페이지 이름
	     topPanel.add(lb01);
	     lb01.setBounds(32, 56, 263, 33);
		
	     	//첫번쨰 탈퇴회원 정보
		   ImageIcon img1 = new ImageIcon ("image\\admin\\DeliteData1.png");//탈퇴회원정보
	       JButton btn1 = new JButton(img1);
	       
	       //두번째탈퇴회원정보
	       ImageIcon  img2 = new ImageIcon ("image\\\\admin\\\\DeliteData2.png");
	       JButton btn2 = new JButton(img2);
	       
	       //세번쨰 탈퇴회원 정보
	       ImageIcon  img3 = new ImageIcon ("image\\\\admin\\\\DeliteData3.png");
	       JButton btn3 = new JButton(img3);
	       
	       ///네번쨰 탈퇴회원 정보
	       ImageIcon  img05 = new ImageIcon ("image\\\\admin\\\\DeliteData5.png");
	       JButton btn05 = new JButton(img05);
	       
	       //네섯번째 탈퇴 회원 정보
	       ImageIcon  img5 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\DeliteData4.png");
	       JButton btn5 = new JButton(img5);
	       
	       //탈퇴회원 다음게시판넘어가기
	       ImageIcon  img8 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Findnext.png");//다음페이지
	       JButton btn8 = new JButton(img8);
	       
	       ////검색기능
	       ImageIcon  img9 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Find.png");//검색
	       JButton btn9 = new JButton(img9);
	       
	       //패널에 버튼 추가
	       bottomPanel.add(btn1);//탈퇴회원 버튼
	       bottomPanel.add(btn2);
	       bottomPanel.add(btn3);
	       bottomPanel.add(btn5);
	       bottomPanel.add(btn8);//다음페이지
	       bottomPanel.add(btn9);//검색버튼
	       bottomPanel.add(btn05);//5번쨰 탈퇴회원
	       //버튼 위치 조정
	       btn1.setBounds(35, 143, 430, 104);
	       btn2.setBounds(34, 262, 430, 104);
	       btn3.setBounds(34, 380, 430, 104);
	       btn5.setBounds(34, 498, 430, 104);
	       btn8.setBounds(181, 95, 136, 21);//다음페이지
	       btn9.setBounds(31, 19, 430, 62);//다음페이지
	       btn05.setBounds(34, 617, 430, 104);
		   btn9.setContentAreaFilled(false);
		   btn9.setBorderPainted(false);
		   btn8.setContentAreaFilled(false);
		   btn8.setBorderPainted(false);
	       
	       //뒤로가기 버튼
	       btn0.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
	    		   
	    		   new AdminList(frame);
	    		   delite.setVisible(false);
	    	   }
	       });
	       
	       //다음탈퇴게시물로 이동
	       btn8.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
	    		   
	    		   new Delite2(frame);
	    		   delite.setVisible(false);
	    	   }
	       });
	       }
}

		

	

		