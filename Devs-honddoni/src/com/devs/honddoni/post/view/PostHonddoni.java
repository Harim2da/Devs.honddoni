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
import com.devs.honddoni.post.controller.ContactController;

public class PostHonddoni extends JFrame{
	
	private JFrame mainFrame; // 메인프레임
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
	private PostDTO postDTO;
	private ContactController contactController;
	
	
	
	/*혼또니 게시글 작성 화면 불러오기*/
	public PostHonddoni() {
		this.setBounds(100, 100, 516, 909);
		this.setLayout(null);
		topPanel();
		selectPost();
		createPostTitle();
		selectLocal();
		insertJoinMember();
		postContents();
		postButton();
		postMeetingTime();
		addPostComponent();

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/*상단 패널 생성*/
	public void topPanel() {
		topPanel = new JPanel();
		topPanel.setBounds(0, 0, 500, 100);
		topPanel.setLayout(null);
		topPanel.setBackground(Color.WHITE);

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
	
	/* 팝업 시 반투명 패널 생성 */
	public void popupPanel() {

		pann = new JLayeredPane();
		pann.setBounds(0, 30, 500, 670);
		mainFrame.add(pann);
	
	}

	/* 게시글 작성 화면 내 쌓아올리기 - 순서 중요 */
	public void addPostComponent() {

		this.add(topPanel);
		this.add(bottomPanel);
		bottomPanel.add(postTypebtn);
		bottomPanel.add(postTitle);
		bottomPanel.add(localSelectbtn);
		bottomPanel.add(joinmember);	
		bottomPanel.add(selectCategorycombo);
		bottomPanel.add(postContents);
		bottomPanel.add(postbtn);
		bottomPanel.add(bottomLabel);
				this.repaint();
				this.revalidate();

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
	}

	/*지역 선택 버튼*/
	private void selectLocal() {
		localSelectbtn = new JButton("");
		localSelectbtn.setOpaque(false);
		localSelectbtn.setContentAreaFilled(false);
		localSelectbtn.setBorderPainted(false);
		localSelectbtn.setBounds(105, 78, 125, 31);
		
		
//		bottomPanel.add(popupPanel);
		
		pann = new JLayeredPane();
		pann.setBounds(0, 30, 500, 670);
		this.add(pann);
		
		
		localSelectbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//popupPanel();
				koreaMap();
				btnstop();
				
				// 지도 팝업
				
				
				
			}
		});
		

	}

	/* 지도 관련 라벨과 버튼 등 실행*/
	private void koreaMap() {
		
		koreaMapLabel = new JLabel();
		koreaMapLabel.setBackground(Color.WHITE);
		koreaMapLabel.setLayout(null);
		koreaMapLabel.setBounds(29, 65, 442, 595);
		koreaMapLabel.setIcon(new ImageIcon("image/post/matchlocal.png"));
		pann.add(koreaMapLabel, JLayeredPane.DRAG_LAYER);
		
		closeMap = new JButton();
		closeMap.setBounds(423, 2, 15, 15);
		closeMap.setBorderPainted(false);
		closeMap.setOpaque(false);
		closeMap.setContentAreaFilled(false);
		closeMap.setIcon(new ImageIcon("image/post/canclebtn.png"));
		koreaMapLabel.add(closeMap);
		
		this.repaint();
//		this.revalidate();
		System.out.println("지도팝업");
		
		closeMap.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				change();
				btnstart();
			}

			
		});
           
	}
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
		System.out.println("실행확인");
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
		System.out.println("실행확인");
	}
	
	/*모집 인원 기입*/
	private void insertJoinMember() {
		joinmember = new JTextField();
		joinmember.setBorder(null);
		joinmember.setOpaque(false);
		joinmember.setBounds(327, 90, 108, 28); // 폰트 크기 키우면 y축 위치 조정
		joinmember.setColumns(10);
	}

	/* 게시글 작성*/
	private void postContents() {
		postContents = new JTextArea();
		postContents.setOpaque(false);
		postContents.setBounds(59, 305, 399, 273);

	}

	/* 만날 일시 설정 콤보박스*/
	private void postMeetingTime() {

		String[] year = new String[16];
		for(int i = 0; i <year.length; i++) {
			if(i == 0) {
				year[i] ="";
			} else {
				year[i] = 20 + i +"";
			}
		}
		meetingYear = new JComboBox(year);	
		meetingYear.setBounds(102, 211, 42, 28);
		meetingYear.setSelectedIndex(0);



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


		String[] min = {"", "00", "30"};
		meetingMinutes = new JComboBox(min);
		meetingMinutes.setBounds(396, 211, 39, 28);
		meetingMinutes.setSelectedIndex(0);

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
		postbtn.setIcon(new ImageIcon(PostView.class.getResource("/post/postbutton.png")));
		postbtn.setContentAreaFilled(false);
		postbtn.setBorderPainted(false);
		postbtn.setOpaque(false);
		
		
		postbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == postbtn) {
					postDTO = new PostDTO();
					
					
					/* 게시글 정보 담기 : 게시글 제목, 내용, 게시판 종류, 모임일자, 모임시간, 지역코드, 카테고리코드,모임인원 */
					postDTO.setPostName(postTitle.getText()); //게시글 제목
					postDTO.setPostContents(postContents.getText()); // 게시글 내용
					postDTO.setPostCategory("혼또니");
					
					/* 만남 일자 6글자 형식으로 합치기 */
					String meetDay = (String)meetingYear.getSelectedItem() + (String)meetingMonth.getSelectedItem()
									+ (String)meetingDay.getSelectedItem();
					
					postDTO.setPostMeetingDate(meetDay);
					
					/* 만남일시 */
					 String meetTime = (String)meetingHour.getSelectedItem() + ":" + (String)meetingMinutes.getSelectedItem();
					 postDTO.setPostMeetingDate(meetTime);
					
					 
//					 postDTO.setLocalName(); 지도에서 지역선택 후 받아오기 - DB는 숫자
					 
					 /* 카테고리(맛집 탐방 등) 일단 받아오고 컨트롤러에서 코드로 변환해주기*/
					 postDTO.setCategoryName((String)selectCategorycombo.getSelectedItem());
					 
					 /* 텍스트 필드로 받은 모임인원, int로 전환 */
					 int numberOfJoin = Integer.parseInt(joinmember.getText());
					 postDTO.setPostNumberOfPeopleNumber(numberOfJoin);
	
					 contactController.writeHonddoniBoardPost(postDTO);
					
				}
				
			}
		});
				
	}


}




//private JButton localSelectbtn; // 지역선택 버튼


