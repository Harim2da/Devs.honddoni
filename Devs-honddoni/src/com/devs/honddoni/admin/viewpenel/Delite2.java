package com.devs.honddoni.admin.viewpenel;

import java.awt.Color; 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.devs.honddoni.common.mainframe.MainFrame;

public class Delite2 extends JPanel{
	//탈퇴요청 회원 화면
	

	private MainFrame frame;
	private Delite2 delite2;
	private JButton btn1, btn2, btn3, btn4, btn5;
	
	public Delite2(MainFrame frame) {
		//프레임, 패널설정
		this.frame = frame;
		this.delite2 = this;
		
		//전체 패널 생성
		delite2.setBounds(0, 0, 500, 870);
		delite2.setLayout(null);
		delite2.setBackground(Color.white);
		frame.add(delite2);

		/* 하단 패널 생성 */
		JPanel bottomPanel = new JPanel();

		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.WHITE);
		delite2.add(bottomPanel);
		
		/* 상단 패널 생성 */
		JPanel topPanel = new JPanel();
		topPanel.setBounds(0, 0, 500, 100);
		topPanel.setLayout(null);
		topPanel.setBackground(Color.WHITE);
		delite2.add(topPanel);
		
		//상단 마크 뒤로가는기능
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
		
	     
	     	//첫번째 탈퇴회원
		   ImageIcon img1 = new ImageIcon ("image\\admin\\Delite2-1.png");//탈퇴회원정보
	       JButton btn1 = new JButton(img1);
	       	//두번째 탈퇴회원
	       ImageIcon  img2 = new ImageIcon ("image\\\\admin\\\\Delite2-2.png");
	       JButton btn2 = new JButton(img2);
	       
	       //탈퇴 첫번째게시판으로 돌아가는 버튼
	       ImageIcon  img8 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\FindBack.png");//이전페이지
	       JButton btn8 = new JButton(img8);
	       
	       //검색기능 버튼
	       ImageIcon  img9 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Find.png");//검색
	       JButton btn9 = new JButton(img9);
	       
	       //패널에 버튼 추가
	       bottomPanel.add(btn1);//탈퇴회원 버튼
	       bottomPanel.add(btn2);
	       bottomPanel.add(btn8);//다음페이지
	       bottomPanel.add(btn9);//검색버튼
	       //버튼 위치 조정
	       btn1.setBounds(32, 143, 430, 104);
	       btn2.setBounds(32, 262, 430, 104);
	       btn8.setBounds(181, 95, 136, 21);//이전페이지
	       btn9.setBounds(31, 19, 430, 62);//다음페이지
		   btn8.setContentAreaFilled(false);
		   btn8.setBorderPainted(false);
		   btn9.setContentAreaFilled(false);
		   btn9.setBorderPainted(false);
	   
//	       //탈퇴게시판 1로 돌아가는 기능
	       btn8.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
	    		   
	    		   new Delite(frame);
	    		   delite2.setVisible(false);
	    	   }
	       });
	       //뒤로가는 버튼
	       btn0.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
	    		   
	    		   new AdminList(frame);
	    		   delite2.setVisible(false);

	    	   }
	       });
	}
}

		