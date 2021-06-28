package com.devs.honddoni.admin.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.devs.honddoni.admin.view.viewframe;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Rectangle;

public class viewframe extends JFrame {

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
	public viewframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 909);
		contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 498, 862);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setDefaultCapable(false);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\명길\\Desktop\\admin123\\Check withdrawal request member data.png"));
		btnNewButton.setBounds(35, 129, 430, 121);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setDefaultCapable(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\명길\\Desktop\\admin123\\Full data of membership subscribers (2).png"));
		btnNewButton_1.setBounds(34, 293, 430, 121);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\명길\\Desktop\\admin123\\Member achievement management.png"));
		btnNewButton_2.setBounds(34, 456, 430, 121);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\명길\\Desktop\\admin123\\Manage Announcement.png"));
		btnNewButton_3.setBounds(188, 520, 105, 27);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\명길\\Desktop\\admin123\\SideBar.png"));
		btnNewButton_4.setBounds(14, 38, 105, 27);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setContentAreaFilled(false);
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\명길\\Desktop\\admin123\\Mark.png"));
		btnNewButton_5.setBounds(303, 27, 172, 70);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setContentAreaFilled(false);
		btnNewButton_6.setBorderPainted(false);
		btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\명길\\Desktop\\admin123\\Manage Announcement.png"));
		btnNewButton_6.setBounds(33, 620, 430, 121);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setBorderPainted(false);
		btnNewButton_7.setContentAreaFilled(false);
		btnNewButton_7.setIcon(new ImageIcon("C:\\Users\\명길\\Desktop\\admin123\\Scroll.png"));
		btnNewButton_7.setBounds(221, 798, 56, 25);
		panel.add(btnNewButton_7);
	}
}
