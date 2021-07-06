package com.devs.honddoni.search.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.devs.honddoni.common.PagenationPost;
import com.devs.honddoni.common.dto.PageInfoPostDTO;
import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.common.mainframe.MainFrame;
import com.devs.honddoni.post.controller.GetFilter;
import com.devs.honddoni.post.controller.PagingController;
import com.devs.honddoni.post.view.PostHonddoni;
import com.devs.honddoni.post.view.SelectAllHonPost2;
import com.devs.honddoni.post.view.SelectAllHonPost3;

public class AllBoardList2 extends JPanel {

	
	private AllBoardList2 allBoardList;
	private MainFrame frame;

	private JPanel upPanel;
	private JPanel bottomPanel;
	private JLabel searchLabel;
	private JButton aim;
	private JTextField searching;
	private JLabel pageLongbarLabel;	//페이지표기 바
	private JLabel beforeNumber = new JLabel("");
	private JLabel afterNumber;
	private JButton beforeBtn = new JButton(); // 앞페이지 버튼
	private JButton afterBtn = new JButton(); // 뒷 페이지 버튼
	private JLabel[] postList;	
	private List<PostDTO> postListDTO = null;
	private JLabel[] profilePictrue; //프로필
	private JLabel[] nickName; // 닉네임
	private JLabel[] postTitle; // 게시글 제목
//	private JLabel[] categoryName; //카테고리명
//	private JLabel[] localName;
	//	private int postNo; //게시글 번호
	//	private int totalPostNum;
	//	private PostDTO postDTO = new PostDTO();
	
	private JButton myHonddoniBtn;  //마이페이지 이동 버튼
	private JButton searchHonddoniBtn;	//게시글 작성페이지 이동 버튼
	private JButton homeBtn;		 //메인화면이동 버튼
	private JButton interestingBtn;	 //관심글 목록 이동 버튼
	private JButton noticeBtn;		 //공지사항 목록 이동 버튼
	private JLabel backgroundImage;	 //로고 포함 테두리 배경 (디자인용)
	
	GetFilter getName = GetFilter.getInstance();

	/* 프레임을 제외한 나머지를 합친 것 */
	public AllBoardList2(MainFrame frame) {

		this.frame = frame;
		this.allBoardList = this;
		
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

		/* 하단패널에 포함될 버튼, 라벨 */
		aim();
		pageLongbarLabel();
		searchLabel();
		searching();
		beforeNumber();
		afterNumber();
		beforeBtn();
		afterBtn();
		profilePictrue();
		nickName();
		postTitle();
//		categoryName();
//		localName();
		postList();

		/* 반복문이 필요없는 버튼, 라벨을 하단패널에 더해줌 */

		bottomPanel.add(searchLabel);
		bottomPanel.add(searching);
		bottomPanel.add(aim);
		bottomPanel.add(pageLongbarLabel);


		/* 디자인용도의 longbar에 라벨, 버튼을 더해줌 */
		pageLongbarLabel.add(beforeNumber);
		pageLongbarLabel.add(afterNumber);
		pageLongbarLabel.add(beforeBtn);
		pageLongbarLabel.add(afterBtn);

		frame.add(upPanel);
		frame.add(bottomPanel);
	}

	public JPanel getDownPanel() {
		return bottomPanel;
	}

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
	
	/* 하단 패널 */
	public void bottomPanel() {

		bottomPanel = new JPanel();
		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.WHITE);

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
				
				bottomPanel.setVisible(false);
				upPanel.setVisible(false);
				frame.remove(upPanel);
				frame.remove(bottomPanel);
				new PostHonddoni(frame);
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
				bottomPanel.setVisible(false);
				upPanel.setVisible(false);
				frame.remove(upPanel);
				frame.remove(bottomPanel);
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
				bottomPanel.setVisible(false);
				upPanel.setVisible(false);
				frame.remove(upPanel);
				frame.remove(bottomPanel);
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

	public void searchLabel() {

		searchLabel = new JLabel();   // 하단 패널 위 검색창
		searchLabel.setBackground(Color.white);
		searchLabel.setLayout(null);
		searchLabel.setBounds(25, 15, 450, 63); 
		searchLabel.setIcon(new ImageIcon("image/search/searchBar.png"));

	}

	public void searching() {

		searching = new JTextField(); // 검색창 텍필
		searching.setBorder(null);
		searching.setOpaque(false);
		searching.setBounds(80, 16, 315, 28);
		searching.setColumns(20);

	}

	public void aim() {

		aim = new JButton();		// 검색 버튼
		aim.setBounds(22, 13, 41, 41);
		aim.setBorderPainted(false);
		aim.setOpaque(false);
		aim.setContentAreaFilled(false);

	}

	public void pageLongbarLabel() {

		pageLongbarLabel = new JLabel("");		//페이지 표기 바
		pageLongbarLabel.setLayout(null);
		pageLongbarLabel.setIcon(new ImageIcon("image/post/nextPageButton.png"));
		pageLongbarLabel.setBounds(182, 90, 137, 22);

	}

	/* 이전 페이지 */
	public void beforeBtn() {
		int pageNo = AllBoardList.nowPage2;

		beforeBtn.setIcon(new ImageIcon("image/post/beforePageButton.png"));
		beforeBtn.setContentAreaFilled(false);
		beforeBtn.setBorderPainted(false);
		beforeBtn.setBounds(15, 4, 14, 14);

		if(pageNo < 2) {
			beforeBtn.setVisible(false);
		} else {
			beforeBtn.setVisible(true);

			beforeBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(AllBoardList.nowPage2 >= 2 ) {
						AllBoardList.nowPage2--;
					}

					bottomPanel.setVisible(false);
					AllBoardList sf = new AllBoardList(frame);
					frame.add(sf.getDownPanel());


					beforeBtn();
					beforeNumber();
					afterBtn();



				}
			});
		}	
	}



	public void afterBtn() {

		int pageNo = AllBoardList.nowPage2;


		int totalCount = new PagingController().totalWholePostNum();

		PagenationPost pagenationpost = new PagenationPost();
		PageInfoPostDTO pageInfo = pagenationpost.getPostPageInfo(pageNo, totalCount, 5, 5);
		afterBtn.setIcon(new ImageIcon("image/post/afterPageButton.png"));
		afterBtn.setContentAreaFilled(false);
		afterBtn.setBorderPainted(false);
		afterBtn.setBounds(120, 4, 14, 14);

		if(pageNo == pageInfo.getMaxPage()) {
			afterBtn.setVisible(false);
		} else {
			afterBtn.setVisible(true);
		}

		afterBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if(AllBoardList.nowPage2 < pageInfo.getMaxPage()) {
					AllBoardList.nowPage2++;
				}

				bottomPanel.setVisible(false);
				AllBoardList sf = new AllBoardList(frame);
				frame.add(sf.getDownPanel());

				afterBtn();
				beforeBtn();
				beforeNumber();


			}
		});




	}

	public void beforeNumber() {
		String frontPageString = Integer.valueOf(AllBoardList.nowPage2).toString();
		beforeNumber.setText(frontPageString);
		beforeNumber.setLayout(null);
		beforeNumber.setBounds(50, 4, 14, 14);
		System.out.println(frontPageString);

	}

	public void afterNumber() {

		int pageNo = AllBoardList.nowPage2;

		int totalCount = new PagingController().totalWholePostNum();
		PagenationPost pagenationPost = new PagenationPost();
		PageInfoPostDTO pageInfo = pagenationPost.getPostPageInfo(pageNo, totalCount, 5, 5);
		String backPageString = Integer.valueOf(pageInfo.getMaxPage()).toString();
		afterNumber = new JLabel(backPageString);
		afterNumber.setLayout(null);
		afterNumber.setBounds(85, 4, 14, 14);

	}

	/* 게시글 배경 틀*/
	public void postList() {
		int pageNo = AllBoardList.nowPage2;
		int y = 153;

		postListDTO = new PagingController().wholePostList(pageNo);

		for(int i = 0; i < postListDTO.size(); i++) {

			postList = new JLabel[postListDTO.size()];
			postList[i] = new JLabel();
			postList[i].setLayout(null);
			postList[i].setIcon(new ImageIcon("image/post/postlist1.PNG"));
			postList[i].setBounds(35, y, 431 , 105);

			bottomPanel.add(postList[i]);
			y += 118;
			bottomPanel.repaint();
			bottomPanel.revalidate();

		}
	}




	/* 게시글에 맞는 프로필 불러오기 */
	public void profilePictrue() {
		int pageNo = AllBoardList.nowPage2;
		int y = 153;

		postListDTO = new PagingController().wholePostList(pageNo);
		PostDTO postInfo = new PostDTO();

		for(int i = 0; i < postListDTO.size(); i++) {

			profilePictrue = new JLabel[postListDTO.size()];
			postInfo = postListDTO.get(i);
			profilePictrue[i] = new JLabel();
			profilePictrue[i].setLayout(null);
			profilePictrue[i].setBounds(53, y + 12, 40, 40);

			if(postInfo.getMemberProfile().equals("1")) {
				profilePictrue[i].setIcon(new ImageIcon("image/post/commentPf1.png"));
			} else if(postInfo.getMemberProfile().equals("2")) {
				profilePictrue[i].setIcon(new ImageIcon("image/post/commentPf2.png"));
			} else if(postInfo.getMemberProfile().equals("3")) {
				profilePictrue[i].setIcon(new ImageIcon("image/post/commentPf3.png"));
			} else if(postInfo.getMemberProfile().equals("4")) {
				profilePictrue[i].setIcon(new ImageIcon("image/post/commentPf4.png"));
			} else if(postInfo.getMemberProfile().equals("5")) {
				profilePictrue[i].setIcon(new ImageIcon("image/post/commentPf5.png"));
			} else if(postInfo.getMemberProfile() == null) {
				profilePictrue[i].setVisible(false);
			}
			bottomPanel.add(profilePictrue[i]);
			y += 118;
		}
	}

	/* 게시글 별 작성자 닉네임 불러오기 */
	public void nickName() {
		int pageNo = AllBoardList.nowPage2;
		int y = 153;

		postListDTO = new PagingController().wholePostList(pageNo);
		PostDTO postInfo = null;

		for(int i = 0; i < postListDTO.size(); i++) {

			postInfo = postListDTO.get(i);

			nickName = new JLabel[postListDTO.size()];
			nickName[i] = new JLabel();
			nickName[i].setLayout(null);
			nickName[i].setText(postInfo.getMemberNickname());
			nickName[i].setBounds(100, y + 10, 90, 50);
			bottomPanel.add(nickName[i]);
			y += 118;

		}	

	}

	/* 카테고리 라벨*/
//	public void categoryName() {
//		int pageNo = AllBoardList.nowPage2;
//		int y = 153;
//
//		postListDTO = new PagingController().wholePostList(pageNo);
//		PostDTO postInfo = null;
//
//		for(int i = 0; i < postListDTO.size(); i++) {
//
//			postInfo = postListDTO.get(i);
//
//			categoryName = new JLabel[postListDTO.size()];
//			categoryName[i] = new JLabel();
//			categoryName[i].setLayout(null);
//			categoryName[i].setBounds(188, y + 21, 70, 31);
//
//			
//			
//			if(postInfo.getCategoryName().equals("맛집탐방")) {
//				categoryName[i].setIcon(new ImageIcon("image/post/eat.png"));
//
//			} else if(postInfo.getCategoryName().equals("활동")) {
//				categoryName[i].setIcon(new ImageIcon("image/post/active.png"));
//
//			} else if(postInfo.getCategoryName().equals("취미")) {
//				categoryName[i].setIcon(new ImageIcon("image/post/hobby.png"));
//
//			} else if(postInfo.getCategoryName().equals("산책")) {
//				categoryName[i].setIcon(new ImageIcon("image/post/walk.png"));
//
//			} else if(postInfo.getCategoryName().equals("스터디")) {
//				categoryName[i].setIcon(new ImageIcon("image/post/study.png"));
//
//			} else if(postInfo.getCategoryName().equals("게임")) {
//				categoryName[i].setIcon(new ImageIcon("image/post/game.png"));
//			} else if(postInfo.getCategoryName() == null){
//				categoryName[i].setVisible(false);
//			}
//			bottomPanel.add(categoryName[i]);
//			y += 118;
//		}

	

	public void postTitle() {
		int pageNo = AllBoardList.nowPage2;
		int y = 153;

		postListDTO = new PagingController().wholePostList(pageNo);
		PostDTO postInfo = null;

		for(int i = 0; i < postListDTO.size(); i++) {

			postInfo = postListDTO.get(i);
			postTitle = new JLabel[postListDTO.size()];
			postTitle[i] = new JLabel();
			postTitle[i].setText(postInfo.getPostName());
			postTitle[i].setLayout(null);
			postTitle[i].setBounds(64, y + 63, 343, 25);
			bottomPanel.add(postTitle[i]);
			y += 118;

			postTitle[i].addMouseListener(new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent e) {
					System.out.println("세부게시판 조회");

				}
				@Override
				public void mouseReleased(MouseEvent e) {}
				@Override
				public void mousePressed(MouseEvent e) {}
				@Override
				public void mouseExited(MouseEvent e) {}
				@Override
				public void mouseEntered(MouseEvent e) {}
			});
		}
	}

//	public void localName() {
//		int pageNo = AllBoardList.nowPage2;
//		int y = 153;
//
//		postListDTO = new PagingController().wholePostList(pageNo);
//		PostDTO postInfo = null;
//
//		for(int i = 0; i < postListDTO.size(); i++) {
//
//			postInfo = postListDTO.get(i);		
//
//			localName = new JLabel[postListDTO.size()];
//			localName[i] = new JLabel();
//			localName[i].setLayout(null);
//			localName[i].setBounds(383, y + 6, 46, 25);
//
//			if(postInfo.getLocalName().equals("강릉")) {
//				localName[i].setIcon(new ImageIcon("image/post/gangneung.png"));
//			} else if(postInfo.getLocalName().equals("담양")) {
//				localName[i].setIcon(new ImageIcon("image/post/damyang.png"));
//			} else if(postInfo.getLocalName().equals("대구")) {
//				localName[i].setIcon(new ImageIcon("image/post/daegu.png"));
//			} else if(postInfo.getLocalName().equals("부산")) {
//				localName[i].setIcon(new ImageIcon("image/post/busan.png"));
//			} else if(postInfo.getLocalName().equals("서울")) {
//				localName[i].setIcon(new ImageIcon("image/post/seoul.png"));
//			} else if(postInfo.getLocalName().equals("인천")) {
//				localName[i].setIcon(new ImageIcon("image/post/incheon.png"));
//			} else if(postInfo.getLocalName().equals("순천")) {
//				localName[i].setIcon(new ImageIcon("image/post/sooncheon.png"));
//			} else if(postInfo.getLocalName().equals("전주")) {
//				localName[i].setIcon(new ImageIcon("image/post/jeonju.png"));
//			} else if(postInfo.getLocalName().equals("제주")) {
//				localName[i].setIcon(new ImageIcon("image/post/jeju.png"));
//			} else if(postInfo.getLocalName().equals("천안")) {
//				localName[i].setIcon(new ImageIcon("image/post/cheonan.png"));
//			} else if (postInfo.getLocalName() == null) {
//				localName[i].setVisible(false);
//			}
//
//			bottomPanel.add(localName[i]);
//			y += 118;
//		}		
	}




































































//------------------------------------------
//2차수정


//private AllBoardList allBoardList;
//private MainFrame frame;
//
//private JPanel bottomPanel = new JPanel();
//private JLabel searchLabel;
//private JButton aim;
//private JTextField searching;
//private JLabel pagebarLabel;	//페이지표기 바
//private JLabel preNumber = new JLabel("");
//private JLabel commingNumber;
//public static int frontPage = 1;
//private JButton preBtn = new JButton(); // 앞페이지 버튼
//private JButton commingBtn = new JButton(); // 뒷 페이지 버튼
//private JLabel[] postList;	
//List<PostDTO> postListDTO = null;
////--	private JLabel[] profile; //프로필
//private JLabel[] nickName; // 닉네임
//private JLabel[] postTitle; // 게시글 제목
//private JLabel[] categoryName; //카테고리명
//private JLabel[] localName;
//private int postNo; //게시글 번호
//private int totalPostNum;
//private PostDTO postDTO = new PostDTO();
//
//
//
//GetFilter getName = GetFilter.getInstance();
//
//
//
//public AllBoardList(MainFrame frame) {
//
//	this.frame = frame;
//	this.allBoardList = this;
//	
//	this.setBounds(0, 0, 500, 870);
//	this.setBackground(Color.white);
//	this.setLayout(null);
//	frame.add(this);
//	
//	
//	bottomPanel.setBounds(0, 100, 500, 770);
//	bottomPanel.setLayout(null);
//	bottomPanel.setBackground(Color.white);	
//
//	
//	addComponents();
//	postlistbgr(1);
//	prePageBtn();
//	commingPageBtn(1);
//	prePageNumber();
//	commingPageNumber(1);
//	
//
//	nickName();
//	categoryName(1);
//	
//	localName(1);
//	
//	this.repaint();
//	this.revalidate();
//
//
//}
//
//
//
//public void bottomPanel() {
//	bottomPanel = new JPanel();
//	bottomPanel.setBounds(0, 100, 500, 770);
//	bottomPanel.setLayout(null);
//	bottomPanel.setBackground(Color.white);	
//	
//}
//
//
//private void addComponents() {
//
//	searchLabel = new JLabel();   // 하단 패널 위 검색창
//	searchLabel.setBackground(Color.white);
//	searchLabel.setLayout(null);
//	searchLabel.setBounds(25, 15, 450, 63); 
//	searchLabel.setIcon(new ImageIcon("image/search/searchBar.png"));
//	bottomPanel.add(searchLabel);
//	
//	searching = new JTextField(); // 검색창 텍스트필드
//	searching.setBorder(null);
//	searching.setOpaque(false);
//	searching.setBounds(80, 16, 315, 28);
//	searching.setColumns(20);
//	searchLabel.add(searching);
//	
//	aim = new JButton();		// 검색 버튼
//	aim.setBounds(22, 13, 41, 41);
//	aim.setBorderPainted(false);
//	aim.setOpaque(false);
//	aim.setContentAreaFilled(false);
//	searchLabel.add(aim);
//	
//	pagebarLabel = new JLabel("");		//페이지 표기 바
//	pagebarLabel.setLayout(null);
//	pagebarLabel.setIcon(new ImageIcon("image/post/nextPageButton.png"));
//	pagebarLabel.setBounds(182, 112, 137, 22);
//	bottomPanel.add(pagebarLabel);
//	System.out.println("add 호출됨");
//	
//}
//
//
//
///* 이전 페이지 */
//private void prePageBtn() {
//	int pageNo = frontPage;
//	
//	preBtn.setIcon(new ImageIcon("image/post/beforePageButton.png"));
//	preBtn.setContentAreaFilled(false);
//	preBtn.setBorderPainted(false);
//	preBtn.setBounds(15, 4, 14, 14);
//	
//	if(pageNo < 2) {
//		preBtn.setVisible(false);
//	} else {
//		preBtn.setVisible(true);
//		
//		System.out.println("frontPage : " + frontPage);
//		preBtn.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//
//				if(frontPage >= 2 ) {
//					frontPage--;
//				}
//
//				
//				postListDTO = new PagingController().selectPostList(pageNo, getName.getLocalName(), getName.getCategoryName());
//				postlistbgr(postNo); 
//
//				prePageBtn();
//				prePageNumber();
//				commingPageBtn(1);
//				System.out.println("frontPage : " + frontPage);
//				pagebarLabel.add(preBtn);
//
//			}
//		});
//	}	
//}
//
//
////다음페이지 버튼
//private void commingPageBtn(int postNo) {
//	
//	this.postNo = postNo;
//
//	int pageNo = frontPage;
//	
//	
//	int totalCount = new PagingController().selectWholePostNum(getName.getLocalName(), getName.getCategoryName());
//	
//	PagenationPost pagenationpost = new PagenationPost();
//	PageInfoPostDTO pageInfo = pagenationpost.getPostPageInfo(pageNo, totalCount, 5, 5);
//
//	commingBtn.setIcon(new ImageIcon("image/post/afterPageButton.png"));
//	commingBtn.setContentAreaFilled(false);
//	commingBtn.setBorderPainted(false);
//	commingBtn.setBounds(120, 4, 14, 14);
//	
//	if(pageNo == pageInfo.getMaxPage()) {
//		commingBtn.setVisible(false);
//	} else {
//		commingBtn.setVisible(true);
//	}
//	
//	commingBtn.addActionListener(new ActionListener() {
//		
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			
//			if(frontPage < pageInfo.getMaxPage()) {
//				frontPage++;
//			}
//
//			
//							
//			commingPageBtn(1);
//			prePageBtn();
//			prePageNumber();
//			
//		}
//	});
//	
//	pagebarLabel.add(commingBtn);
//	
//	
//}
//
////전 페이지
//private void prePageNumber() {
//	String frontPageString = Integer.valueOf(frontPage).toString();
//
//	preNumber.setText(frontPageString);
//	preNumber.setLayout(null);
//	preNumber.setBounds(50, 4, 14, 14);
//	System.out.println(frontPageString);
//	
//}
//
////다음페이지
//private void commingPageNumber(int postNo) {
//	
//	int pageNo = frontPage;
//
//	int totalCount = new PagingController().selectWholePostNum(getName.getLocalName(), getName.getCategoryName());
//
//	PagenationPost pagenationPost = new PagenationPost();
//	PageInfoPostDTO pageInfo = pagenationPost.getPostPageInfo(pageNo, totalCount, 5, 5);
//	String backPageString = Integer.valueOf(pageInfo.getMaxPage()).toString();
//
//	commingNumber = new JLabel(backPageString);
//	commingNumber.setLayout(null);
//	commingNumber.setBounds(85, 4, 14, 14);
//
//	
//}
//
///* 게시글 배경 틀*/
//private void postlistbgr(int postNo) {
//	int pageNo = frontPage;
//	int y = 153;
//	
//	postListDTO = new PagingController().selectPostList(pageNo, getName.getLocalName(), getName.getCategoryName());
//	PostDTO postInfo = null;
//	
//	for(int i = 0; i < postListDTO.size(); i++) {
//		
//		postInfo = postListDTO.get(i);
//		
//		postList = new JLabel[postListDTO.size()];
//		postList[i].setLayout(null);
//		postList[i].setIcon(new ImageIcon("image/post/postlist1"));
//		postList[i].setBounds(35, y, 432, 105);
//		bottomPanel.add(postList[i]);
//		y += 118;
//	}
//	
//	
//}
//
//
///* 게시글 별 작성자 닉네임 불러오기 */
//private void nickName() {
//	int pageNo = frontPage;
//	int y = 152;
//	
//		postListDTO = new PagingController().selectPostList(pageNo, getName.getLocalName(), getName.getCategoryName());
//		PostDTO postInfo = null;
//		
//		for(int i = 0; i < postListDTO.size(); i++) {
//			
//			postInfo = postListDTO.get(i);
//			
//			nickName = new JLabel[postListDTO.size()];
//			nickName[i].setLayout(null);
//			nickName[i].setText(postInfo.getMemberNickname());
//			nickName[i].setBounds(92, y + 15, 100, 43);
//			bottomPanel.add(nickName[i]);
//			y += 117;
//
//		}	
//			
//}
//
///* 카테고리 라벨*/
//private void categoryName(int postNo) {
//	int pageNo = frontPage;
//	int y = 152;
//	
//		postListDTO = new PagingController().selectPostList(pageNo, getName.getLocalName(), getName.getCategoryName());
//		PostDTO postInfo = null;
//		
//		for(int i = 0; i < postListDTO.size(); i++) {
//			
//			postInfo = postListDTO.get(i);
//			
//			categoryName = new JLabel[postListDTO.size()];
//			categoryName[i].setLayout(null);
//			categoryName[i].setBounds(188, y + 21, 70, 34);
//			
//			if(postInfo.getCategoryName().equals("맛집탐방")) {
//				categoryName[i].setIcon(new ImageIcon("image/post/eat.png"));
//				
//			} else if(postInfo.getCategoryName().equals("활동")) {
//				categoryName[i].setIcon(new ImageIcon("image/post/active.png"));
//				
//			} else if(postInfo.getCategoryName().equals("취미")) {
//				categoryName[i].setIcon(new ImageIcon("image/post/hobby.png"));
//				
//			} else if(postInfo.getCategoryName().equals("산책")) {
//				categoryName[i].setIcon(new ImageIcon("image/post/walk.png"));
//				
//			} else if(postInfo.getCategoryName().equals("스터디")) {
//				categoryName[i].setIcon(new ImageIcon("image/post/study.png"));
//				
//			} else if(postInfo.getCategoryName().equals("게임")) {
//				categoryName[i].setIcon(new ImageIcon("image/post/game.png"));
//			} else {
//				categoryName[i].setVisible(false);
//			}
//			bottomPanel.add(categoryName[i]);
//			y += 117;
//		}
//			
//}
//
////게시글 제목 불러오기
//private void postTitle(int postNo) {
//	int pageNo = frontPage;
//	int y = 152;
//	
//		postListDTO = new PagingController().selectPostList(pageNo, getName.getLocalName(), getName.getCategoryName());
//		PostDTO postInfo = null;
//		
//		for(int i = 0; i < postListDTO.size(); i++) {
//			
//			postInfo = postListDTO.get(i);
//			postTitle = new JLabel[postListDTO.size()];
//			postTitle[i].setText(postInfo.getPostName());
//			postTitle[i].setLayout(null);
//			postTitle[i].setBounds(62, y + 10, 395, 28);
//			bottomPanel.add(postTitle[i]);
//			y += 118;
//			
//			postTitle[i].addMouseListener(new MouseListener() {
//				
//				@Override
//				public void mouseClicked(MouseEvent e) {
//					// 게시판 세부내용 보이게 설정
//					
//				}
//				@Override
//				public void mouseReleased(MouseEvent e) {}
//				@Override
//				public void mousePressed(MouseEvent e) {}
//				@Override
//				public void mouseExited(MouseEvent e) {}
//				@Override
//				public void mouseEntered(MouseEvent e) {}
//			});
//		}
//}
//
//private void localName(int postNo) {
//	int pageNo = frontPage;
//	int y = 152;
//	
//		postListDTO = new PagingController().selectPostList(pageNo, getName.getLocalName(), getName.getCategoryName());
//		PostDTO postInfo = null;
//		
//		for(int i = 0; i < postListDTO.size(); i++) {
//			
//			postInfo = postListDTO.get(i);		
//			
//			localName = new JLabel[postListDTO.size()];
//			localName[i].setLayout(null);
//			localName[i].setBounds(383, y + 6, 46, 25);
//			
//			if(postInfo.getLocalName().equals("강릉")) {
//				localName[i].setIcon(new ImageIcon("image/post/gangneung.png"));
//			} else if(postInfo.getLocalName().equals("담양")) {
//				localName[i].setIcon(new ImageIcon("image/post/damyang.png"));
//			} else if(postInfo.getLocalName().equals("대구")) {
//				localName[i].setIcon(new ImageIcon("image/post/daegu.png"));
//			} else if(postInfo.getLocalName().equals("부산")) {
//				localName[i].setIcon(new ImageIcon("image/post/busan.png"));
//			} else if(postInfo.getLocalName().equals("서울")) {
//				localName[i].setIcon(new ImageIcon("image/post/seoul.png"));
//			} else if(postInfo.getLocalName().equals("인천")) {
//				localName[i].setIcon(new ImageIcon("image/post/incheon.png"));
//			} else if(postInfo.getLocalName().equals("순천")) {
//				localName[i].setIcon(new ImageIcon("image/post/sooncheon.png"));
//			} else if(postInfo.getLocalName().equals("전주")) {
//				localName[i].setIcon(new ImageIcon("image/post/jeonju.png"));
//			} else if(postInfo.getLocalName().equals("제주")) {
//				localName[i].setIcon(new ImageIcon("image/post/jeju.png"));
//			} else if(postInfo.getLocalName().equals("천안")) {
//				localName[i].setIcon(new ImageIcon("image/post/cheonan.png"));
//			} else if (postInfo.getLocalName() == null) {
//				localName[i].setVisible(false);
//			}
//			
//			bottomPanel.add(localName[i]);
//			y += 117;
//			
//		}
//	
//}
























//------------------------------------------------------
//1차수정

//	MainFrame frame = new MainFrame();
//	
//	private JPanel topPanel; // 상단패널
//	private JPanel bottomPanel; //하단패널
////	private JLabel bottomLabel;
//	private JLabel searchBar; //검색바 라벨---------
//	private JButton aim; // 검색 버튼
//	private JTextField search; // 키워드 입력
//	//페이징
//	
//	// 첫번째 게시물
//	private JButton AllBoardList1; // 첫 번째 게시물 진입 버튼
//	private JLabel listProfile1; //첫 번째 게시물 작성자 프로필---------
//	private JLabel nickName1; //첫 번째 게시물 작성자 닉네임------------
//	private JLabel location1; //첫 번째 게시물 지역-------------------
//	//z order로(하트버튼)
//	private JLabel article1; //100byte // 첫 번째 게시물 제목---------
//	
//	// 두번째 게시물
//	private JButton AllBoardList2; // 두 번째 게시물 진입 버튼
//	private JLabel listProfile2; //게시물 작성자 프로필----------------
//	private JLabel nickName2;  //게시물 작성자 닉네임------------------
//	private JLabel location2;  //게시물 지역-------------------------
//	//z order로
//	private JLabel article2; //100byte  //게시물 제목----------------
//	
//	// 세번째 게시물
//	private JButton AllBoardList3; // 세 번째 게시물 진입 버튼
//	private JLabel listProfile3;  //게시물 작성자 프로필----------------
//	private JLabel nickName3;  //게시물 작성자 닉네임-------------------
//	private JLabel location3;  //게시물 지역-------------------------
//	//z order로
//	private JLabel article3; //100byte  //게시물 제목----------------
//	
//	// 네번째 게시물
//	private JButton AllBoardList4;  // 네 번째 게시물 진입 버튼
//	private JLabel listProfile4; // 게시물 작성자 프로필-----------------
//	private JLabel nickName4;  //게시물 작성자 닉네임--------------------
//	private JLabel location4;  //게시물 지역--------------------------
//	//z order로
//	private JLabel article4; //100byte	  //게시물 제목-----------------
//	
//	// 다섯번째 게시물
//	private JButton AllBoardList5;  // 다섯 번째 게시물 진입 버튼
//	private JLabel listProfile5;  //게시물 작성자 프로필-----------------
//	private JLabel nickName5;  //게시물 작성자 닉네임-----------------------
//	private JLabel location5;  //게시물 지역--------------------------
//	//z order로
//	private JLabel article5; //100byte  //게시물 제목
//	
//	//전체게시물 조회 화면 불러오기
//	public AllBoardList() {
//		bottomPanel();
//		clickAim();
//		writeKeyword();
//		clickAllBoardList1();
//		clickAllBoardList2();
//		clickAllBoardList3();
//		clickAllBoardList4();
//		clickAllBoardList5();
//		
//		frame.add(bottomPanel);
//		
//	}
//	
//
//
////	private void writeKeyword() {
////		search = new JTextField();
////		search.setBorder(null);
////		search.setDisabledTextColor(Color.white);
////		search.setOpaque(false);
////		search.setBounds(106, 168, 326, 29);  
////		search.setColumns(10);
////		
////	}
//	
//	
//
//
//
//	private void bottomPanel() {
//		bottomPanel = new JPanel();
//		bottomPanel.setBounds(0, 100, 500, 770);
//		bottomPanel.setLayout(null);
//		bottomPanel.setBackground(Color.black);
//		
//		//검색바 라벨
//		searchBar = new JLabel();
//		searchBar.setBackground(Color.white);
//		searchBar.setLayout(null);
//		searchBar.setBounds(35, 152, 431, 63);  
//		searchBar.setIcon(new ImageIcon("image/search/searchBar.png"));
//		
//		
//		
///*--------------------- 첫번째 게시물 관련 라벨 ----------------------*/
//		
//		//첫번째 게시물 작성자 프로필
//		listProfile1 = new JLabel();
//		listProfile1.setBackground(Color.white);
//		listProfile1.setLayout(null);
//		listProfile1.setBounds(53, 164, 37, 40);  
//		listProfile1.setIcon(new ImageIcon("image/post/commentPf1.png")); 
//		
//		//첫번째 게시물 작성자 닉네임
//		nickName1 = new JLabel();
//		nickName1.setBackground(Color.white);
//		nickName1.setLayout(null);
//		nickName1.setBounds(89, 159, 101, 44);  
////		nickName1.setIcon(new ImageIcon("")); <-- 아직 미지정
//		
//		//첫번째 게시물 지역
//		location1 = new JLabel();
//		location1.setBackground(Color.white);
//		location1.setLayout(null);
//		location1.setBounds(383, 161, 46, 25);  
////		location1.setIcon(new ImageIcon("")); <-- 아직 미지정
//		
//		//첫번째 게시물 제목
//		article1 = new JLabel();
//		article1.setBackground(Color.white);
//		article1.setLayout(null);
//		article1.setBounds(55, 212, 396, 29);  
////		article1.setIcon(new ImageIcon("")); <-- 아직 미지정
//		
////----------------------------------------------------------------
//		
///*--------------------- 두번째 게시물 관련 라벨 ----------------------*/		
//		
//		//두번째 게시물 작성자 프로필
//		listProfile2 = new JLabel();
//		listProfile2.setBackground(Color.white);
//		listProfile2.setLayout(null);
//		listProfile2.setBounds(53, 282, 37, 40);  
//		listProfile2.setIcon(new ImageIcon("image/post/commentPf2.png")); 
//		
//		//두번째 게시물 작성자 닉네임
//		nickName2 = new JLabel();
//		nickName2.setBackground(Color.white);
//		nickName2.setLayout(null);
//		nickName2.setBounds(89, 282, 101, 44);  
////		nickName2.setIcon(new ImageIcon("")); <-- 아직 미지정
//		
//		//두번째 게시물 지역
//		location2 = new JLabel();
//		location2.setBackground(Color.white);
//		location2.setLayout(null);
//		location2.setBounds(383, 279, 46, 25);  
////		location2.setIcon(new ImageIcon("")); <-- 아직 미지정
//		
//		//두번째 게시물 제목
//		article2 = new JLabel();
//		article2.setBackground(Color.white);
//		article2.setLayout(null);
//		article2.setBounds(55, 330, 396, 29);  
////		article2.setIcon(new ImageIcon("")); <-- 아직 미지정
//		
////----------------------------------------------------------------
//		
///*--------------------- 세번째 게시물 관련 라벨 ----------------------*/		
//		
//		//세번째 게시물 작성자 프로필
//		listProfile3 = new JLabel();
//		listProfile3.setBackground(Color.white);
//		listProfile3.setLayout(null);
//		listProfile3.setBounds(53, 400, 37, 40);  
//		listProfile3.setIcon(new ImageIcon("image/post/commentPf3.png")); 
//		
//		//세번째 게시물 작성자 닉네임
//		nickName3 = new JLabel();
//		nickName3.setBackground(Color.white);
//		nickName3.setLayout(null);
//		nickName3.setBounds(89, 400, 101, 44);  
////		nickName3.setIcon(new ImageIcon("")); <-- 아직 미지정
//		
//		//세번째 게시물 지역
//		location3 = new JLabel();
//		location3.setBackground(Color.white);
//		location3.setLayout(null);
////		location3.setBounds(383, 397, 46, 25);  <-- 아직 미지정
////		location3.setIcon(new ImageIcon("")); <-- 아직 미지정
//		
//		//세번째 게시물 제목
//		article3 = new JLabel();
//		article3.setBackground(Color.white);
//		article3.setLayout(null);
////		article3.setBounds(55, 449, 396, 29);  <-- 아직 미지정
////		article3.setIcon(new ImageIcon("")); <-- 아직 미지정
//		
////----------------------------------------------------------------		
//		
///*--------------------- 네번째 게시물 관련 라벨 ----------------------*/		
//		
//		//네번째 게시물 작성자 프로필
//		listProfile4 = new JLabel();
//		listProfile4.setBackground(Color.white);
//		listProfile4.setLayout(null);
//		listProfile4.setBounds(53, 518, 37, 40); 
//		listProfile4.setIcon(new ImageIcon("image/post/commentPf4.png")); 
//		
//		//네번째 게시물 작성자 닉네임
//		nickName4 = new JLabel();
//		nickName4.setBackground(Color.white);
//		nickName4.setLayout(null);
//		nickName4.setBounds(89, 518, 101, 44);  
////		nickName4.setIcon(new ImageIcon("")); <-- 아직 미지정
//		
//		//네번째 게시물 지역
//		location4 = new JLabel();
//		location4.setBackground(Color.white);
//		location4.setLayout(null);
//		location4.setBounds(383, 515, 46, 25);  
////		location4.setIcon(new ImageIcon("")); <-- 아직 미지정
//		
//		//네번째 게시물 제목
//		article4 = new JLabel();
//		article4.setBackground(Color.white);
//		article4.setLayout(null);
//		article4.setBounds(55, 567, 396, 29);  
////		article4.setIcon(new ImageIcon("")); <-- 아직 미지정
//		
////----------------------------------------------------------------		
//		
///*--------------------- 네번째 게시물 관련 라벨 ----------------------*/		
//		
//		//다섯번째 게시물 작성자 프로필
//		listProfile5 = new JLabel();
//		listProfile5.setBackground(Color.white);
//		listProfile5.setLayout(null);
//		listProfile5.setBounds(53, 636, 37, 40);  
//		listProfile5.setIcon(new ImageIcon("image/post/commentP5.png")); 
//		
//		//다섯번째 게시물 작성자 닉네임
//		nickName5 = new JLabel();
//		nickName5.setBackground(Color.white);
//		nickName5.setLayout(null);
//		nickName5.setBounds(89, 636, 101, 44);  
////		nickName5.setIcon(new ImageIcon("")); <-- 아직 미지정
//		
//		//다섯번째 게시물 지역
//		location5 = new JLabel();
//		location5.setBackground(Color.white);
//		location5.setLayout(null);
//		location5.setBounds(383, 633, 46, 25);  
////		location5.setIcon(new ImageIcon("")); <-- 아직 미지정
//		
//		//다섯번째 게시물 제목
//		article5 = new JLabel();
//		article5.setBackground(Color.white);
//		article5.setLayout(null);
//		article5.setBounds(55, 685, 396, 29);  
////		article5.setIcon(new ImageIcon("")); <-- 아직 미지정
//
//		
////----------------------------------------------------------------		
//		
//	}
//	
//	//검색돋보기 클릭
//	private void clickAim() {
//		bottomPanel();
//		aim = new JButton();
//		aim.setIcon(new ImageIcon("image/search/aim.png"));
//		aim.setContentAreaFilled(false);
//		aim.setBorderPainted(false);
//		aim.setBounds(59, 168, 29, 29);  
//		
//		aim.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// 키워드검색 후 조회화면
//				System.out.println("키워드 검색 후 조회화면으로");
//			}});
//	}
//	
//		//키워드입력 텍스트필드        
//		private void writeKeyword() {
//			search = new JTextField();
//			search.setBorder(null);
//			search.setDisabledTextColor(Color.white);
//			search.setOpaque(false);
//			search.setBounds(106, 168, 326, 29);  
//			search.setColumns(10);
//		}
//	
//	
//	
//	
//	//첫번째 게시물 진입
//	private void clickAllBoardList1() {
//		bottomPanel();
//		AllBoardList1 = new JButton();
////		AllBoardList1.setIcon(new ImageIcon(""));
//		AllBoardList1.setContentAreaFilled(false);
//		AllBoardList1.setBorderPainted(false);
//		AllBoardList1.setBounds(35, 152, 431, 105);  
//		
//		aim.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// 첫번째 게시물 진입
//				System.out.println("첫번째 게시물에 진입");
//			}});
//	}
//	
//	//첫번째 게시물 진입
//		private void clickAllBoardList2() {
//			bottomPanel();
//			AllBoardList2 = new JButton();
////			AllBoardList2.setIcon(new ImageIcon(""));
//			AllBoardList2.setContentAreaFilled(false);
//			AllBoardList2.setBorderPainted(false);
//			AllBoardList2.setBounds(35, 270, 431, 105);  
//			
//			aim.addActionListener(new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					// 두번째 게시물 진입
//					System.out.println("두번째 게시물에 진입");
//				}});
//		}
//		
//		//세번째 게시물 진입
//		private void clickAllBoardList3() {
//			bottomPanel();
//			AllBoardList3 = new JButton();
////			AllBoardList3.setIcon(new ImageIcon(""));
//			AllBoardList3.setContentAreaFilled(false);
//			AllBoardList3.setBorderPainted(false);
//			AllBoardList3.setBounds(35, 388, 431, 105);  
//			
//			aim.addActionListener(new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					// 세번째 게시물 진입
//					System.out.println("세번째 게시물에 진입");
//				}});
//		}
//		
//		//네번째 게시물 진입
//		private void clickAllBoardList4() {
//			bottomPanel();
//			AllBoardList4 = new JButton();
////			AllBoardList4.setIcon(new ImageIcon(""));
//			AllBoardList4.setContentAreaFilled(false);
//			AllBoardList4.setBorderPainted(false);
//			AllBoardList4.setBounds(35, 506, 431, 105);  
//			
//			aim.addActionListener(new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					// 네번째 게시물 진입
//					System.out.println("네번째 게시물에 진입");
//				}});
//		}
//		
//		//다섯번째 게시물 진입
//		private void clickAllBoardList5() {
//			bottomPanel();
//			AllBoardList5 = new JButton();
////			AllBoardList5.setIcon(new ImageIcon(""));
//			AllBoardList5.setContentAreaFilled(false);
//			AllBoardList5.setBorderPainted(false);
//			AllBoardList5.setBounds(35, 624, 431, 105);  
//			
//			aim.addActionListener(new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					// 다섯번째 게시물 진입
//					System.out.println("다섯번째 게시물에 진입");
//				}});
//		}
//		
//	
//		
//		
//		
//	//MainFrame frame = new MainFrame();
//	SearchController se ;
//	private JPanel topPanel; // 상단패널
//	private JPanel bottomPanel; //하단패널
////	private JLabel bottomLabel;
//	private JLabel searchBar; //검색바 라벨---------
//	private JButton aim; // 검색 버튼
//	private JTextField search; // 키워드 입력
//	
//	//페이징
//	private JLabel pageBar; // 페이지버튼의 라벨-----------
//	private JLabel beforeNum; // 페이지 앞 숫자------------
//	private JLabel afterNum; // 페이지 뒤 숫자-------------
//	private int nowPage = 1; // 현재페이지========================
//	private JButton beforeBtn; //앞페이지로 이동버튼
//	private JButton afterBtn; //뒷페이지로 이동버튼
//	private JLabel postList; //게시글리스트의 밑바탕
//	List<PostDTO> postListDTO = null; //=-=-=-=-=-=-=-=-=-=-=-=-=
//	
//	//게시물 리스트
//	private JLabel listFrame; //게시글 프레임--------
//	private JLabel profile; //프로필 사진-------------
//	private JLabel nickName; //닉네임------------
//	private JLabel location; //지역-------------
////	private (JLabel? JButton?) like; <---- 관심글 등록 (하트)
//	private JLabel listTitle; //게시글 타이틀
//	private int postNo; //게시글 번호
//	
//	
//	public AllBoardList() {
//		
//		
//		bottomPanel();
//		aim();
//		search();
//		beforeBtn();
////		afterBtn(1);  <----에러
////		allBoardList(1); <----- commentList와 같은...
//		
//		
//		
//		bottomPanel.add(searchBar);
//		bottomPanel.add(pageBar);
//		bottomPanel.add(listFrame);
//		
//		pageBar.add(beforeNum);
//		pageBar.add(afterNum);
//		
//		listFrame.add(profile);
//		listFrame.add(nickName);
//		listFrame.add(location);
//		listFrame.add(listTitle);
//	}
//		
//	//하단패널
//	public void bottomPanel() {
//		
//		System.out.println("다음페이지와?");
//		bottomPanel = new JPanel();
//		bottomPanel.setBounds(0, 100, 500, 770);
//		bottomPanel.setLayout(null);
//		bottomPanel.setBackground(Color.black);		//일단 구분하기위해 검은색(확인 후 white로 바꿀것)
//		
//		
//		//검색바 라벨
//		searchBar = new JLabel();
//		searchBar.setBackground(Color.white);
//		searchBar.setLayout(null);
//		searchBar.setBounds(35, 152, 431, 63);  
//		searchBar.setIcon(new ImageIcon("image/search/searchBar.png"));
//		
//		//페이지바 라벨
//		pageBar = new JLabel();
//		pageBar.setBackground(Color.white);
//		pageBar.setLayout(null);
//		pageBar.setBounds(182, 105, 137, 22);  
//		pageBar.setIcon(new ImageIcon("image/post/nextPageButton.png"));
//		
//		//앞페이지로 이동 버튼
//		beforeNum = new JLabel();
//		beforeNum.setBackground(Color.white);
//		beforeNum.setLayout(null);
//		beforeNum.setBounds(188, 109, 13, 13);  
//		beforeNum.setIcon(new ImageIcon("image/post/leftpagebutton.png"));
//		
//		//뒷페이지로 이동 버튼
//		afterNum = new JLabel();
//		afterNum.setBackground(Color.white);
//		afterNum.setLayout(null);
// 		afterNum.setBounds(300, 109, 13, 13);  
//		afterNum.setIcon(new ImageIcon("image/post/ringhtpagebutton.png"));
//		
//		//게시글 프레임
//		listFrame = new JLabel();
//		listFrame.setBackground(Color.white);
//		listFrame.setLayout(null);
//		listFrame.setBounds(35, 152, 431, 105);  
//		listFrame.setIcon(new ImageIcon("image/search/boardlistframe.png"));
//		
//		//프로필 사진
//		profile = new JLabel();
//		profile.setBackground(Color.white);
//		profile.setLayout(null);
//		profile.setBounds(35, 164, 37, 40);  
//		profile.setIcon(new ImageIcon("image/post/commentPf1.png"));
//		
//		//닉네임
//		nickName = new JLabel();
//		nickName.setBackground(Color.white);
//		nickName.setLayout(null);
//		nickName.setBounds(89, 164, 101, 44);  
//		nickName.setIcon(new ImageIcon("image/search/nicknameEx.png"));
//		
//		//지역
//		location = new JLabel();
//		location.setBackground(Color.white);
//		location.setLayout(null);
//		location.setBounds(383, 152, 46, 25);  
//		location.setIcon(new ImageIcon("image/search/Rectangle30.png"));
//		
//		//게시글 타이틀
//		listTitle = new JLabel();
//		listTitle.setBackground(Color.white);
//		listTitle.setLayout(null);
//		listTitle.setBounds(55, 212, 396, 29);  
//		listTitle.setIcon(new ImageIcon("image/search/textBar.png"));
//		
//	}	
//	
//	//검색돋보기 클릭
//	public void aim() {
//		bottomPanel();
//		aim = new JButton();
//		aim.setIcon(new ImageIcon("image/search/aim.png"));
//		aim.setContentAreaFilled(false);
//		aim.setBorderPainted(false);
//		aim.setBounds(59, 168, 29, 29);  
//		
//		aim.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// 키워드검색 후 조회화면
//				System.out.println("키워드 검색 후 조회화면으로");
//			}});
//	}
//	
//	
//	//키워드입력 텍스트필드
//	public void search() {
//		search = new JTextField();
//		search.setBorder(null);
//		search.setDisabledTextColor(Color.white);
//		search.setOpaque(false);
//		search.setBounds(106, 168, 326, 29);  
//		search.setColumns(10);
//	}
//
//	//게시글 이전페이지로 이동하는 버튼
//	public void beforeBtn() {
//
//		int pageNo = nowPage;
//
//		beforeBtn = new JButton("");
//		beforeBtn.setIcon(new ImageIcon("image/post/beforePageButton.png"));
//		beforeBtn.setContentAreaFilled(false);
//		beforeBtn.setBorderPainted(false);
//		beforeBtn.setBounds(188, 109, 13, 13);  
//		if(pageNo == 1) {
//			beforeBtn.setVisible(false);
//		}
//		beforeBtn.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("이전페이지로 이동");
//				/* 이전페이지 호출*/
//			}
//		});
//			
//	}
//			
//게시글 다음페이지로 이동		
//		public void afterBtn(int postNo) {
//			
//			this.postNo = postNo;
//			
//			int pageNo = nowPage;
//			PageInfoPostDTO() dto = new PageInfoPostDTO();
//			new PagingController().totalWholePostNum(postNo);
//			int totalCount = dto.getTotalCount();	
//			PagenationPost pagenationPost = new PagenationPost();
//			PageInfoPostDTO() pageInfo = pagenationPost.getPostPageInfo(pageNo, totalCount, 2, 5);
//
//			afterBtn = new JButton("");
//			afterBtn.setIcon(new ImageIcon("image/post/afterPageButton.png"));
//			afterBtn.setContentAreaFilled(false);
//			afterBtn.setBorderPainted(false);
//			afterBtn.setBounds(120, 4, 14, 14);
//			if(pageNo == pageInfo.getMaxPage()) {
//				afterBtn.setVisible(false);
//			}
//			afterBtn.addActionListener(new ActionListener() {
//
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					System.out.println("다음페이지 호출");
//					/* 다음페이지 호출*/
//				}
//			});
//		}
//			
//		/* 현재페이지, 전체페이지, 페이지이동 버튼이 위치한 라벨 */
//	public void commentLongbarLabel() {
//
//		searchBar = new JLabel("");
//		searchBar.setLayout(null);
//		searchBar.setIcon(new ImageIcon("image/post/nextPageButton.png"));
//		searchBar.setBounds(182, 17, 137, 22);
//	
//	}
//	
//	/* 현재페이지를 나타내는 숫자 */
//	public void beforeNum() {
//
//		String frontPageString = Integer.valueOf(nowPage).toString();
//		
//		beforeNum.setText(frontPageString);
//		beforeNum.setLayout(null);
//		beforeNum.setBounds(233, 108, 44, 14);
//		System.out.println(frontPageString);
//
//	}	


/* 최종페이지를 나타내는 숫자 */
//	public void afterNum(int postNo) {
//
//		int pageNo = nowPage;
//
//		int totalCount = new PagingController().totalWholePostNum(postNo);
//		
//		PagenationPost PagenationPost = new PagenationPost();
//		PageInfoPostDTO() pageInfo = PagenationPost.getPagenationPost(pageNo, totalCount, 5, 5);
//		String backPageString = Integer.valueOf(pageInfo.getMaxPage()).toString();
//
//		afterNum = new JLabel(backPageString);
//		afterNum.setLayout(null);
//		afterNum.setBounds(85, 4, 14, 14);
//
//	}

//	/* 게시글 내용을  나타냄 */
//	public void allBoardList(int postNo) {
//
//		
//		int pageNo = nowPage;
//		int y =  152;
//		
//		postListDTO = new PagingController().wholePostList(pageNo);
//		PostDTO postInfo = null;
//
//		for(int i = 0; i < postListDTO.size(); i++) {
//			
//			postInfo = postListDTO.get(i);
//			
//			postList = new JLabel[postListDTO.size()] {
//				postList[i] = new JLabel();
//				postList[i].
//				
//			}
//			
//		}


//		118

//
//		for(int i = 0; i < postListDTO.size(); i++) {
//			
//			postInfo = postListDTO.get(i);
//			
//			postList = new JLabel[postListDTO.size()];
//			postList[i] = new JLabel();
//			postList[i].setLayout(null);
//			postList[i].setIcon(new ImageIcon(""));
//			postList[i].setBounds(35, y, 431, 61);
//
//			nickName = new JLabel[postListDTO.size()];
//			nickName[i] = new JLabel();
//			nickName[i].setLayout(null);
//			nickName[i].setBounds(110, y + 10, 720, 35);
//			nickName[i].setText(postInfo.getMemberNickname());
//
//			content = new JLabel[postListDTO.size()];
//			content[i] = new JLabel();
//			content[i].setLayout(null);
//			content[i].setBounds(187, y + 10, 250, 35);
//			content[i].setText(postInfo.getCommentsContents());
//
//			updateBtn = new JButton[postListDTO.size()];
//			updateBtn[i] = new JButton();
//			updateBtn[i].setIcon(new ImageIcon("image/post/commentUpdateButton.png"));
//			updateBtn[i].setContentAreaFilled(false);
//			updateBtn[i].setBorderPainted(false);
//			updateBtn[i].setBounds(415, y + 37, 23, 23);
//			System.out.println("updateBtn[" + i + "] : " + postListDTO.get(i).getCommentsNo());
//
//			int getCommentsNo = postListDTO.get(i).getCommentsNo();
//			int getMemberNo = postListDTO.get(i).getMemberNo();
//
//
//			if(getMemberNo == 1 /* 로그인된 번호 */) {
//				updateBtn[i].addActionListener(new ActionListener() {
//
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						System.out.println("댓글 수정란 호출");
//						String text = (String)JOptionPane.showInputDialog("댓글 내용을 입력하세요.");
//						System.out.println(text);
//						CommentsDTO updateComment = new CommentsDTO();
//
//
//						updateComment.setCommentsNo(getCommentsNo);
//						updateComment.setMemberNo(getMemberNo);
//						updateComment.setCommentsContents(text);
//						//						System.out.println("conmmentListDTO CommentNo  : " + commentListDTO.get(i).getCommentsNo());
//						//						System.out.println("conmmentListDTO MemberNo  : " + commentListDTO.get(i).getMemberNo());
//						System.out.println("getCommentsNo : " + getCommentsNo);
//
//
//						ContactController2 contactController2 = new ContactController2();
//						contactController2.updateComment(updateComment);
//
//
//					}
//				});
//			}









//		
//	}
//}

































