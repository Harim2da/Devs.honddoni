package com.devs.honddoni.post.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.common.mainframe.MainFrame;
import com.devs.honddoni.member.view.MyPage;
import com.devs.honddoni.memberLog.controller.GetLoginMember;
import com.devs.honddoni.post.controller.ContactController;

public class PostModify extends JPanel{
	/* 게시글 세부 조회
	 * 리스트에서 클릭 시 */

	GetLoginMember loginMember = GetLoginMember.getInstance(); //회원정보 받아오기
	private MainFrame frame; 
	private PostModify postModify;
	
	private JPanel topPanel; 
	private JLabel topLabel;
	private JPanel bottomPanel = new JPanel();
	private JLabel postLabel;
	private JLabel modiLabel;
	private JTextField postTitle;
	private JTextField postTitleEdit;
	private JTextArea postContents;
	private JTextArea postContentsEdit;
	private JTextField joinmember;
	private JComboBox selectCategorycombo = PostActionCategory.getInstance();
	private JLabel postbtn; //게시글 작성 완료 버튼

	private JComboBox meetingYear; // 만남 년도 콤보박스
	private JComboBox meetingMonth; // 만남 월 콤보박스
	private JComboBox meetingDay; // 만남 일 콤보박스
	private JComboBox meetingHour; // 만남 시간 콤보박스
	private JComboBox meetingMinutes; // 만남 분 콤보박스
	private PostDTO postDTO;
	private ContactController contactController = new ContactController();
	private JLabel commentcheck;
	private JLabel modify;
	private JLabel delete;
	private JButton local;
	private JButton category;
	private JLabel meetdate;
	private JLabel profile;
	private JLabel nickName;
	private JButton myHonddoniBtn;								//마이페이지 이동 버튼
	private JButton searchHonddoniBtn;							//게시글 작성페이지 이동 버튼
	private JButton homeBtn;									//메인화면이동 버튼
	private JButton interestingBtn;								//관심글 목록 이동 버튼
	private JButton noticeBtn;		


	public PostModify(MainFrame frame, int postNo) {
		
		this.frame = frame;
		this.postModify = this;

		/*상단 패널 및 버튼*/
		topPanel();
		myHonddoniBtn();
		searchHonddoniBtn();
		homeBtn();
		interestingBtn();
		noticeBtn();
		
		/*하단 패널 */
		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.white);	
		frame.add(bottomPanel);
		modifyPostTitle(postNo);
		modifyPostContents(postNo);
		modifyJoinmember(postNo);
		modifyLocal(postNo);
		modifyCategory(postNo);
		modifyDate(postNo);
		profile(postNo);
		nickName(postNo);

		selectBtn(postNo);
		addComponents(); //반드시 제일 밑에 있을 것!


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
		frame.add(topLabel);
		
	}
	
	/* My혼또니(마이페이지 화면으로 이동) 버튼 */
	public void myHonddoniBtn() {

		myHonddoniBtn = new JButton();
		myHonddoniBtn.setBounds(171,23,56,56);
		myHonddoniBtn.setIcon(new ImageIcon("image/common/toppanel/myHonddoniBtn.png"));
		myHonddoniBtn.setBorderPainted(false);
		myHonddoniBtn.setContentAreaFilled(false);
		topPanel.add(myHonddoniBtn);
		
		
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
		topPanel.add(searchHonddoniBtn);
		
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
		topPanel.add(homeBtn);
		
		
		homeBtn.addActionListener(new ActionListener() {

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

	/* 관심글 목록페이지로 이동하는 버튼 생성 */
	public void interestingBtn() {

		interestingBtn = new JButton("");
		interestingBtn.setBounds(362,23,56,56);
		interestingBtn.setIcon(new ImageIcon("image/common/toppanel/InterestingBtn.png"));
		interestingBtn.setBorderPainted(false);
		interestingBtn.setContentAreaFilled(false);
		topPanel.add(interestingBtn);
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
		topPanel.add(noticeBtn);
		
		noticeBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("공지사항 버튼 클릭");
			}
		});

	}

	private void addComponents() {

		postLabel = new JLabel();   // 하단 패널 위 게시글 라벨
		postLabel.setBackground(Color.white);
		postLabel.setLayout(null);
		postLabel.setBounds(35, 0, 500, 724); 
		postLabel.setIcon(new ImageIcon("image/post/Group 9001.png"));
		bottomPanel.add(postLabel);

	}

	/* 게시글 제목 */
	private void modifyPostTitle(int postNo) {
		postDTO = contactController.selectThePost(postNo); // 게시글 번호 받아오기

		String title = postDTO.getPostName();
		System.out.println(title);

		postTitle = new JTextField();
		postTitle.setEditable(false);
		postTitle.setBorder(null);

		postTitle.setOpaque(false);
		postTitle.setBounds(113, 30, 322, 28);	// 폰트 크기 키우면 y축 위치 조정

		postTitle.setText(title);
		bottomPanel.add(postTitle);

	}
	
	/* 게시글 내용 */
	private void modifyPostContents(int postNo) {
		postDTO = contactController.selectThePost(postNo); //괄호 속 게시글 번호 입력받기

		String contents = postDTO.getPostContents();
		System.out.println(contents);
		postContents = new JTextArea();
		postContents.setOpaque(false);
		postContents.setBounds(59, 320, 399, 273);
		postContents.setText(contents);
		postContents.setLineWrap(true);  // 줄바꿈 처리
		postContents.setEditable(false); //수정 불가
		bottomPanel.add(postContents);

	}

	/* 모일 인원 */
	private void modifyJoinmember(int postNo) {
		postDTO = contactController.selectThePost(postNo);  //괄호 속 게시글 번호 입력받기
		String join = Integer.valueOf(postDTO.getPostNumberOfPeopleNumber()).toString();

		joinmember = new JTextField();
		joinmember.setBorder(null);
		joinmember.setOpaque(false);
		joinmember.setBounds(350, 95, 108, 28); // 폰트 크기 키우면 y축 위치 조정
		joinmember.setColumns(10);
		joinmember.setText(join);
		joinmember.setEditable(false);
		bottomPanel.add(joinmember);
	}


	private void modifyLocal(int postNo) {
		postDTO = contactController.selectThePost(postNo); //괄호 속 게시글 번호 입력받기

		String localName = postDTO.getLocalName();
		local = new JButton(localName);
		local.setBounds(105, 88, 125, 30);
		local.setContentAreaFilled(false);
		local.setBorderPainted(true);
		local.setOpaque(false);
		local.setEnabled(false);
		bottomPanel.add(local);

	}

	private void modifyCategory(int postNo) {
		postDTO = contactController.selectThePost(postNo); //괄호 속 게시글 번호 입력받기

		String categoryName = postDTO.getCategoryName();
		category = new JButton(categoryName);
		category.setBounds(139, 152, 306, 28);
		category.setContentAreaFilled(false);
		category.setBorderPainted(true);
		category.setOpaque(false);
		category.setEnabled(false);
		bottomPanel.add(category);

	}

	private void modifyDate(int postNo) {
		postDTO = contactController.selectThePost(postNo); //괄호 속 게시글 번호 입력받기

		String meet = postDTO.getPostMeetingDate();
		String year = "";
		String month = "";
		String day = "";

		/*년 월 일 분리*/
		for(int i = 0; i < meet.length(); i++) {
			if(i < 2) {
				year += meet.charAt(i);
			} else if(i < 4) {
				month += meet.charAt(i);
			} else {
				day += meet.charAt(i);
			}
		}

		/* 시 분 분리*/
		String time = postDTO.getPostMeetingTime();


		meetdate = new JLabel();
		meetdate.setBounds(105, 224, 350, 20);
		meetdate.setLayout(null);
		meetdate.setText(year + " 년  " + month + " 월  " + day + " 일     " + time);
		bottomPanel.add(meetdate);
	}
	
	/* 작성자 프로필 생성 */
	private void profile(int postNo) {
		postDTO = contactController.selectThePost(10); //괄호 속 게시글 번호 입력받기
		String profilenum = postDTO.getMemberProfile();

		profile = new JLabel();
		profile.setBounds(53, 612, 40, 40);
		meetdate.setLayout(null);

		if(profilenum.equals("1")) {
			profile.setIcon(new ImageIcon("image/post/commentPf1.png"));
		} else if(profilenum.equals("2")) {
			profile.setIcon(new ImageIcon("image/post/commentPf2.png"));
		} else if(profilenum.equals("3")) {
			profile.setIcon(new ImageIcon("image/post/commentPf3.png"));
		} else if(profilenum.equals("4")) {
			profile.setIcon(new ImageIcon("image/post/commentPf4.png"));
		} else if(profilenum.equals("5")) {
			profile.setIcon(new ImageIcon("image/post/commentPf5.png"));
		} 
		bottomPanel.add(profile);

	}
	
	/*닉네임 불러오기 */
	private void nickName(int postNo) {
		postDTO = contactController.selectThePost(10); //괄호 속 게시글 번호 입력받기
		String nick = postDTO.getMemberNickname();

		nickName = new JLabel();
		nickName.setBounds(105, 612, 91, 40);
		nickName.setLayout(null);
		nickName.setText(nick);

		bottomPanel.add(nickName);

	}


	/*하단 작성자 정보*/
	/* 하단 버튼 세 개 - 댓글확인, 게시글 수정, 게시글 삭제 */
	private void selectBtn(int postNo) {
		/*댓글 확인 버튼*/
		commentcheck = new JLabel();
		commentcheck.setBounds(35, 683, 140,41);
		commentcheck.setOpaque(false);
		bottomPanel.add(commentcheck);

		/*수정 버튼*/
		modify = new JLabel();
		modify.setBounds(180, 683, 140,41);
		modify.setOpaque(false);
		modify.setIcon(new ImageIcon("image/post/modifypost.png"));
		bottomPanel.add(modify);

		/* 삭제 버튼 */
		delete = new JLabel();
		delete.setBounds(326, 683, 140,41);
		delete.setOpaque(false);
		bottomPanel.add(delete);
		
		int memberNo = postDTO.getPostMemberNo();
		int loginNo = loginMember.getLoginMemberNo();

		commentcheck.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// 댓글 전체보기 연결
				//int postNo = postDTO.getPostNo();
				frame.remove(topPanel);
				frame.remove(bottomPanel);
				topPanel.setVisible(false);
				bottomPanel.setVisible(false);
				new SelectedComment(frame, postNo);
				frame.repaint();
				frame.revalidate();
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {	}

			@Override
			public void mouseEntered(MouseEvent e) {}


		}); // 댓글보기 버튼 액션리스너



		/*수정하기 버튼 클릭*/
		modify.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {}
			
			@Override
			public void mouseExited(MouseEvent e) {	}
			
			@Override
			public void mouseEntered(MouseEvent e) {}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				/*싱글톤으로 작성자 멤버번호와 일치하는 지 확인*/

				if(memberNo == loginNo) {
					bottomPanel.remove(postLabel); //게시글 확인용 라벨 삭제
					bottomPanel.remove(modify);
					bottomPanel.remove(commentcheck);
					bottomPanel.remove(delete);
					postbtn = new JLabel();			// 수정 후 작성완료용
					postbtn.setBounds(128, 684, 244, 42);
					postbtn.setLayout(null);
					postbtn.setIcon(new ImageIcon("image/post/postbutton.png"));
					postbtn.setOpaque(false);
					bottomPanel.repaint();
					bottomPanel.revalidate();

					profile.setVisible(false);	//프로필 가리기
					nickName.setVisible(false);	//닉네임 가리기
					bottomPanel.remove(category);
					bottomPanel.add(selectCategorycombo);


					postMeetingTime(); //만날 일시 수정

					postTitle.setEditable(true);
					postContents.setEditable(true);
					joinmember.setEditable(true);

					modiLabel = new JLabel();   // 하단 패널 위 수정용 게시글 라벨
					modiLabel.setBackground(Color.white);
					modiLabel.setLayout(null);
					modiLabel.setBounds(35, 0, 500, 724); 
					modiLabel.setIcon(new ImageIcon("image/post/editpage.png"));
					bottomPanel.add(modiLabel);


					System.out.println("작성완료체크");
					modiLabel.add(postbtn);

					postbtn.addMouseListener(new MouseListener() {

						@Override
						public void mouseClicked(MouseEvent e) {
							System.out.println("반응체크");
							postDTO = new PostDTO();


							/* 게시글 정보 담기 : 게시글 제목, 내용, 게시판 종류, 모임일자, 모임시간, 지역코드, 카테고리코드,모임인원 */
							postDTO.setPostNo(postNo);
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

							//		postDTO.setLocalName(localSelectbtn.getText()); //일단 임의의 값 지도에서 지역선택 후 받아오기 - DB는 숫자

							/* 카테고리(맛집 탐방 등) 일단 받아오고 컨트롤러에서 코드로 변환해주기*/

							postDTO.setCategoryName((String)selectCategorycombo.getSelectedItem());

							/* 텍스트 필드로 받은 모임인원, int로 전환 */
							int numberOfJoin = Integer.parseInt(joinmember.getText());
							postDTO.setPostNumberOfPeopleNumber(numberOfJoin);
							System.out.println(postDTO);

							contactController.updateThePost(postDTO);

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
				
				}}
		}); // 수정하기 버튼 종료
		
		
		delete.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {}
			
			@Override
			public void mouseExited(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e) {}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// 삭제버튼
				
				if(memberNo == loginNo) {
					int postNo = postDTO.getPostNo();
					contactController.deleteThePost(postNo);			
			}
				}
		});

			}// 버튼 메소드 닫는 괄호


		/*수정 시 콤보박스 생성*/
		private void postMeetingTime() {
			meetdate.setText("");

			String[] year = new String[16];
			for(int i = 0; i <year.length; i++) {
				if(i == 0) {
					year[i] ="";
				} else {
					year[i] = 20 + i + "" ;
				}
			}
			meetingYear = new JComboBox(year);	
			meetingYear.setBounds(102, 214, 42, 28);
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
			meetingMonth.setBounds(170, 214, 39, 28);
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
			meetingDay.setBounds(238, 214, 39, 28);
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
			meetingHour.setBounds(327, 214, 39, 28);
			meetingHour.setSelectedIndex(0);


			String[] min = {"", "00", "30"};
			meetingMinutes = new JComboBox(min);
			meetingMinutes.setBounds(396, 214, 39, 28);
			meetingMinutes.setSelectedIndex(0);

			bottomPanel.add(meetingYear);
			bottomPanel.add(meetingMonth);
			bottomPanel.add(meetingDay);
			bottomPanel.add(meetingHour);
			bottomPanel.add(meetingMinutes);

		} // 만날 일시 콤보박스 메소드 종료

		


	}
	
	



	
