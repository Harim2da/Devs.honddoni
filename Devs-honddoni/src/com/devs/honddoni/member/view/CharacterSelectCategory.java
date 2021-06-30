package com.devs.honddoni.member.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class CharacterSelectCategory {
	
	private static JComboBox characterSelectCombo;
	
	public CharacterSelectCategory() {
		//패널 생성
		
		//팝업창 올리기
		
		//콤보박스
		String[] characterCategory = {"", "리더형", "팔로워형", "계획적", "즉흥적", "외향적", "내향적", "감성적", "이성적"};
		characterSelectCombo = new JComboBox(characterCategory);
		
		characterSelectCombo.setBounds(1, 1, 50, 50);
		characterSelectCombo.setSelectedIndex(0);
		characterSelectCombo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("콤보박스 동작");				
			}
		});
		
	}
	
	public static JComboBox getInstance() {
		
		new CharacterSelectCategory();
		
		return characterSelectCombo;
	}
	

}
