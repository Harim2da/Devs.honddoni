package com.devs.honddoni.post.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.devs.honddoni.common.PagenationComments;
import com.devs.honddoni.common.dto.CommentsDTO;
import com.devs.honddoni.common.dto.PageInfoCommentsDTO;
import com.devs.honddoni.post.controller.ContactController2;
import com.devs.honddoni.post.controller.PagingController;

public class SelectedComment extends JFrame {

	private JPanel upPanel; 					//상단패널
	private JPanel downPanel;					//하단패널
	private JButton commentWriteBtn;			//댓글 작성 버튼
	private JLabel commentLongbarLabel;			//페이지를 나타낼때 아래 깔래는 바
	private JButton backBtn;        			//뒤로 가기
	private JLabel beforeNumber = new JLabel("");	 		    //페이지를 나타내는 앞의 숫자
	private JLabel afterNumber;					//페이지를 나타내는 뒤의 숫자
	public static int frontPage = 1;					//현재 페이지
	private JButton beforeBtn = new JButton();				//페이지를 앞으로 이동하는 버튼
	private JButton afterBtn = new JButton();					//페이지를 뒤로 이동하는 버튼
	private JLabel commentList;				//댓글리스트의 밑바탕
	List<CommentsDTO> commentListDTO = null;
	private JLabel nickName;					//유저 닉네임
	private JLabel content;						//댓글 내용
	private JButton updateBtn;					//댓글 수정 버튼
	private JButton reportBtn;					//댓글 신고 버튼
	private JLabel commentsDate;				//댓글 작성 날짜
	private JLabel commentsTime;				//댓글 작성 시간
	private JLabel profilePictrue;				//프로필 사진
	private JButton myHonddoniBtn;				//마이페이지 이동
	private JButton searchHonddoniBtn;			//게시글 작성페이지 이동
	private JButton homeBtn;					//메인화면이동
	private JButton interestingBtn;				//관심글 목록 이동
	private JButton noticeBtn;					//공지사항 목록 이동
	private JLabel backgroundImage;				//로고 포함 테두리 배경
	private int postNo;							//게시글 번호
	private JButton deleteBtn;					//게시글 삭제

	/* 프레임에서 패널을 더해주기 위한 getter */
	public JPanel getUpPanel() {
		return upPanel;
	}
	public JPanel getDownPanel() {
		return downPanel;
	}
	//	public JButton getSidebarBtn() {
	//		return sidebarBtn;
	//	}
	//	public JButton getLogoBtn() {
	//		return logoBtn;
	//	}
	//	public JButton getCommentWriteBtn() {
	//		return commentWriteBtn;
	//	}
	//	public JLabel getCommentLongbarLabel() {
	//		return commentLongbarLabel;
	//	}
	//	public JButton getBackBtn() {
	//		return backBtn;
	//	}
	//	public JLabel getBeforeNumber() {
	//		return beforeNumber;
	//	}
	//	public JLabel getAfterNumber() {
	//		return afterNumber;
	//	}
	//	public int getFrontPage() {
	//		return frontPage;
	//	}
	//	public void setFrontPage(int frontPage) {
	//		this.frontPage = frontPage;
	//	}
	//	public JButton getBeforeBtn() {
	//		return beforeBtn;
	//	}
	//	public JButton getAfterBtn() {
	//		return afterBtn;
	//	}
	//	public JLabel getCommentList() {
	//		return commentList;
	//	}

	/* 프레임을 제외한 나머지를 합친 것 */
	public void collect() {

		upPanel();
		downPanel();
		myHonddoniBtn();
		searchHonddoniBtn();
		homeBtn();
		interestingBtn();
		noticeBtn();
		commentWriteBtn();
		commentLongbarLabel();
		backBtn();
		beforeNumber();
		afterNumber(1);
		beforeBtn();
		afterBtn(1);
		commentList(1);
		upPanel.add(myHonddoniBtn);
		upPanel.add(searchHonddoniBtn);
		upPanel.add(homeBtn);
		upPanel.add(interestingBtn);
		upPanel.add(noticeBtn);
		upPanel.add(backgroundImage);
		downPanel.add(commentWriteBtn);
		downPanel.add(commentLongbarLabel);
		downPanel.add(backBtn);		
		commentLongbarLabel.add(beforeNumber);
		commentLongbarLabel.add(afterNumber);
		commentLongbarLabel.add(beforeBtn);
		commentLongbarLabel.add(afterBtn);


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
	public void downPanel() {

		downPanel = new JPanel();
		downPanel.setBounds(0, 100, 500, 770);
		downPanel.setLayout(null);
		downPanel.setBackground(Color.WHITE);


	}

	public void nextPanel() {

		downPanel = new JPanel();
		downPanel.setBounds(0, 100, 500, 770);
		downPanel.setLayout(null);
		downPanel.setBackground(Color.WHITE);

	}

	/* My혼또니 버튼 생성 */
	public void myHonddoniBtn() {

		myHonddoniBtn = new JButton("");
		myHonddoniBtn.setBounds(171,23,56,56);
		myHonddoniBtn.setIcon(new ImageIcon("image/common/toppanel/myHonddoniBtn.png"));
		myHonddoniBtn.setBorderPainted(false);
		myHonddoniBtn.setContentAreaFilled(false);
		myHonddoniBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("my혼또니 버튼 클릭");
			}
		});


	}

	/* 혼또니 찾기 버튼 생성*/
	public void searchHonddoniBtn() {

		searchHonddoniBtn = new JButton("");
		searchHonddoniBtn.setBounds(234,23,56,56);
		searchHonddoniBtn.setIcon(new ImageIcon("image/common/toppanel/SearchHonddoniBtn.png"));
		searchHonddoniBtn.setBorderPainted(false);
		searchHonddoniBtn.setContentAreaFilled(false);
		searchHonddoniBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("혼또니 찾기 버튼 클릭");
			}
		});

	}
	/* Home 버튼 생성 */
	public void homeBtn() {

		homeBtn = new JButton("");
		homeBtn.setBounds(298,23,56,56);
		homeBtn.setIcon(new ImageIcon("image/common/toppanel/HomeBtn.png"));
		homeBtn.setBorderPainted(false);
		homeBtn.setContentAreaFilled(false);
		homeBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("홈  버튼 클릭");
			}
		});


	}

	/* 관심금 목록 버튼 생성 */
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

	/* 공지사항 버튼 생성 */
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

	/* 댓글 작성 버튼 */
	public void commentWriteBtn() {

		commentWriteBtn = new JButton("");
		commentWriteBtn.setIcon(new ImageIcon("image/post/commentWriteButton.png"));
		commentWriteBtn.setContentAreaFilled(false);
		commentWriteBtn.setBorderPainted(false);
		commentWriteBtn.setBounds(35, 17, 72, 22);
		commentWriteBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("댓글 작성란 호출");
				String text = (String)JOptionPane.showInputDialog("댓글 내용을 입력하세요.");
				System.out.println(text);
				CommentsDTO newComment = new CommentsDTO();

				newComment.setCommentsContents(text);
				newComment.setPostNo(postNo);

				/* 싱글톤으로 샏ㅇ성된 멤버넘버 받아와야댐 */
				newComment.setMemberNo(1);

				ContactController2 contactController2 = new ContactController2();
				contactController2.communicationComment(newComment);


			}
		});

	}

	/* 현재페이지, 전체페이지, 페이지이동 버튼가 위치한 라벨 */
	public void commentLongbarLabel() {

		commentLongbarLabel = new JLabel("");
		commentLongbarLabel.setLayout(null);
		commentLongbarLabel.setIcon(new ImageIcon("image/post/nextPageButton.png"));
		commentLongbarLabel.setBounds(182, 17, 137, 22);

	}

	/* 뒤로가기 */
	public void backBtn() {

		backBtn = new JButton("");
		backBtn.setIcon(new ImageIcon("image/post/backButton.png"));
		backBtn.setContentAreaFilled(false);
		backBtn.setBorderPainted(false);
		backBtn.setBounds(444, 17, 22, 22);
		backBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("게시글 조회 호출");
			}
		});
	}

	/* 댓글 이전페이지로 이동하는 버튼 */
	public void beforeBtn() {

		int pageNo = frontPage;

		beforeBtn.setIcon(new ImageIcon("image/post/beforePageButton.png"));
		beforeBtn.setContentAreaFilled(false);
		beforeBtn.setBorderPainted(false);
		beforeBtn.setBounds(15, 4, 14, 14);
		if(pageNo < 2) {
			beforeBtn.setVisible(false);
		} else {
			beforeBtn.setVisible(true);
		}

		System.out.println("frontPage : " + frontPage);
		beforeBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if(frontPage >= 2 ) {
					frontPage--;
				}

				//				PageInfoCommentsDTO pageInfo = pagenationComments.getCommentsPageInfo(pageNo, totalCount, 10, 5);
				commentListDTO = new PagingController().selectCommentsList(pageNo, postNo);
				commentList(postNo);


				beforeBtn();
				beforeNumber();
				afterBtn(1);
				System.out.println("frontPage : " + frontPage);


			}
		});


	}

	/* 댓글 다음페이지로 이동 */
	public void afterBtn(int postNo) {

		this.postNo = postNo;

		int pageNo = frontPage;

		int totalCount = new PagingController().selectWholeCommentsNum(postNo);

		PagenationComments pagenationComments = new PagenationComments();
		PageInfoCommentsDTO pageInfo = pagenationComments.getCommentsPageInfo(pageNo, totalCount, 10, 5);

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

				if(frontPage < pageInfo.getMaxPage()) {
					frontPage++;
				}


				downPanel.remove(commentList);


				for(int i = 0; i < 10; i++) {


					downPanel.remove(commentList);
					downPanel.remove(nickName);
					downPanel.remove(content);
					downPanel.remove(updateBtn);
					downPanel.remove(reportBtn);
					downPanel.remove(commentsDate);
					downPanel.remove(commentsTime);
					downPanel.remove(profilePictrue);
					downPanel.remove(deleteBtn);

				}

				//				PageInfoCommentsDTO pageInfo = pagenationComments.getCommentsPageInfo(pageNo, totalCount, 10, 5);
				//				commentListDTO = new PagingController().selectCommentsList(pageNo, postNo);
				commentList(postNo);

				afterBtn(1);
				beforeBtn();
				beforeNumber();		

			}
		});
	}

	/* 현재페이지를 나타내는 숫자 */
	public void beforeNumber() {

		String frontPageString = Integer.valueOf(frontPage).toString();

		beforeNumber.setText(frontPageString);
		beforeNumber.setLayout(null);
		beforeNumber.setBounds(50, 4, 14, 14);
		System.out.println(frontPageString);

	}

	/* 최종페이지를 나타내는 숫자 */
	public void afterNumber(int postNo) {

		int pageNo = frontPage;

		int totalCount = new PagingController().selectWholeCommentsNum(postNo);

		PagenationComments pagenationComments = new PagenationComments();
		PageInfoCommentsDTO pageInfo = pagenationComments.getCommentsPageInfo(pageNo, totalCount, 10, 5);
		String backPageString = Integer.valueOf(pageInfo.getMaxPage()).toString();

		afterNumber = new JLabel(backPageString);
		afterNumber.setLayout(null);
		afterNumber.setBounds(85, 4, 14, 14);

	}

	/* 댓글내용을 나타내는 양식 */
	public void commentList(int postNo) {

		int pageNo = frontPage;
		int y = 52;

		commentListDTO = new PagingController().selectCommentsList(pageNo, postNo);
		CommentsDTO commentInfo = null;


		for(int i = 0; i < commentListDTO.size(); i++) {

			commentInfo = commentListDTO.get(i);

			commentList = new JLabel("");
			commentList.setLayout(null);
			commentList.setIcon(new ImageIcon("image/post/commentWriteListLabelOne.png"));
			commentList.setBounds(35, y, 431, 61);

			nickName = new JLabel(commentInfo.getMemberNickname());
			nickName.setLayout(null);
			nickName.setBounds(110, y + 10, 720, 35); 

			content = new JLabel(commentInfo.getCommentsContents());
			content.setLayout(null);
			content.setBounds(187, y + 10, 250, 35); 

			updateBtn = new JButton("");
			updateBtn.setIcon(new ImageIcon("image/post/commentUpdateButton.png"));
			updateBtn.setContentAreaFilled(false);
			updateBtn.setBorderPainted(false);
			updateBtn.setBounds(415, y + 37, 23, 23);
			updateBtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("댓글 수정란 호출");
					String text = (String)JOptionPane.showInputDialog("댓글 내용을 입력하세요.");
					System.out.println(text);
					CommentsDTO updateComment = new CommentsDTO();

					for(int i = 0; i < commentListDTO.size(); i++) {

						updateComment.setCommentsNo(commentListDTO.get(i).getCommentsNo());
						updateComment.setMemberNo(commentListDTO.get(i).getMemberNo());
						updateComment.setCommentsContents(text);

					}
					ContactController2 contactController2 = new ContactController2();
					contactController2.updateComment(updateComment);


				}
			});

			reportBtn = new JButton("");
			reportBtn.setIcon(new ImageIcon("image/post/commentReportButton.png"));
			reportBtn.setContentAreaFilled(false);
			reportBtn.setBorderPainted(false);
			reportBtn.setBounds(440, y + 37, 23, 23);
			reportBtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					/* 신고 팝업창 띄우기 */
					System.out.println("신고 팝업창 띄우기");

				}
			});

			commentsDate = new JLabel(commentInfo.getCommentsDate());
			commentsDate.setLayout(null);
			commentsDate.setBounds(418, y - 7 , 250, 35);

			commentsTime = new JLabel(commentInfo.getCommentsTime());
			commentsTime.setLayout(null);
			commentsTime.setBounds(422, y + 7 , 250, 35);

			profilePictrue = new JLabel("");
			profilePictrue.setLayout(null);
			profilePictrue.setBounds(45, y - 10, 75, 75);

			if(commentInfo.getMemberProfile().equals("1")) {

				profilePictrue.setIcon(new ImageIcon("image/post/commentPf1.png"));

			} else if(commentInfo.getMemberProfile().equals("2")) {

				profilePictrue.setIcon(new ImageIcon("image/post/commentPf2.png"));

			} else if(commentInfo.getMemberProfile().equals("3")) {

				profilePictrue.setIcon(new ImageIcon("image/post/commentPf3.png"));

			} else if(commentInfo.getMemberProfile().equals("4")) {

				profilePictrue.setIcon(new ImageIcon("image/post/commentPf4.png"));

			} else if(commentInfo.getMemberProfile().equals("5")) {

				profilePictrue.setIcon(new ImageIcon("image/post/commentPf5.png"));

			} else if(commentInfo.getMemberProfile() == null) {
				profilePictrue.setVisible(false);
			}

			deleteBtn = new JButton("");
			deleteBtn.setIcon(new ImageIcon("image/post/commentDeleteButton.png"));
			deleteBtn.setContentAreaFilled(false);
			deleteBtn.setBorderPainted(false);
			deleteBtn.setBounds(390, y + 37, 23, 23);
			deleteBtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					System.out.println("댓글 삭제");
					CommentsDTO deleteComment = new CommentsDTO();
					List<CommentsDTO> deleteCommentList = new ArrayList<>();

					for(int i = 0; i < commentListDTO.size(); i++) {

						deleteComment.setCommentsNo(commentListDTO.get(i).getCommentsNo());
						deleteComment.setMemberNo(commentListDTO.get(i).getMemberNo());
						deleteCommentList.add(deleteComment);
					}

					ContactController2 contactController2 = new ContactController2();
					contactController2.deleteComment(deleteCommentList);



				}
			});


			downPanel.add(deleteBtn);
			downPanel.add(profilePictrue);
			downPanel.add(nickName);
			downPanel.add(content);
			downPanel.add(updateBtn);
			downPanel.add(reportBtn);
			downPanel.add(commentsDate);
			downPanel.add(commentsTime);
			downPanel.add(commentList);

			y += 62;

		}
	}
}