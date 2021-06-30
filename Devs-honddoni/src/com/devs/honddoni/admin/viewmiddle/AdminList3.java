package com.devs.honddoni.admin.viewmiddle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AdminList3 extends JFrame {
	
    private JButton b1, b2, b3, b4, b5, b6, b7;

   public AdminList3()
   {
       super("관리자메뉴2(로그아웃)"); //프레임의 타이틀
   	   setBounds(100, 100, 516, 909); //컨테이너 크기
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLocationRelativeTo(null);

       
       //버튼을 넣기 위한 패널 생성
       JPanel jp = new JPanel();
//     setBounds(0, 0, 498, 862);
       jp.setLayout(null);
       
       //이미지 버튼 생성
       ImageIcon  img1 = new ImageIcon ("../admin/admin123/Check withdrawal request member data.png");
       JButton btn1 = new JButton("게시글관리");
       
       ImageIcon  img2 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
       JButton btn2 = new JButton("신고처리-게시글");
       
       ImageIcon  img3 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
       JButton btn3 = new JButton("신고처리-사용자");
       
       ImageIcon  img4 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
       JButton btn4 = new JButton("신고처리-댓글");
       
       ImageIcon  img5 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
       JButton btn5 = new JButton("관리자 로그아웃");
       
       ImageIcon  img6 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
       JButton btn6 = new JButton("S");
       
       ImageIcon  img7 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
       JButton btn7 = new JButton("B");
       
       ImageIcon  img8 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
       JButton btn8 = new JButton("N");
       
       ImageIcon  img9 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
       JButton btn9 = new JButton("로그아웃 성공");
       
       

       //패널에 버튼 추가
       jp.add(btn1);
       jp.add(btn2);
       jp.add(btn3);
       jp.add(btn4);
       jp.add(btn5);
       jp.add(btn6);
       jp.add(btn7);
       jp.add(btn8);
       jp.add(btn9);
       
       
       
       
       //버튼 위치 조정
       btn1.setBounds(35, 124, 430, 96);
       btn2.setBounds(33, 253, 430, 96);
       btn3.setBounds(33, 383, 430, 96);
       btn4.setBounds(33, 513, 430, 96);
       btn5.setBounds(33, 643, 430, 96);
       
       btn6.setBounds(34, 36, 36, 16);
       btn7.setBounds(303, 27, 172, 70);
       btn8.setBounds(221, 798, 56, 25);
       btn9.setBounds(29, 318, 445, 233);
     
       
       

       //컨테이너에 패널 추가
       add(jp);
       setVisible(true); //창을 보이게함
       
       //컨테이너에 패널 추가
       add(jp);
       setVisible(true); //창을 보이게함
       
       btn9.addActionListener(new ActionListener() {
    	   @Override
    	   public void actionPerformed(ActionEvent e) {
    		   new AdminList2();
    		   setVisible(false);
    	   }
    	   
       });
   }
 
 
   }