package com.devs.honddoni.search.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.devs.honddoni.view.viewframe;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Rectangle;
import javax.swing.JButton;

public class SearchView extends JFrame {

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
	public SearchView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 909);
		contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 500, 870);
		contentPane.add(panel);
		panel.setBounds(0, 0, 500, 870);
		contentPane.add(panel);
		
		JLabel selectAllListLabel = new JLabel();
		selectAllListLabel.setBounds(new Rectangle(0, 0, 500, 870));
		selectAllListLabel.setIcon(new ImageIcon("C:\\Users\\FLEX2\\OneDrive\\바탕 화면\\미니이미지\\미니사진\\전체조회\\Group_1021.png"));
		panel.add(selectAllListLabel);
	}
	
	
}
