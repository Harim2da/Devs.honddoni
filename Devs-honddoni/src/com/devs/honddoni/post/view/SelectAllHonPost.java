package com.devs.honddoni.post.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.common.font.FontManager;
import com.devs.honddoni.common.mainframe.MainFrame;
import com.devs.honddoni.member.view.MyPage;
import com.devs.honddoni.post.controller.GetFilter;
import com.devs.honddoni.search.view.MainBottomPanel;

public class SelectAllHonPost extends JPanel{

	private MainFrame frame; 
	private SelectAllHonPost selectAllHonPost;
	private JPanel topPanel;
	private JButton myHonddoniBtn;								//마이페이지 이동 버튼
	private JButton searchHonddoniBtn;							//게시글 작성페이지 이동 버튼
	private JButton homeBtn;									//메인화면이동 버튼
	private JButton interestingBtn;								//관심글 목록 이동 버튼
	private JButton noticeBtn;
	private JLabel topLabel;
	private JPanel bottomPanel;  								//하단 패널 	
	private JLabel mapLabel;									// 지역선택용 라벨 
	private JLabel searchLabel; 								// 검색창 라벨
	private JButton aim;       								    // 검색 버튼
	private JTextField searching; 								// 검색어 입력창
	private JLabel categoryPick; 								// 카테고리 선택 라벨
	private PostDTO postDTO = new PostDTO();


	
	public SelectAllHonPost(MainFrame frame) {

		this.frame = frame;
		this.selectAllHonPost = this;
		
		/*상단 패널 및 버튼*/
		topPanel();
		myHonddoniBtn();
		searchHonddoniBtn();
		homeBtn();
		interestingBtn();
		noticeBtn();
				
		BottomPanel();
		addComponents();
		searching();
		selectLocal();
		
	}
	
	private void topPanel() {

		topPanel = new JPanel();
		topPanel.setBounds(0, 0, 500, 100);
		topPanel.setLayout(null);
		topPanel.setBackground(Color.WHITE);
		frame.add(topPanel);
		
		topLabel = new JLabel();
		topLabel.setBounds(0, 0, 500, 100);
		topLabel.setIcon(new ImageIcon("image/common/toppanel/backgroundImage.png"));
		topLabel.setVisible(true); 
		topPanel.add(topLabel);
		frame.repaint();
		
		
	}
	
	/* My혼또니(마이페이지 화면으로 이동) 버튼 */
	public void myHonddoniBtn() {

		myHonddoniBtn = new JButton();
		myHonddoniBtn.setBounds(171,23,56,56);
		myHonddoniBtn.setIcon(new ImageIcon("image/common/toppanel/myHonddoniBtn.png"));
		myHonddoniBtn.setBorderPainted(false);
		myHonddoniBtn.setContentAreaFilled(false);
		topLabel.add(myHonddoniBtn);
		
		
		myHonddoniBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.remove(bottomPanel);
				frame.remove(topPanel);
				topPanel.setVisible(false);
				bottomPanel.setVisible(false);
				new MyPage(frame);
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
		topLabel.add(searchHonddoniBtn);
		
		searchHonddoniBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.remove(bottomPanel);
				frame.remove(topPanel);
				topPanel.setVisible(false);
				bottomPanel.setVisible(false);
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
		topLabel.add(homeBtn);
		
		
		homeBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				frame.remove(bottomPanel);
				frame.remove(topPanel);
				topPanel.setVisible(false);
				bottomPanel.setVisible(false);
				new MainBottomPanel(frame);			
				frame.repaint();
				frame.revalidate();
				

			}
		});

	}

	/* 관심글 목록페이지로 이동하는 버튼 생성 */
	public void interestingBtn() {

		interestingBtn = new JButton("");
		interestingBtn.setBounds(362,23,56,56);
		interestingBtn.setIcon(new ImageIcon("image/common/toppanel/InterestingBtn.png"));
		interestingBtn.setBorderPainted(false);
		interestingBtn.setContentAreaFilled(false);
		topLabel.add(interestingBtn);
		
	}

	/* 공지사항목록을 조회할 수 있는 버튼 생성 */
	public void noticeBtn() {

		noticeBtn = new JButton("");
		noticeBtn.setBounds(426,23,56,56);
		noticeBtn.setIcon(new ImageIcon("image/common/toppanel/NoticeBtn.png"));
		noticeBtn.setBorderPainted(false);
		noticeBtn.setContentAreaFilled(false);
		topLabel.add(noticeBtn);
		
		noticeBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.remove(topPanel);
				frame.remove(bottomPanel);
				topPanel.setVisible(false);
				bottomPanel.setVisible(false);
				new PostNotice(frame);
				frame.repaint();
				frame.revalidate();
			}
		});

	}
	
	/* 하단 패널 */
	public void BottomPanel() {
		bottomPanel = new JPanel();
		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.WHITE);	
		
		searchLabel = new JLabel();   // 하단 패널 위 검색창
		searchLabel.setBackground(Color.WHITE);
		searchLabel.setLayout(null);
		searchLabel.setBounds(25, 15, 450, 63); 
		searchLabel.setIcon(new ImageIcon("image/search/searchBar.png"));
		
		mapLabel = new JLabel(""); // 하단 패널 위 지역 선택
		mapLabel.setBackground(Color.WHITE);
		mapLabel.setLayout(null);
		mapLabel.setBounds(25, 125, 450, 596);            
		mapLabel.setIcon(new ImageIcon("image/post/matchlocal.png"));
		
	}
	
	/* 패널과 라벨들 얹기 */
	private void addComponents() {
		frame.add(bottomPanel);
		bottomPanel.add(searchLabel);
		bottomPanel.add(mapLabel);
	
		frame.repaint();
		frame.revalidate();
	}
	
	/* 검색창 처리 */
	private void searching() {
		
		searching = new JTextField();
		searching.setBorder(null);
		searching.setOpaque(false);
		searching.setBounds(80, 16, 315, 28);
		searching.setColumns(20);
		searchLabel.add(searching);
		
		aim = new JButton();
		aim.setBounds(22, 13, 41, 41);
		aim.setBorderPainted(false);
		aim.setOpaque(false);
		aim.setContentAreaFilled(false);
		searchLabel.add(aim);
	 
		
	}
	
	
	/* 조회할 지역 선택 */
	private void selectLocal() {
		/* 지역 선택 버튼 */
		JButton btn1 = new JButton();   
		btn1.setBounds(340, 80, 65, 65);
		btn1.setBorderPainted(false);
		btn1.setOpaque(false);
		btn1.setContentAreaFilled(false);
		mapLabel.add(btn1);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				GetFilter getLocalName = GetFilter.getInstance();
				getLocalName.setLocalName("강릉");
				categoryPick();
				bottomPanel.remove(mapLabel);
			}
		});

		/*지도 위 담양 버튼*/
		JButton btn2 = new JButton();   
		btn2.setBounds(50, 395, 65, 65);
		btn2.setBorderPainted(false);
		btn2.setOpaque(false);
		btn2.setContentAreaFilled(false);
		mapLabel.add(btn2);

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				GetFilter getLocalName = GetFilter.getInstance();
				getLocalName.setLocalName("담양");
				categoryPick();
				bottomPanel.remove(mapLabel);
			}
		});

		/*지도 위 대구 버튼*/
		JButton btn3 = new JButton();   
		btn3.setBounds(355, 295, 65, 65);
		btn3.setBorderPainted(false);
		btn3.setOpaque(false);
		btn3.setContentAreaFilled(false);
		mapLabel.add(btn3);

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				GetFilter getLocalName = GetFilter.getInstance();
				getLocalName.setLocalName("대구");
				categoryPick();
				bottomPanel.remove(mapLabel);
			}
		});
		/*지도 위 부산 버튼*/
		JButton btn4 = new JButton();   
		btn4.setBounds(345, 405, 65, 65);
		btn4.setBorderPainted(false);
		btn4.setOpaque(false);
		btn4.setContentAreaFilled(false);
		mapLabel.add(btn4);

		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				GetFilter getLocalName = GetFilter.getInstance();
				getLocalName.setLocalName("부산");
				categoryPick();
				bottomPanel.remove(mapLabel);
			}
		});

		/*지도 위 서울 버튼*/
		JButton btn5 = new JButton();   
		btn5.setBounds(80, 72, 61, 61);
		btn5.setBorderPainted(false);
		btn5.setOpaque(false);
		btn5.setContentAreaFilled(false);
		mapLabel.add(btn5);

		btn5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				GetFilter getLocalName = GetFilter.getInstance();
				getLocalName.setLocalName("서울");
				categoryPick();
				bottomPanel.remove(mapLabel);
			}
		});

		/*지도 위 인천 버튼*/
		JButton btn6 = new JButton();   
		btn6.setBounds(15, 125, 60, 60);
		btn6.setBorderPainted(false);
		btn6.setOpaque(false);
		btn6.setContentAreaFilled(false);
		mapLabel.add(btn6);

		btn6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				GetFilter getLocalName = GetFilter.getInstance();
				getLocalName.setLocalName("인천");
				categoryPick();
				bottomPanel.remove(mapLabel);
			}
		});

		/*지도 위 순천 버튼*/
		JButton btn7 = new JButton();   
		btn7.setBounds(242, 440, 60, 60);
		btn7.setBorderPainted(false);
		btn7.setOpaque(false);
		btn7.setContentAreaFilled(false);
		mapLabel.add(btn7);

		btn7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				GetFilter getLocalName = GetFilter.getInstance();
				getLocalName.setLocalName("순천");
				categoryPick();
				bottomPanel.remove(mapLabel);
			}
		});

		/*지도 위 전주 버튼*/
		JButton btn8 = new JButton();   
		btn8.setBounds(38, 310, 62, 62);
		btn8.setBorderPainted(false);
		btn8.setOpaque(false);
		btn8.setContentAreaFilled(false);
		mapLabel.add(btn8);

		btn8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				GetFilter getLocalName = GetFilter.getInstance();
				getLocalName.setLocalName("전주");
				categoryPick();
				bottomPanel.remove(mapLabel);
			}
		});

		/*지도 위 제주 버튼*/
		JButton btn9 = new JButton();   
		btn9.setBounds(195, 510, 63, 63);
		btn9.setBorderPainted(false);
		btn9.setOpaque(false);
		btn9.setContentAreaFilled(false);
		mapLabel.add(btn9);

		btn9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				GetFilter getLocalName = GetFilter.getInstance();
				getLocalName.setLocalName("제주");
				categoryPick();
				bottomPanel.remove(mapLabel);
			}
		});

		/*지도 위 천안 버튼*/
		JButton btn10 = new JButton();   
		btn10.setBounds(77, 223, 63, 63);
		btn10.setBorderPainted(false);
		btn10.setOpaque(false);
		btn10.setContentAreaFilled(false);
		mapLabel.add(btn10);

		btn10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				GetFilter getLocalName = GetFilter.getInstance();
				getLocalName.setLocalName("천안");
				categoryPick();
				bottomPanel.remove(mapLabel);

			}
		});
	} // 지역 선택 종료

	
	/* 카테고리 선택 */
	private void categoryPick() {
		bottomPanel.repaint();
		bottomPanel.add(searchLabel);
		categoryPick = new JLabel();
		categoryPick.setBackground(Color.WHITE);
		categoryPick.setLayout(null);
		categoryPick.setBounds(25, 125, 450, 596);      
		bottomPanel.add(categoryPick);
		
		
		JButton eatbtn = new JButton();
		JButton walkbtn = new JButton();
		JButton activebtn = new JButton();
		JButton hobbybtn = new JButton();
		JButton gamebtn = new JButton();
		JButton studybtn = new JButton();
		
		/* 맛집 탐방 */
		eatbtn.setBounds(50, 23, 137, 161);
		eatbtn.setIcon(new ImageIcon("image/post/categoryfood.png"));
		eatbtn.setBorderPainted(false);
		eatbtn.setOpaque(false);
		eatbtn.setContentAreaFilled(false);
		categoryPick.add(eatbtn);
		
		eatbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GetFilter getCategoryName = GetFilter.getInstance();
				getCategoryName.setCategoryName("맛집탐방");
				
				frame.remove(topPanel);
				frame.remove(bottomPanel);
				topPanel.setVisible(false);
				bottomPanel.setVisible(false);
				new SelectAllHonPost2(frame);
				frame.repaint();
				frame.revalidate();
				
			}
		});
		
		/* 산책 */
		walkbtn.setBounds(255, 23, 137, 161);
		walkbtn.setIcon(new ImageIcon("image/post/categorysports.png"));
		walkbtn.setBorderPainted(false);
		walkbtn.setOpaque(false);
		walkbtn.setContentAreaFilled(false);
		categoryPick.add(walkbtn);
		
		walkbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GetFilter getCategoryName = GetFilter.getInstance();
				getCategoryName.setCategoryName("산책");
				frame.remove(topPanel);
				frame.remove(bottomPanel);
				topPanel.setVisible(false);
				bottomPanel.setVisible(false);
				new SelectAllHonPost2(frame);
				frame.repaint();
				frame.revalidate();				
			}
		});
		
		/* 활동 */
		activebtn.setBounds(50, 203, 137, 161);
		activebtn.setIcon(new ImageIcon("image/post/categoryhonddoni.png"));
		activebtn.setBorderPainted(false);
		activebtn.setOpaque(false);
		activebtn.setContentAreaFilled(false);
		categoryPick.add(activebtn);
		
		activebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GetFilter getCategoryName = GetFilter.getInstance();
				getCategoryName.setCategoryName("활동");
				frame.remove(topPanel);
				frame.remove(bottomPanel);
				topPanel.setVisible(false);
				bottomPanel.setVisible(false);
				new SelectAllHonPost2(frame);
				frame.repaint();
				frame.revalidate();				
			}
		});
		
		/* 취미 */
		hobbybtn.setBounds(255, 203, 137, 161);
		hobbybtn.setIcon(new ImageIcon("image/post/categorypuzzle.png"));
		hobbybtn.setBorderPainted(false);
		hobbybtn.setOpaque(false);
		hobbybtn.setContentAreaFilled(false);
		categoryPick.add(hobbybtn);
		
		hobbybtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GetFilter getCategoryName = GetFilter.getInstance();
				getCategoryName.setCategoryName("취미");
				frame.remove(topPanel);
				frame.remove(bottomPanel);
				topPanel.setVisible(false);
				bottomPanel.setVisible(false);
				new SelectAllHonPost2(frame);
				frame.repaint();
				frame.revalidate();				
			}
		});
		
		/* 게임 */
		gamebtn.setBounds(50, 383, 137, 161);
		gamebtn.setIcon(new ImageIcon("image/post/categoryminigame.png"));
		gamebtn.setBorderPainted(false);
		gamebtn.setOpaque(false);
		gamebtn.setContentAreaFilled(false);
		categoryPick.add(gamebtn);
		
		gamebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GetFilter getCategoryName = GetFilter.getInstance();
				getCategoryName.setCategoryName("게임");
				frame.remove(topPanel);
				frame.remove(bottomPanel);
				topPanel.setVisible(false);
				bottomPanel.setVisible(false);
				new SelectAllHonPost2(frame);
				frame.repaint();
				frame.revalidate();				
			}
		});
		
		/* 스터디 */
		studybtn.setBounds(255, 383, 137, 161);
		studybtn.setIcon(new ImageIcon("image/post/categoryfindpost.png"));
		studybtn.setBorderPainted(false);
		studybtn.setOpaque(false);
		studybtn.setContentAreaFilled(false);
		categoryPick.add(studybtn);
		
		studybtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GetFilter getCategoryName = GetFilter.getInstance();
				getCategoryName.setCategoryName("스터디");
				frame.remove(topPanel);
				frame.remove(bottomPanel);
				topPanel.setVisible(false);
				bottomPanel.setVisible(false);
				new SelectAllHonPost2(frame);
				frame.repaint();
				frame.revalidate();				
			}
		});
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
