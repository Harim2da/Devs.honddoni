package com.devs.honddoni.search.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.devs.honddoni.post.view.PostView;

public class SearchMainPanel extends JPanel {

	private JLabel bottomLabel;
	
	public SearchMainPanel() {
		
		basicBottom();
		
	}

	private void basicBottom() {

		this.setBounds(0, 100, 500, 770);
		this.setLayout(null);
		this.setBackground(Color.white);
		
		bottomLabel = new JLabel("");
		bottomLabel.setBackground(Color.white);
		bottomLabel.setLayout(null);
		bottomLabel.setBounds(35, 14, 431, 648);
		bottomLabel.setIcon(new ImageIcon(PostView.class.getResource("/post/postbtmpanel.png")));
		
	}

	
		
	
	
	
	
}
