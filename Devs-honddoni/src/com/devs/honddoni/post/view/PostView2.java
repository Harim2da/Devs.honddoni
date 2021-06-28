package com.devs.honddoni.post.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import javax.swing.JLabel;

public class PostView2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PostView2 frame = new PostView2();
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
	public PostView2() {
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton_99_1 = new JButton("");
		btnNewButton_99_1.setIcon(new ImageIcon(PostView2.class.getResource("/post/commentReportButton.png")));
		btnNewButton_99_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton_99_1_1_1_1_1_1_1_1_1 = new JButton("");
		btnNewButton_99_1_1_1_1_1_1_1_1_1.setIcon(new ImageIcon(PostView2.class.getResource("/post/commentReportButton.png")));
		btnNewButton_99_1_1_1_1_1_1_1_1_1.setContentAreaFilled(false);
		btnNewButton_99_1_1_1_1_1_1_1_1_1.setBorderPainted(false);
		btnNewButton_99_1_1_1_1_1_1_1_1_1.setBounds(435, 775, 23, 23);
		panel.add(btnNewButton_99_1_1_1_1_1_1_1_1_1);
		
		JButton btnNewButton_99_1_1_1_1_1_1_1_1 = new JButton("");
		btnNewButton_99_1_1_1_1_1_1_1_1.setIcon(new ImageIcon(PostView2.class.getResource("/post/commentReportButton.png")));
		btnNewButton_99_1_1_1_1_1_1_1_1.setContentAreaFilled(false);
		btnNewButton_99_1_1_1_1_1_1_1_1.setBorderPainted(false);
		btnNewButton_99_1_1_1_1_1_1_1_1.setBounds(435, 711, 23, 23);
		panel.add(btnNewButton_99_1_1_1_1_1_1_1_1);
		
		JButton btnNewButton_99_1_1_1_1_1_1_1 = new JButton("");
		btnNewButton_99_1_1_1_1_1_1_1.setIcon(new ImageIcon(PostView2.class.getResource("/post/commentReportButton.png")));
		btnNewButton_99_1_1_1_1_1_1_1.setContentAreaFilled(false);
		btnNewButton_99_1_1_1_1_1_1_1.setBorderPainted(false);
		btnNewButton_99_1_1_1_1_1_1_1.setBounds(435, 648, 23, 23);
		panel.add(btnNewButton_99_1_1_1_1_1_1_1);
		
		JButton btnNewButton_99_1_1_1_1_1_1 = new JButton("");
		btnNewButton_99_1_1_1_1_1_1.setIcon(new ImageIcon(PostView2.class.getResource("/post/commentReportButton.png")));
		btnNewButton_99_1_1_1_1_1_1.setContentAreaFilled(false);
		btnNewButton_99_1_1_1_1_1_1.setBorderPainted(false);
		btnNewButton_99_1_1_1_1_1_1.setBounds(435, 578, 23, 23);
		panel.add(btnNewButton_99_1_1_1_1_1_1);
		
		JButton btnNewButton_99_1_1_1_1_1 = new JButton("");
		btnNewButton_99_1_1_1_1_1.setIcon(new ImageIcon(PostView2.class.getResource("/post/commentReportButton.png")));
		btnNewButton_99_1_1_1_1_1.setContentAreaFilled(false);
		btnNewButton_99_1_1_1_1_1.setBorderPainted(false);
		btnNewButton_99_1_1_1_1_1.setBounds(435, 511, 23, 23);
		panel.add(btnNewButton_99_1_1_1_1_1);
		
		JButton btnNewButton_99_1_1_1_1 = new JButton("");
		btnNewButton_99_1_1_1_1.setIcon(new ImageIcon(PostView2.class.getResource("/post/commentReportButton.png")));
		btnNewButton_99_1_1_1_1.setContentAreaFilled(false);
		btnNewButton_99_1_1_1_1.setBorderPainted(false);
		btnNewButton_99_1_1_1_1.setBounds(435, 444, 23, 23);
		panel.add(btnNewButton_99_1_1_1_1);
		
		JButton btnNewButton_99_1_1_1 = new JButton("");
		btnNewButton_99_1_1_1.setIcon(new ImageIcon(PostView2.class.getResource("/post/commentReportButton.png")));
		btnNewButton_99_1_1_1.setContentAreaFilled(false);
		btnNewButton_99_1_1_1.setBorderPainted(false);
		btnNewButton_99_1_1_1.setBounds(435, 378, 23, 23);
		panel.add(btnNewButton_99_1_1_1);
		
		JButton btnNewButton_99_1_1 = new JButton("");
		btnNewButton_99_1_1.setIcon(new ImageIcon(PostView2.class.getResource("/post/commentReportButton.png")));
		btnNewButton_99_1_1.setContentAreaFilled(false);
		btnNewButton_99_1_1.setBorderPainted(false);
		btnNewButton_99_1_1.setBounds(435, 311, 23, 23);
		panel.add(btnNewButton_99_1_1);
		btnNewButton_99_1.setContentAreaFilled(false);
		btnNewButton_99_1.setBorderPainted(false);
		btnNewButton_99_1.setBounds(435, 244, 23, 23);
		panel.add(btnNewButton_99_1);
		
		JButton btnNewButton_5_1_1_1_1_1_1_1_1_1 = new JButton("");
		btnNewButton_5_1_1_1_1_1_1_1_1_1.setIcon(new ImageIcon(PostView2.class.getResource("/post/commentUpdateButton.png")));
		btnNewButton_5_1_1_1_1_1_1_1_1_1.setContentAreaFilled(false);
		btnNewButton_5_1_1_1_1_1_1_1_1_1.setBorderPainted(false);
		btnNewButton_5_1_1_1_1_1_1_1_1_1.setBounds(402, 775, 23, 23);
		panel.add(btnNewButton_5_1_1_1_1_1_1_1_1_1);
		
		JButton btnNewButton_5_1_1_1_1_1_1_1_1 = new JButton("");
		btnNewButton_5_1_1_1_1_1_1_1_1.setIcon(new ImageIcon(PostView2.class.getResource("/post/commentUpdateButton.png")));
		btnNewButton_5_1_1_1_1_1_1_1_1.setContentAreaFilled(false);
		btnNewButton_5_1_1_1_1_1_1_1_1.setBorderPainted(false);
		btnNewButton_5_1_1_1_1_1_1_1_1.setBounds(402, 711, 23, 23);
		panel.add(btnNewButton_5_1_1_1_1_1_1_1_1);
		
		JButton btnNewButton_5_1_1_1_1_1_1_1 = new JButton("");
		btnNewButton_5_1_1_1_1_1_1_1.setIcon(new ImageIcon(PostView2.class.getResource("/post/commentUpdateButton.png")));
		btnNewButton_5_1_1_1_1_1_1_1.setContentAreaFilled(false);
		btnNewButton_5_1_1_1_1_1_1_1.setBorderPainted(false);
		btnNewButton_5_1_1_1_1_1_1_1.setBounds(402, 648, 23, 23);
		panel.add(btnNewButton_5_1_1_1_1_1_1_1);
		
		JButton btnNewButton_5_1_1_1_1_1_1 = new JButton("");
		btnNewButton_5_1_1_1_1_1_1.setIcon(new ImageIcon(PostView2.class.getResource("/post/commentUpdateButton.png")));
		btnNewButton_5_1_1_1_1_1_1.setContentAreaFilled(false);
		btnNewButton_5_1_1_1_1_1_1.setBorderPainted(false);
		btnNewButton_5_1_1_1_1_1_1.setBounds(402, 578, 23, 23);
		panel.add(btnNewButton_5_1_1_1_1_1_1);
		
		JButton btnNewButton_5_1_1_1_1_1 = new JButton("");
		btnNewButton_5_1_1_1_1_1.setIcon(new ImageIcon(PostView2.class.getResource("/post/commentUpdateButton.png")));
		btnNewButton_5_1_1_1_1_1.setContentAreaFilled(false);
		btnNewButton_5_1_1_1_1_1.setBorderPainted(false);
		btnNewButton_5_1_1_1_1_1.setBounds(402, 511, 23, 23);
		panel.add(btnNewButton_5_1_1_1_1_1);
		
		JButton btnNewButton_5_1_1_1_1 = new JButton("");
		btnNewButton_5_1_1_1_1.setIcon(new ImageIcon(PostView2.class.getResource("/post/commentUpdateButton.png")));
		btnNewButton_5_1_1_1_1.setContentAreaFilled(false);
		btnNewButton_5_1_1_1_1.setBorderPainted(false);
		btnNewButton_5_1_1_1_1.setBounds(402, 444, 23, 23);
		panel.add(btnNewButton_5_1_1_1_1);
		
		JButton btnNewButton_5_1_1_1 = new JButton("");
		btnNewButton_5_1_1_1.setIcon(new ImageIcon(PostView2.class.getResource("/post/commentUpdateButton.png")));
		btnNewButton_5_1_1_1.setContentAreaFilled(false);
		btnNewButton_5_1_1_1.setBorderPainted(false);
		btnNewButton_5_1_1_1.setBounds(402, 378, 23, 23);
		panel.add(btnNewButton_5_1_1_1);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon(PostView2.class.getResource("/common/Group 1014.png")));
		btnNewButton.setBounds(35, 34, 37, 20);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setDefaultCapable(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setIcon(new ImageIcon(PostView2.class.getResource("/post/logoButton.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(304, 28, 173, 71);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setIcon(new ImageIcon(PostView2.class.getResource("/post/commentWriteButton.png")));
		btnNewButton_2.setBounds(35, 117, 72, 22);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setIcon(new ImageIcon(PostView2.class.getResource("/post/NextPageButton.png")));
		btnNewButton_3.setBounds(182, 117, 137, 22);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon(PostView2.class.getResource("/post/backButton.png")));
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setBounds(444, 117, 22, 22);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setContentAreaFilled(false);
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setIcon(new ImageIcon(PostView2.class.getResource("/post/commentUpdateButton.png")));
		btnNewButton_5.setBounds(402, 178, 23, 23);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("");
		btnNewButton_5_1.setIcon(new ImageIcon(PostView2.class.getResource("/post/commentUpdateButton.png")));
		btnNewButton_5_1.setContentAreaFilled(false);
		btnNewButton_5_1.setBorderPainted(false);
		btnNewButton_5_1.setBounds(402, 244, 23, 23);
		panel.add(btnNewButton_5_1);
		
		JButton btnNewButton_99 = new JButton("");
		btnNewButton_99.setContentAreaFilled(false);
		btnNewButton_99.setBorderPainted(false);
		btnNewButton_99.setIcon(new ImageIcon(PostView2.class.getResource("/post/commentReportButton.png")));
		btnNewButton_99.setBounds(435, 178, 23, 23);
		panel.add(btnNewButton_99);
		
		JButton btnNewButton_5_1_1 = new JButton("");
		btnNewButton_5_1_1.setIcon(new ImageIcon(PostView2.class.getResource("/post/commentUpdateButton.png")));
		btnNewButton_5_1_1.setContentAreaFilled(false);
		btnNewButton_5_1_1.setBorderPainted(false);
		btnNewButton_5_1_1.setBounds(402, 311, 23, 23);
		panel.add(btnNewButton_5_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(PostView2.class.getResource("/post/commentWriteListLabelTen.png")));
		lblNewLabel_1.setBounds(35, 151, 431, 662);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\정현수\\Desktop\\댓글 전체보기.png"));
		lblNewLabel.setBounds(0, 0, 500, 870);
		panel.add(lblNewLabel);
	}
}
