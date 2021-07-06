package com.devs.honddoni.post.view;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.devs.honddoni.common.PagenationPost;
import com.devs.honddoni.common.dto.PageInfoPostDTO;
import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.common.mainframe.MainFrame;
import com.devs.honddoni.post.controller.GetFilter;
import com.devs.honddoni.post.controller.PagingController;
public class SelectAllHonPost3 extends JPanel {

	private SelectAllHonPost3 selectAllHonPost3;
	private MainFrame frame;
	
	private JPanel downPanel;
	private JLabel searchLabel;
	private JButton aim;
	private JTextField searching;
	private JLabel pageLongbarLabel;	//페이지표기 바
	private JLabel beforeNumber = new JLabel("");
	private JLabel afterNumber;
	private JButton beforeBtn = new JButton(); // 앞페이지 버튼
	private JButton afterBtn = new JButton(); // 뒷 페이지 버튼
	private JLabel[] postList;	
	private List<PostDTO> postListDTO = null;
	private JLabel[] profilePictrue; //프로필
	private JLabel[] nickName; // 닉네임
	private JLabel[] postTitle; // 게시글 제목
	private JLabel[] categoryName; //카테고리명
	private JLabel[] localName;
	//	private int postNo; //게시글 번호
	//	private int totalPostNum;
	//	private PostDTO postDTO = new PostDTO();
	GetFilter getName = GetFilter.getInstance();

	/* 프레임을 제외한 나머지를 합친 것 */
	public SelectAllHonPost3(MainFrame frame) {

		this.frame = frame;
		this.selectAllHonPost3 = this;
		
		/* 패널 */
		//upPanel();
		downPanel();

		/* 하단패널에 포함될 버튼, 라벨 */

		aim();
		pageLongbarLabel();
		searchLabel();
		searching();
		beforeNumber();
		afterNumber();
		beforeBtn();
		afterBtn();
		profilePictrue();
		nickName();
		postTitle();
		categoryName();
		localName();
		postList();

		/* 반복문이 필요없는 버튼, 라벨을 하단패널에 더해줌 */

		downPanel.add(searchLabel);
		downPanel.add(searching);
		downPanel.add(aim);
		downPanel.add(pageLongbarLabel);


		/* 디자인용도의 longbar에 라벨, 버튼을 더해줌 */
		pageLongbarLabel.add(beforeNumber);
		pageLongbarLabel.add(afterNumber);
		pageLongbarLabel.add(beforeBtn);
		pageLongbarLabel.add(afterBtn);
		
		frame.add(downPanel);
	}

	public JPanel getDownPanel() {
		return downPanel;
	}

	/* 하단 패널 */
	public void downPanel() {

		downPanel = new JPanel();
		downPanel.setBounds(0, 100, 500, 770);
		downPanel.setLayout(null);
		downPanel.setBackground(Color.WHITE);

	}

	public void searchLabel() {

		searchLabel = new JLabel();   // 하단 패널 위 검색창
		searchLabel.setBackground(Color.white);
		searchLabel.setLayout(null);
		searchLabel.setBounds(25, 15, 450, 63); 
		searchLabel.setIcon(new ImageIcon("image/search/searchBar.png"));

	}

	public void searching() {

		searching = new JTextField(); // 검색창 텍필
		searching.setBorder(null);
		searching.setOpaque(false);
		searching.setBounds(80, 16, 315, 28);
		searching.setColumns(20);

	}

	public void aim() {

		aim = new JButton();		// 검색 버튼
		aim.setBounds(22, 13, 41, 41);
		aim.setBorderPainted(false);
		aim.setOpaque(false);
		aim.setContentAreaFilled(false);

	}

	public void pageLongbarLabel() {

		pageLongbarLabel = new JLabel("");		//페이지 표기 바
		pageLongbarLabel.setLayout(null);
		pageLongbarLabel.setIcon(new ImageIcon("image/post/nextPageButton.png"));
		pageLongbarLabel.setBounds(182, 90, 137, 22);

	}

	/* 이전 페이지 */
	public void beforeBtn() {
		int pageNo = SelectAllHonPost2.frontPage2;

		beforeBtn.setIcon(new ImageIcon("image/post/beforePageButton.png"));
		beforeBtn.setContentAreaFilled(false);
		beforeBtn.setBorderPainted(false);
		beforeBtn.setBounds(15, 4, 14, 14);

		if(pageNo < 2) {
			beforeBtn.setVisible(false);
		} else {
			beforeBtn.setVisible(true);

			beforeBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(SelectAllHonPost2.frontPage2 >= 2 ) {
						SelectAllHonPost2.frontPage2--;
					}

					downPanel.setVisible(false);
					SelectAllHonPost2 sf = new SelectAllHonPost2(frame);
					frame.add(sf.getDownPanel());


					beforeBtn();
					beforeNumber();
					afterBtn();



				}
			});
		}	
	}



	public void afterBtn() {

		int pageNo = SelectAllHonPost2.frontPage2;


		int totalCount = new PagingController().selectWholePostNum(getName.getLocalName(), getName.getCategoryName());

		PagenationPost pagenationpost = new PagenationPost();
		PageInfoPostDTO pageInfo = pagenationpost.getPostPageInfo(pageNo, totalCount, 5, 5);
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

				if(SelectAllHonPost2.frontPage2 < pageInfo.getMaxPage()) {
					SelectAllHonPost2.frontPage2++;
				}

				downPanel.setVisible(false);
				SelectAllHonPost2 sf = new SelectAllHonPost2(frame);
				frame.add(sf.getDownPanel());

				afterBtn();
				beforeBtn();
				beforeNumber();


			}
		});




	}

	public void beforeNumber() {
		String frontPageString = Integer.valueOf(SelectAllHonPost2.frontPage2).toString();
		beforeNumber.setText(frontPageString);
		beforeNumber.setLayout(null);
		beforeNumber.setBounds(50, 4, 14, 14);
		System.out.println(frontPageString);

	}

	public void afterNumber() {

		int pageNo = SelectAllHonPost2.frontPage2;

		int totalCount = new PagingController().selectWholePostNum(getName.getLocalName(), getName.getCategoryName());
		PagenationPost pagenationPost = new PagenationPost();
		PageInfoPostDTO pageInfo = pagenationPost.getPostPageInfo(pageNo, totalCount, 5, 5);
		String backPageString = Integer.valueOf(pageInfo.getMaxPage()).toString();
		afterNumber = new JLabel(backPageString);
		afterNumber.setLayout(null);
		afterNumber.setBounds(85, 4, 14, 14);

	}

	/* 게시글 배경 틀*/
	public void postList() {
		int pageNo = SelectAllHonPost2.frontPage2;
		int y = 153;

		postListDTO = new PagingController().selectPostList(pageNo, getName.getLocalName(), getName.getCategoryName());

		for(int i = 0; i < postListDTO.size(); i++) {

			postList = new JLabel[postListDTO.size()];
			postList[i] = new JLabel();
			postList[i].setLayout(null);
			postList[i].setIcon(new ImageIcon("image/post/postlist1.PNG"));
			postList[i].setBounds(35, y, 431 , 105);
			
			downPanel.add(postList[i]);
			y += 118;
			downPanel.repaint();
			downPanel.revalidate();

		}
	}




	/* 게시글에 맞는 프로필 불러오기 */
	public void profilePictrue() {
		int pageNo = SelectAllHonPost2.frontPage2;
		int y = 153;

		postListDTO = new PagingController().selectPostList(pageNo, getName.getLocalName(), getName.getCategoryName());
		PostDTO postInfo = new PostDTO();

		for(int i = 0; i < postListDTO.size(); i++) {

			postInfo = postListDTO.get(i);
			profilePictrue = new JLabel[postListDTO.size()];
			profilePictrue[i] = new JLabel();
			profilePictrue[i].setLayout(null);
			profilePictrue[i].setBounds(53, y + 12, 40, 40);

			if(postInfo.getMemberProfile().equals("1")) {
				profilePictrue[i].setIcon(new ImageIcon("image/post/commentPf1.png"));
			} else if(postInfo.getMemberProfile().equals("2")) {
				profilePictrue[i].setIcon(new ImageIcon("image/post/commentPf2.png"));
			} else if(postInfo.getMemberProfile().equals("3")) {
				profilePictrue[i].setIcon(new ImageIcon("image/post/commentPf3.png"));
			} else if(postInfo.getMemberProfile().equals("4")) {
				profilePictrue[i].setIcon(new ImageIcon("image/post/commentPf4.png"));
			} else if(postInfo.getMemberProfile().equals("5")) {
				profilePictrue[i].setIcon(new ImageIcon("image/post/commentPf5.png"));
			} else if(postInfo.getMemberProfile() == null) {
				profilePictrue[i].setVisible(false);
			}
			downPanel.add(profilePictrue[i]);
			y += 118;
		}
	}

	/* 게시글 별 작성자 닉네임 불러오기 */
	public void nickName() {
		int pageNo = SelectAllHonPost2.frontPage2;
		int y = 153;

		postListDTO = new PagingController().selectPostList(pageNo, getName.getLocalName(), getName.getCategoryName());
		PostDTO postInfo = null;

		for(int i = 0; i < postListDTO.size(); i++) {

			postInfo = postListDTO.get(i);

			nickName = new JLabel[postListDTO.size()];
			nickName[i] = new JLabel();
			nickName[i].setLayout(null);
			nickName[i].setText(postInfo.getMemberNickname());
			nickName[i].setBounds(100, y + 10, 90, 50);
			downPanel.add(nickName[i]);
			y += 118;

		}	

	}

	/* 카테고리 라벨*/
	public void categoryName() {
		int pageNo = SelectAllHonPost2.frontPage2;
		int y = 153;

		postListDTO = new PagingController().selectPostList(pageNo, getName.getLocalName(), getName.getCategoryName());
		PostDTO postInfo = null;

		for(int i = 0; i < postListDTO.size(); i++) {

			postInfo = postListDTO.get(i);

			categoryName = new JLabel[postListDTO.size()];
			categoryName[i] = new JLabel();
			categoryName[i].setLayout(null);
			categoryName[i].setBounds(188, y + 21, 70, 31);

			if(postInfo.getCategoryName().equals("맛집탐방")) {
				categoryName[i].setIcon(new ImageIcon("image/post/eat.png"));

			} else if(postInfo.getCategoryName().equals("활동")) {
				categoryName[i].setIcon(new ImageIcon("image/post/active.png"));

			} else if(postInfo.getCategoryName().equals("취미")) {
				categoryName[i].setIcon(new ImageIcon("image/post/hobby.png"));

			} else if(postInfo.getCategoryName().equals("산책")) {
				categoryName[i].setIcon(new ImageIcon("image/post/walk.png"));

			} else if(postInfo.getCategoryName().equals("스터디")) {
				categoryName[i].setIcon(new ImageIcon("image/post/study.png"));

			} else if(postInfo.getCategoryName().equals("게임")) {
				categoryName[i].setIcon(new ImageIcon("image/post/game.png"));
			} else {
				categoryName[i].setVisible(false);
			}
			downPanel.add(categoryName[i]);
			y += 118;
		}

	}

	public void postTitle() {
		int pageNo = SelectAllHonPost2.frontPage2;
		int y = 153;

		postListDTO = new PagingController().selectPostList(pageNo, getName.getLocalName(), getName.getCategoryName());
		PostDTO postInfo = null;

		for(int i = 0; i < postListDTO.size(); i++) {

			postInfo = postListDTO.get(i);
			postTitle = new JLabel[postListDTO.size()];
			postTitle[i] = new JLabel();
			postTitle[i].setText(postInfo.getPostName());
			postTitle[i].setLayout(null);
			postTitle[i].setBounds(64, y + 63, 343, 25);
			downPanel.add(postTitle[i]);
			y += 118;

			postTitle[i].addMouseListener(new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent e) {
					System.out.println("세부게시판 조회");

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
		}
	}

	public void localName() {
		int pageNo = SelectAllHonPost2.frontPage2;
		int y = 153;

		postListDTO = new PagingController().selectPostList(pageNo, getName.getLocalName(), getName.getCategoryName());
		PostDTO postInfo = null;

		for(int i = 0; i < postListDTO.size(); i++) {

			postInfo = postListDTO.get(i);		

			localName = new JLabel[postListDTO.size()];
			localName[i] = new JLabel();
			localName[i].setLayout(null);
			localName[i].setBounds(383, y + 6, 46, 25);

			if(postInfo.getLocalName().equals("강릉")) {
				localName[i].setIcon(new ImageIcon("image/post/gangneung.png"));
			} else if(postInfo.getLocalName().equals("담양")) {
				localName[i].setIcon(new ImageIcon("image/post/damyang.png"));
			} else if(postInfo.getLocalName().equals("대구")) {
				localName[i].setIcon(new ImageIcon("image/post/daegu.png"));
			} else if(postInfo.getLocalName().equals("부산")) {
				localName[i].setIcon(new ImageIcon("image/post/busan.png"));
			} else if(postInfo.getLocalName().equals("서울")) {
				localName[i].setIcon(new ImageIcon("image/post/seoul.png"));
			} else if(postInfo.getLocalName().equals("인천")) {
				localName[i].setIcon(new ImageIcon("image/post/incheon.png"));
			} else if(postInfo.getLocalName().equals("순천")) {
				localName[i].setIcon(new ImageIcon("image/post/sooncheon.png"));
			} else if(postInfo.getLocalName().equals("전주")) {
				localName[i].setIcon(new ImageIcon("image/post/jeonju.png"));
			} else if(postInfo.getLocalName().equals("제주")) {
				localName[i].setIcon(new ImageIcon("image/post/jeju.png"));
			} else if(postInfo.getLocalName().equals("천안")) {
				localName[i].setIcon(new ImageIcon("image/post/cheonan.png"));
			} else if (postInfo.getLocalName() == null) {
				localName[i].setVisible(false);
			}

			downPanel.add(localName[i]);
			y += 118;
		}		
	}

	




}