package com.devs.honddoni.admin.viewmiddle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class login extends JFrame {
	
    private JButton b1, b2, b3, b4;
    private JLabel label1;
    private JFrame mainFrame;

   public login() {
	   
       super("로그인"); //프레임의 타이틀
       
       mainFrame = new JFrame();
   	   this.setBounds(100, 100, 516, 909); //컨테이너 크기
   	   this.setDefaultCloseOperation(EXIT_ON_CLOSE);
   	   this.setLocationRelativeTo(null);
       
       //버튼을 넣기 위한 패널 생성
       JPanel jp = new JPanel();
       jp.setBounds(0, 0, 498, 862);
       jp.setLayout(null);
       
       //이미지 버튼 생성
       ImageIcon  img1 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
       JButton btn1 = new JButton("로그인");
       
       ImageIcon  img2 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
       JButton btn2 = new JButton("아이디 찾기");
       
       ImageIcon  img3 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
       JButton btn3 = new JButton("비밀번호 찾기");
       
       ImageIcon  img4 = new ImageIcon ("/admin/admin123/Check withdrawal request member data.png");
       JButton btn4 = new JButton("혼또니 회원가입");
       
       JLabel label1 = new JLabel("혼또니 마크");
       
       JLabel label2 = new JLabel("혼또니 글씨");
       
       JLabel jl = new JLabel("아이디 : ");
       JTextField jt = new JTextField();
       
       JLabel jl1 = new JLabel("패스워드 : ");
       JTextField jt1 = new JTextField();
  
    		   

       //패널에 버튼 추가
       jp.add(btn1);
       jp.add(btn2);
       jp.add(btn3);
       jp.add(btn4);
       jp.add(label1);
       jp.add(label2);
       jp.add(jl);
       jp.add(jt);
       jp.add(jl1);
       jp.add(jt1);
       
   
       //버튼 위치 조정
       btn1.setBounds(34, 592, 430, 62);
       btn2.setBounds(57, 724, 110, 40);
       btn3.setBounds(195, 724, 110, 40);
       btn4.setBounds(333, 724, 110, 40);
       label1.setBounds(174, 81, 151, 153);
       label2.setBounds(130, 257, 240, 98);
       jl.setBounds(34, 431, 430, 62);
       jt.setBounds(34, 431, 430, 62);
       jl1.setBounds(34, 512, 430, 62);
       jt1.setBounds(34, 512, 430, 62);
     

       //컨테이너에 패널 추가
       add(jp);
       setVisible(true); //창을 보이게함
       
       btn1.addActionListener(new ActionListener() {
    	   @Override
    	   public void actionPerformed(ActionEvent e) {
    		   login2 login2 = new login2();
    		   mainFrame.add(login2);
    		   jp.setVisible(false);
    	   }
       });
   }
   public static void main(String[] args) {

       login l = new login();
   }
}
