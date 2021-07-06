package com.devs.honddoni.post.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.common.font.FontManager;
import com.devs.honddoni.common.mainframe.MainFrame;
import com.devs.honddoni.member.view.MyPage;
import com.devs.honddoni.post.controller.ContactController;
import com.devs.honddoni.search.view.MainBottomPanel;

public class PostHonddoni extends JPanel {
	
	private PostHonddoni postHonddoni;
	private MainFrame frame;
	
//	private JFrame mainFrame; // 메인프레임
	private JPanel topPanel;  // 상단 패널
	private JPanel bottomPanel; // 하단 패널
	private JLabel bottomLabel; // 하단 게시판 라벨(그림 배경)
	private JButton postTypebtn; // 혼또니 게시판 버튼
	private JTextField postTitle; // 게시글 제목
	private JButton localSelectbtn; // 지역선택 버튼
	private JLayeredPane pann; // 레이어 가능한 팝업 팬
	private JLabel koreaMapLabel; //지도 라벨
	private JButton closeMap;
	private JTextField joinmember; // 모일 인원 
	private JTextArea postContents; // 게시글 내용 
	private JComboBox selectCategorycombo = PostActionCategory.getInstance(); //카테고리 콤보박스
	private JButton postbtn; //게시글 작성 완료 버튼
	private JComboBox meetingYear; // 만남 년도 콤보박스
	private JComboBox meetingMonth; // 만남 월 콤보박스
	private JComboBox meetingDay; // 만남 일 콤보박스
	private JComboBox meetingHour; // 만남 시간 콤보박스
	private JComboBox meetingMinutes; // 만남 분 콤보박스
	private PostDTO postDTO = new PostDTO();
	private ContactController contactController = new ContactController();
	private String localpick = "";  // 지도 위 선택한 지역
	private JButton myHonddoniBtn;								//마이페이지 이동 버튼
	private JButton searchHonddoniBtn;							//게시글 작성페이지 이동 버튼
	private JButton homeBtn;									//메인화면이동 버튼
	private JButton interestingBtn;								//관심글 목록 이동 버튼
	private JButton noticeBtn;									//공지사항 목록 이동 버튼
	private JLabel backgroundImage;	
	FontManager font = new FontManager();

	/*혼또니 게시글 작성 화면 불러오기*/
	public PostHonddoni(MainFrame frame) {
		
		this.frame = frame;
		this.postHonddoni = this;
		
		topPanel();
		bottomPanel();
		myHonddoniBtn();
		searchHonddoniBtn();
		homeBtn();
		interestingBtn();
		noticeBtn();
		selectPost();
		createPostTitle();
		selectLocal();
		insertJoinMember();
		postContents();
		postButton();
		postMeetingTime();
		addPostComponent();
		
		frame.add(topPanel);
		frame.add(bottomPanel);
//		this.setVisible(true);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/*상단 패널 생성*/
	public void topPanel() {
		topPanel = new JPanel();
		topPanel.setBounds(0, 0, 500, 100);
		topPanel.setLayout(null);
		topPanel.setBackground(Color.WHITE);
		
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
				topPanel.setVisible(false);
				frame.remove(topPanel);
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
				topPanel.setVisible(false);
				frame.remove(topPanel);
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
				topPanel.setVisible(false);
				frame.remove(topPanel);
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

	/* 팝업용 패널 생성 */
	public void popupPanel() {

		pann = new JLayeredPane();
		pann.setBounds(0, 30, 500, 670);
		frame.add(pann);

	}

	/* 게시글 작성 화면 내 쌓아올리기  */
	public void addPostComponent() {

		topPanel.add(myHonddoniBtn);
		topPanel.add(searchHonddoniBtn);
		topPanel.add(homeBtn);
		topPanel.add(interestingBtn);
		topPanel.add(noticeBtn);
		topPanel.add(backgroundImage);
		bottomPanel.add(postTypebtn);
		bottomPanel.add(postTitle);
		bottomPanel.add(localSelectbtn);
		bottomPanel.add(joinmember);	
		bottomPanel.add(selectCategorycombo);
		bottomPanel.add(postContents);
		bottomPanel.add(postbtn);
		bottomPanel.add(bottomLabel);
		frame.add(topPanel);
		frame.add(bottomPanel);
		frame.repaint();
		frame.revalidate();

	}

	/*게시판 종류 선택 - 혼또니*/
	private void selectPost() {
		bottomPanel();
		postTypebtn = new JButton();
		postTypebtn.setIcon(new ImageIcon("image/post/postcategory.png"));
		postTypebtn.setContentAreaFilled(false);
		postTypebtn.setBorderPainted(false);
		postTypebtn.setBounds(43, 20, 56, 30);


		postTypebtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 자유게시판으로 전환
				System.out.println("자유게시판 전환");
			}
		});
	}

	/*혼또니 게시판 제목 작성*/
	private void createPostTitle() {
		postTitle = new JTextField();
		postTitle.setBorder(null);
		postTitle.setDisabledTextColor(Color.WHITE);
		postTitle.setOpaque(false);
		postTitle.setBounds(113, 25, 322, 28);	// 폰트 크기 키우면 y축 위치 조정
		postTitle.setColumns(10);
		postTitle.setFont(font.customFont12);
	}

	/*지역 선택 버튼*/
	private void selectLocal() {
		localSelectbtn = new JButton("");
		localSelectbtn.setOpaque(false);
		localSelectbtn.setContentAreaFilled(false);
		localSelectbtn.setBorderPainted(false);
		localSelectbtn.setBounds(105, 78, 125, 31);


		pann = new JLayeredPane();
		pann.setBounds(0, 30, 500, 670);
		frame.add(pann);



		localSelectbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btnstop();
				koreaMap();

			}
		});


	}

	/* 지도 관련 라벨과 버튼 등 실행*/
	private void koreaMap() {

		/*지도 패널 생성*/
		koreaMapLabel = new JLabel();
		koreaMapLabel.setBackground(Color.WHITE);
		koreaMapLabel.setLayout(null);
		koreaMapLabel.setBounds(29, 65, 442, 595);
		koreaMapLabel.setIcon(new ImageIcon("image/post/matchlocal.png"));
		pann.add(koreaMapLabel, JLayeredPane.DRAG_LAYER);

		/*패널 창 닫기 버튼*/
		closeMap = new JButton();
		closeMap.setBounds(423, 2, 15, 15);
		closeMap.setBorderPainted(false);
		closeMap.setOpaque(false);
		closeMap.setContentAreaFilled(false);
		closeMap.setIcon(new ImageIcon("image/post/canclebtn.png"));
		koreaMapLabel.add(closeMap);

		frame.repaint();

		closeMap.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				change();
				btnstart();
			}

		});

		/* 지역 선택 버튼 */
		JButton btn1 = new JButton();   
		btn1.setBounds(350, 70, 65, 65);
		btn1.setBorderPainted(false);
		btn1.setOpaque(false);
		btn1.setContentAreaFilled(false);
		koreaMapLabel.add(btn1);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				localpick = "강릉";
				change();
				btnstart();
			}
		});

		/*지도 위 담양 버튼*/
		JButton btn2 = new JButton();   
		btn2.setBounds(50, 400, 65, 65);
		btn2.setBorderPainted(false);
		btn2.setOpaque(false);
		btn2.setContentAreaFilled(false);
		koreaMapLabel.add(btn2);

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				localpick = "담양";
				change();
				btnstart();
			}
		});

		/*지도 위 대구 버튼*/
		JButton btn3 = new JButton();   
		btn3.setBounds(355, 300, 65, 65);
		btn3.setBorderPainted(false);
		btn3.setOpaque(false);
		btn3.setContentAreaFilled(false);
		koreaMapLabel.add(btn3);

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				localpick = "대구";
				change();
				btnstart();
			}
		});
		/*지도 위 부산 버튼*/
		JButton btn4 = new JButton();   
		btn4.setBounds(350, 410, 65, 65);
		btn4.setBorderPainted(false);
		btn4.setOpaque(false);
		btn4.setContentAreaFilled(false);
		koreaMapLabel.add(btn4);

		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				localpick = "부산";
				change();
				btnstart();
			}
		});

		/*지도 위 서울 버튼*/
		JButton btn5 = new JButton();   
		btn5.setBounds(80, 72, 63, 63);
		btn5.setBorderPainted(false);
		btn5.setOpaque(false);
		btn5.setContentAreaFilled(false);
		koreaMapLabel.add(btn5);

		btn5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				localpick = "서울";
				change();
				btnstart();
			}
		});

		/*지도 위 인천 버튼*/
		JButton btn6 = new JButton();   
		btn6.setBounds(15, 125, 60, 60);
		btn6.setBorderPainted(false);
		btn6.setOpaque(false);
		btn6.setContentAreaFilled(false);
		koreaMapLabel.add(btn6);

		btn6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				localpick = "인천";
				change();
				btnstart();
			}
		});

		/*지도 위 순천 버튼*/
		JButton btn7 = new JButton();   
		btn7.setBounds(242, 440, 60, 60);
		btn7.setBorderPainted(false);
		btn7.setOpaque(false);
		btn7.setContentAreaFilled(false);
		koreaMapLabel.add(btn7);

		btn7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				localpick = "순천";
				change();
				btnstart();
			}
		});

		/*지도 위 전주 버튼*/
		JButton btn8 = new JButton();   
		btn8.setBounds(38, 310, 63, 63);
		btn8.setBorderPainted(false);
		btn8.setOpaque(false);
		btn8.setContentAreaFilled(false);
		koreaMapLabel.add(btn8);

		btn8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				localpick = "전주";
				change();
				btnstart();
			}
		});

		/*지도 위 제주 버튼*/
		JButton btn9 = new JButton();   
		btn9.setBounds(195, 510, 63, 63);
		btn9.setBorderPainted(false);
		btn9.setOpaque(false);
		btn9.setContentAreaFilled(false);
		koreaMapLabel.add(btn9);

		btn9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				localpick = "제주";
				change();
				btnstart();
			}
		});

		/*지도 위 천안 버튼*/
		JButton btn10 = new JButton();   
		btn10.setBounds(77, 223, 63, 63);
		btn10.setBorderPainted(false);
		btn10.setOpaque(false);
		btn10.setContentAreaFilled(false);
		koreaMapLabel.add(btn10);

		btn10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				localpick = "천안";
				change();
				btnstart();
			}
		});

	} // 지도 메소드 종료


	/* 팝업 종료 */
	public void change() {
		koreaMapLabel.setVisible(false);
		pann.setVisible(false);

	}

	/*팝업 화면 실행 시 버튼 및 기타 비활성화*/
	private void btnstop() {
		postTitle.setVisible(false);
		localSelectbtn.setVisible(false);
		joinmember.setVisible(false);
		selectCategorycombo.setVisible(false);
		meetingYear.setVisible(false);
		meetingMonth.setVisible(false);
		meetingDay.setVisible(false);
		meetingHour.setVisible(false);
		meetingMinutes.setVisible(false);
		postContents.setVisible(false);
		postTypebtn.setVisible(false);
		postbtn.setEnabled(false);
	}

	/*기존 게시글 작성 화면 재활성화*/
	private void btnstart() {
		postTitle.setVisible(true);
		localSelectbtn.setVisible(true);
		joinmember.setVisible(true);
		selectCategorycombo.setVisible(true);
		meetingYear.setVisible(true);
		meetingMonth.setVisible(true);
		meetingDay.setVisible(true);
		meetingHour.setVisible(true);
		meetingMinutes.setVisible(true);
		postContents.setVisible(true);
		postTypebtn.setVisible(true);
		postbtn.setEnabled(true);
		localSelectbtn.setText(localpick);
		//		System.out.println("실행확인");
	}

	/*모집 인원 기입*/
	private void insertJoinMember() {
		joinmember = new JTextField();
		joinmember.setBorder(null);
		joinmember.setOpaque(false);
		joinmember.setBounds(327, 90, 108, 28); // 폰트 크기 키우면 y축 위치 조정
		joinmember.setColumns(10);
		joinmember.setFont(font.customFont12);
	}

	/* 게시글 작성*/
	private void postContents() {
		postContents = new JTextArea();
		postContents.setOpaque(false);
		postContents.setBounds(59, 305, 399, 273);
		postContents.setFont(font.customFont12);

	}

	/* 만날 일시 설정 콤보박스*/
	private void postMeetingTime() {

		String[] year = new String[16];
		for(int i = 0; i <year.length; i++) {
			if(i == 0) {
				year[i] ="";
			} else {
				year[i] = 20 + i + "" ;
			}
		}
		meetingYear = new JComboBox(year);	
		meetingYear.setBounds(102, 211, 42, 28);
		meetingYear.setSelectedIndex(0);
		meetingYear.setFont(font.customFont12);



		String[] month = new String[13];
		for(int i = 0; i <month.length; i++) {
			if(i == 0) {
				month[i] ="";
			} else if(i < 10) {
				month[i] = "0" + i ;
			} else {
				month[i] = i + "";
			}
		}
		meetingMonth = new JComboBox(month);
		meetingMonth.setBounds(170, 211, 39, 28);
		meetingMonth.setSelectedIndex(0);
		meetingMonth.setFont(font.customFont12);


		String[] day = new String[32];
		for(int i = 0; i <day.length; i++) {
			if(i == 0) {
				month[i] ="";
			} else if(i < 10) {
				day[i] = "0" + i +"";
			} else {
				day[i] = i +"";
			}
		}
		meetingDay = new JComboBox(day);
		meetingDay.setBounds(238, 211, 39, 28);
		meetingDay.setSelectedIndex(0);
		meetingDay.setFont(font.customFont12);


		String[] hour = new String[25];
		for(int i = 0; i <hour.length; i++) {
			if(i == 0) {
				hour[i] ="";
			} else if(i < 10){
				hour[i] = "0" + i +"";
			} else {
				hour[i] = i +"";
			}
		}
		meetingHour = new JComboBox(hour);
		meetingHour.setBounds(327, 211, 39, 28);
		meetingHour.setSelectedIndex(0);
		meetingHour.setFont(font.customFont12);


		String[] min = {"", "00", "30"};
		meetingMinutes = new JComboBox(min);
		meetingMinutes.setBounds(396, 211, 39, 28);
		meetingMinutes.setSelectedIndex(0);
		meetingMinutes.setFont(font.customFont12);

		bottomPanel.add(meetingYear);
		bottomPanel.add(meetingMonth);
		bottomPanel.add(meetingDay);
		bottomPanel.add(meetingHour);
		bottomPanel.add(meetingMinutes);

	} // 만날 일시 콤보박스 메소드 종료


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


				/* 게시글 정보 담기 : 게시글 제목, 내용, 게시판 종류, 모임일자, 모임시간, 지역코드, 카테고리코드,모임인원 */
				postDTO.setPostName(postTitle.getText()); //게시글 제목
				postDTO.setPostContents(postContents.getText()); // 게시글 내용
				postDTO.setPostCategory("혼또니");

				/* 만남 일자 6글자 형식으로 합치기 */
				String meetYear = (String)meetingYear.getSelectedItem(); 
				String meetMonth = (String)meetingMonth.getSelectedItem();
				String meetDay = (String)meetingDay.getSelectedItem();
				String meetingDay = meetYear + meetMonth + meetDay;
				postDTO.setPostMeetingDate(meetingDay);

				/* 만남일시 */
				String meetHour = (String)meetingHour.getSelectedItem();  
				String meetMin =  (String)meetingMinutes.getSelectedItem();
				String meetTime = meetHour + ":" + meetMin ;
				postDTO.setPostMeetingTime(meetTime);

				postDTO.setLocalName(localSelectbtn.getText()); //일단 임의의 값 지도에서 지역선택 후 받아오기 - DB는 숫자

				/* 카테고리(맛집 탐방 등) 일단 받아오고 컨트롤러에서 코드로 변환해주기*/
				
				postDTO.setCategoryName((String)selectCategorycombo.getSelectedItem());

				/* 텍스트 필드로 받은 모임인원, int로 전환 */
				int numberOfJoin = Integer.parseInt(joinmember.getText());
				postDTO.setPostNumberOfPeopleNumber(numberOfJoin);
				System.out.println(postDTO);

				contactController.writeHonddoniBoardPost(postDTO);

			}
		});


	}

}




