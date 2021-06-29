package com.devs.honddoni.post.view;

import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.UIManager;

public class PostHonddoni2 {

	public PostHonddoni2( ) {
		
	}
	
	public void selectActionCategory() {
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
		
	}
	
	
}
