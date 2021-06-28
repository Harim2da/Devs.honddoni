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

public class MemberLogView extends JFrame {
	
	public MemberLogView() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("logobutton");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FirstView();
			}
		});
		
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
		
		btnNewButton.setBounds(174, 276, 152, 154);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("logo2 button");
		btnNewButton_1.setBounds(130, 443, 241, 99);
		getContentPane().add(btnNewButton_1);
	}
	
	private JPanel contentPane;
	
	public void FirstView() {
		viewframe frame = new viewframe();
		frame.setVisible(true);
		frame.getContentPane().add(contentPane);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 909);
		
		contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 500, 870);
		contentPane.add(panel);
		
		
		
	}
	
	public void MemberLogView() {}	
}
