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

//모든회원정보 조회 화면

public class AllData2 {
	
	MainFrame1 MainFrame = new MainFrame1();
	
	private JButton btn1, btn2, btn3, btn4, btn5;
	private JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10, lb11, lb12, lb13, lb14, lb15, lb16,
	lb17, lb18, lb19, lb20, lb21; 
	
	public AllData2() {

		/* 하단 패널 생성 */
		JPanel bottomPanel = new JPanel();

		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.WHITE);
		MainFrame.add(bottomPanel);
		
		/* 상단 패널 생성 */
		JPanel topPanel = new JPanel();
		topPanel.setBounds(0, 0, 500, 100);
		topPanel.setLayout(null);
		topPanel.setBackground(Color.WHITE);
		MainFrame.add(topPanel);
		
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
	       
//	       ImageIcon  img2 = new ImageIcon ("image\\\\admin\\\\AllData2.png");//두번째 회원가입자데이터
//	       JButton btn2 = new JButton(img2);
//	       
//	       ImageIcon  img3 = new ImageIcon ("image\\\\admin\\\\AllData3.png");//세번째 회원가입자데이터
//	       JButton btn3 = new JButton(img3);
//	       
//	       ImageIcon  img4 = new ImageIcon ("image\\\\admin\\\\AllData4.png");//네번째 회원가입자데이터
//	       JButton btn4 = new JButton(img4);
//	       
//	       ImageIcon  img5 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\AllData5.png");//다섯번째 회원가입자데이터
//	       JButton btn5 = new JButton(img5);
	       
	       ImageIcon  img6 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Delite.png");
	       JLabel lb1 = new JLabel();
	       
	       
	       //첫번째 전체회원목록게시판으로 가는 버튼
	       ImageIcon  img8 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\FindBack.png");//다음페이지
	       JButton btn8 = new JButton(img8);
	       
	       //검색마우스그림
	       ImageIcon  img9 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Find.png");//검색
	       JButton btn9 = new JButton(img9);
	       
	       
	       
//	       JLabel lb2 = new JLabel("사진");//프로필사진
//	       
//	       JLabel lb3 = new JLabel("닉네임:");//닉네임
//	       
//	       JLabel lb4 = new JLabel("아이디:");//아이디
//	       
//	       JLabel lb5 = new JLabel("가입일:");//가입일
//	       
//	       
//	       JLabel lb6 = new JLabel("사진");//프로필사진
//	       
//	       JLabel lb7 = new JLabel("닉네임:");//닉네임
//	       
//	       JLabel lb8 = new JLabel("아이디:");//아이디
//	       
//	       JLabel lb9 = new JLabel("가입일:");//가입일
//	       
//	      
//	       JLabel lb10 = new JLabel("사진");//프로필사진
//	       
//	       JLabel lb11 = new JLabel("닉네임:");//닉네임
//	       
//	       JLabel lb12 = new JLabel("아이디:");//아이디
//	       
//	       JLabel lb13 = new JLabel("가입일:");//가입일
//	       
//	       
//	       JLabel lb14 = new JLabel("사진");//프로필사진
//	       
//	       JLabel lb15 = new JLabel("닉네임:");//닉네임
//	       
//	       JLabel lb16 = new JLabel("아이디:");//아이디
//	       
//	       JLabel lb17 = new JLabel("가입일:");//가입일
//	       
//	       ImageIcon  img7 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Squrd.png");
//	       JLabel lb18 = new JLabel();//네모
//	       
//	       ImageIcon  img8 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Squrd.png");
//	       JLabel lb19 = new JLabel();//네모
//	       
//	       ImageIcon  img9 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Squrd.png");
//	       JLabel lb20 = new JLabel();//네모
//	       
//	       ImageIcon  img10 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Squrd.png");
//	       JLabel lb21 = new JLabel();//네모
	       

	       

	       //패널에 버튼 추가
	       bottomPanel.add(btn1);//회원1버튼
//	       bottomPanel.add(btn2);
//	       bottomPanel.add(btn3);
//	       bottomPanel.add(btn4);
//	       bottomPanel.add(btn5);
	       bottomPanel.add(lb1);//

	       bottomPanel.add(btn8);//첫번째 회원정보 게시판으로 이동
	       bottomPanel.add(btn9);
	       
//	       bottomPanel.add(lb2);//프로필
//	       bottomPanel.add(lb3);//닉네임
//	       bottomPanel.add(lb4);//아이디
//	       bottomPanel.add(lb5);//가입일
//	       bottomPanel.add(lb6);//프로필
//	       bottomPanel.add(lb7);//닉네임
//	       bottomPanel.add(lb8);//아이디
//	       bottomPanel.add(lb9);//가입일
//	       bottomPanel.add(lb10);//프로필
//	       bottomPanel.add(lb11);//닉네임
//	       bottomPanel.add(lb12);//아이디
//	       bottomPanel.add(lb13);//가입일
//	       bottomPanel.add(lb14);//프로필
//	       bottomPanel.add(lb15);//닉네임
//	       bottomPanel.add(lb16);//아이디
//	       bottomPanel.add(lb17);//가입일
//	       
//	       bottomPanel.add(lb18);//네모
//	       bottomPanel.add(lb19);//네모
//	       bottomPanel.add(lb20);//네모
//	       bottomPanel.add(lb21);//네모
	       
	       
	       //버튼 위치 조정
	       btn1.setBounds(35, 143, 430, 104);
//	       btn2.setBounds(34, 262, 430, 121);
//	       btn3.setBounds(34, 380, 430, 121);
//	       btn4.setBounds(33, 498, 430, 121);
//	       btn5.setBounds(34, 616, 430, 104);

	       btn8.setBounds(181, 95, 136, 21);
	       btn9.setBounds(31, 19, 430, 62);
	       
//	       lb1.setBounds(56, 0, 263, 33);
//	       lb2.setBounds(53, 172, 36, 39);//프로필 위치
//	       lb3.setBounds(92, 168, 100, 43);//닉네임 위치
//	       lb4.setBounds(250, 168, 200, 24);//id 위치
//	       lb5.setBounds(250, 198, 136, 24);//가입일 위치 위치
//	       
//	       lb6.setBounds(53, 290, 36, 39);//프로필 위치
//	       lb7.setBounds(92, 286, 100, 43);//닉네임 위치
//	       lb8.setBounds(250, 286, 200, 24);//id 위치
//	       lb9.setBounds(250, 316, 136, 24);//가입일 위치 위치
//	       
//	       lb10.setBounds(53, 390, 36, 39);//프로필 위치
//	       lb11.setBounds(92, 386, 100, 43);//닉네임 위치
//	       lb12.setBounds(250, 404, 200, 24);//id 위치
//	       lb13.setBounds(250, 434, 136, 24);//가입일 위치 위치
//	       
//	       lb14.setBounds(53, 490, 36, 39);//프로필 위치
//	       lb15.setBounds(92, 486, 100, 43);//닉네임 위치
//	       lb16.setBounds(250, 522, 200, 24);//id 위치
//	       lb17.setBounds(250, 553, 136, 24);//가입일 위치 위치
//	       
//	       lb18.setBounds(34, 143, 430, 104);//네모
//	       lb19.setBounds(34, 262, 430, 104);//네모
//	       lb20.setBounds(34, 380, 430, 104);//네모
//	       lb21.setBounds(34, 498, 430, 104);//네모
	       
	       //컨테이너에 패널 추가
	       MainFrame.add(bottomPanel);
	       MainFrame.setVisible(true); //창을 보이게함
	       
//	       poupfrome.pup 이미지넣기
	       
	       btn1.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   new Login2();
	    		   bottomPanel.setVisible(false);
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
	    		   
	    		   new AdminList();
	    		   bottomPanel.setVisible(false); 
	    		   MainFrame.setVisible(false);
	    	   }
	       });
	       
	       btn8.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
//	    		   login2 login2 = new login2();
//	    		   JPanel.add(login2);
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
	    		   
	    		   new AllData();
	    		   bottomPanel.setVisible(false); 
	    		   MainFrame.setVisible(false);
	    	   }
	       });
	}
}

		
