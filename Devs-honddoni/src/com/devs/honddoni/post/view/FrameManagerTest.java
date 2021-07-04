package com.devs.honddoni.post.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.devs.honddoni.common.mainframe.FrameManager;
import com.devs.honddoni.common.mainframe.MainFrame;
import com.devs.honddoni.member.view.MyPage;

public class FrameManagerTest {

	static JPanel topPanel= new JPanel();					//상단 패널
	static JLabel backgroundImage = new JLabel();			//상단 패널 바탕이미지
	static JButton homeBtn = new JButton();				//홈버튼
	static JButton myHonddoniBtn = new JButton();			//MY혼또니 버튼
	static JButton searchHonddoniBtn = new JButton();		//혼또니 찾기 버튼
	static JButton interestingBtn;			//관심글 찾기 버튼
	static JButton noticeBtn;				//공지사항 조회 버튼
	

	MyPage myPage;
	
	/* 패널 변경 메소드 */

	public static void changePanel(MainFrame frame, JPanel oldPanel, JPanel newPanel) {	
		frame.remove(oldPanel);
		frame.add(newPanel);
		frame.repaint();
		frame.revalidate();

	}
	
	



	
}
