package com.devs.honddoni.admin.viewpenel;

import java.awt.Color; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.devs.honddoni.admin.controller.ManagementController;
import com.devs.honddoni.admin.model.dao.AdminDAO;
import com.devs.honddoni.common.mainframe.MainFrame;

//모든회원정보 조회 화면

public class AllData2 extends JPanel {
	
	private MainFrame frame;
	private AllData2 alldata2;
	private JButton btn1, btn2, btn3, btn4, btn5;
	
	public AllData2(MainFrame frame) {
		//프레임, 패널설정
			this.frame = frame;
			this.alldata2 = this;
			
		//전체 패널 생성
			alldata2.setBounds(0, 0, 500, 870);
			alldata2.setLayout(null);
			alldata2.setBackground(Color.white);
		frame.add(alldata2);

		/* 하단 패널 생성 */
		JPanel bottomPanel = new JPanel();

		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.WHITE);
		alldata2.add(bottomPanel);
		
		/* 상단 패널 생성 */
		JPanel topPanel = new JPanel();
		topPanel.setBounds(0, 0, 500, 100);
		topPanel.setLayout(null);
		topPanel.setBackground(Color.WHITE);
		alldata2.add(topPanel);
		
		 ImageIcon img0 = new ImageIcon ("image\\admin\\HondoniWrite.png");//상단 혼또니 마크
	     JButton btn0 = new JButton(img0);
	     
	     ImageIcon img01 = new ImageIcon("image\\admin\\AllDataLogo.png");
	     JLabel lb01 = new JLabel(img01);
	     
	     //상단패널에 혼또니마크로 뒤로가기 버튼
	     topPanel.add(btn0);
	     btn0.setBounds(303, 27, 172, 70);
	     btn0.setContentAreaFilled(false);
	     btn0.setBorderPainted(false);
	     //상단에 페이지 이름
	     topPanel.add(lb01);
	     lb01.setBounds(32, 56, 263, 33);
		
		   ImageIcon img1 = new ImageIcon ("image\\admin\\AllData2-1.png");//첫번째 회원가입자데이터
	       JButton btn1 = new JButton(img1);
	       
	       ImageIcon  img6 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Delite.png");
	       JLabel lb1 = new JLabel();
	       
	       
	       //첫번째 전체회원목록게시판으로 가는 버튼
	       ImageIcon  img8 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\FindBack.png");//다음페이지
	       JButton btn8 = new JButton(img8);
	       
	       //검색마우스그림
	       ImageIcon  img9 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Find.png");//검색
	       JButton btn9 = new JButton(img9);
	       
	       //패널에 버튼 추가
	       bottomPanel.add(btn1);//회원1버튼
	       bottomPanel.add(lb1);//
	       bottomPanel.add(btn8);//첫번째 회원정보 게시판으로 이동
	       bottomPanel.add(btn9);
	       
	       //버튼 위치 조정
	       btn1.setBounds(35, 143, 430, 104);
	       btn8.setBounds(181, 95, 136, 21);
	       btn9.setBounds(31, 19, 430, 62);	       
		   btn8.setContentAreaFilled(false);
		   btn8.setBorderPainted(false);
		   btn9.setContentAreaFilled(false);
		   btn9.setBorderPainted(false);
	       
	       btn0.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
	    		   
	    		   new AdminList(frame);
	    		   alldata2.setVisible(false); 
	    	   }
	       });
	       
	       btn8.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
	    		   
	    		   new AllData(frame);
	    		   alldata2.setVisible(false); 

	    	   }
	       });
	}
}

		
