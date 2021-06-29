package com.devs.honddoni.admin.vew1;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.apache.log4j.chainsaw.Main;

public class AdminView extends JFrame {
	
	static JButton b1=new JButton("버튼1");
	/*그려주기*/

	public Main() {
		homeframe();
		btn();
	}
	/*프레임 생성 함수*/
	public void homeframe() {
		setTitle("1");//타이틀
		setSize(400,600);//프레임의 크기
		setResizable(false);//창의 크기를 변경하지 못하게
		setLocationRelativeTo(null);//창이 가운데 나오게
		setLayout(null);//레이아웃을 내맘대로 설정가능하게 해줌.
		setVisible(true);//창이 보이게
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
	}
	/*버튼설정*/
	public void btn() {
		b1.setLayout(null);//레이아웃
		b1.setBounds(0, 0, 100, 100);//위치,크기
		add(b1);//프레임에 추가
	}
	public void paint(Graphics g) {//그리는 함수
		g.drawImage(background, 0, 0, null);//background를 그려줌
		//paintComponents(g);//add로 추가해준부분을 그려줌
	}
	/*메인함수*/
	public static void main(String[] args){
		new Main();
	}
}
		
//		JFrame mf = new JFrame();
//		mf.setBounds(100, 100, 516, 909);
//		
//		JPanel panel1 = new JPanel();
//		panel1.setBounds(0, 0, 498, 862);
//
//		mf.add(panel1, BorderLayout CENTER);
//		mf.add(new JButton)
//		JButton button = new JButton();
//		button.setBounds(35, 129, 430, 121);
	}
}