package com.devs.honddoni.post.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import javax.swing.JTextArea;

public class PostView extends JFrame {

	private JPanel contentPane;
	private JTextField postTitle;
	private JTextField joinmember;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PostView frame = new PostView();
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
	public PostView() {
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(106, 311, 37, 28);
		panel.add(comboBox);
		
		JButton postconfirm = new JButton("");
		postconfirm.setBounds(129, 784, 263, 41);
		postconfirm.setIcon(new ImageIcon(PostView.class.getResource("/post/postbutton.png")));
		postconfirm.setContentAreaFilled(false);
		postconfirm.setBorderPainted(false);
		panel.add(postconfirm);
		
		JButton honddonibtn = new JButton("");
		honddonibtn.setBounds(298, 27, 185, 73);
		honddonibtn.setBorderPainted(false);
		honddonibtn.setContentAreaFilled(false);
		honddonibtn.setForeground(Color.WHITE);
		honddonibtn.setIcon(new ImageIcon(PostView.class.getResource("/post/logoButton.png")));
		panel.add(honddonibtn);
		
		JButton sidebar = new JButton("");
		sidebar.setBounds(35, 28, 37, 27);
		sidebar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sidebar.setIcon(new ImageIcon(PostView.class.getResource("/common/Group 1014.png")));
		sidebar.setContentAreaFilled(false);
		sidebar.setBorderPainted(false);
		panel.add(sidebar);
		
		postTitle = new JTextField();
		postTitle.setBorder(null);
		postTitle.setDisabledTextColor(Color.WHITE);
		postTitle.setOpaque(false);
		postTitle.setBounds(113, 120, 322, 28);
		panel.add(postTitle);
		postTitle.setColumns(10);
		
		JButton postType = new JButton("");
		postType.setIcon(new ImageIcon(PostView.class.getResource("/post/postcategory.png")));
		postType.setContentAreaFilled(false);
		postType.setBorderPainted(false);
		postType.setBounds(43, 120, 56, 30);
		panel.add(postType);
		
		JButton localSelectbtn = new JButton("");
		localSelectbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		localSelectbtn.setOpaque(false);
		localSelectbtn.setContentAreaFilled(false);
		localSelectbtn.setBorderPainted(false);
		localSelectbtn.setBounds(105, 178, 125, 31);
		panel.add(localSelectbtn);
		
		joinmember = new JTextField();
		joinmember.setBorder(null);
		joinmember.setOpaque(false);
		joinmember.setBounds(327, 181, 108, 28);
		panel.add(joinmember);
		joinmember.setColumns(10);
		
		
		String[] actioncategory = {" "," 맛집탐방", " 활동", " 취미", " 산책", " 스터디", " 게임"};
		JComboBox selectCategorycombo = new JComboBox(actioncategory);
		selectCategorycombo.setFocusable(false);
		selectCategorycombo.setLightWeightPopupEnabled(false);
		selectCategorycombo.setOpaque(false);
		selectCategorycombo.setForeground(Color.BLACK);
		selectCategorycombo.setBorder(null);
		selectCategorycombo.setBackground(UIManager.getColor("Button.disabledShadow"));
		selectCategorycombo.setBounds(139, 245, 306, 28);
		selectCategorycombo.setModel(new DefaultComboBoxModel(new String[] {" ", "맛집탐방", "활동", "취미", "산책", "스터디", "게임"}));
		panel.add(selectCategorycombo);
		
		JTextArea postContents = new JTextArea();
		postContents.setOpaque(false);
		postContents.setBounds(59, 405, 399, 273);
		panel.add(postContents);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(170, 311, 39, 28);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(238, 311, 39, 28);
		panel.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(327, 311, 39, 28);
		panel.add(comboBox_3);
		
		
		JLabel postbacklabel = new JLabel("");
		postbacklabel.setBackground(Color.WHITE);
		postbacklabel.setBounds(0, 0, 500, 870);
		postbacklabel.setIcon(new ImageIcon(PostView.class.getResource("/post/postpannel2.png")));
		panel.add(postbacklabel);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(396, 311, 39, 28);
		panel.add(comboBox_4);
	}
}
