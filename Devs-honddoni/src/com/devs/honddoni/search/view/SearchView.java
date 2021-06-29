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
		
		JButton aim = new JButton();
		aim.setIcon(new ImageIcon(SearchView.class.getResource("/search/aim.png")));
		aim.setBounds(58, 50, 30, 30);
		panel_3.add(aim);
		
		JLabel searchBarFrame = new JLabel();
		searchBarFrame.setBounds(35, 34, 430, 62);
		panel_3.add(searchBarFrame);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(SearchView.class.getResource("/search/selectAllListLabel.png")));
		lblNewLabel.setBounds(0, 0, 500, 770);
		panel_3.add(lblNewLabel);
		
		searchBar = new JTextField();
		searchBar.setBounds(108, 50, 324, 30);
		panel_3.add(searchBar);
		searchBar.setColumns(10);
	}
}
