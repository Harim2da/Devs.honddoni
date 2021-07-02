package com.devs.honddoni.post.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PostActionCategory {
	
	private static JComboBox selectCategorycombo;
	
	public PostActionCategory() {
		
		String[] actioncategory = {" ","맛집탐방", "활동", "취미", "산책", "스터디", "게임"};
		selectCategorycombo = new JComboBox(actioncategory);

		selectCategorycombo.setBounds(139, 145, 306, 28);
		selectCategorycombo.setSelectedIndex(0);
		selectCategorycombo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("콤박 동작");

			}
		});
		
	}
	
	
	public static JComboBox getInstance() {
		new PostActionCategory();		
		
		return selectCategorycombo;
	}
	
	
	
		
	}
	
	
	
	
	
	
	
	

