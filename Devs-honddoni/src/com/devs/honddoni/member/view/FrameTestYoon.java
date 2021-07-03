package com.devs.honddoni.member.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.devs.honddoni.common.mainframe.FrameManager;

public class FrameTestYoon extends JFrame{

	MyPage MyPage;
	FrameTestYoon frame;
	
	private JPanel topPanel;
	private JLabel backgroundImage = new JLabel();
	private JButton myHonddoniBtn = new JButton();
	private JButton searchHonddoniBtn = new JButton();
	private JButton homeBtn = new JButton();
	private JButton interestingBtn = new JButton();
	private JButton noticeBtn = new JButton();
	
	public FrameTestYoon() {
		
		this.setBounds(100, 100, 516, 909);
		this.setLayout(null);
		this.setTitle("혼또니(혼자 또 여행왔니?)");
		
		topPanel();
		myHonddoniBtnClick();
		searchHonddoniBtnClick();
		homeBtnClick();
		interestingBtnClick();
		noticeBtnClick();
		
		
//		//시작화면으로 가기 전에 상단패널을 멈춰준다.
//		topPannelBtnStop();		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//프레임이 자꾸 두개가 생겨서 이닛패널로 함 써보자
		
		new MyPage(this);
	}
	
	
	public void topPanel() {

		/* 상단 패널 생성 */
		topPanel = new JPanel();
		topPanel.setBounds(0, 0, 500, 100);
		topPanel.setLayout(null);
		topPanel.setBackground(Color.WHITE);
		this.add(topPanel);
		
		/* 상단 패널 뒷배경 생성 */
		backgroundImage.setBounds(0, 0, 500, 100);
		backgroundImage.setIcon(new ImageIcon("image/common/toppanel/backgroundImage.png"));
		backgroundImage.setVisible(true); 
		topPanel.add(backgroundImage);

	}
	
	public void myHonddoniBtnClick() {
		/* My혼또니 버튼 생성 */
		myHonddoniBtn.setBounds(171,23,56,56);
		myHonddoniBtn.setIcon(new ImageIcon("image/common/toppanel/myHonddoniBtn.png"));
		myHonddoniBtn.setBorderPainted(false);
		myHonddoniBtn.setContentAreaFilled(false);
		myHonddoniBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("my혼또니 버튼 클릭");
//				FrameManager.changePanel(, new MyPage());
			}
		});
		backgroundImage.add(myHonddoniBtn);
		
	}
	
	public void searchHonddoniBtnClick() {
		/* 혼또니 찾기 버튼 생성*/
		searchHonddoniBtn.setBounds(234,23,56,56);
		searchHonddoniBtn.setIcon(new ImageIcon("image/common/toppanel/SearchHonddoniBtn.png"));
		searchHonddoniBtn.setBorderPainted(false);
		searchHonddoniBtn.setContentAreaFilled(false);
		searchHonddoniBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("혼또니 찾기 버튼 클릭");
			}
		});
		backgroundImage.add(searchHonddoniBtn);

	}
	public void homeBtnClick() {
		/* Home 버튼 생성 */
		homeBtn.setBounds(298,23,56,56);
		homeBtn.setIcon(new ImageIcon("image/common/toppanel/HomeBtn.png"));
		homeBtn.setBorderPainted(false);
		homeBtn.setContentAreaFilled(false);
		homeBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("홈  버튼 클릭");
				frame.remove();
				frame.add(new Main(frame));
				frame.repaint();
				frame.revalidate();
			}
		});
		backgroundImage.add(homeBtn);
		
	}
	public void interestingBtnClick() {
		/* 관심금 목록 버튼 생성 */
		interestingBtn.setBounds(362,23,56,56);
		interestingBtn.setIcon(new ImageIcon("image/common/toppanel/InterestingBtn.png"));
		interestingBtn.setBorderPainted(false);
		interestingBtn.setContentAreaFilled(false);
		interestingBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("관심글 목록 버튼 클릭");
			}
		});
		backgroundImage.add(interestingBtn);	
	}
	
	public void noticeBtnClick() {
		/* 공지사항 버튼 생성 */
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
	
	//로그인 이전까지는 상단패널 및 버튼들을 멈춰야 함
	public void topPannelBtnStop() {
		myHonddoniBtn.setVisible(false);
		searchHonddoniBtn.setVisible(false);
		homeBtn.setVisible(false);
		interestingBtn.setVisible(false);
		noticeBtn.setVisible(false);
		backgroundImage.setVisible(false);
		topPanel.setVisible(false);
	}
	
	//로그인 이후, 상단패널 및 버튼들을 활성화 해야 함
	public void topPannelBtnStart() {
		myHonddoniBtn.setVisible(true);
		searchHonddoniBtn.setVisible(true);
		homeBtn.setVisible(true);
		interestingBtn.setVisible(true);
		noticeBtn.setVisible(true);
		backgroundImage.setVisible(true);
		topPanel.setVisible(true);
	}
	
	
}
