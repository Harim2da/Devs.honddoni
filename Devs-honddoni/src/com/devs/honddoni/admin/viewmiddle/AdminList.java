package com.devs.honddoni.admin.viewmiddle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AdminList extends JFrame {
	
    private JButton b1, b2, b3, b4, b5, b6, b7;

   public AdminList()
   {
       super("관리자메뉴 1"); //프레임의 타이틀
   	   setBounds(100, 100, 516, 909); //컨테이너 크기
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLocationRelativeTo(null);

       
       //버튼을 넣기 위한 패널 생성
       JPanel jp = new JPanel();
//     setBounds(0, 0, 498, 862);
       jp.setLayout(null);
       
       //이미지 버튼 생성
       ImageIcon  img1 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
       JButton btn1 = new JButton("탈퇴요청 데이터확인");
       
       ImageIcon  img2 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
       JButton btn2 = new JButton("회원가입자 전체데이터");
       
       ImageIcon  img3 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
       JButton btn3 = new JButton("회원 업적 관리");
       
       ImageIcon  img4 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
       JButton btn4 = new JButton("공지사항 관리");
       
       ImageIcon  img5 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
       JButton btn5 = new JButton("S");
       
       ImageIcon  img6 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
       JButton btn6 = new JButton("B");
       
       ImageIcon  img7 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
       JButton btn7 = new JButton("N");

       //패널에 버튼 추가
       jp.add(btn1);
       jp.add(btn2);
       jp.add(btn3);
       jp.add(btn4);
       jp.add(btn5);
       jp.add(btn6);
       jp.add(btn7);
       
       
       
       //버튼 위치 조정
       btn1.setBounds(35, 129, 430, 121);
       btn2.setBounds(34, 293, 430, 121);
       btn3.setBounds(34, 456, 430, 121);
       btn4.setBounds(33, 620, 430, 121);
       btn5.setBounds(34, 36, 36, 16);
       btn6.setBounds(303, 27, 172, 70);
       btn7.setBounds(221, 798, 56, 25);

       //컨테이너에 패널 추가
       add(jp);
       setVisible(true); //창을 보이게함
       
       btn7.addActionListener(new ActionListener() {
    	   @Override
    	   public void actionPerformed(ActionEvent e) {
    		   new test2();
    		   setVisible(false);
    	   }
    	   
       });
       
       btn1.addActionListener(new ActionListener() {
    	   @Override
    	   public void actionPerformed(ActionEvent e) {
    		   new Delite();
    		   setVisible(false);
    	   }
    	   
       });
       
       btn2.addActionListener(new ActionListener() {
    	   @Override
    	   public void actionPerformed(ActionEvent e) {
    		   new AllData();
    		   setVisible(false);
    	   }
    	   
       });
       
       btn3.addActionListener(new ActionListener() {
    	   @Override
    	   public void actionPerformed(ActionEvent e) {
    		   new Honest();
    		   setVisible(false);
    	   }
    	   
       });
       
       btn4.addActionListener(new ActionListener() {
    	   @Override
    	   public void actionPerformed(ActionEvent e) {
    		   new Notice();
    		   setVisible(false);
    	   }
    	   
       });
       
       btn6.addActionListener(new ActionListener() {
    	   @Override
    	   public void actionPerformed(ActionEvent e) {
    		   new AdminList();
    		   setVisible(false);
    	   }
    	   
       });
   }
}