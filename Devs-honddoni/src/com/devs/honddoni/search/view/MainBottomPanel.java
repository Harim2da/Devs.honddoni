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
		writeKeyword();
		clickLocalList1();
		clickLocalList2();
		clickLocalList3();
		clickCovid();
		clickGuide();
		clickLogout();
		
		
//		allBottomPanelComponent();
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
//	public void allBottomPanelComponent() {
//		
//		this.add(topPanel);
//		this.add(bottomPanel);
//		bottomPanel.add();
//		bottomPanel.add();
//		bottomPanel.add();
//		
//		bottomPanel.add(bottomLabel);
//		this.getIgnoreRepaint();
//		this.revalidate();
//	}
//	
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
	
	//전체조회버튼 클릭
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
	
	//혼또니게시판조회버튼 클릭
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
	
	//자유게시판조회 버튼 클릭
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
	
	//검색돋보기 클릭
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
	
	//키워드입력 텍스트필드
	private void writeKeyword() {
		search = new JTextField();
		search.setBorder(null);
		search.setDisabledTextColor(Color.white);
		search.setOpaque(false);
//		search.setBounds(?, ?, ?, ?);  <--아직 미지정
		search.setColumns(10);
	}
	
	//지역게시판 리스트1번으로 이동하는 버튼
	private void clickLocalList1() {
		bottomPanel();
		localList1 = new JButton();
//		localList1.setIcon(new ImageIcon("아직 안따옴"));
		localList1.setContentAreaFilled(false);
		localList1.setBorderPainted(false);
//		localList1.setBounds(?, ?, ?, ?);  <--아직 미지정
		
		localList1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 지역게시판 리스트1번
				System.out.println("지역게시판 리스트1번으로");
			}});
	}
	
	//지역게시판 리스트2번으로 이동하는 버튼
		private void clickLocalList2() {
			bottomPanel();
			localList2 = new JButton();
//			localList2.setIcon(new ImageIcon("아직 안따옴"));
			localList2.setContentAreaFilled(false);
			localList2.setBorderPainted(false);
//			localList2.setBounds(?, ?, ?, ?);  <--아직 미지정
			
			localList1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// 지역게시판 리스트2번
					System.out.println("지역게시판 리스트2번으로");
				}});
		}
		
		//지역게시판 리스트2번으로 이동하는 버튼
		private void clickLocalList3() {
			bottomPanel();
			localList3 = new JButton();
//			localList3.setIcon(new ImageIcon("아직 안따옴"));
			localList3.setContentAreaFilled(false);
			localList3.setBorderPainted(false);
//			localList3.setBounds(?, ?, ?, ?);  <--아직 미지정
			
			localList3.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// 지역게시판 리스트3번
					System.out.println("지역게시판 리스트3번으로");
				}});
		}
	
		//코로나 안전수칙 버튼
		private void clickCovid() {
			bottomPanel();
			covid = new JButton();
//			covid.setIcon(new ImageIcon("코로나 팝업"));
			covid.setContentAreaFilled(false);
			covid.setBorderPainted(false);
//			covid.setBounds(?, ?, ?, ?);  <--아직 미지정
			
			covid.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// 코로나 안전수칙
					System.out.println("코로나 안전수칙으로");
				}});
		}	
		
		//이용약관 버튼
		private void clickGuide() {
			bottomPanel();
			guide = new JButton();
		  //guide.setIcon(new ImageIcon("이용약관 팝업"));
			guide.setContentAreaFilled(false);
			guide.setBorderPainted(false);
		  //guide.setBounds(?, ?, ?, ?);  <--아직 미지정

			guide.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					//이용약관 버튼
					System.out.println("이용약관으로");
				}});
		}	

		//이용약관 버튼
		private void clickLogout() {
			bottomPanel();
			logout = new JButton();
		  //logout.setIcon(new ImageIcon("코로나 팝업"));
			logout.setContentAreaFilled(false);
			logout.setBorderPainted(false);
		  //logout.setBounds(?, ?, ?, ?);  <--아직 미지정

			logout.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					//이용약관 버튼
					System.out.println("이용약관으로");
				}});
		}
		
		
		
		
	
//	JPanel mainBottomPanel = new JPanel();
	
	
}









