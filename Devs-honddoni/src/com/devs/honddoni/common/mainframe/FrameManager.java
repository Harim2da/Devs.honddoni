package com.devs.honddoni.common.mainframe;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream.GetField;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.devs.honddoni.member.view.MyPage;

public class FrameManager {

	static JPanel topPanel= new JPanel();					//상단 패널
	static JLabel backgroundImage = new JLabel();			//상단 패널 바탕이미지
	static JButton homeBtn = new JButton();				//홈버튼
	static JButton myHonddoniBtn = new JButton();			//MY혼또니 버튼
	static JButton searchHonddoniBtn = new JButton();		//혼또니 찾기 버튼
	static JButton interestingBtn;			//관심글 찾기 버튼
	static JButton noticeBtn;				//공지사항 조회 버튼
	

//	MyPage myPage;

	
	
	/* 패널 변경 메소드 */

	public static void changePanel(MainFrame frame, JPanel oldPanel, JPanel newPanel) {	
		frame.remove(oldPanel);
		frame.add(newPanel);
		frame.repaint();
		frame.revalidate();

	}
	
	

	public static void activeUpSidePanel(MainFrame frame, JPanel presentPage, MyPage myPage) {
		topPanel(frame, presentPage);
		myHonddoniBtnClick(frame, presentPage, myPage);
//		searchHonddoniBtnClick(frame, presentPage);
//		homeBtnClick(frame, presentPage);
//		interestingBtnClick(frame, presentPage);
//		noticeBtnClick(frame, presentPage);
		
	}
	public static void topPanel(MainFrame frame, JPanel presentPage) {

		/* 상단 패널 생성 */
		topPanel = new JPanel();
		topPanel.setBounds(0, 0, 500, 100);
		topPanel.setLayout(null);
		topPanel.setBackground(Color.WHITE);
		frame.add(topPanel);
		
		/* 상단 패널 뒷배경 생성 */
//		backgroundImage = new JLabel();
		backgroundImage.setBounds(0, 0, 500, 100);
		backgroundImage.setIcon(new ImageIcon("image/common/toppanel/backgroundImage.png"));
		backgroundImage.setVisible(true); 
		topPanel.add(backgroundImage);

	}
	
//	MyPage myPage;
	public static void myHonddoniBtnClick(MainFrame frame, JPanel presentPage, MyPage myPage) {
		
		/* My혼또니 버튼 생성 */
//		myHonddoniBtn = new JButton();
		myHonddoniBtn.setBounds(171,23,56,56);
		myHonddoniBtn.setIcon(new ImageIcon("image/common/toppanel/myHonddoniBtn.png"));
		myHonddoniBtn.setBorderPainted(false);
		myHonddoniBtn.setContentAreaFilled(false);
		myHonddoniBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("my혼또니 버튼 클릭");
				System.out.println("//frame// : " + frame + ", " + "//presentPage //: " + presentPage + ", " +"//myPage//" + myPage);
				FrameManager.changePanel(frame, presentPage, new MyPage(frame));
//				FrameManager.changePanel(frame, presentPage, myPage);
				presentPage.repaint();
				presentPage.revalidate();
			}
		});
		backgroundImage.add(myHonddoniBtn);
		
	}
	
	public static void searchHonddoniBtnClick(MainFrame frame, JPanel presentPage, 혼또니찾기) {
		/* 혼또니 찾기 버튼 생성*/
//		searchHonddoniBtn = new JButton();
		searchHonddoniBtn.setBounds(234,23,56,56);
		searchHonddoniBtn.setIcon(new ImageIcon("image/common/toppanel/SearchHonddoniBtn.png"));
		searchHonddoniBtn.setBorderPainted(false);
		searchHonddoniBtn.setContentAreaFilled(false);
		searchHonddoniBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("혼또니 찾기 버튼 클릭");
				FrameManager.changePanel(frame, presentPage, 혼또니찾기);
				presentPage.repaint();
				presentPage.revalidate();
			}
		});
		backgroundImage.add(searchHonddoniBtn);

	}
	public static void homeBtnClick(MainFrame frame, JPanel presentPage) {
		
		/* Home 버튼 생성 */
		homeBtn = new JButton();
		homeBtn.setBounds(298,23,56,56);
		homeBtn.setIcon(new ImageIcon("image/common/toppanel/HomeBtn.png"));
		homeBtn.setBorderPainted(false);
		homeBtn.setContentAreaFilled(false);
		homeBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("홈  버튼 클릭");
				FrameManager.changePanel(frame, presentPage, new MyPage(frame));
			}
		});
		backgroundImage.add(homeBtn);
		
	}
	public static void interestingBtnClick(MainFrame frame, JPanel presentPage) {
		
		/* 관심글 목록 버튼 생성 */
		interestingBtn = new JButton();
		interestingBtn.setBounds(362,23,56,56);
		interestingBtn.setIcon(new ImageIcon("image/common/toppanel/InterestingBtn.png"));
		interestingBtn.setBorderPainted(false);
		interestingBtn.setContentAreaFilled(false);
		interestingBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("관심글 목록 버튼 클릭");
				FrameManager.changePanel(frame, presentPage, new MyPage(frame));
			}
		});
		backgroundImage.add(interestingBtn);	
	}
	
	public static void noticeBtnClick(MainFrame frame, JPanel presentPage) {
		
		/* 공지사항 버튼 생성 */
		noticeBtn = new JButton();
		noticeBtn.setBounds(426,23,56,56);
		noticeBtn.setIcon(new ImageIcon("image/common/toppanel/NoticeBtn.png"));
		noticeBtn.setBorderPainted(false);
		noticeBtn.setContentAreaFilled(false);
		noticeBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("공지사항 버튼 클릭");
			}
		});
		backgroundImage.add(noticeBtn);
		
	}
	
}
