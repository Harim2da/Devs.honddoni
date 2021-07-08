package com.devs.honddoni.admin.viewpenel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.devs.honddoni.admin.model.dto.AdminDTO;
import com.devs.honddoni.common.mainframe.MainFrame;

//모든회원정보 조회 화면

public class AllData extends JPanel {
	
	private MainFrame frame;
	private AllData alldata;
	List<AdminDTO> commentListDTO = null;
	private JButton btn1, btn2, btn3, btn4, btn5;
	
	public AllData(MainFrame frame) {
		//프레임, 패널설정
		this.frame = frame;
		this.alldata = this;
		
		//전체 패널 생성
		alldata.setBounds(0, 0, 500, 870);
		alldata.setLayout(null);
		alldata.setBackground(Color.white);
		frame.add(alldata);

		/* 하단 패널 생성 */
		JPanel bottomPanel = new JPanel();

		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.WHITE);
		alldata.add(bottomPanel);
		
		/* 상단 패널 생성 */
		JPanel topPanel = new JPanel();
		topPanel.setBounds(0, 0, 500, 100);
		topPanel.setLayout(null);
		topPanel.setBackground(Color.WHITE);
		alldata.add(topPanel);
		
		//상단 뒤로가기버튼
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
	     
		   ImageIcon img1 = new ImageIcon ("image\\admin\\AllData1.png");//첫번째 회원가입자데이터
	       JButton btn1 = new JButton(img1);
	       
	       ImageIcon  img2 = new ImageIcon ("image\\\\admin\\\\AllData2.png");//두번째 회원가입자데이터
	       JButton btn2 = new JButton(img2);
	       
	       ImageIcon  img3 = new ImageIcon ("image\\\\admin\\\\AllData3.png");//세번째 회원가입자데이터
	       JButton btn3 = new JButton(img3);
	       
	       ImageIcon  img4 = new ImageIcon ("image\\\\admin\\\\AllData4.png");//네번째 회원가입자데이터
	       JButton btn4 = new JButton(img4);
	       
	       ImageIcon  img5 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\AllData5.png");//다섯번째 회원가입자데이터
	       JButton btn5 = new JButton(img5);
	       
	       //탈퇴요청 데이터확인 라벨
	       ImageIcon  img6 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Delite.png");
	       JLabel lb1 = new JLabel();
	       
	       //검색마우스그림
	       ImageIcon  img10 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Find.png");//검색
	       JButton btn10 = new JButton(img10);
	       
	     //탈퇴회원 다음게시판넘어가기
	       ImageIcon  img11 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Findnext.png");//다음페이지
	       JButton btn11 = new JButton(img11);
	       
	       //패널에 버튼 추가
	       bottomPanel.add(btn1);//회원1버튼
	       bottomPanel.add(btn2);
	       bottomPanel.add(btn3);
	       bottomPanel.add(btn4);
	       bottomPanel.add(btn5);
	       topPanel.add(lb1);//
	       bottomPanel.add(btn10);
	       bottomPanel.add(btn11);

	       //버튼 위치 조정
	       btn1.setBounds(35, 143, 430, 104);
	       btn2.setBounds(35, 262, 430, 104);
	       btn3.setBounds(35, 380, 430, 104);
	       btn4.setBounds(35, 498, 430, 104);
	       btn5.setBounds(35, 616, 430, 104);
	       btn10.setBounds(31, 19, 430, 62);
	       lb1.setBounds(56, 83, 263, 33);
	       btn11.setBounds(181, 95, 136, 21);
		   btn11.setContentAreaFilled(false);
		   btn11.setBorderPainted(false);
		   btn10.setContentAreaFilled(false);
		   btn10.setBorderPainted(false);
	       	       
	       btn11.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
	    		   
	    		   new AllData2(frame);
	    		   alldata.setVisible(false);
	    		   
	    	   }
	       });
	       
	       btn0.addActionListener(new ActionListener() {
	    	   @Override
	    	   public void actionPerformed(ActionEvent e) {
	    		   
	    		   new AdminList(frame);
	    		   alldata.setVisible(false); 
	    		   
	    	   }
	       });
	}
}

		

	