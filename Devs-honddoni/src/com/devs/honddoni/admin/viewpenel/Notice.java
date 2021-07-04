package com.devs.honddoni.admin.viewpenel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//공지사항 화면

public class Notice {
	
	MainFrame1 MainFrame = new MainFrame1();
	
	private JButton btn1;
	
	public Notice() {

		/* 전체 패널 생성 */
		JPanel bottomPanel = new JPanel();

		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.WHITE);
		MainFrame.add(bottomPanel);
		
		   ImageIcon img1 = new ImageIcon ("image\\admin\\NoticeButton.png");
	       JButton btn1 = new JButton(img1);
	       
	       ImageIcon  img2 = new ImageIcon ("image\\\\admin\\\\NoticeButton.png");
	       JButton btn2 = new JButton(img2);
	       
	       ImageIcon  img3 = new ImageIcon ("image\\\\admin\\\\NoticeButton.png");
	       JButton btn3 = new JButton(img3);
	       
	       ImageIcon  img4 = new ImageIcon ("image\\\\admin\\\\NoticeButton.png");
	       JButton btn4 = new JButton(img4);
	       
	       ImageIcon  img5 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\NoticeButton.png");
	       JButton btn5 = new JButton(img5);
	       
	       
	       ImageIcon  img6 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\Delite.png");
	       JLabel lb1 = new JLabel();
	       
	       ImageIcon  img7 = new ImageIcon ("image\\\\\\\\admin\\\\\\\\NoticeWrite.png");
	       JButton btn7 = new JButton(img7);
	       
	       JLabel j1 = new JLabel();
	       JTextField tex1 = new JTextField();
	       
	       JLabel j2 = new JLabel();
	       JTextField tex2 = new JTextField();
	       
	       JTextField tex3 = new JTextField();
	       
	       JTextField tex4 = new JTextField();
	       
	       JTextField tex5 = new JTextField();
	       
	       
	       
	       
	       
	       
	   
	  
	       //패널에 버튼 추가
	       bottomPanel.add(btn1);
	       bottomPanel.add(btn2);
	       bottomPanel.add(btn3);
	       bottomPanel.add(btn4);
	       bottomPanel.add(btn5);
	       bottomPanel.add(lb1);
	       bottomPanel.add(btn7);
	       
	       bottomPanel.add(tex1);
	       bottomPanel.add(j1);
	       
	       bottomPanel.add(tex2);
	       bottomPanel.add(j2);
	       
	       bottomPanel.add(tex3);
	       bottomPanel.add(tex4);
	       bottomPanel.add(tex5);
	    
	       //버튼 위치 조정
	       btn1.setBounds(35, 153, 433, 105);
	       btn2.setBounds(35, 272, 433, 105);
	       btn3.setBounds(35, 381, 433, 105);
	       btn4.setBounds(35, 510, 433, 105);
	       btn5.setBounds(35, 629, 433, 105);
	       lb1.setBounds(56, 0, 263, 33);
	       btn7.setBounds(35, 127, 71, 21);
	       tex1.setBounds(54, 210, 398, 29);
	       j1.setBounds(54, 210, 398, 29);
	       
	       tex1.setBounds(54, 333, 398, 29);
	       j2.setBounds(54, 333, 398, 29);
	       
	       
	       tex1.setBounds(54, 452, 398, 29);
	       tex1.setBounds(54, 571, 398, 29);
	       tex1.setBounds(54, 690, 398, 29);
	       
	   
	     
	       //컨테이너에 패널 추가
	       MainFrame.add(bottomPanel);
	       MainFrame.setVisible(true); //창을 보이게함
	       
//	       btn1.addActionListener(new ActionListener() {
//	    	   @Override
//	    	   public void actionPerformed(ActionEvent e) {
////	    		   login2 login2 = new login2();
////	    		   JPanel.add(login2);
////	    		   new login2();
////	    		   bottomPanel.setVisible(false);
//	    		   
//	    		   new login2();
//	    		   bottomPanel.setVisible(false);
////	    		  MainFrame.setVisible(false);
//	    	   }
//	       });
	}
}

		