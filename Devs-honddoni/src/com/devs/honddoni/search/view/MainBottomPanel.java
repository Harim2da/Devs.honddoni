package com.devs.honddoni.search.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//메인프레임의 하단 프레임
public class MainBottomPanel extends JFrame {

	private JFrame mainFrame; //메인프레임
	private JPanel topPanel; // 상단패널
	private JPanel bottomPanel; //하단패널
	private JButton allListBoardBtn; //전체조회버튼
	private JButton honddoniBoardBtn; //혼또니게시판버튼
	private JButton freeBoardBtn; //자유게시판버튼
	private JLabel searchBar; //검색바 라벨----------------------
	private JButton aim; //검색버튼
	private JTextField search; //키워드 입력
	private JLabel recommendTour; //추천여행지라벨----------------
	private JButton localList1; //추천여행지1 버튼
	private JButton localList2; //추천여행지2 버튼
	private JButton localList3; // 추천여행지3 버튼
	private JButton covid; //코로나 안전수칙버튼
	private JButton guide; // 이용약관버튼
	private JButton logout; // 로그아웃버튼
	private JLabel adminEmail; // 문의메일-----------------------
	
	public MainBottomPanel() {
		this.setBounds(100, 100, 516, 909);
		this.setLayout(null);
		
		topPanel();
		bottomPanel();
		clickAllListBoard();
		clickHonddoniBoard();
		clickFreeBoard();
		
		clickAim();
		
//		allBottomPanelComponent();
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//상단패널
	private void topPanel() {
		topPanel = new JPanel();
		topPanel.setBounds(0, 0, 500, 100);
		topPanel.setLayout(null);
		topPanel.setBackground(Color.white);
	}
	
	//하단패널
	private void bottomPanel() {
		bottomPanel = new JPanel();
		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.WHITE);	
		
		//검색바 라벨
		searchBar = new JLabel();
		searchBar.setBackground(Color.white);
		searchBar.setLayout(null);
//		searchBar.setBounds(?, ?, ?, ?);  <--아직 미지정
		searchBar.setIcon(new ImageIcon("image/seach/searchBar.png"));
		
		//추천여행지 라벨
		recommendTour = new JLabel();
		recommendTour.setBackground(Color.white);
		recommendTour.setLayout(null);
//		recommendTour.setBounds(?, ?, ?, ?);  <--아직 미지정
//		recommendTour.setIcon(new ImageIcon("아직 안따옴"));
		
		//문의메일 라벨
		adminEmail = new JLabel();
		adminEmail.setBackground(Color.white);
		adminEmail.setLayout(null);
//		adminEmail.setBounds(?, ?, ?, ?);  <--아직 미지정
//		adminEmail.setIcon(new ImageIcon("아직 안따옴"));
	}
	
	private void clickAllListBoard() {
		bottomPanel();
		allListBoardBtn = new JButton();
//		allListBoardBtn.setIcon(new ImageIcon("아직 안따옴"));
		allListBoardBtn.setContentAreaFilled(false);
		allListBoardBtn.setBorderPainted(false);
//		allListBoardBtn.setBounds(?, ?, ?, ?);  <--아직 미지정
		
		allListBoardBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 전체조회 게시판으로
				System.out.println("전체조회 게시판으로");
			}});
	}
	
	private void clickHonddoniBoard() {
		bottomPanel();
		honddoniBoardBtn = new JButton();
//		honddoniBoardBtn.setIcon(new ImageIcon("아직 안따옴"));
		honddoniBoardBtn.setContentAreaFilled(false);
		honddoniBoardBtn.setBorderPainted(false);
//		honddoniBoardBtn.setBounds(?, ?, ?, ?);  <--아직 미지정
		
		honddoniBoardBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 혼또니 게시판으로
				System.out.println("혼또니 게시판으로");
			}});
	}
	
	private void clickFreeBoard() {
		bottomPanel();
		freeBoardBtn = new JButton();
//		freeBoardBtn.setIcon(new ImageIcon("아직 안따옴"));
		freeBoardBtn.setContentAreaFilled(false);
		freeBoardBtn.setBorderPainted(false);
//		freeBoardBtn.setBounds(?, ?, ?, ?);  <--아직 미지정
		
		freeBoardBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 자유 게시판으로
				System.out.println("자유 게시판으로");
			}});
	}
	
	
	
	
	
	
	private void clickAim() {
		bottomPanel();
		aim = new JButton();
		aim.setIcon(new ImageIcon("image/search/aim.png"));
		aim.setContentAreaFilled(false);
		aim.setBorderPainted(false);
//		aim.setBounds(?, ?, ?, ?);  <--아직 미지정
		
		aim.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 키워드검색 후 조회화면
				System.out.println("키워드 검색 후 조회화면으로");
			}});
	}
	
	
	
	
	
	
	
	
//	JPanel mainBottomPanel = new JPanel();
	
	
}









