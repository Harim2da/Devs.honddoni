//package com.devs.honddoni.post.view;
//
//import java.awt.Color;
//import java.awt.Container;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.List;
//
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//
//import com.devs.honddoni.common.PagenationComments;
//import com.devs.honddoni.common.dto.CommentsDTO;
//import com.devs.honddoni.common.dto.PageInfoCommentsDTO;
//import com.devs.honddoni.post.controller.ContactController2;
//import com.devs.honddoni.post.controller.PagingController;
//
//public class SelectedComment2 extends JFrame {
//
//
//	private JPanel upPanel; 					//상단패널
//	private JPanel downPanel;					//하단패널
//	//	private JPanel nextPanel;					//하단패널
//	private JButton commentWriteBtn;			//댓글 작성 버튼
//	private JLabel commentLongbarLabel;			//페이지를 나타낼때 아래 깔래는 바
//	private JButton backBtn;        			//뒤로 가기
//	private JLabel beforeNumber = new JLabel("");	 		    //페이지를 나타내는 앞의 숫자
//	private JLabel afterNumber;					//페이지를 나타내는 뒤의 숫자
//	public static int frontPage = 1;					//현재 페이지
//	private JButton beforeBtn = new JButton();				//페이지를 앞으로 이동하는 버튼
//	private JButton afterBtn = new JButton();					//페이지를 뒤로 이동하는 버튼
//	private JLabel[] commentList;				//댓글리스트의 밑바탕
//	List<CommentsDTO> commentListDTO = null;
//	private JLabel[] nickName;					//유저 닉네임
//	private JLabel[] content;						//댓글 내용
//	private JButton[] updateBtn;					//댓글 수정 버튼
//	private JButton[] reportBtn;					//댓글 신고 버튼
//	private JLabel[] commentsDate;				//댓글 작성 날짜
//	private JLabel[] commentsTime;				//댓글 작성 시간
//	private JLabel[] profilePictrue;				//프로필 사진
//	private JButton myHonddoniBtn;				//마이페이지 이동
//	private JButton searchHonddoniBtn;			//게시글 작성페이지 이동
//	private JButton homeBtn;					//메인화면이동
//	private JButton interestingBtn;				//관심글 목록 이동
//	private JButton noticeBtn;					//공지사항 목록 이동
//	private JLabel backgroundImage;				//로고 포함 테두리 배경
//	private int postNo;							//게시글 번호
//	private JButton[] deleteBtn;					//게시글 삭제
//
//	/* 프레임에서 패널을 더해주기 위한 getter */
//	public JPanel getUpPanel() {
//		return upPanel;
//	}
//	public JPanel getDownPanel() {
//		return downPanel;
//	}
//	//	public JPanel getNextPanel() {
//	//		return nextPanel;
//	//	}
//	//	public JButton getSidebarBtn() {
//	//		return sidebarBtn;
//	//	}
//	//	public JButton getLogoBtn() {
//	//		return logoBtn;
//	//	}
//	//	public JButton getCommentWriteBtn() {
//	//		return commentWriteBtn;
//	//	}
//	//	public JLabel getCommentLongbarLabel() {
//	//		return commentLongbarLabel;
//	//	}
//	//	public JButton getBackBtn() {
//	//		return backBtn;
//	//	}
//	//	public JLabel getBeforeNumber() {
//	//		return beforeNumber;
//	//	}
//	//	public JLabel getAfterNumber() {
//	//		return afterNumber;
//	//	}
//	//	public int getFrontPage() {
//	//		return frontPage;
//	//	}
//	//	public void setFrontPage(int frontPage) {
//	//		this.frontPage = frontPage;
//	//	}
//	//	public JButton getBeforeBtn() {
//	//		return beforeBtn;
//	//	}
//	//	public JButton getAfterBtn() {
//	//		return afterBtn;
//	//	}
//	//	public JLabel getCommentList() {
//	//		return commentList;
//	//	}
//
//	/* 프레임을 제외한 나머지를 합친 것 */
//	public void collect() {
//
//		upPanel();
//		downPanel();
//		//		nextPanel();
//
//		myHonddoniBtn();
//		searchHonddoniBtn();
//		homeBtn();
//		interestingBtn();
//		noticeBtn();
//
//		commentWriteBtn();
//		commentLongbarLabel();
//		backBtn();
//		beforeNumber();
//		afterNumber(1);
//		beforeBtn();
//		afterBtn(1);
//		nickName(1);
//		content(1);
//		updateBtn(1);
//		commentsDate(1);
//		reportBtn(1);
//		commentsTime(1);
//		profilePictrue(1);
//		deleteBtn(1);
//		commentList(1);
//
//		upPanel.add(myHonddoniBtn);
//		upPanel.add(searchHonddoniBtn);
//		upPanel.add(homeBtn);
//		upPanel.add(interestingBtn);
//		upPanel.add(noticeBtn);
//		upPanel.add(backgroundImage);
//		downPanel.add(commentWriteBtn);
//		downPanel.add(commentLongbarLabel);
//		downPanel.add(backBtn);
//		//		nextPanel.add(commentWriteBtn);
//		//		nextPanel.add(commentLongbarLabel);
//		//		nextPanel.add(backBtn);
//
//		commentLongbarLabel.add(beforeNumber);
//		commentLongbarLabel.add(afterNumber);
//		commentLongbarLabel.add(beforeBtn);
//		commentLongbarLabel.add(afterBtn);
//
//
//	}
//	/* 상단 패널 */
//	public void upPanel() {
//
//		upPanel = new JPanel();
//		upPanel.setBounds(0, 0, 500, 100);
//		upPanel.setLayout(null);
//		upPanel.setBackground(Color.WHITE);
//
//		/* 상단 패널 뒷배경 생성 */
//		backgroundImage = new JLabel("");
//		backgroundImage.setBounds(0, 0, 500, 100);
//		backgroundImage.setIcon(new ImageIcon("image/common/toppanel/backgroundImage.png"));
//		backgroundImage.setVisible(true); 
//
//	}
//
//	/* 하단 패널 */
//	public void downPanel() {
//
//		downPanel = new JPanel();
//		downPanel.setBounds(0, 100, 500, 770);
//		downPanel.setLayout(null);
//		downPanel.setBackground(Color.WHITE);
//
//
//	}
//
//	//	public void nextPanel() {
//	//
//	//		nextPanel = new JPanel();
//	//		nextPanel.setBounds(0, 100, 500, 770);
//	//		nextPanel.setLayout(null);
//	//		nextPanel.setBackground(Color.WHITE);
//	//		nextPanel.setVisible(false);
//	//		
//	//
//	//	}
//
//	/* My혼또니 버튼 생성 */
//	public void myHonddoniBtn() {
//
//		myHonddoniBtn = new JButton("");
//		myHonddoniBtn.setBounds(171,23,56,56);
//		myHonddoniBtn.setIcon(new ImageIcon("image/common/toppanel/myHonddoniBtn.png"));
//		myHonddoniBtn.setBorderPainted(false);
//		myHonddoniBtn.setContentAreaFilled(false);
//		myHonddoniBtn.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("my혼또니 버튼 클릭");
//			}
//		});
//
//
//	}
//
//	/* 혼또니 찾기 버튼 생성*/
//	public void searchHonddoniBtn() {
//
//		searchHonddoniBtn = new JButton("");
//		searchHonddoniBtn.setBounds(234,23,56,56);
//		searchHonddoniBtn.setIcon(new ImageIcon("image/common/toppanel/SearchHonddoniBtn.png"));
//		searchHonddoniBtn.setBorderPainted(false);
//		searchHonddoniBtn.setContentAreaFilled(false);
//		searchHonddoniBtn.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("혼또니 찾기 버튼 클릭");
//			}
//		});
//
//	}
//	/* Home 버튼 생성 */
//	public void homeBtn() {
//
//		homeBtn = new JButton("");
//		homeBtn.setBounds(298,23,56,56);
//		homeBtn.setIcon(new ImageIcon("image/common/toppanel/HomeBtn.png"));
//		homeBtn.setBorderPainted(false);
//		homeBtn.setContentAreaFilled(false);
//		homeBtn.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("홈  버튼 클릭");
//			}
//		});
//
//
//	}
//
//	/* 관심금 목록 버튼 생성 */
//	public void interestingBtn() {
//
//		interestingBtn = new JButton("");
//		interestingBtn.setBounds(362,23,56,56);
//		interestingBtn.setIcon(new ImageIcon("image/common/toppanel/InterestingBtn.png"));
//		interestingBtn.setBorderPainted(false);
//		interestingBtn.setContentAreaFilled(false);
//		interestingBtn.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("관심글 목록 버튼 클릭");
//			}
//		});
//
//	}
//
//	/* 공지사항 버튼 생성 */
//	public void noticeBtn() {
//
//		noticeBtn = new JButton("");
//		noticeBtn.setBounds(426,23,56,56);
//		noticeBtn.setIcon(new ImageIcon("image/common/toppanel/NoticeBtn.png"));
//		noticeBtn.setBorderPainted(false);
//		noticeBtn.setContentAreaFilled(false);
//		noticeBtn.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("공지사항 버튼 클릭");
//			}
//		});
//
//	}
//
//	/* 댓글 작성 버튼 */
//	public void commentWriteBtn() {
//
//		commentWriteBtn = new JButton("");
//		commentWriteBtn.setIcon(new ImageIcon("image/post/commentWriteButton.png"));
//		commentWriteBtn.setContentAreaFilled(false);
//		commentWriteBtn.setBorderPainted(false);
//		commentWriteBtn.setBounds(35, 17, 72, 22);
//		commentWriteBtn.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("댓글 작성란 호출");
//				String text = (String)JOptionPane.showInputDialog("댓글 내용을 입력하세요.");
//				System.out.println(text);
//				CommentsDTO newComment = new CommentsDTO();
//
//				newComment.setCommentsContents(text);
//				newComment.setPostNo(postNo);
//
//				/* 싱글톤으로 샏ㅇ성된 멤버넘버 받아와야댐 */
//				newComment.setMemberNo(1);
//
//				ContactController2 contactController2 = new ContactController2();
//				contactController2.communicationComment(newComment);
//
//
//			}
//		});
//
//	}
//
//	/* 현재페이지, 전체페이지, 페이지이동 버튼가 위치한 라벨 */
//	public void commentLongbarLabel() {
//
//		commentLongbarLabel = new JLabel("");
//		commentLongbarLabel.setLayout(null);
//		commentLongbarLabel.setIcon(new ImageIcon("image/post/nextPageButton.png"));
//		commentLongbarLabel.setBounds(182, 17, 137, 22);
//
//	}
//
//	/* 뒤로가기 */
//	public void backBtn() {
//
//		backBtn = new JButton("");
//		backBtn.setIcon(new ImageIcon("image/post/backButton.png"));
//		backBtn.setContentAreaFilled(false);
//		backBtn.setBorderPainted(false);
//		backBtn.setBounds(444, 17, 22, 22);
//		backBtn.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("게시글 조회 호출");
//			}
//		});
//	}
//
//	/* 댓글 이전페이지로 이동하는 버튼 */
//	public void beforeBtn() {
//
//		int pageNo = frontPage;
//
//		beforeBtn.setIcon(new ImageIcon("image/post/beforePageButton.png"));
//		beforeBtn.setContentAreaFilled(false);
//		beforeBtn.setBorderPainted(false);
//		beforeBtn.setBounds(15, 4, 14, 14);
//		if(pageNo < 2) {
//			beforeBtn.setVisible(false);
//		} else {
//			beforeBtn.setVisible(true);
//		}
//
//		System.out.println("frontPage : " + frontPage);
//		beforeBtn.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//
//				if(frontPage >= 2 ) {
//					frontPage--;
//				}
//
//				//				PageInfoCommentsDTO pageInfo = pagenationComments.getCommentsPageInfo(pageNo, totalCount, 10, 5);
//				commentListDTO = new PagingController().selectCommentsList(pageNo, postNo);
//				commentList(postNo);
//
//
//				beforeBtn();
//				beforeNumber();
//				afterBtn(1);
//				System.out.println("frontPage : " + frontPage);
//
//
//			}
//		});
//
//
//	}
//
//	/* 댓글 다음페이지로 이동 */
//	public void afterBtn(int postNo) {
//
//		this.postNo = postNo;
//
//		int pageNo = frontPage;
//
//		int totalCount = new PagingController().selectWholeCommentsNum(postNo);
//
//		PagenationComments pagenationComments = new PagenationComments();
//		PageInfoCommentsDTO pageInfo = pagenationComments.getCommentsPageInfo(pageNo, totalCount, 10, 5);
//
//		afterBtn.setIcon(new ImageIcon("image/post/afterPageButton.png"));
//		afterBtn.setContentAreaFilled(false);
//		afterBtn.setBorderPainted(false);
//		afterBtn.setBounds(120, 4, 14, 14);
//
//		if(pageNo == pageInfo.getMaxPage()) {
//			afterBtn.setVisible(false);
//		} else {
//			afterBtn.setVisible(true);
//		}
//
//
//		afterBtn.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//
//				if(frontPage < pageInfo.getMaxPage()) {
//					frontPage++;
//				}
//				
//				remove(downPanel);
//				
//				for(int i = 0; i < commentListDTO.size()) {
//					
//					downPanel.remove(commentList[i]);
//					
//				}
//
//
//				afterBtn(1);
//				beforeBtn();
//				beforeNumber();		
//
//				//				SelectedComment2 sc = new SelectedComment2();
//				//				sc.collect();
//				//				Ctest3.changePanel(downPanel, sc.getDownPanel2());
//				//				downPanel.setVisible(false);
//				//				sc.getDownPanel2().setVisible(true);
//			}
//		});
//	}
//
//	/* 현재페이지를 나타내는 숫자 */
//	public void beforeNumber() {
//
//		String frontPageString = Integer.valueOf(frontPage).toString();
//
//		beforeNumber.setText(frontPageString);
//		beforeNumber.setLayout(null);
//		beforeNumber.setBounds(50, 4, 14, 14);
//		System.out.println(frontPageString);
//
//	}
//
//	/* 최종페이지를 나타내는 숫자 */
//	public void afterNumber(int postNo) {
//
//		int pageNo = frontPage;
//
//		int totalCount = new PagingController().selectWholeCommentsNum(postNo);
//
//		PagenationComments pagenationComments = new PagenationComments();
//		PageInfoCommentsDTO pageInfo = pagenationComments.getCommentsPageInfo(pageNo, totalCount, 10, 5);
//		String backPageString = Integer.valueOf(pageInfo.getMaxPage()).toString();
//
//		afterNumber = new JLabel(backPageString);
//		afterNumber.setLayout(null);
//		afterNumber.setBounds(85, 4, 14, 14);
//
//	}
//
//	/* 댓글내용을 나타내는 양식 */
//	public void commentList(int postNo) {
//
//		int pageNo = frontPage;
//		int y = 52;
//
//		commentListDTO = new PagingController().selectCommentsList(pageNo, postNo);
//		CommentsDTO commentInfo = null;
//
//
//		for(int i = 0; i < commentListDTO.size(); i++) {
//
//			commentInfo = commentListDTO.get(i);
//
//			commentList = new JLabel[commentListDTO.size()];
//			commentList[i] = new JLabel();
//			commentList[i].setLayout(null);
//			commentList[i].setIcon(new ImageIcon("image/post/commentWriteListLabelOne.png"));
//			commentList[i].setBounds(35, y, 431, 61);
//			downPanel.add(commentList[i]);
//			y += 62;
//		}
//	}
//
//	public void nickName(int postNo) {
//
//		int pageNo = frontPage;
//		int y = 52;
//
//		commentListDTO = new PagingController().selectCommentsList(pageNo, postNo);
//		CommentsDTO commentInfo = null;
//
//		for(int i = 0; i < commentListDTO.size(); i++) {
//
//			commentInfo = commentListDTO.get(i);	
//
//			nickName = new JLabel[commentListDTO.size()];
//			nickName[i] = new JLabel();
//			nickName[i].setLayout(null);
//			nickName[i].setBounds(110, y + 10, 720, 35);
//			nickName[i].setText(commentInfo.getMemberNickname());
//			downPanel.add(nickName[i]);
//			y += 62;
//		}
//	}
//
//	public void content(int postNo) {
//
//		int pageNo = frontPage;
//		int y = 52;
//
//		commentListDTO = new PagingController().selectCommentsList(pageNo, postNo);
//		CommentsDTO commentInfo = null;
//
//		for(int i = 0; i < commentListDTO.size(); i++) {
//			commentInfo = commentListDTO.get(i);
//			content = new JLabel[commentListDTO.size()];
//			content[i] = new JLabel();
//			content[i].setLayout(null);
//			content[i].setBounds(187, y + 10, 250, 35);
//			content[i].setText(commentInfo.getCommentsContents());
//			downPanel.add(content[i]);
//			y += 62;
//		}
//	}
//
//	public void updateBtn(int postNo) {
//
//		int pageNo = frontPage;
//		int y = 52;
//
//		commentListDTO = new PagingController().selectCommentsList(pageNo, postNo);
//		CommentsDTO commentInfo = null;
//
//		for(int i = 0; i < commentListDTO.size(); i++) {
//			
//			commentInfo = commentListDTO.get(i);
//			
//			updateBtn = new JButton[commentListDTO.size()];
//			updateBtn[i] = new JButton();
//			updateBtn[i].setIcon(new ImageIcon("image/post/commentUpdateButton.png"));
//			updateBtn[i].setContentAreaFilled(false);
//			updateBtn[i].setBorderPainted(false);
//			updateBtn[i].setBounds(415, y + 37, 23, 23);
//			System.out.println("updateBtn[" + i + "] : " + commentListDTO.get(i).getCommentsNo());
//
//			int getCommentsNo = commentListDTO.get(i).getCommentsNo();
//			int getMemberNo = commentListDTO.get(i).getMemberNo();
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
//			downPanel.add(updateBtn[i]);
//			y += 62;
//		}
//	}
//
//	public void commentsDate(int postNo) {
//
//		int pageNo = frontPage;
//		int y = 52;
//
//		commentListDTO = new PagingController().selectCommentsList(pageNo, postNo);
//		CommentsDTO commentInfo = null;
//
//		for(int i = 0; i < commentListDTO.size(); i++) {
//
//			commentInfo = commentListDTO.get(i);
//			
//			commentsDate = new JLabel[commentListDTO.size()];
//			commentsDate[i] = new JLabel();
//			commentsDate[i].setLayout(null);
//			commentsDate[i].setBounds(418, y - 7 , 250, 35);
//			commentsDate[i].setText(commentInfo.getCommentsDate());
//			downPanel.add(commentsDate[i]);
//			y += 62;
//		}
//	}
//
//	public void reportBtn(int postNo) {
//
//		int pageNo = frontPage;
//		int y = 52;
//
//		commentListDTO = new PagingController().selectCommentsList(pageNo, postNo);
//		CommentsDTO commentInfo = null;
//
//		for(int i = 0; i < commentListDTO.size(); i++) {
//
//			commentInfo = commentListDTO.get(i);
//			
//			reportBtn = new JButton[commentListDTO.size()];
//			reportBtn[i] = new JButton();
//			reportBtn[i].setIcon(new ImageIcon("image/post/commentReportButton.png"));
//			reportBtn[i].setContentAreaFilled(false);
//			reportBtn[i].setBorderPainted(false);
//			reportBtn[i].setBounds(440, y + 37, 23, 23);
//			reportBtn[i].addActionListener(new ActionListener() {
//
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					//					for(int i = 0; i < commentListDTO.size(); i++) {
//					//						
//					//						commentsDate.setVisible(false);
//					//					}
//					System.out.println("신고 팝업창 띄우기");
//
//				}
//			});
//			downPanel.add(reportBtn[i]);
//			y += 62;
//		}
//	}
//
//	public void commentsTime(int postNo) {
//
//		int pageNo = frontPage;
//		int y = 52;
//
//		commentListDTO = new PagingController().selectCommentsList(pageNo, postNo);
//		CommentsDTO commentInfo = null;
//
//		for(int i = 0; i < commentListDTO.size(); i++) {
//
//			commentInfo = commentListDTO.get(i);
//			
//			commentsTime = new JLabel[commentListDTO.size()];
//			commentsTime[i] = new JLabel();
//			commentsTime[i].setLayout(null);
//			commentsTime[i].setBounds(422, y + 7 , 250, 35);
//			commentsTime[i].setText(commentInfo.getCommentsTime());
//			downPanel.add(commentsTime[i]);
//			y += 62;
//		}
//	}
//
//	public void profilePictrue(int postNo) {
//
//		int pageNo = frontPage;
//		int y = 52;
//
//		commentListDTO = new PagingController().selectCommentsList(pageNo, postNo);
//		CommentsDTO commentInfo = null;
//
//		for(int i = 0; i < commentListDTO.size(); i++) {
//			
//			commentInfo = commentListDTO.get(i);
//			
//			profilePictrue = new JLabel[commentListDTO.size()];
//			profilePictrue[i] = new JLabel();
//			profilePictrue[i].setLayout(null);
//			profilePictrue[i].setBounds(45, y - 10, 75, 75);
//
//
//			if(commentInfo.getMemberProfile().equals("1")) {
//
//				profilePictrue[i].setIcon(new ImageIcon("image/post/commentPf1.png"));
//
//			} else if(commentInfo.getMemberProfile().equals("2")) {
//
//				profilePictrue[i].setIcon(new ImageIcon("image/post/commentPf2.png"));
//
//			} else if(commentInfo.getMemberProfile().equals("3")) {
//
//				profilePictrue[i].setIcon(new ImageIcon("image/post/commentPf3.png"));
//
//			} else if(commentInfo.getMemberProfile().equals("4")) {
//
//				profilePictrue[i].setIcon(new ImageIcon("image/post/commentPf4.png"));
//
//			} else if(commentInfo.getMemberProfile().equals("5")) {
//
//				profilePictrue[i].setIcon(new ImageIcon("image/post/commentPf5.png"));
//
//			} else if(commentInfo.getMemberProfile() == null) {
//				profilePictrue[i].setVisible(false);
//			}
//			downPanel.add(profilePictrue[i]);
//			y += 62;
//		}
//	}
//
//	public void deleteBtn(int postNo) {
//
//		int pageNo = frontPage;
//		int y = 52;
//
//		commentListDTO = new PagingController().selectCommentsList(pageNo, postNo);
//		CommentsDTO commentInfo = null;
//
//		for(int i = 0; i < commentListDTO.size(); i++) {
//			
//			commentInfo = commentListDTO.get(i);
//
//			deleteBtn = new JButton[commentListDTO.size()];
//			deleteBtn[i] = new JButton("");
//			deleteBtn[i].setIcon(new ImageIcon("image/post/commentDeleteButton.png"));
//			deleteBtn[i].setContentAreaFilled(false);
//			deleteBtn[i].setBorderPainted(false);
//			deleteBtn[i].setBounds(390, y + 37, 23, 23);
//
//			int getCommentsNo = commentListDTO.get(i).getCommentsNo();
//			int getMemberNo = commentListDTO.get(i).getMemberNo();
//
//			if(getMemberNo == 1 /* 로그인된 번호 */) {
//				deleteBtn[i].addActionListener(new ActionListener() {
//
//					@Override
//					public void actionPerformed(ActionEvent e) {
//
//						System.out.println("댓글 삭제");
//						CommentsDTO deleteComment = new CommentsDTO();
//
//						deleteComment.setCommentsNo(getCommentsNo);
//						deleteComment.setMemberNo(getMemberNo);
//
//
//
//						ContactController2 contactController2 = new ContactController2();
//						contactController2.deleteComment(deleteComment);
//
//					}
//				});
//			}
//			downPanel.add(deleteBtn[i]);
//			y += 62;
//		}
//	}
//	
//
//	
//
//	
//	//			nextPanel.add(updateBtn[i]);
//	//			nextPanel.add(deleteBtn[i]);
//	//			nextPanel.add(profilePictrue[i]);
//	//			nextPanel.add(nickName[i]);
//	//			nextPanel.add(content[i]);
//	//			nextPanel.add(reportBtn[i]);
//	//			nextPanel.add(commentsDate[i]);
//	//			nextPanel.add(commentsTime[i]);
//	//			nextPanel.add(commentList[i]);
//
//	
//
//
//
//}