package com.devs.honddoni.admin.vew1;

import java.awt.Button;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.devs.honddoni.admin.view.viewframe;

public class AdminList extends JFrame {
	
//	private Image screenImage;
//	private Graphics screenGraphic;
//	
//	private Image introBackground = new ImageIcon(Main.class.getResource("../images/코린이.png")).getImage();
//	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/코린이.png")));
//	private JButton exitButton = new JButton(new ImageIcon(Main.class.getResource("../images/Check withdrawal request member data.png")));
//	
	public AdminList () {
		
		setTitle("혼또니");
		setBounds(100, 100, 516, 909);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		
//		menuBar.setBounds(0, 0, 498, 862);
//		add(menuBar);
		
	    Button exitButton = new Button("");
		exitButton.setBounds(35, 129, 430, 121);
		add(exitButton);
		exitButton.setIcon(new ImageIcon(viewframe.class.getResource("/admin/admin123/Check withdrawal request member data.png")));
		
		Button exitButton1 = new Button("");
		exitButton.setBounds(34, 293, 430, 121);
		add(exitButton1);
		
		Button exitButton3 = new Button("");
		exitButton.setBounds(34, 456, 430, 121);
		add(exitButton3);
		
		Button exitButton4 = new Button("");
		exitButton.setBounds(33, 620, 430, 121);
		add(exitButton4);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 500, 870);
		add(panel);
		
		
		
	}

}
