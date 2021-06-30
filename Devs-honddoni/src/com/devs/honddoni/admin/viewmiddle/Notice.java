package com.devs.honddoni.admin.viewmiddle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Notice extends JFrame {
	
    private JButton b1, b2;

   public Notice()
   {
       super("공지사항 관리"); //프레임의 타이틀
   	   setBounds(100, 100, 516, 909); //컨테이너 크기
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLocationRelativeTo(null);

       
       //버튼을 넣기 위한 패널 생성
       JPanel jp = new JPanel();
//     setBounds(0, 0, 498, 862);
       jp.setLayout(null);
       
       //이미지 버튼 생성
       ImageIcon  img1 = new ImageIcon ("../admin/admin123/Check withdrawal request member data.png");
       JButton btn1 = new JButton("S");
       
       ImageIcon  img2 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
       JButton btn2 = new JButton("M");
       
       ImageIcon  img3 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
       JButton btn3 = new JButton("공지사항 작성");
     
       
       //패널에 버튼 추가
       jp.add(btn1);
       jp.add(btn2);
       jp.add(btn3);
      
       
    
       
       //버튼 위치 조정
       btn1.setBounds(34, 36, 36, 16);
       btn2.setBounds(303, 27, 172, 70);
       btn3.setBounds(35 , 227, 71, 21);
     
       
       

       //컨테이너에 패널 추가
       add(jp);
       setVisible(true); //창을 보이게함
       
       //컨테이너에 패널 추가
       add(jp);
       setVisible(true); //창을 보이게함
       
       btn2.addActionListener(new ActionListener() {
    	   @Override
    	   public void actionPerformed(ActionEvent e) {
    		   new AdminList();
    		   setVisible(false);
    	   }
    	   
       });
       
       btn3.addActionListener(new ActionListener() {
    	   @Override
    	   public void actionPerformed(ActionEvent e) {
    		   new NoticeWrite();
    		   setVisible(false);
    	   }
    	   
       });
   }
 
 
   }