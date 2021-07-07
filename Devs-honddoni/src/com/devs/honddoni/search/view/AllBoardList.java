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
import com.devs.honddoni.member.view.MyPage;
import com.devs.honddoni.post.controller.GetFilter;
import com.devs.honddoni.post.controller.PagingController;
import com.devs.honddoni.post.view.PostHonddoni;
import com.devs.honddoni.post.view.SelectAllHonPost2;
import com.devs.honddoni.post.view.SelectAllHonPost3;

public class AllBoardList extends JPanel {

	private AllBoardList allBoardList;
	private MainFrame frame;

	private JPanel upPanel;
	private JPanel bottomPanel;
	private JLabel searchLabel;
	private JButton aim;
	private JTextField searching;
	private JLabel pageLongbarLabel;				//페이지표기 바
	private JLabel beforeNumber = new JLabel("");
	private JLabel afterNumber;
	public static int nowPage2 = 1;
	private JButton beforeBtn = new JButton(); 		// 앞페이지 버튼
	private JButton afterBtn = new JButton(); 		// 뒷 페이지 버튼
	private JLabel[] postList;	
	private List<PostDTO> postListDTO = null;
	private JLabel[] profilePictrue; 				//프로필
	private JLabel[] nickName; 						// 닉네임
	private JLabel[] postTitle; 					// 게시글 제목
	
	private JButton myHonddoniBtn;  				// 마이페이지 이동 버튼
	private JButton searchHonddoniBtn;				// 게시글 작성페이지 이동 버튼
	private JButton homeBtn;		 				// 메인화면이동 버튼
	private JButton interestingBtn;	 				// 관심글 목록 이동 버튼
	private JButton noticeBtn;		 				// 공지사항 목록 이동 버튼
	private JLabel backgroundImage;	 				// 로고 포함 테두리 배경 (디자인용)
	
	GetFilter getName = GetFilter.getInstance();

	/* 프레임을 제외한 나머지를 합친 것 */
	public AllBoardList(MainFrame frame) {

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
					AllBoardList2 sf = new AllBoardList2(frame);
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
				AllBoardList2 sf = new AllBoardList2(frame);
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

			postInfo = postListDTO.get(i);
			profilePictrue = new JLabel[postListDTO.size()];
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
}




