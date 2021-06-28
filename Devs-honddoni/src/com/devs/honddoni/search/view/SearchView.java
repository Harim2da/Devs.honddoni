package com.devs.honddoni.search.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.devs.honddoni.view.viewframe;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Rectangle;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextField;

public class SearchView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnNewButton;

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
		
		/*전체조회 프레임*/
		JPanel panel = new JPanel();
		panel.setBounds(104, 54, 500, 870);
		contentPane.add(panel);
		panel.setBounds(0, 0, 500, 870);
		contentPane.add(panel);
		panel.setLayout(null);
		
		/*검색버튼*/
		JButton aim = new JButton();
		aim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		/*마이페이지 버튼*/
		JButton honddoniButton = new JButton();
		honddoniButton.setIcon(new ImageIcon(SearchView.class.getResource("/post/sidebarButton.png")));
		honddoniButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(375, 23, 97, 23);
		panel.add(btnNewButton);
		honddoniButton.setBounds(12, 10, 41, 36);
		panel.add(honddoniButton);
		
		textField_4 = new JTextField();
		textField_4.setBounds(59, 743, 391, 29);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(59, 625, 391, 29);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(59, 506, 391, 29);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(59, 388, 391, 29);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(59, 270, 391, 29);
		panel.add(textField);
		textField.setColumns(10);
		aim.setIcon(new ImageIcon(SearchView.class.getResource("/search/aim.png")));
		aim.setBounds(59, 101, 29, 29);
		panel.add(aim);
		
		JLabel selectAllListLabel = new JLabel();
		selectAllListLabel.setBounds(0, 0, 500, 870);
		selectAllListLabel.setIcon(new ImageIcon(SearchView.class.getResource("/search/selectAllListLabel.png")));
		panel.add(selectAllListLabel);
		
	
	}
}
