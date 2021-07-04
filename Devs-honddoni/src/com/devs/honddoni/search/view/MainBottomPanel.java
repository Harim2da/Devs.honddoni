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

import com.devs.honddoni.search.controller.SearchController;

//메인프레임의 하단 프레임
public class MainBottomPanel /*extends JFrame*/{

	JFrame frame  = new JFrame();
//MainFrame frame; //메인프레임
	//private JFrame frame;
	
	private JPanel topPanel; // 상단패널
	private JPanel bottomPanel; //하단패널
	private JButton allListBoardBtn; //전체조회버튼
	private JButton honddoniBoardBtn; //혼또니게시판버튼
	private JButton freeBoardBtn; //자유게시판버튼
	private JLabel searchBar; //검색바 라벨-----------------------
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
	private SearchController searchController;
	public MainBottomPanel() {
		//this.setBounds(100, 100, 516, 909);
	//	this.setLayout(null);
		
		/*수정한부분*/
		frame.setBounds(100, 100, 516, 909);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		searchController.selectSearch();
//		topPanel();
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
		
		
		allBottomPanelComponent();
		
		frame.getContentPane().add(bottomPanel);
		frame.add(bottomPanel); // <--프레임에 하단 패널...???
//		this.repaint();
//		this.revalidate();
//		this.setVisible(true);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void allBottomPanelComponent() {
		
//		this.add(topPanel);
//		this.add(bottomPanel);
		bottomPanel.add(allListBoardBtn);
		bottomPanel.add(honddoniBoardBtn);
		bottomPanel.add(freeBoardBtn);
		bottomPanel.add(aim);
		bottomPanel.add(search);
		bottomPanel.add(localList1);
		bottomPanel.add(localList2);
		bottomPanel.add(localList3);
		bottomPanel.add(covid);
		bottomPanel.add(guide);
		bottomPanel.add(logout);
		
		bottomPanel.add(searchBar);
		bottomPanel.add(recommendTour);
		bottomPanel.add(adminEmail);
		
//		this.repaint();
//		this.revalidate();
		
		frame.repaint();
//		frame.revalidate();
	}
	
//	//상단패널
//	private void topPanel() {
//		topPanel = new JPanel();
//		topPanel.setBounds(0, 0, 500, 100);
//		topPanel.setLayout(null);
//		topPanel.setBackground(Color.white);
//		}
	
	//하단패널
	public void bottomPanel() {
		bottomPanel = new JPanel();
		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.white);	
		
//		frame.add(bottomPanel); // <--프레임에 하단 패널...???
		
		//검색바 라벨
		searchBar = new JLabel();
		searchBar.setBackground(Color.white);
		searchBar.setLayout(null);
		searchBar.setBounds(35, 152, 431, 63);  
		searchBar.setIcon(new ImageIcon("image/search/searchBar.png"));
		
		//추천여행지 라벨
		recommendTour = new JLabel();
		recommendTour.setBackground(Color.white);
		recommendTour.setLayout(null);
		recommendTour.setBounds(35, 227, 154, 25);  
		recommendTour.setIcon(new ImageIcon("image/search/bottompanel/recommendLabelLogo.png"));
		
		//문의메일 라벨
		adminEmail = new JLabel();
		adminEmail.setBackground(Color.white);
		adminEmail.setLayout(null);
		adminEmail.setBounds(123, 733, 244, 20);  
		adminEmail.setIcon(new ImageIcon("image/search/bottompanel/adminEmailLogo.png"));
	}
	
	//전체조회버튼 클릭
	public void clickAllListBoard() {
		//bottomPanel();
		allListBoardBtn = new JButton();
		allListBoardBtn.setIcon(new ImageIcon("image/search/bottompanel/alllistboardLogo.png"));
		allListBoardBtn.setContentAreaFilled(false);
		allListBoardBtn.setBorderPainted(false);
		allListBoardBtn.setBounds(62, 23, 90, 110);  
		
		
		
		
		allListBoardBtn.addActionListener(new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {
//				allBoardList.bottomPanel();
			
				JPanel changeBoardList = new JPanel();
				changeBoardList.setLayout(null);
				changeBoardList.setBounds(0,100,500,770);
				changeBoardList.setVisible(true);
				changeBoardList.setBackground(Color.white);
				frame.add(changeBoardList);
				
//				searchController = new SearchController();
//				searchController.selectSearch();
				
				AllBoardList allBoardList = new AllBoardList();
				allBoardList.bottomPanel();
//				0987ㅛㅅ654
				
				
				// 패널이 넘어가서 그 전체조회 해당하는 이미지
				changeBoardList.repaint();
				changeBoardList.revalidate();
				// 전체조회 게시판으로
				// DB연결 (MVC)
				
				// 패널이 넘어가서 그 전체조회 해당하는 이미지
				
				System.out.println("전체조회 게시판으로");
			}});
	}
	
	//혼또니게시판조회버튼 클릭
	public void clickHonddoniBoard() {
//		bottomPanel();
		honddoniBoardBtn = new JButton();
		honddoniBoardBtn.setIcon(new ImageIcon("image/search/bottompanel/honddoniboardLogo.png"));
		honddoniBoardBtn.setContentAreaFilled(false);
		honddoniBoardBtn.setBorderPainted(false);
		honddoniBoardBtn.setBounds(205, 23, 90, 110);  
		
		honddoniBoardBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 혼또니 게시판으로
				System.out.println("혼또니 게시판으로");
			}});
	}
	
	//자유게시판조회 버튼 클릭
	public void clickFreeBoard() {
//		bottomPanel();
		freeBoardBtn = new JButton();
		freeBoardBtn.setIcon(new ImageIcon("image/search/bottompanel/freeboardLogo.png"));
		freeBoardBtn.setContentAreaFilled(false);
		freeBoardBtn.setBorderPainted(false);
		freeBoardBtn.setBounds(347, 23, 90, 110);  
		
		freeBoardBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 자유 게시판으로
				System.out.println("자유 게시판으로");
			}});
	}
	
	//검색돋보기 클릭
	public void clickAim() {
//		bottomPanel();
		aim = new JButton();
		aim.setIcon(new ImageIcon("image/search/aim.png"));
		aim.setContentAreaFilled(false);
		aim.setBorderPainted(false);
		aim.setBounds(59, 168, 29, 29);  
		
		aim.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 키워드검색 후 조회화면
				System.out.println("키워드 검색 후 조회화면으로");
			}});
	}
	
	//키워드입력 텍스트필드
	public void writeKeyword() {
		search = new JTextField();
		search.setBorder(null);
		search.setDisabledTextColor(Color.white);
		search.setOpaque(false);
		search.setBounds(106, 168, 326, 29);  
		search.setColumns(10);
	}
	
	//지역게시판 리스트1번으로 이동하는 버튼
	public void clickLocalList1() {
//		bottomPanel();
		localList1 = new JButton();
		localList1.setIcon(new ImageIcon("image/search/bottompanel/locallist1Logo.png"));
		localList1.setContentAreaFilled(false);
		localList1.setBorderPainted(false);
		localList1.setBounds(35, 263, 430, 100);  
		
		localList1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 지역게시판 리스트1번
				System.out.println("지역게시판 리스트1번으로");
			}});
	}
	
	//지역게시판 리스트2번으로 이동하는 버튼
	public void clickLocalList2() {
//			bottomPanel();
			localList2 = new JButton();
			localList2.setIcon(new ImageIcon("image/search/bottompanel/locallist2Logo.png"));
			localList2.setContentAreaFilled(false);
			localList2.setBorderPainted(false);
			localList2.setBounds(35, 401, 430, 110);  
			
			localList1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// 지역게시판 리스트2번
					System.out.println("지역게시판 리스트2번으로");
				}});
		}
		
		//지역게시판 리스트3번으로 이동하는 버튼
	public void clickLocalList3() {
//			bottomPanel();
			localList3 = new JButton();
			localList3.setIcon(new ImageIcon("image/search/bottompanel/locallist3Logo.png"));
			localList3.setContentAreaFilled(false);
			localList3.setBorderPainted(false);
			localList3.setBounds(35, 539, 430, 110);  
			
			localList3.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// 지역게시판 리스트3번
					System.out.println("지역게시판 리스트3번으로");
				}});
		}
	
		//코로나 안전수칙 버튼
	public void clickCovid() {
//			bottomPanel();
			covid = new JButton();
			covid.setIcon(new ImageIcon("image/search/bottompanel/covidLogo.png"));
			covid.setContentAreaFilled(false);
			covid.setBorderPainted(false);
			covid.setBounds(90, 697, 125, 26);  
			
			covid.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// 코로나 안전수칙
					System.out.println("코로나 안전수칙으로");
				}});
		}	
		
		//이용약관 버튼
	public void clickGuide() {
//			bottomPanel();
			guide = new JButton();
		    guide.setIcon(new ImageIcon("image/search/bottompanel/guideLogo.png"));
			guide.setContentAreaFilled(false);
			guide.setBorderPainted(false);
		    guide.setBounds(238, 697, 73, 26);  

			guide.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					//이용약관 버튼
					System.out.println("이용약관으로");
				}});
		}	

		//로그아웃 버튼
	public void clickLogout() {
//			bottomPanel();
			logout = new JButton();
		    logout.setIcon(new ImageIcon("image/search/bottompanel/logoutLogo.png"));
			logout.setContentAreaFilled(false);
			logout.setBorderPainted(false);
		    logout.setBounds(337, 697, 73, 26);  

			logout.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					//로그아웃 버튼
					System.out.println("로그아웃으로");
				}});
		}
		
		
//		frame.repaint();
//		fram.revalidate();
//		
	
//	JPanel mainBottomPanel = new JPanel();
//	JPanel mainBottomPanel = new JPanel();
	
	
}









