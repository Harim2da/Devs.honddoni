package com.devs.honddoni.admin.viewtaehun;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.devs.honddoni.search.view.AllBoardListView;

public class Application extends JFrame {
	
    private JButton b1, b2, b3, b4;
    private JLabel label1;
  

   public Application()
   {
       super("태훈님 화면"); //프레임의 타이틀
   	   setBounds(100, 100, 516, 909); //컨테이너 크기
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
       
       //버튼을 넣기 위한 패널 생성
       JPanel jp = new JPanel();
//     setBounds(0, 0, 498, 862);
       jp.setLayout(null);
       
       //이미지 버튼 생성
       ImageIcon  img1 = new ImageIcon ("image/post/canclebtn.png");
       JButton btn1 = new JButton("s");
       
       ImageIcon  img2 = new ImageIcon ("image/post/canclebtn.png");
       JButton btn2 = new JButton(img2);
       
       ImageIcon  img3 = new ImageIcon ("src/com/devs/honddoni/admin/viewtaehun/SearchButton.png");
       JButton btn3 = new JButton(img3);
       
       JButton btn4 = new JButton("src/com/devs/honddoni/admin/viewtaehun/SearchButton.png");
       
       JButton btn5 = new JButton("image/post/canclebtn.png");
       
       JButton btn6 = new JButton("하트");
       
       ImageIcon  imgA = new ImageIcon ("src/com/devs/honddoni/admin/viewtaehun/SearchText.png");
       JTextField f1 = new JTextField();
       
       ImageIcon  img111 = new ImageIcon ("src/com/devs/honddoni/admin/viewtaehun/SearchLabel.png");
       JLabel j1 = new JLabel(img111);
       
//       JLabel label1 = new JLabel("혼또니 마크");
//       
//       JLabel label2 = new JLabel("혼또니 글씨");
//       
//       JLabel jl = new JLabel("아이디 : ");
//       JTextField jt = new JTextField();
//       
//       JLabel jl1 = new JLabel("패스워드 : ");
//       JTextField jt1 = new JTextField();
  
    		   

       //패널에 버튼 추가
       jp.add(btn1);
       jp.add(btn2);
       jp.add(btn3);
       jp.add(btn4);
       jp.add(btn5);
       jp.add(btn6);
       jp.add(f1);
       jp.add(j1);
//       jp.add(label2);
//       jp.add(jl);
//       jp.add(jt);
//       jp.add(jl1);
//       jp.add(jt1);
       
   
       //버튼 위치 조정
       btn1.setBounds(34, 36, 36, 16);
       btn2.setBounds(303, 27, 172, 70);
       btn3.setBounds(59, 142, 28, 28);
       btn4.setBounds(181, 201, 136, 21);
       btn5.setBounds(34, 243, 430, 104);
       btn6.setBounds(436, 251, 22, 22);
       f1.setBounds(106, 171, 326, 0);
       j1.setBounds(34, 125, 430, 62);
//       label2.setBounds(130, 257, 240, 98);
//       jl.setBounds(34, 431, 430, 62);
//       jt.setBounds(34, 431, 430, 62);
//       jl1.setBounds(34, 512, 430, 62);
//       jt1.setBounds(34, 512, 430, 62);
       add(jp);
       setVisible(true);
       
     
   }
   public static void main(String[] args) {

       Application A = new Application();
   }
}
