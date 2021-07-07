package com.devs.honddoni.search.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.devs.honddoni.common.mainframe.MainFrame;
import com.devs.honddoni.common.mainframe.PopupFrame;
import com.devs.honddoni.member.view.MyPage;
import com.devs.honddoni.memberLog.view.MemberLogView;
import com.devs.honddoni.post.view.PostHonddoni;
import com.devs.honddoni.post.view.SelectAllHonPost;
import com.devs.honddoni.search.controller.SearchController;


//메인프레임 일단 run에서 Application에 붙임


//메인프레임의 하단 프레임
public class MainBottomPanel extends JPanel{

	private MainBottomPanel mainBottomPanel;
	private MainFrame frame;
	
	private JPanel upPanel; 	
	private JPanel bottomPanel;
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
	
	private JButton myHonddoniBtn;								//마이페이지 이동 버튼
	private JButton searchHonddoniBtn;							//게시글 작성페이지 이동 버튼
	private JButton homeBtn;									//메인화면이동 버튼
	private JButton interestingBtn;								//관심글 목록 이동 버튼
	private JButton noticeBtn;									//공지사항 목록 이동 버튼
	private JLabel backgroundImage;								//로고 포함 테두리 배경 (디자인용)
	
	
	public MainBottomPanel(MainFrame frame) {
		
		this.frame = frame;
		this.mainBottomPanel = this;
		
		
//		this.setBounds(0, 0, 500, 870); //<-크기조절
//		this.setBackground(Color.white);
//		this.setLayout(null);
		
//		frame.add(this);
		
		
//		/*수정한부분*/
//		frame.setBounds(100, 100, 516, 909);
//		frame.setLayout(null);
//		frame.setVisible(true);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		searchController.selectSearch();
//		topPanel();
//		bottomPanel();
		
		/* 패널 */
		upPanel();
		bottomPanel();

		/* 상단패널에 포함될 버튼 */
		myHonddoniBtn();
		searchHonddoniBtn();
		homeBtn();
		interestingBtn();
		noticeBtn();
		
		/* 버튼들을 상단패널에 더해줌 */
		upPanel.add(myHonddoniBtn);
		upPanel.add(searchHonddoniBtn);
		upPanel.add(homeBtn);
		upPanel.add(interestingBtn);
		upPanel.add(noticeBtn);
		upPanel.add(backgroundImage);
		
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
		
		frame.add(upPanel);  //<-- 메인프레임에 내 클래스의 업패널, 바텀패널 붙임
		frame.add(bottomPanel);
		
		
//		frame.add(bottomPanel); // <--프레임에 하단 패널...???
		
//		frame.getContentPane().add(bottomPanel);
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
		frame.revalidate();
	}
	
//	//상단패널
//	private void topPanel() {
//		topPanel = new JPanel();
//		topPanel.setBounds(0, 0, 500, 100);
//		topPanel.setLayout(null);
//		topPanel.setBackground(Color.white);
//		}
	
	/* 상단 패널 */
	public void upPanel() {

		upPanel = new JPanel();
		upPanel.setBounds(0, 0, 500, 100);
		upPanel.setLayout(null);
		upPanel.setBackground(Color.WHITE);

		/* 상단 패널 뒷배경 생성 */
		backgroundImage = new JLabel("");
		backgroundImage.setBounds(0, 0, 500, 100);
		backgroundImage.setIcon(new ImageIcon("image/common/toppanel/backgroundImage.png"));
		backgroundImage.setVisible(true); 

	}
	
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
	
	/* My혼또니(마이페이지 화면으로 이동) 버튼 */
	public void myHonddoniBtn() {

		myHonddoniBtn = new JButton("");
		myHonddoniBtn.setBounds(171,23,56,56);
		myHonddoniBtn.setIcon(new ImageIcon("image/common/toppanel/myHonddoniBtn.png"));
		myHonddoniBtn.setBorderPainted(false);
		myHonddoniBtn.setContentAreaFilled(false);
		myHonddoniBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.remove(bottomPanel);
				frame.remove(upPanel);
				bottomPanel.setVisible(false);
				upPanel.setVisible(false);
				MyPage mp = new MyPage(frame);
				frame.repaint();
				frame.revalidate();
			}
		});

	}

	/* 혼또니 찾기(게시글 작성) 버튼 */
	public void searchHonddoniBtn() {

		searchHonddoniBtn = new JButton("");
		searchHonddoniBtn.setBounds(234,23,56,56);
		searchHonddoniBtn.setIcon(new ImageIcon("image/common/toppanel/SearchHonddoniBtn.png"));
		searchHonddoniBtn.setBorderPainted(false);
		searchHonddoniBtn.setContentAreaFilled(false);
		searchHonddoniBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.remove(bottomPanel);
				frame.remove(upPanel);
				bottomPanel.setVisible(false);
				upPanel.setVisible(false);
				new PostHonddoni(frame);
				frame.repaint();
				frame.revalidate();
			}
		});

	}
	
	/* Home(메인화면으로 이동) 버튼 생성 */
	public void homeBtn() {

		homeBtn = new JButton("");
		homeBtn.setBounds(298,23,56,56);
		homeBtn.setIcon(new ImageIcon("image/common/toppanel/HomeBtn.png"));
		homeBtn.setBorderPainted(false);
		homeBtn.setContentAreaFilled(false);
		homeBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.remove(bottomPanel);
				frame.remove(upPanel);
				bottomPanel.setVisible(false);
				upPanel.setVisible(false);
				new MainBottomPanel(frame);
				frame.repaint();
				frame.revalidate();
			
			}
		});

	}

	/* 관심금 목록페이지로 이동하는 버튼 생성 */
	public void interestingBtn() {

		interestingBtn = new JButton("");
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

	}

	/* 공지사항목록을 조회할 수 있는 버튼 생성 */
	public void noticeBtn() {

		noticeBtn = new JButton("");
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

	}
	
	//전체조회버튼 클릭
	public void clickAllListBoard() {
		//downPanel();
		allListBoardBtn = new JButton();
		allListBoardBtn.setIcon(new ImageIcon("image/search/bottompanel/alllistboardLogo.png"));
		allListBoardBtn.setContentAreaFilled(false);
		allListBoardBtn.setBorderPainted(false);
		allListBoardBtn.setBounds(62, 23, 90, 110);  
		
		allListBoardBtn.addActionListener(new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {
			 
				frame.remove(bottomPanel);
				frame.remove(upPanel);
				bottomPanel.setVisible(false);
				upPanel.setVisible(false);
				new AllBoardList(frame);
				frame.getIgnoreRepaint();
				frame.revalidate();
				
//				JPanel changeBoardList = new JPanel();
//				changeBoardList.setLayout(null);
//				changeBoardList.setBounds(0,100,500,770);
//				changeBoardList.setVisible(true);
//				changeBoardList.setBackground(Color.white);
//				frame.add(changeBoardList);
//				
//				AllBoardList allBoardList = new AllBoardList(frame);
//				allBoardList.bottomPanel();
//				
//				
//				// 패널이 넘어가서 그 전체조회 해당하는 이미지
//				changeBoardList.repaint();
//				changeBoardList.revalidate();
//				// 전체조회 게시판으로
//				// DB연결 (MVC)
//				
//				// 패널이 넘어가서 그 전체조회 해당하는 이미지
//				
//				System.out.println("전체조회 게시판으로");
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
				frame.remove(bottomPanel);
				frame.remove(upPanel);
				bottomPanel.setVisible(false);
				upPanel.setVisible(false);
				new SelectAllHonPost(frame);
				frame.repaint();
				frame.revalidate();
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
				
				frame.remove(bottomPanel);
				frame.remove(upPanel);
				bottomPanel.setVisible(false);
				upPanel.setVisible(false);
				new FreeBoardList(frame);
				frame.getIgnoreRepaint();
				frame.revalidate();
				
//				JPanel changeFreeList = new JPanel();
//				changeFreeList.setLayout(null);
//				changeFreeList.setBounds(0,100,500,770);
//				changeFreeList.setVisible(true);
//				changeFreeList.setBackground(Color.white);
//				frame.add(changeFreeList);
//				
//				AllBoardList allBoardList = new AllBoardList(frame);
//				allBoardList.bottomPanel();
//
//				// 패널이 넘어가서  자유 게시판에 해당하는 이미지
//				changeFreeList.repaint();
//				changeFreeList.revalidate();
//				// 전체조회 게시판으로
//				// DB연결 (MVC)
//				
//				// 패널이 넘어가서 그 자유 게시판에 해당하는 이미지
//				System.out.println("자유 게시판으로");
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
					PopupFrame.popup2("image/search/guideLine.png");
					frame.remove(bottomPanel);
					frame.remove(upPanel);
					bottomPanel.setVisible(false);
					upPanel.setVisible(false);
					new MainBottomPanel(frame);
					frame.getIgnoreRepaint();
					frame.revalidate();
					
					//System.out.println("코로나 안전수칙으로");
					//(23, 99, 455, 587);
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
					PopupFrame.popup2("image/search/userguide.png");
					frame.remove(bottomPanel);
					frame.remove(upPanel);
					bottomPanel.setVisible(false);
					upPanel.setVisible(false);
					new MainBottomPanel(frame);
					frame.getIgnoreRepaint();
					frame.revalidate();
					
					//System.out.println("이용약관으로");
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
					
					PopupFrame.popup("image/popup/logoutSuccess.png");
					frame.remove(bottomPanel);
					frame.remove(upPanel);
					bottomPanel.setVisible(false);
					upPanel.setVisible(false);
					new MemberLogView(frame);
					frame.getIgnoreRepaint();
					frame.revalidate();
					
				}});
		}
		
		
//		frame.repaint();
//		fram.revalidate();
//		
	
//	JPanel mainBottomPanel = new JPanel();
//	JPanel mainBottomPanel = new JPanel();
	
	
}









