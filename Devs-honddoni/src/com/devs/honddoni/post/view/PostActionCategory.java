package com.devs.honddoni.post.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class PostActionCategory extends JPanel{

	
	public PostActionCategory() {
		selectCategoryCombo();
	}
	
	public void selectCategoryCombo() {
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
	
		selectCategorycombo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("카테고리선택");
				
			}
		});
	
	
	}
	
	
	
	
	
	
	
	
}
