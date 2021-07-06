package com.devs.honddoni.post.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.post.controller.ContactController;

public class PostModify extends JFrame{
	/* 게시글 세부 조회
	 * 리스트에서 클릭 시 */

	private JFrame mainframe = new JFrame(); 
	private JPanel bottomPanel = new JPanel();
	private JLabel postLabel;
	private JLabel modiLabel;
	private JTextField postTitle;
	private JTextField postTitleEdit;
	private JTextArea postContents;
	private JTextArea postContentsEdit;
	private JTextField joinmember;
	private JComboBox selectCategorycombo = PostActionCategory.getInstance();

	private JButton postbtn; //게시글 작성 완료 버튼

	private JComboBox meetingYear; // 만남 년도 콤보박스
	private JComboBox meetingMonth; // 만남 월 콤보박스
	private JComboBox meetingDay; // 만남 일 콤보박스
	private JComboBox meetingHour; // 만남 시간 콤보박스
	private JComboBox meetingMinutes; // 만남 분 콤보박스
	private PostDTO postDTO;
	private ContactController contactController = new ContactController();
	private JButton commentcheck;
	private JButton modify;
	private JButton delete;
	private JButton local;
	private JButton category;
	private JLabel meetdate;
	private JLabel profile;
	private JLabel nickName;



	public PostModify() {
		this.setBounds(100, 100, 516, 909);
		this.setLayout(null);

		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.white);	
		this.add(bottomPanel);
		modifyPostTitle();
		modifyPostContents();
		modifyJoinmember();
		modifyLocal();
		modifyCategory();
		modifyDate();
		profile();
		nickName();

		selectBtn();
		addComponents(); //반드시 제일 밑에 있을 것!


		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}


	private void addComponents() {

		postLabel = new JLabel();   // 하단 패널 위 게시글 라벨
		postLabel.setBackground(Color.white);
		postLabel.setLayout(null);
		postLabel.setBounds(35, 0, 500, 724); 
		postLabel.setIcon(new ImageIcon("image/post/Group 9001.png"));
		bottomPanel.add(postLabel);

		//		pagebarLabel = new JLabel("");		//페이지 표기 바
		//		pagebarLabel.setLayout(null);
		//		pagebarLabel.setIcon(new ImageIcon("image/post/nextPageButton.png"));
		//		pagebarLabel.setBounds(182, 112, 137, 22);
		//		bottomPanel.add(pagebarLabel);
	}

	/* 게시글 제목 */
	private void modifyPostTitle() {
		postDTO = contactController.selectThePost(10); // 게시글 번호 받아오기

		String title = postDTO.getPostName();
		System.out.println(title);

		postTitle = new JTextField();
		postTitle.setEditable(false);
		postTitle.setBorder(null);
		//		postTitle.setDisabledTextColor(Color.WHITE);
		postTitle.setOpaque(false);
		postTitle.setBounds(113, 30, 322, 28);	// 폰트 크기 키우면 y축 위치 조정
		//		postTitle.setColumns(10);
		postTitle.setText(title);
		bottomPanel.add(postTitle);

	}
	/* 게시글 내용 */
	private void modifyPostContents() {
		postDTO = contactController.selectThePost(10); //괄호 속 게시글 번호 입력받기

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
	private void modifyJoinmember() {
		postDTO = contactController.selectThePost(10);  //괄호 속 게시글 번호 입력받기
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


	private void modifyLocal() {
		postDTO = contactController.selectThePost(10); //괄호 속 게시글 번호 입력받기

		String localName = postDTO.getLocalName();
		local = new JButton(localName);
		local.setBounds(105, 88, 125, 30);
		local.setContentAreaFilled(false);
		local.setBorderPainted(true);
		local.setOpaque(false);
		local.setEnabled(false);
		bottomPanel.add(local);

	}

	private void modifyCategory() {
		postDTO = contactController.selectThePost(10); //괄호 속 게시글 번호 입력받기

		String categoryName = postDTO.getCategoryName();
		category = new JButton(categoryName);
		category.setBounds(139, 152, 306, 28);
		category.setContentAreaFilled(false);
		category.setBorderPainted(true);
		category.setOpaque(false);
		category.setEnabled(false);
		bottomPanel.add(category);

	}

	private void modifyDate() {
		postDTO = contactController.selectThePost(10); //괄호 속 게시글 번호 입력받기

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
	private void profile() {
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
	private void nickName() {
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
	private void selectBtn() {
		/*댓글 확인 버튼*/
		commentcheck = new JButton();
		commentcheck.setBounds(35, 683, 140,41);
		commentcheck.setContentAreaFilled(false);
		commentcheck.setBorderPainted(false);
		commentcheck.setOpaque(false);
		bottomPanel.add(commentcheck);

		/*수정 버튼*/
		modify = new JButton();
		modify.setBounds(180, 683, 140,41);
		modify.setContentAreaFilled(false);
		modify.setBorderPainted(false);
		modify.setOpaque(false);
		modify.setIcon(new ImageIcon("image/post/modifypost.png"));
		bottomPanel.add(modify);

		/* 삭제 버튼 */
		delete = new JButton();
		delete.setBounds(326, 683, 140,41);
		delete.setContentAreaFilled(false);
		delete.setBorderPainted(false);
		delete.setOpaque(false);
		bottomPanel.add(delete);

		/*댓글확인 버튼 클릭 시 */
		commentcheck.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 게시글 번호 넘기고, 댓글 확인과 연결하기

			}
		});



		/*수정하기 버튼 클릭시*/
		modify.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int memberNo = postDTO.getPostMemberNo();

				/*싱글톤으로 작성자 멤버번호와 일치하는 지 확인 필요 - 지금은 임의값*/
				//				if(memberNo == 10) {
				bottomPanel.remove(postLabel); //게시글 용 라벨 생성
				bottomPanel.remove(modify);
				bottomPanel.remove(commentcheck);
				bottomPanel.remove(delete);
				bottomPanel.repaint();
				bottomPanel.revalidate();
				
//				modify.setEnabled(false);
//				modify.setVisible(false);
//				commentcheck.setEnabled(false);
//				delete.setEnabled(false);
				
				profile.setVisible(false);
				nickName.setVisible(false);
				bottomPanel.remove(category);
				bottomPanel.add(selectCategorycombo);

				postbtn = new JButton();
				postbtn.setBounds(129, 684, 263, 41);
				postbtn.setIcon(new ImageIcon("image/post/postbutton.png"));
				postbtn.setContentAreaFilled(false);
				postbtn.setBorderPainted(true);
				postbtn.setOpaque(false);
				

				postButton();
				postMeetingTime();
				
				postTitle.setEditable(true);
				postContents.setEditable(true);
				joinmember.setEditable(true);

				modiLabel = new JLabel();   // 하단 패널 위 게시글 라벨
				modiLabel.setBackground(Color.white);
				modiLabel.setLayout(null);
				modiLabel.setBounds(35, 0, 500, 724); 
				modiLabel.setIcon(new ImageIcon("image/post/editpage.png"));
				bottomPanel.add(modiLabel);

				postbtn.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("반응체크");
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

						//		postDTO.setLocalName(localSelectbtn.getText()); //일단 임의의 값 지도에서 지역선택 후 받아오기 - DB는 숫자

						/* 카테고리(맛집 탐방 등) 일단 받아오고 컨트롤러에서 코드로 변환해주기*/

						postDTO.setCategoryName((String)selectCategorycombo.getSelectedItem());

						/* 텍스트 필드로 받은 모임인원, int로 전환 */
						int numberOfJoin = Integer.parseInt(joinmember.getText());
						postDTO.setPostNumberOfPeopleNumber(numberOfJoin);
						System.out.println(postDTO);

						//		contactController.updateThePost(postDTO);

					}
				});
				
				// 지역 수정은 고민


				//				}

			}
		});


		/* 삭제하기 버튼 클릭 시 */
		delete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int memberNo = postDTO.getPostMemberNo();
				if(memberNo == 10) {

					int postNo = postDTO.getPostNo();
					//	int postNo = 10; 테스트용
					contactController.deleteThePost(postNo);
				}
			}
		});
	}

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

	/* 게시글 작성 완료 버튼 */
	private void postButton() {
		
		
		//postbtn.setEnabled(false);
	



	}


}
