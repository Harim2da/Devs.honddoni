package com.devs.honddoni.member.view;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class CharacterSelect extends JPanel{
	
	public CharacterSelect() {
		//패널 생성
		
		//팝업창 올리기
		
		//콤보박스
		String[] characterCategory = {"외향", "내향"};
		JComboBox CharacterSelectCombo = new JComboBox(characterCategory);
		
		CharacterSelectCb.setBounds(1, 1, 50, 50);
		CharacterSelectCb.setSelectedIndex(0);
		
		//확인버튼
		
		//취소버튼
		
		//버튼누르면 패널이 꺼지게
	}

}
