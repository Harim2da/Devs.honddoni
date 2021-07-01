package com.devs.honddoni.admin.viewmiddle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class login2 extends JPanel {
	
    private JButton btn1, btn2, btn3, btn4, btn5;
    private JLabel label1;
    private JFrame mainFrame;

   public login2()
   {
       //버튼을 넣기 위한 패널 생성
//       JPanel jp1 = new JPanel();
//       JButton jb = new JButton();
       this.setBounds(0, 0, 498, 862);
       this.setLayout(null);
//       jp.setBounds(100, 100, 516, 909); //컨테이너 크기
//       this.setLocation(null);
       
       //이미지 버튼 생성
       ImageIcon  img1 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
       JButton btn1 = new JButton("로그인");
       
       ImageIcon  img2 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
       JButton btn2 = new JButton("아이디 찾기");
       
       ImageIcon  img3 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
       JButton btn3 = new JButton("비밀번호 찾기");
       
       ImageIcon  img4 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
       JButton btn4 = new JButton("혼또니 회원가입");
       
       ImageIcon  img5 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
       JButton btn5 = new JButton("관리자 로그인 성공");
  
       //패널에 버튼 추가
       this.add(btn1);
       this.add(btn2);
       this.add(btn3);
       this.add(btn4);
       this.add(btn5);
  
       //버튼 위치 조정
       btn1.setBounds(34, 592, 430, 62);
       btn2.setBounds(57, 724, 110, 40);
       btn3.setBounds(195, 724, 110, 40);
       btn4.setBounds(333, 724, 110, 40);
       btn5.setBounds(28, 353, 442, 231);
       
       //컨테이너에 패널 추가
//       add(jp1);
       setVisible(true); //창을 보이게함
       
       btn5.addActionListener(new ActionListener() {
    	   @Override
    	   public void actionPerformed(ActionEvent e) {
    		   new AdminList();
    		   setVisible(false);
    	   }
       });
   }
}
