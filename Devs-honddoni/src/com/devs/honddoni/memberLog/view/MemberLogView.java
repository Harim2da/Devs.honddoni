package com.devs.honddoni.memberLog.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.devs.honddoni.view.viewframe;

import java.awt.Rectangle;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class MemberLogView extends JFrame {
	
	private JFrame frame;
	private JPanel contentPane;	
	
	public MemberLogView() {
		this.frame = new JFrame();
		this.contentPane = new JPanel();
	}

	public void FirstView() {
		frame.setBounds(100, 100, 516, 909);

		contentPane.setLayout(null);
		contentPane.setBounds(0, 0, 500, 870);

		JButton btnNewButton = new JButton("logobutton");
		btnNewButton.setIcon(new ImageIcon(MemberLogView.class.getResource("/memberLog/login/login_1_logo.png")));
		btnNewButton.setBounds(174, 276, 152, 154);
		btnNewButton.setBorderPainted(false);
		getContentPane().add(btnNewButton);

		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MemberLogView();
				frame.setVisible(false);
			}
		});		

		JButton btnNewButton_1 = new JButton("logo2 button");
		btnNewButton_1.setIcon(new ImageIcon(MemberLogView.class.getResource("/memberLog/login/login_2_logo2.png")));
		btnNewButton_1.setBounds(130, 443, 241, 99);
		btnNewButton_1.setBorderPainted(false);
		getContentPane().add(btnNewButton_1);


		contentPane.add(btnNewButton);
		contentPane.add(btnNewButton_1);

		frame.getContentPane().add(contentPane);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void MemberLogView() {
		frame.setBounds(100, 100, 516, 909);

		contentPane.setLayout(null);
		contentPane.setBounds(0, 0, 500, 870);
		
		
		
		
		frame.getContentPane().add(contentPane);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

	}

}
