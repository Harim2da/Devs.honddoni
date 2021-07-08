package com.devs.honddoni.admin.viewpenel;

import java.awt.Color;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.devs.honddoni.common.mainframe.MainFrame;

//업적관리 화면

public class Honnest extends JPanel {
	
	private MainFrame frame;
	private Honnest honnest;
	private JButton btn1, btn2, btn3, btn4, btn5;
	
	public Honnest(MainFrame frame) {
		//프레임, 패널설정
		this.frame = frame;
		this.honnest = this;
		
		//전체 패널 생성
		honnest.setBounds(0, 0, 500, 870);
		honnest.setLayout(null);
		honnest.setBackground(Color.white);
		frame.add(honnest);

		/* 하단 패널 생성 */
		JPanel bottomPanel = new JPanel();

		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.WHITE);
		honnest.add(bottomPanel);
		
		/* 상단 패널 생성 */
		JPanel topPanel = new JPanel();
		topPanel.setBounds(0, 0, 500, 100);
		topPanel.setLayout(null);
		topPanel.setBackground(Color.WHITE);
		honnest.add(topPanel);
		
		 ImageIcon img0 = new ImageIcon ("image\\admin\\HondoniWrite.png");//상단 혼또니 마크
	     JButton btn0 = new JButton(img0);
	     ImageIcon img01 = new ImageIcon("image\\admin\\HonestLogo.png");
	     JLabel lb01 = new JLabel(img01);
	     
	     //상단패널에 혼또니마크로 뒤로가기 버튼
	     topPanel.add(btn0);
	     btn0.setBounds(303, 27, 172, 70);
	     btn0.setContentAreaFilled(false);
	     btn0.setBorderPainted(false);
	     
	     //상단에 페이지 이름
	     topPanel.add(lb01);
	     lb01.setBounds(32, 56, 263, 33);
	     	//첫번쨰회원 업적
		   ImageIcon img1 = new ImageIcon ("image\\admin\\Honest1.png");
	       JLabel btn1 = new JLabel(img1);
	       //두번째회원 업적
	       ImageIcon  img2 = new ImageIcon ("image\\\\admin\\\\Honest2.png");
	       JLabel btn2 = new JLabel(img2);
	       //세번쨰회원 업적
	       ImageIcon  img3 = new ImageIcon ("image\\\\admin\\\\Honest3.png");
	       JLabel btn3 = new JLabel(img3);
	       //네번째회원 업적
	       ImageIcon  img4 = new ImageIcon ("image\\\\admin\\\\Honest4.png");
	       JLabel btn4 = new JLabel(img4);
	       //다섯번회원 업적
	       ImageIcon  img5 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Honest5.png");
	       JLabel btn5 = new JLabel(img5);
	       
	       //검색기능버튼
	       ImageIcon  img10 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Find.png");//검색
	       JButton btn10 = new JButton(img10);
	       
	       ImageIcon  img11 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Findnext.png");//다음페이지
	       JButton btn11 = new JButton(img11);

	       //패널에 버튼 추가
	       bottomPanel.add(btn1);
	       bottomPanel.add(btn2);
	       bottomPanel.add(btn3);
	       bottomPanel.add(btn4);
	       bottomPanel.add(btn5);
	       bottomPanel.add(btn10);
	       bottomPanel.add(btn11);
	    
	       //버튼 위치 조정
	       btn1.setBounds(34, 143, 430, 104);
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
	       
	       
	       btn0.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {

	    		   
	    		   new AdminList(frame);
	    		   honnest.setVisible(false); 

	    	   }
	       });
	       
	       btn11.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
	    		   
	    		   new Honnest2(frame);
	    		   honnest.setVisible(false); 
 		   
	    	   }
	       });
	}
}

		

	
