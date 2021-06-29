package com.devs.honddoni.search.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

public class SearchView {

	private JFrame frame;
	private final JPanel panel_2 = new JPanel();
	private JTextField searchBar;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchView window = new SearchView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SearchView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 516, 909);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 500, 870);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(0, 0, 500, 870);
		panel.add(panel_1);
		panel_1.setLayout(null);
		panel_2.setBackground(Color.PINK);
		panel_2.setBounds(0, 0, 500, 100);
		panel_1.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 100, 500, 770);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel achivement = new JLabel("");
		achivement.setIcon(new ImageIcon(SearchView.class.getResource("/common/Group 1010.png")));
		achivement.setBounds(179, 172, 70, 39);
		panel_3.add(achivement);
		
		JLabel exId = new JLabel("");
		exId.setIcon(new ImageIcon(SearchView.class.getResource("/search/exId.png")));
		exId.setBounds(101, 170, 80, 43);
		panel_3.add(exId);
		
		JLabel profile = new JLabel("");
		profile.setIcon(new ImageIcon(SearchView.class.getResource("/member/updateInfo/pf3.png")));
		profile.setBounds(40, 163, 57, 50);
		panel_3.add(profile);
		
		JLabel locationLabel = new JLabel("");
		locationLabel.setIcon(new ImageIcon(SearchView.class.getResource("/search/Rectangle 30.png")));
		locationLabel.setBounds(366, 169, 66, 21);
		panel_3.add(locationLabel);
		
		JButton heart = new JButton("");
		heart.setIcon(new ImageIcon(SearchView.class.getResource("/search/like (1) 23.png")));
		heart.setBounds(435, 167, 23, 23);
		panel_3.add(heart);
		
		textField = new JTextField();
		textField.setBounds(52, 220, 396, 30);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JButton intoBoardFrame = new JButton("");
		intoBoardFrame.setBounds(35, 160, 431, 105);
		panel_3.add(intoBoardFrame);
		
		searchBar = new JTextField();
		searchBar.setBackground(Color.LIGHT_GRAY);
		searchBar.setBounds(108, 50, 324, 30);
		panel_3.add(searchBar);
		searchBar.setColumns(10);
		
		JButton aim = new JButton();
		aim.setIcon(new ImageIcon(SearchView.class.getResource("/search/aim.png")));
		aim.setBounds(58, 50, 30, 30);
		panel_3.add(aim);
		
		JLabel searchBarFrame = new JLabel();
		searchBarFrame.setBounds(35, 34, 430, 62);
		panel_3.add(searchBarFrame);
		
		JLabel panel2lFrame = new JLabel("New label");
		panel2lFrame.setIcon(new ImageIcon(SearchView.class.getResource("/search/selectAllListLabel.png")));
		panel2lFrame.setBounds(0, 0, 500, 770);
		panel_3.add(panel2lFrame);
		
		
		//------------------------------------------------------------------------------------------------------------
		
//		JPanel panel_4 = new JPanel();
//		panel_4.setBounds(0, 100, 500, 770);
//		panel_1.add(panel_4);
//		panel_4.setLayout(null);
//		
//		JLabel achivement1 = new JLabel("");
//		achivement1.setIcon(new ImageIcon(SearchView.class.getResource("/common/Group 1010.png")));
//		achivement1.setBounds(179, 172, 70, 39);
//		panel_4.add(achivement1);
//		
//		JLabel exId1 = new JLabel("");
//		exId1.setIcon(new ImageIcon(SearchView.class.getResource("/search/exId1.png")));
//		exId1.setBounds(101, 170, 80, 43);
//		panel_4.add(exId1);
//		
//		JLabel profile = new JLabel("");
//		profile.setIcon(new ImageIcon(SearchView.class.getResource("/member/updateInfo/pf3.png")));
//		profile.setBounds(40, 163, 57, 50);
//		panel_4.add(profile);
//		
//		JLabel locationLabel = new JLabel("");
//		locationLabel.setIcon(new ImageIcon(SearchView.class.getResource("/search/Rectangle 30.png")));
//		locationLabel.setBounds(366, 169, 66, 21);
//		panel_4.add(locationLabel);
//		
//		JButton heart = new JButton("");
//		heart.setIcon(new ImageIcon(SearchView.class.getResource("/search/like (1) 23.png")));
//		heart.setBounds(435, 167, 23, 23);
//		panel_4.add(heart);
//		
//		textField = new JTextField();
//		textField.setBounds(52, 220, 396, 30);
//		panel_4.add(textField);
//		textField.setColumns(10);
//		
//		JButton intoBoardFrame = new JButton("");
//		intoBoardFrame.setBounds(35, 160, 431, 105);
//		panel_4.add(intoBoardFrame);
//		
//		searchBar = new JTextField();
//		searchBar.setBackground(Color.LIGHT_GRAY);
//		searchBar.setBounds(108, 50, 324, 30);
//		panel_4.add(searchBar);
//		searchBar.setColumns(10);
//		
//		JButton aim = new JButton();
//		aim.setIcon(new ImageIcon(SearchView.class.getResource("/search/aim.png")));
//		aim.setBounds(58, 50, 30, 30);
//		panel_4.add(aim);
//		
//		JLabel searchBarFrame = new JLabel();
//		searchBarFrame.setBounds(35, 34, 430, 62);
//		panel_4.add(searchBarFrame);
//		
//		JLabel panel2lFrame = new JLabel("New label");
//		panel2lFrame.setIcon(new ImageIcon(SearchView.class.getResource("/search/selectAllListLabel.png")));
//		panel2lFrame.setBounds(0, 0, 500, 770);
//		panel_4.add(panel2lFrame);
		
	}
}
