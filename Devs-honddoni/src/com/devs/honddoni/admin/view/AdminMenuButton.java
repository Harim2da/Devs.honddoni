package com.devs.honddoni.admin.view;

import javax.swing.JButton;

public class AdminMenuButton extends JButton{

	@Override
	public void setBorderPainted(boolean b) {
		super.setBorderPainted(false);
	}
	
	@Override
	public void setContentAreaFilled(boolean b) {
		super.setContentAreaFilled(false);
	}
	
	@Override
	public void setDefaultCapable(boolean defaultCapable) {
		super.setDefaultCapable(false);
	}
	
}
