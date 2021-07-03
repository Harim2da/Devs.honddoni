package com.devs.honddoni.post.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SelectAllHonPost extends JFrame{

	private static final Color Color = null;
	private JFrame frame = new JFrame();
	private JPanel bottomPanel = new JPanel(); 
	private JLabel mapLabel;
	private JLabel searchLabel;
	private JButton aim;
	
	
	public SelectAllHonPost() {
		this.setBounds(100, 100, 516, 909);
		this.setLayout(null);
		BottomPanel();
		addComponents();
		selectLocal();
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public void BottomPanel() {
		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.WHITE);	
		
		searchLabel = new JLabel();
		searchLabel.setBackground(Color.WHITE);
		searchLabel.setLayout(null);
		searchLabel.setBounds(25, 15, 450, 63); 
		searchLabel.setIcon(new ImageIcon("image/search/searchBar.png"));
		
		mapLabel = new JLabel("");
		mapLabel.setBackground(Color.WHITE);
		mapLabel.setLayout(null);
		mapLabel.setBounds(25, 125, 450, 596);            
		mapLabel.setIcon(new ImageIcon("image/post/matchlocal.png"));
		
	}
	
	private void addComponents() {
		this.add(bottomPanel);
		bottomPanel.add(searchLabel);
		bottomPanel.add(mapLabel);
	
		this.repaint();
		this.revalidate();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private void selectLocal() {
		/* 지역 선택 버튼 */
		JButton btn1 = new JButton();   
		btn1.setBounds(340, 80, 65, 65);
		btn1.setBorderPainted(false);
		btn1.setOpaque(false);
		btn1.setContentAreaFilled(false);
		mapLabel.add(btn1);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("강릉");
			}
		});

		/*지도 위 담양 버튼*/
		JButton btn2 = new JButton();   
		btn2.setBounds(50, 395, 65, 65);
		btn2.setBorderPainted(false);
		btn2.setOpaque(false);
		btn2.setContentAreaFilled(false);
		mapLabel.add(btn2);

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("담양");
			}
		});

		/*지도 위 대구 버튼*/
		JButton btn3 = new JButton();   
		btn3.setBounds(355, 295, 65, 65);
		btn3.setBorderPainted(false);
		btn3.setOpaque(false);
		btn3.setContentAreaFilled(false);
		mapLabel.add(btn3);

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("대구");
			}
		});
		/*지도 위 부산 버튼*/
		JButton btn4 = new JButton();   
		btn4.setBounds(345, 405, 65, 65);
		btn4.setBorderPainted(false);
		btn4.setOpaque(false);
		btn4.setContentAreaFilled(false);
		mapLabel.add(btn4);

		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("부산");
			}
		});

		/*지도 위 서울 버튼*/
		JButton btn5 = new JButton();   
		btn5.setBounds(80, 72, 61, 61);
		btn5.setBorderPainted(false);
		btn5.setOpaque(false);
		btn5.setContentAreaFilled(false);
		mapLabel.add(btn5);

		btn5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("서울");
			}
		});

		/*지도 위 인천 버튼*/
		JButton btn6 = new JButton();   
		btn6.setBounds(15, 125, 60, 60);
		btn6.setBorderPainted(false);
		btn6.setOpaque(false);
		btn6.setContentAreaFilled(false);
		mapLabel.add(btn6);

		btn6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("인천");
			}
		});

		/*지도 위 순천 버튼*/
		JButton btn7 = new JButton();   
		btn7.setBounds(242, 440, 60, 60);
		btn7.setBorderPainted(false);
		btn7.setOpaque(false);
		btn7.setContentAreaFilled(false);
		mapLabel.add(btn7);

		btn7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("순천");
			}
		});

		/*지도 위 전주 버튼*/
		JButton btn8 = new JButton();   
		btn8.setBounds(38, 310, 62, 62);
		btn8.setBorderPainted(false);
		btn8.setOpaque(false);
		btn8.setContentAreaFilled(false);
		mapLabel.add(btn8);

		btn8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("전주");
			}
		});

		/*지도 위 제주 버튼*/
		JButton btn9 = new JButton();   
		btn9.setBounds(195, 510, 63, 63);
		btn9.setBorderPainted(false);
		btn9.setOpaque(false);
		btn9.setContentAreaFilled(false);
		mapLabel.add(btn9);

		btn9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("제주");
			}
		});

		/*지도 위 천안 버튼*/
		JButton btn10 = new JButton();   
		btn10.setBounds(77, 223, 63, 63);
		btn10.setBorderPainted(false);
		btn10.setOpaque(false);
		btn10.setContentAreaFilled(false);
		mapLabel.add(btn10);

		btn10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("천안");

			}
		});
	}
	
	
	
	
	
	
	
}
