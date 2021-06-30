package com.devs.honddoni.member.view;

import java.awt.Color;

import javax.swing.JPanel;

public class MemberView extends JPanel {
	
	private UpsidePanel upsidePanel;
	
	public MemberView() {
		addUpsidePanel();
		init();
		createButton();
		addListener();
	}
	
	private void addUpsidePanel() {
		upsidePanel = new UpsidePanel();
		this.add(upsidePanel);
	}

	private void init() {
		this.setBounds(0, 100, 500, 770);
		this.setLayout(null);
		this.setVisible(true);
		this.setBackground(Color.black);
	}

	private void createButton() {
		
	}

	private void addListener() {
		
	}
	
}
