package com.devs.honddoni.post.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.devs.honddoni.common.PagenationComments;
import com.devs.honddoni.common.PagenationPost;
import com.devs.honddoni.common.dto.PageInfoCommentsDTO;
import com.devs.honddoni.common.dto.PageInfoPostDTO;
import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.common.mainframe.MainFrame;
import com.devs.honddoni.post.controller.PagingController;

public class SelectAllHonPost2 extends JPanel{

	private MainFrame frame;
	private SelectAllHonPost2 bottomPanel;
	private JLabel searchLabel;
	private JButton aim;
	private JTextField searching;
	private JLabel pagebarLabel;	//페이지표기 바
	private JLabel preNumber = new JLabel("");
	private JLabel commingNumber;
	public static int frontPage = 1;
	private JButton preBtn = new JButton(); // 앞페이지 버튼
	private JButton commingBtn = new JButton(); // 뒷 페이지 버튼
	private JLabel postList;	
	List<PostDTO> postListDTO = null;
	private JLabel profile; //프로필
	private JLabel nickName; // 닉네임
	private JLabel postTitle; // 게시글 제목
	private JLabel categoryName; //카테고리명
	private JLabel localName;
	private int postNo; //게시글 번호
	private int totalPostNum;
	private PostDTO postDTO = new PostDTO();
	
	
	
	
	public SelectAllHonPost2(MainFrame frame) {
		this.frame = frame;
		this.bottomPanel = this;
		
		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.CYAN);	
		frame.add(bottomPanel);
		
		addComponents();
		
	}

	private void addComponents() {
	
		searchLabel = new JLabel();   // 하단 패널 위 검색창
		searchLabel.setBackground(Color.white);
		searchLabel.setLayout(null);
		searchLabel.setBounds(25, 15, 450, 63); 
		searchLabel.setIcon(new ImageIcon("image/search/searchBar.png"));
		bottomPanel.add(searchLabel);
		
		searching = new JTextField(); // 검색창 텍필
		searching.setBorder(null);
		searching.setOpaque(false);
		searching.setBounds(80, 16, 315, 28);
		searching.setColumns(20);
		searchLabel.add(searching);
		
		aim = new JButton();		// 검색 버튼
		aim.setBounds(22, 13, 41, 41);
		aim.setBorderPainted(false);
		aim.setOpaque(false);
		aim.setContentAreaFilled(false);
		searchLabel.add(aim);
		
		pagebarLabel = new JLabel("");		//페이지 표기 바
		pagebarLabel.setLayout(null);
		pagebarLabel.setIcon(new ImageIcon("image/post/nextPageButton.png"));
		pagebarLabel.setBounds(182, 112, 137, 22);
		bottomPanel.add(pagebarLabel);
		
		
	}
	
	/* 이전 페이지 */
	private void prePageBtn() {
		int pageNo = frontPage;
		
		preBtn.setIcon(new ImageIcon("image/post/beforePageButton.png"));
		preBtn.setContentAreaFilled(false);
		preBtn.setBorderPainted(false);
		preBtn.setBounds(15, 4, 14, 14);
		
		if(pageNo < 2) {
			preBtn.setVisible(false);
		} else {
			preBtn.setVisible(true);
			
			System.out.println("frontPage : " + frontPage);
			preBtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					if(frontPage >= 2 ) {
						frontPage--;
					}

					
					postListDTO = new PagingController().selectPostList(pageNo, postDTO.getLocalName(), postDTO.getCategoryName());
					postList(postNo); 

					prePageBtn();
					prePageNumber();
					commingPageBtn(1);
					System.out.println("frontPage : " + frontPage);
					bottomPanel.add(preBtn);

				}
			});
		}	
	}
	
	

	private void commingPageBtn(int postNo) {
		
		this.postNo = postNo;

		int pageNo = frontPage;
		
		int totalCount = new PagingController().selectWholePostNum(postDTO.getLocalName(), postDTO.getCategoryName());
		
		PagenationPost pagenationpost = new PagenationPost();
		PageInfoPostDTO pageInfo = pagenationpost.getPostPageInfo(pageNo, totalCount, 5, 5);

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

				bottomPanel.remove(postList);
				
				for(int i = 0; i < 5; i++) {
					bottomPanel.remove(postList);
					bottomPanel.remove(profile);
					bottomPanel.remove(nickName);
					bottomPanel.remove(postTitle);
					bottomPanel.remove(categoryName);
				}
				
				postList(postNo);
				
				commingPageBtn(1);
				prePageBtn();
				prePageNumber();
				
			}
		});
		
		bottomPanel.add(commingBtn);
		
		
	}
	


	

	protected void prePageNumber() {
		String frontPageString = Integer.valueOf(frontPage).toString();

		preNumber.setText(frontPageString);
		preNumber.setLayout(null);
		preNumber.setBounds(50, 4, 14, 14);
		System.out.println(frontPageString);
		
	}
	
	protected void commingPageNumber(int postNo) {
		
		int pageNo = frontPage;

		int totalCount = new PagingController().selectWholePostNum(postDTO.getLocalName(), postDTO.getCategoryName());

		PagenationPost pagenationPost = new PagenationPost();
		PageInfoPostDTO pageInfo = pagenationPost.getPostPageInfo(pageNo, totalCount, 5, 5);
		String backPageString = Integer.valueOf(pageInfo.getMaxPage()).toString();

		commingNumber = new JLabel(backPageString);
		commingNumber.setLayout(null);
		commingNumber.setBounds(85, 4, 14, 14);

		
	}
	
	protected void postList(int postNo) {
		int pageNo = frontPage;
		int y = 153;
		
			postListDTO = new PagingController().selectPostList(pageNo, postDTO.getLocalName(), postDTO.getCategoryName());
			PostDTO postInfo = null;
			
			for(int i = 0; i < postListDTO.size(); i++) {
				
				postInfo = postListDTO.get(i);
				
				postList = new JLabel("");
				postList.setLayout(null);
				postList.setIcon(new ImageIcon("image/post/postlist1"));
				postList.setBounds(35, y, 432, 105);
				bottomPanel.add(postList);
				
				profile = new JLabel("");
				profile.setLayout(null);
				profile.setBounds(53, y + 12, 37, 37);
				
				
				if(postInfo.getMemberProfile().equals("1")) {

					profile.setIcon(new ImageIcon("image/post/commentPf1.png"));

				} else if(postInfo.getMemberProfile().equals("2")) {

					profile.setIcon(new ImageIcon("image/post/commentPf2.png"));

				} else if(postInfo.getMemberProfile().equals("3")) {

					profile.setIcon(new ImageIcon("image/post/commentPf3.png"));

				} else if(postInfo.getMemberProfile().equals("4")) {

					profile.setIcon(new ImageIcon("image/post/commentPf4.png"));

				} else if(postInfo.getMemberProfile().equals("5")) {

					profile.setIcon(new ImageIcon("image/post/commentPf5.png"));

				} else if(postInfo.getMemberProfile() == null) {
					profile.setVisible(false);
				}
				bottomPanel.add(profile);
				
				nickName = new JLabel(postInfo.getMemberNickname());
				nickName.setLayout(null);
				nickName.setBounds(92, y + 15, 100, 43);
				bottomPanel.add(nickName);
				
				categoryName = new JLabel("");
				categoryName.setLayout(null);
				categoryName.setBounds(188, y + 21, 70, 34);
				
				if(postInfo.getCategoryName().equals("맛집탐방")) {
					categoryName.setIcon(new ImageIcon("image/post/eat.png"));
					
				} else if(postInfo.getCategoryName().equals("활동")) {
					categoryName.setIcon(new ImageIcon("image/post/active.png"));
					
				} else if(postInfo.getCategoryName().equals("취미")) {
					categoryName.setIcon(new ImageIcon("image/post/hobby.png"));
					
				} else if(postInfo.getCategoryName().equals("산책")) {
					categoryName.setIcon(new ImageIcon("image/post/walk.png"));
					
				} else if(postInfo.getCategoryName().equals("스터디")) {
					categoryName.setIcon(new ImageIcon("image/post/study.png"));
					
				} else if(postInfo.getCategoryName().equals("게임")) {
					categoryName.setIcon(new ImageIcon("image/post/game.png"));
				} else {
					categoryName.setVisible(false);
				}
				
				bottomPanel.add(categoryName);
				
				postTitle = new JLabel(postInfo.getPostName());
				postTitle.setLayout(null);
				postTitle.setBounds(62, y + 10, 395, 28);
				bottomPanel.add(postTitle);
				
				postTitle.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseClicked(MouseEvent e) {
						// 게시판 세부내용 보이게 설정
						
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
				
				
				localName = new JLabel();
				localName.setLayout(null);
				localName.setBounds(383, y + 6, 46, 25);
				
				if(postInfo.getLocalName().equals("강릉")) {
					localName.setIcon(new ImageIcon("image/post/gangneung.png"));
				} else if(postInfo.getLocalName().equals("담양")) {
					localName.setIcon(new ImageIcon("image/post/damyang.png"));
				} else if(postInfo.getLocalName().equals("대구")) {
					localName.setIcon(new ImageIcon("image/post/daegu.png"));
				} else if(postInfo.getLocalName().equals("부산")) {
					localName.setIcon(new ImageIcon("image/post/busan.png"));
				} else if(postInfo.getLocalName().equals("서울")) {
					localName.setIcon(new ImageIcon("image/post/seoul.png"));
				} else if(postInfo.getLocalName().equals("인천")) {
					localName.setIcon(new ImageIcon("image/post/incheon.png"));
				} else if(postInfo.getLocalName().equals("순천")) {
					localName.setIcon(new ImageIcon("image/post/sooncheon.png"));
				} else if(postInfo.getLocalName().equals("전주")) {
					localName.setIcon(new ImageIcon("image/post/jeonju.png"));
				} else if(postInfo.getLocalName().equals("제주")) {
					localName.setIcon(new ImageIcon("image/post/jeju.png"));
				} else if(postInfo.getLocalName().equals("천안")) {
					localName.setIcon(new ImageIcon("image/post/cheonan.png"));
				} else if (postInfo.getLocalName() == null) {
					localName.setVisible(false);
				}
				
				bottomPanel.add(localName);
				
			}
		
	}
	
	
	
	
	
}
