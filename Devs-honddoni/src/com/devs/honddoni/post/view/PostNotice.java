package com.devs.honddoni.post.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.devs.honddoni.admin.model.dto.SearchSingletonDTO;
import com.devs.honddoni.admin.viewpenel.Notice;
import com.devs.honddoni.common.PagenationComments;
import com.devs.honddoni.common.dto.PageInfoCommentsDTO;
import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.common.font.FontManager;
import com.devs.honddoni.common.mainframe.MainFrame;
import com.devs.honddoni.member.view.MyPage;
import com.devs.honddoni.member.view.RegistMember;
import com.devs.honddoni.memberLog.view.MemberLogView;
import com.devs.honddoni.post.controller.ContactController;
import com.devs.honddoni.post.controller.PagingController;
import com.devs.honddoni.search.view.MainBottomPanel;


//공지사항 게시판 화면
public class PostNotice extends JPanel{
	
	private MainFrame frame;
	private PostNotice postNotice;
	
	private JPanel upPanel;							//상단패널
	private JButton myHonddoniBtn;					//마이페이지 이동 버튼
	private JButton searchHonddoniBtn;				//게시글 작성페이지 이동 버튼
	private JButton homeBtn;						//메인화면이동 버튼
	private JButton interestingBtn;					//관심글 목록 이동 버튼
	private JButton noticeBtn;						//공지사항 목록 이동 버튼
	private JLabel backgroundImage;					//로고 포함 테두리 배경 (디자인용)
	
	private PostNoticeView postNoticeView; 			//newPanel로 쓸 것
		
	private JLabel pagebarLabel;					//페이지 표기 바
	private JLabel preNumber = new JLabel("");		//페이지를 나타내는 앞의 숫자
	private JButton preBtn = new JButton();			//앞의 페이지로 가는 버튼
	private JLabel commingNumber;					//페이지를 나타내는 뒤의 숫자
	private JButton commingBtn = new JButton();		//뒤의 페이지로 가는 버튼
	
	private PagingController pagingController = new PagingController();
	private ContactController contactController = new ContactController();
	
	public int frontPage = 1;
	private List<PostDTO> postDTOList = null;		//페이지에 해당하는 게시물들의 목록
	private PostDTO postDTO;						//해당 게시물의 정보
	
	private JPanel noticeLabel;						//게시물 내용들을 올리는 라벨
	private JLabel[] postListLb;					//게시물 내용을 나타내는 밑바탕라벨 (디자인용도)
	private JButton[] postBtn;						//해당 게시물로 가는 버튼
	private JLabel[] title;							//해당 게시물의 제목
	
	private int postNo;
	private int totalPostNum;
	private PostDTO postinfoDTO = null;
	
	FontManager font = new FontManager();
			
	public PostNotice(MainFrame frame) {
		this.frame = frame; 
		this.postNotice = this;		
		
		/* 제일 기본 패널 */
		this.setBounds(0, 0, 500, 870);
		this.setLayout(null);
		this.setBackground(Color.WHITE);
		frame.add(this);
		System.out.println("Notice 패널 생성");	

		
		/* 검색창 라벨 */
		JLabel searchLb = new JLabel("");
		searchLb.setBounds(35, 127, 433, 62);
		searchLb.setBackground(null);
		searchLb.setIcon(new ImageIcon("image/admin/notice_searchArea.png"));
		
		/* 입력받는 텍스트필드들 */
		JTextField searchTf = new JTextField();
		searchTf.setBounds(72, 16, 328, 30);
		
		/* 검색어입력 받아서 검색하는 버튼 */
		JButton searchBtn = new JButton();
		searchBtn.setBounds(25, 16, 29, 29);
		searchBtn.setIcon(new ImageIcon("image/admin/notice_glassBtn.png"));
		
		//패널에 버튼 추가
		this.add(searchLb);
		searchLb.add(searchTf);
		searchLb.add(searchBtn);
		
		
		/* 상단패널 필요 */
		upPanel();
		postNotice.add(upPanel);
		
		/* 상단패널에 포함될 버튼 */
		myHonddoniBtn();
		searchHonddoniBtn();
		homeBtn();
		interestingBtn();
		noticeBtn();
		
		/* 버튼들을 상단패널에 더해줌 */
		upPanel.add(backgroundImage);
		backgroundImage.add(myHonddoniBtn);
		backgroundImage.add(searchHonddoniBtn);
		backgroundImage.add(homeBtn);
		backgroundImage.add(interestingBtn);
		backgroundImage.add(noticeBtn);			
	    
	    		
	    /* 페이지 표기 바 세팅 */
	    pagebarLabel = new JLabel("");
	    pagebarLabel.setBounds(184, 203, 138, 22);
	    pagebarLabel.setIcon(new ImageIcon("image/admin/notice_pagingArea.png"));
	    this.add(pagebarLabel);
	    
		//페이징 버튼과 숫자들		
		prePageNumber();
		commingPageNumber();
		prePageBtn();
		commingPageBtn();
		
		//게시글 올라가는 패널
		setNoticeLabel();		
				
		//게시글 내용들 세팅
		setTitle();	    
		postBtnAdd();
		setPostListLb();
	    
		//pagebarLabel에 라벨, 버튼을 더해줌
		pagebarLabel.add(preNumber);
		pagebarLabel.add(preBtn);
		pagebarLabel.add(commingNumber);
		pagebarLabel.add(commingBtn);		    
	    
	    frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	    
	}
	
	/* 게시글 올라가는 패널 */
	public void setNoticeLabel() {
		noticeLabel = new JPanel();
		noticeLabel.setBounds(35, 252, 432, 577);
		noticeLabel.setLayout(null);
		postNotice.add(noticeLabel);
	}
	
	/* 현재페이지를 나타내는 숫자 */
	public void prePageNumber() {
		String frontPageString = Integer.valueOf(frontPage).toString();

		preNumber.setText(frontPageString);
		preNumber.setLayout(null);
		preNumber.setBounds(50, 4, 14, 14);
		System.out.println("frontPage 숫자 : " + frontPageString);
	}
	
	/* 최종페이지를 나타내는 숫자 */
	public void commingPageNumber() {
		int pageNo = frontPage;

		int totalCount = new PagingController().NoticeWholePostNum();

		PagenationComments pagenationComments = new PagenationComments();
		PageInfoCommentsDTO pageInfo = pagenationComments.getCommentsPageInfo(pageNo, totalCount, 5, 5);
		String backPageString = Integer.valueOf(pageInfo.getMaxPage()).toString();

		commingNumber = new JLabel(backPageString);
		commingNumber.setLayout(null);
		commingNumber.setBounds(85, 4, 14, 14);

	}
	
	/* 다음페이지로 이동버튼 */
	public void commingPageBtn() {

		int pageNo = frontPage;

		int totalCount = new PagingController().NoticeWholePostNum();

		PagenationComments pagenationComments = new PagenationComments();
		PageInfoCommentsDTO pageInfo = pagenationComments.getCommentsPageInfo(pageNo, totalCount, 5, 5);

		commingBtn.setIcon(new ImageIcon("image/post/afterPageButton.png"));
		commingBtn.setContentAreaFilled(false);
		commingBtn.setBorderPainted(false);
		commingBtn.setBounds(120, 4, 14, 14);

		if(pageNo == pageInfo.getMaxPage()) {
			commingBtn.setVisible(false);
		} else {
			commingBtn.setVisible(true);
		}

		commingBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if(frontPage < pageInfo.getMaxPage()) {
					frontPage++;
				}
				
				//기존 내용들이 올라가있는 라벨을 remove하고, 새로운 라벨을 세팅한다.
				postNotice.remove(noticeLabel);
				setNoticeLabel();				
				
				//게시글 내용들 세팅
				setTitle();	    
				postBtnAdd();
				setPostListLb();
				
				commingPageBtn();
				prePageBtn();
				prePageNumber();		

			}
		});
		
		pagebarLabel.add(commingBtn);
	}
	
	/* 이전페이지로 이동 버튼*/
	public void prePageBtn() {		
		int pageNo = frontPage;
		
		preBtn.setIcon(new ImageIcon("image/post/beforePageButton.png"));
		preBtn.setContentAreaFilled(false);
		preBtn.setBorderPainted(false);
		preBtn.setBounds(15, 4, 14, 14);

		if(pageNo < 2) {
			preBtn.setVisible(false);
		} else {
			preBtn.setVisible(true);
		}

		System.out.println("frontPage : " + frontPage);
		preBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {				
				if(frontPage >= 2 ) { //현재있는 페이지
					frontPage--;
				}
				
				postDTOList = new PagingController().NoticePostList(pageNo);
				
				postNotice.remove(noticeLabel);
				setTitle();	    
				postBtnAdd();
				setPostListLb();		//게시글 배경 틀 다시 잡기

				prePageBtn(); 		//이동 후에, 다시 버튼을 재설정해줘야 함
				prePageNumber(); 	//이동 후에, 이전페이지라벨을 재설정해줘야 함
				commingPageBtn();
				System.out.println("frontPage : " + frontPage);
			}
		});
	
		pagebarLabel.add(preBtn);
	}
	
	
	
	/* 게시물 내용을 나타내는 밑바탕라벨 (디자인용도) 반복 */
	public void setPostListLb() {
		int pageNo = frontPage;
		int y = 0; //늘어나는 y축 값
		
		//해당페이지에 맞는 포스트DTO를 List에 담아온다
		postDTOList = new PagingController().NoticePostList(pageNo);		
		System.out.println("DTO리스트 크기 : " + postDTOList.size());

		//반복문으로 밑바탕라벨을 깔아준다
		for(int i = 0; i < postDTOList.size(); i++) {			

			postListLb = new JLabel[postDTOList.size()];
			postListLb[i] = new JLabel();
			postListLb[i].setLayout(null);
			postListLb[i].setIcon(new ImageIcon("image/admin/notice_postArea.png"));
			postListLb[i].setBounds(0, y, 432, 105);
			
			noticeLabel.add(postListLb[i]);
			
			y += 119;
			System.out.println("게시물1개 밑바탕라벨 붙이기");
			postNotice.repaint();
			postNotice.revalidate();
		}
	}
	
	/* 해당 게시물 제목을 나타내는 라벨 */
	public void setTitle() {
		int pageNo = frontPage;
		int p = 62; //늘어나는 y축 값
		
		postDTOList = new PagingController().NoticePostList(pageNo);
		PostDTO postInfo = null;
		
		System.out.println("DTO리스트 크기 : " + postDTOList.size());
		
		for(int i = 0; i < postDTOList.size(); i++) {
			
			postInfo = postDTOList.get(i);			
			System.out.println("제목: " + postInfo.getPostName());			
			
			title = new JLabel[postDTOList.size()];
			title[i] = new JLabel();
			title[i].setText(postInfo.getPostName());
			title[i].setFont(font.customFont12);
			title[i].setLayout(null);
			title[i].setBounds(29, p, 350, 25);
			
			noticeLabel.add(title[i]);
			p += 119;
			System.out.println("게시물1개 제목라벨 붙이기");
		}
		
		
	}
	
	/* 해당 게시물로 가는 버튼 반복 */
	public void postBtnAdd() {
		
		int pageNo = frontPage;
		int j = 12; //늘어나는 y축 값
		
		postDTOList = new PagingController().NoticePostList(pageNo);
		System.out.println("DTO리스트 크기 : " + postDTOList.size());
		
		for(int i = 0; i < postDTOList.size(); i++) {
			//반복할 때마다, postDTOList 중에 이번회차 내용을 DTO에 입력
			postinfoDTO = postDTOList.get(i);
			
			postBtn = new JButton[postDTOList.size()];
			postBtn[i] = new JButton();
			postBtn[i].setLayout(null);
			postBtn[i].setIcon(new ImageIcon("image/admin/notice_noticeBtn.png"));
			postBtn[i].setBounds(18, j, 140, 45);
			noticeLabel.add(postBtn[i]);
			j += 119;
			
			System.out.println("게시물1개 버튼 붙이기");
			postNotice.repaint();
			postNotice.revalidate();
			
			//버튼과 연결된 글의 DTO에서 글번호 추출
			int postNo = postinfoDTO.getPostNo();			
			
			//버튼 클릭시, 해당 포스트 DTO를 들고 NoticeContent로 이동			
			postBtn[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					frame.remove(postNotice);
					postNotice.setVisible(false);
					postNoticeView = new PostNoticeView(frame, postinfoDTO);
					frame.repaint();
					frame.revalidate();

				} 
			});

		}	

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
				postNotice.setVisible(false);
				upPanel.setVisible(false);
				frame.remove(upPanel);
				frame.remove(postNotice);
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
				postNotice.setVisible(false);
				upPanel.setVisible(false);
				frame.remove(upPanel);
				frame.remove(postNotice);
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
				postNotice.setVisible(false);
				upPanel.setVisible(false);
				frame.remove(upPanel);
				frame.remove(postNotice);
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
				frame.remove(upPanel);
				frame.remove(postNotice);
				upPanel.setVisible(false);
				postNotice.setVisible(false);
				new PostNotice(frame);
				frame.repaint();
				frame.revalidate();
			}
		});

	}
	
	
	
	
	
	
}

		