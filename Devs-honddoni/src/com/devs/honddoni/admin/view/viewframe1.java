package com.devs.honddoni.admin.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class viewframe1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewframe frame = new viewframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the frame.
	 */
	public viewframe1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 909);
		
		contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 500, 870);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\명길\\Desktop\\admin123\\Manage Posts.png"));
		btnNewButton.setBounds(33, 124, 430, 97);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setActionCommand("");
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\명길\\Desktop\\admin123\\Report Processing Posts.png"));
		btnNewButton_1.setBounds(33, 253, 430, 97);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setActionCommand("");
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\명길\\Desktop\\admin123\\Report Processing Comments.png"));
		btnNewButton_2.setBounds(33, 513, 430, 97);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\명길\\Desktop\\admin123\\Report Processing User.png"));
		btnNewButton_3.setActionCommand("");
		btnNewButton_3.setBounds(33, 383, 430, 97);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setActionCommand("");
		btnNewButton_4.setBounds(33, 383, 430, 97);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\명길\\Desktop\\admin123\\SideBar.png"));
		btnNewButton_5.setContentAreaFilled(false);
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setActionCommand("");
		btnNewButton_5.setBounds(35, 36, 36, 16);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\명길\\Desktop\\admin123\\Mark.png"));
		btnNewButton_6.setActionCommand("");
		btnNewButton_6.setBounds(303, 27, 172, 70);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setActionCommand("");
		btnNewButton_7.setIcon(new ImageIcon("C:\\Users\\명길\\Desktop\\admin123\\Scroll2.png"));
		btnNewButton_7.setBounds(221, 798, 56, 25);
		panel.add(btnNewButton_7);
	}

}
