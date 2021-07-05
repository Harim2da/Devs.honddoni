package com.devs.honddoni.common.font;


import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.File;

import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class FontManager {
	public Font customFont1;//
	public Font customFont2;
	public Font customFont3;
	public Font customFont12;

	private GraphicsEnvironment ge = // 폰트 가져오기
	GraphicsEnvironment.getLocalGraphicsEnvironment();
	// new가 메서드 안에 들어있음

	public FontManager() {
		
		try {
		this.customFont1 = 
			Font.createFont(
			Font.TRUETYPE_FONT, new File("font/BMDOHYEON.ttf")).deriveFont(15f);
	
		this.customFont2 = 
			Font.createFont(
			Font.TRUETYPE_FONT, new File("font/BMDOHYEON.ttf")).deriveFont(10f);
	
		this.customFont3 = 
			Font.createFont(
			Font.TRUETYPE_FONT, new File("font/BMDOHYEON.ttf")).deriveFont(5f);
		
		this.customFont12 = 
			Font.createFont(
			Font.TRUETYPE_FONT, new File("font/BMDOHYEON.ttf")).deriveFont(12f);
		
		} catch (Exception e) {
			System.out.println("폰트 로딩에 실패했습니다.");
			e.printStackTrace();
		  }
	}

	public static void setUIFont (Font font2){
	    java.util.Enumeration keys = UIManager.getDefaults().keys();
	    while (keys.hasMoreElements()) {
	      Object key = keys.nextElement();
	      Object value = UIManager.get (key);
	      if (value instanceof FontUIResource) {
	    	  FontUIResource orig = (FontUIResource) value;
	    	  Font font = new Font(font2.getFontName(), orig.getStyle(), font2.getSize());
	    	  UIManager.put (key, new FontUIResource(font));
	      	}
	      }
	    } 
}
