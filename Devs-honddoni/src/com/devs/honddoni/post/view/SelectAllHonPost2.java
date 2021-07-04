package com.devs.honddoni.post.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	private JButton postTitle; // 게시글 제목
	private JLabel categoryName; //카테고리명
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
					postList(postNo); 게시글 타이틀 띄우기

					prePageBtn();
					prePageNumber();
					commingPageBtn(1);
					System.out.println("frontPage : " + frontPage);

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

		int totalCount = new PagingController().selectWholeCommentsNum(postNo);

		PagenationComments pagenationComments = new PagenationComments();
		PageInfoCommentsDTO pageInfo = pagenationComments.getCommentsPageInfo(pageNo, totalCount, 10, 5);
		String backPageString = Integer.valueOf(pageInfo.getMaxPage()).toString();

		afterNumber = new JLabel(backPageString);
		afterNumber.setLayout(null);
		afterNumber.setBounds(85, 4, 14, 14);

		
	}
	
	
}
