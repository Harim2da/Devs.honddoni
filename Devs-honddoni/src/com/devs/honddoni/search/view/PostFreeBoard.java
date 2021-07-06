package com.devs.honddoni.search.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.common.mainframe.MainFrame;
import com.devs.honddoni.member.view.MyPage;
import com.devs.honddoni.post.view.PostActionCategory;
import com.devs.honddoni.post.view.PostHonddoni;
import com.devs.honddoni.search.controller.SearchController;


public class PostFreeBoard extends JPanel {

	private PostFreeBoard postFreeBoard;
	private MainFrame frame;

	private JPanel upPanel;  // 상단 패널
	private JPanel bottomPanel; // 하단 패널
	private JLabel bottomLabel; // 하단 게시판 라벨
	private JButton postTypebtn; // 자유 게시판 버튼
	private JTextField postTitle; // 게시글 제목
	private JTextArea postContents; // 게시글 내용 
	private JButton postbtn; //게시글 작성 완료 버튼
	private PostDTO postDTO = new PostDTO();
//	private SearchController searchController = new SearchController();

	private JButton myHonddoniBtn;								//마이페이지 이동 버튼
	private JButton searchHonddoniBtn;							//게시글 작성페이지 이동 버튼
	private JButton homeBtn;									//메인화면이동 버튼
	private JButton interestingBtn;								//관심글 목록 이동 버튼
	private JButton noticeBtn;									//공지사항 목록 이동 버튼
	private JLabel backgroundImage;								//로고 포함 테두리 배경 (디자인용)

	
	

	/*자유 게시글 작성 화면 불러오기*/
	public PostFreeBoard(MainFrame frame) {

		this.frame = frame;
		this.postFreeBoard = this;

		this.setBounds(0, 0, 500, 870);
		this.setLayout(null);

		frame.add(this);

		// 패널
		upPanel();
		bottomPanel();
		
		//상단패널
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
		
		
		//하단패널
		selectPost();
		createPostTitle();
		postContents();
		postButton();

		addPostComponent();

		this.add(upPanel);
		this.add(bottomPanel);
		
//		this.setVisible(true);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
	
		/*하단 패널 생성*/
		public void bottomPanel() {
			bottomPanel = new JPanel();
			bottomPanel.setBounds(0, 100, 500, 770);
			bottomPanel.setLayout(null);
			bottomPanel.setBackground(Color.WHITE);		

			/* 하단 패널 위 라벨 생성*/
			bottomLabel = new JLabel("");
			bottomLabel.setBackground(Color.WHITE);
			bottomLabel.setLayout(null);
			bottomLabel.setBounds(35, 14, 431, 648);            
			bottomLabel.setIcon(new ImageIcon("image/post/postbtmpanel.png"));

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

		/* 게시글 작성 화면 내 쌓아올리기  */
		public void addPostComponent() {

			this.add(upPanel);
			this.add(bottomPanel);

			bottomPanel.add(postTypebtn);
			bottomPanel.add(postTitle);
			bottomPanel.add(postContents);
			bottomPanel.add(postbtn);
			bottomPanel.add(bottomLabel);

			this.repaint();
			this.revalidate();

		}

		/* 게시판 종류 선택 - 자유 */
		private void selectPost() {
			bottomPanel();
			postTypebtn = new JButton();
			postTypebtn.setIcon(new ImageIcon("image/post/postcategoryfree.png"));
			postTypebtn.setContentAreaFilled(false);
			postTypebtn.setBorderPainted(false);
			postTypebtn.setBounds(43, 20, 56, 30);


			postTypebtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// 혼또니게시판 전환
					System.out.println("혼또니게시판 전환");
				}
			});
		}

		/*자유 게시판 제목 작성*/
		private void createPostTitle() {
			postTitle = new JTextField();
			postTitle.setBorder(null);
			postTitle.setDisabledTextColor(Color.WHITE);
			postTitle.setOpaque(false);
			postTitle.setBounds(113, 25, 322, 28);	
			postTitle.setColumns(10);
		}

		/* 게시글 작성*/
		private void postContents() {
			postContents = new JTextArea();
			postContents.setOpaque(false);
			postContents.setBounds(59, 305, 399, 273);

		}



		/* 게시글 작성 완료 버튼*/
		private void postButton() {
			postbtn = new JButton();
			postbtn.setBounds(129, 684, 263, 41);
			postbtn.setIcon(new ImageIcon("image/post/postbutton.png"));
			postbtn.setContentAreaFilled(false);
			postbtn.setBorderPainted(false);
			postbtn.setOpaque(false);


			postbtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					postDTO = new PostDTO();


					/* 게시글 정보 담기 : 게시글 제목, 내용, 게시판 종류*/
					postDTO.setPostName(postTitle.getText()); //게시글 제목
					postDTO.setPostContents(postContents.getText()); // 게시글 내용
					postDTO.setPostCategory("자유");
					
					System.out.println("게시글 작성 완료");

				}
			});


		}



	}












	//--------------------------------------------------------------
	////수정 전 
	//	
	//		private PostFreeBoard postFreeBoard;
	//		private MainFrame frame;
	//
	////		private JFrame mainFrame; // 메인프레임
	//		private JPanel topPanel;  // 상단 패널
	//		private JPanel bottomPanel; // 하단 패널
	//		private JLabel bottomLabel; // 하단 게시판 라벨
	//		private JButton postFreeBtn; // 혼또니 게시판 버튼 -> 자유로
	//		private JTextField postTitle; // 게시글 제목
	//		private JTextArea postContents; // 게시글 내용 
	//		private JButton postbtn; //게시글 작성 완료 버튼
	//		private PostDTO postDTO = new PostDTO();
	//		
	//		
	//
	//
	//		/*자유 게시글 작성 화면 불러오기*/
	//		public PostFreeBoard(MainFrame frame) {
	//			
	//			
	//			postFreeBoard = this;
	//			this.frame = frame;
	//			this.postFreeBoard = this;
	////			this.setBounds(100, 100, 516, 909);
	////			this.setLayout(null);
	////			topPanel();
	//			selectPost();
	//			createPostTitle();
	//			postContents();
	//			postButton();
	//		
	//			addPostComponent();
	//			
	//			this.setVisible(true);
	////			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//
	//		}
	//
	////		/*상단 패널 생성*/
	////		public void topPanel() {
	////			topPanel = new JPanel();
	////			topPanel.setBounds(0, 0, 500, 100);
	////			topPanel.setLayout(null);
	////			topPanel.setBackground(Color.WHITE);
	////
	////		}
	//
	//		/*하단 패널 생성*/
	//		public void bottomPanel() {
	//			bottomPanel = new JPanel();
	//			bottomPanel.setBounds(0, 100, 500, 770);
	//			bottomPanel.setLayout(null);
	//			bottomPanel.setBackground(Color.WHITE);		
	//
	//			/* 하단 패널 위 라벨 생성*/
	//			bottomLabel = new JLabel("");
	//			bottomLabel.setBackground(Color.WHITE);
	//			bottomLabel.setLayout(null);
	//			bottomLabel.setBounds(35, 14, 431, 648);            
	//			bottomLabel.setIcon(new ImageIcon("image/post/postbtmpanel.png"));
	//
	//		}
	//
	//
	//		/* 게시글 작성 화면 내 쌓아올리기  */
	//		public void addPostComponent() {
	//
	//			this.add(topPanel);
	//			this.add(bottomPanel);
	//			
	//			bottomPanel.add(postFreeBtn);
	//			bottomPanel.add(postTitle);
	//			bottomPanel.add(postContents);
	//			bottomPanel.add(postbtn);
	//			bottomPanel.add(bottomLabel);
	//			
	//			this.repaint();
	//			this.revalidate();
	//
	//		}
	//
	//		/*게시판 종류 선택 - 자유*/
	//		private void selectPost() {
	//			bottomPanel();
	//			postFreeBtn = new JButton();
	//			postFreeBtn.setIcon(new ImageIcon("image/search/freebutton.png"));
	//			postFreeBtn.setContentAreaFilled(false);
	//			postFreeBtn.setBorderPainted(false);
	//			postFreeBtn.setBounds(43, 20, 56, 30);
	//
	//
	//			postFreeBtn.addActionListener(new ActionListener() {
	//
	//				@Override
	//				public void actionPerformed(ActionEvent e) {
	//					// 자유게시판으로 전환
	//					System.out.println("자유게시판 전환");
	//				}
	//			});
	//		}
	//
	//		/*자유 게시판 제목 작성*/
	//		private void createPostTitle() {
	//			postTitle = new JTextField();
	//			postTitle.setBorder(null);
	//			postTitle.setDisabledTextColor(Color.WHITE);
	//			postTitle.setOpaque(false);
	//			postTitle.setBounds(113, 25, 322, 28);	
	//			postTitle.setColumns(10);
	//		}
	//
	//		/* 게시글 작성*/
	//		private void postContents() {
	//			postContents = new JTextArea();
	//			postContents.setOpaque(false);
	//			postContents.setBounds(59, 305, 399, 273);
	//
	//		}
	//
	//		
	//		/* 게시글 작성 완료 버튼*/
	//		private void postButton() {
	//			postbtn = new JButton();
	//			postbtn.setBounds(129, 684, 263, 41);
	//			postbtn.setIcon(new ImageIcon("image/post/postbutton.png"));
	//			postbtn.setContentAreaFilled(false);
	//			postbtn.setBorderPainted(false);
	//			postbtn.setOpaque(false);
	//
	//
	//			postbtn.addActionListener(new ActionListener() {
	//
	//				@Override
	//				public void actionPerformed(ActionEvent e) {
	//
	//					postDTO = new PostDTO();
	//
	//
	//					/* 게시글 정보 담기 : 게시글 제목, 내용  */
	//					postDTO.setPostName(postTitle.getText()); //게시글 제목
	//					postDTO.setPostContents(postContents.getText()); // 게시글 내용
	//					postDTO.setPostCategory("자유");
	//					
	//					System.out.println("호출");
	//				}
	//			});
	//
	//
	//		}
	//
	//	}











