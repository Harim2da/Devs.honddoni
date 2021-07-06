package com.devs.honddoni.search.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.devs.honddoni.common.mainframe.MainFrame;

public class SearchBoardList {
	
	MainFrame frame = new MainFrame();
	
	private JPanel topPanel; // 상단패널
	private JPanel bottomPanel; //하단패널
//	private JLabel bottomLabel;
	private JLabel searchBar; //검색바 라벨---------
	private JButton aim; // 검색 버튼
	private JTextField serach; // 키워드 입력
	//페이징
	
	// 첫번째 게시물
	private JButton AllBoardList1; // 첫 번째 게시물 진입 버튼
	private JLabel listProfile1; //첫 번째 게시물 작성자 프로필---------
	private JLabel nickName1; //첫 번째 게시물 작성자 닉네임------------
	private JLabel location1; //첫 번째 게시물 지역-------------------
	//z order로(하트버튼)
	private JLabel article1; //100byte // 첫 번째 게시물 제목---------
	
	// 두번째 게시물
	private JButton AllBoardList2; // 두 번째 게시물 진입 버튼
	private JLabel listProfile2; //게시물 작성자 프로필----------------
	private JLabel nickName2;  //게시물 작성자 닉네임------------------
	private JLabel location2;  //게시물 지역-------------------------
	//z order로
	private JLabel article2; //100byte  //게시물 제목----------------
	
	// 세번째 게시물
	private JButton AllBoardList3; // 세 번째 게시물 진입 버튼
	private JLabel listProfile3;  //게시물 작성자 프로필----------------
	private JLabel nickName3;  //게시물 작성자 닉네임-------------------
	private JLabel location3;  //게시물 지역-------------------------
	//z order로
	private JLabel article3; //100byte  //게시물 제목----------------
	
	// 네번째 게시물
	private JButton AllBoardList4;  // 네 번째 게시물 진입 버튼
	private JLabel listProfile4; // 게시물 작성자 프로필-----------------
	private JLabel nickName4;  //게시물 작성자 닉네임--------------------
	private JLabel location4;  //게시물 지역--------------------------
	//z order로
	private JLabel article4; //100byte	  //게시물 제목-----------------
	
	// 다섯번째 게시물
	private JButton AllBoardList5;  // 다섯 번째 게시물 진입 버튼
	private JLabel listProfile5;  //게시물 작성자 프로필-----------------
	private JLabel nickName5;  //게시물 작성자 닉네임-----------------------
	private JLabel location5;  //게시물 지역--------------------------
	//z order로
	private JLabel article5; //100byte  //게시물 제목
	
	//전체게시물 조회 화면 불러오기
	public SearchBoardList() {
		bottomPanel();
		clickAim();
//		writeKeyword();
		clickAllBoardList1();
		clickAllBoardList2();
		clickAllBoardList3();
		clickAllBoardList4();
		clickAllBoardList5();
		
		frame.add(bottomPanel);
		
	}
	


//	private void writeKeyword() {
//		search = new JTextField();
//		search.setBorder(null);
//		search.setDisabledTextColor(Color.white);
//		search.setOpaque(false);
//		search.setBounds(106, 168, 326, 29);  
//		search.setColumns(10);
//		
//	}
	
	



	private void bottomPanel() {
		bottomPanel = new JPanel();
		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.black);
		
		//검색바 라벨
		searchBar = new JLabel();
		searchBar.setBackground(Color.white);
		searchBar.setLayout(null);
		searchBar.setBounds(35, 152, 431, 63);  
		searchBar.setIcon(new ImageIcon("image/search/searchBar.png"));
		
		
		
/*--------------------- 첫번째 게시물 관련 라벨 ----------------------*/
		
		//첫번째 게시물 작성자 프로필
		listProfile1 = new JLabel();
		listProfile1.setBackground(Color.white);
		listProfile1.setLayout(null);
		listProfile1.setBounds(53, 164, 37, 40);  
//		listProfile1.setIcon(new ImageIcon("")); <-- 아직 미지정
		
		//첫번째 게시물 작성자 닉네임
		nickName1 = new JLabel();
		nickName1.setBackground(Color.white);
		nickName1.setLayout(null);
		nickName1.setBounds(89, 159, 101, 44);  
//		nickName1.setIcon(new ImageIcon("")); <-- 아직 미지정
		
		//첫번째 게시물 지역
		location1 = new JLabel();
		location1.setBackground(Color.white);
		location1.setLayout(null);
		location1.setBounds(383, 161, 46, 25);  
//		location1.setIcon(new ImageIcon("")); <-- 아직 미지정
		
		//첫번째 게시물 제목
		article1 = new JLabel();
		article1.setBackground(Color.white);
		article1.setLayout(null);
		article1.setBounds(55, 212, 396, 29);  
//		article1.setIcon(new ImageIcon("")); <-- 아직 미지정
		
//----------------------------------------------------------------
		
/*--------------------- 두번째 게시물 관련 라벨 ----------------------*/		
		
		//두번째 게시물 작성자 프로필
		listProfile2 = new JLabel();
		listProfile2.setBackground(Color.white);
		listProfile2.setLayout(null);
		listProfile2.setBounds(53, 282, 37, 40);  
//		listProfile2.setIcon(new ImageIcon("")); <-- 아직 미지정
		
		//두번째 게시물 작성자 닉네임
		nickName2 = new JLabel();
		nickName2.setBackground(Color.white);
		nickName2.setLayout(null);
		nickName2.setBounds(89, 282, 101, 44);  
//		nickName2.setIcon(new ImageIcon("")); <-- 아직 미지정
		
		//두번째 게시물 지역
		location2 = new JLabel();
		location2.setBackground(Color.white);
		location2.setLayout(null);
		location2.setBounds(383, 279, 46, 25);  
//		location2.setIcon(new ImageIcon("")); <-- 아직 미지정
		
		//두번째 게시물 제목
		article2 = new JLabel();
		article2.setBackground(Color.white);
		article2.setLayout(null);
		article2.setBounds(55, 330, 396, 29);  
//		article2.setIcon(new ImageIcon("")); <-- 아직 미지정
		
//----------------------------------------------------------------
		
/*--------------------- 세번째 게시물 관련 라벨 ----------------------*/		
		
		//세번째 게시물 작성자 프로필
		listProfile3 = new JLabel();
		listProfile3.setBackground(Color.white);
		listProfile3.setLayout(null);
		listProfile3.setBounds(53, 400, 37, 40);  
//		listProfile3.setIcon(new ImageIcon("")); <-- 아직 미지정
		
		//세번째 게시물 작성자 닉네임
		nickName3 = new JLabel();
		nickName3.setBackground(Color.white);
		nickName3.setLayout(null);
		nickName3.setBounds(89, 400, 101, 44);  
//		nickName3.setIcon(new ImageIcon("")); <-- 아직 미지정
		
		//세번째 게시물 지역
		location3 = new JLabel();
		location3.setBackground(Color.white);
		location3.setLayout(null);
//		location3.setBounds(383, 397, 46, 25);  <-- 아직 미지정
//		location3.setIcon(new ImageIcon("")); <-- 아직 미지정
		
		//세번째 게시물 제목
		article3 = new JLabel();
		article3.setBackground(Color.white);
		article3.setLayout(null);
//		article3.setBounds(55, 449, 396, 29);  <-- 아직 미지정
//		article3.setIcon(new ImageIcon("")); <-- 아직 미지정
		
//----------------------------------------------------------------		
		
/*--------------------- 네번째 게시물 관련 라벨 ----------------------*/		
		
		//네번째 게시물 작성자 프로필
		listProfile4 = new JLabel();
		listProfile4.setBackground(Color.white);
		listProfile4.setLayout(null);
		listProfile4.setBounds(53, 518, 37, 40); 
//		listProfile4.setIcon(new ImageIcon("")); <-- 아직 미지정
		
		//네번째 게시물 작성자 닉네임
		nickName4 = new JLabel();
		nickName4.setBackground(Color.white);
		nickName4.setLayout(null);
		nickName4.setBounds(89, 518, 101, 44);  
//		nickName4.setIcon(new ImageIcon("")); <-- 아직 미지정
		
		//네번째 게시물 지역
		location4 = new JLabel();
		location4.setBackground(Color.white);
		location4.setLayout(null);
		location4.setBounds(383, 515, 46, 25);  
//		location4.setIcon(new ImageIcon("")); <-- 아직 미지정
		
		//네번째 게시물 제목
		article4 = new JLabel();
		article4.setBackground(Color.white);
		article4.setLayout(null);
		article4.setBounds(55, 567, 396, 29);  
//		article4.setIcon(new ImageIcon("")); <-- 아직 미지정
		
//----------------------------------------------------------------		
		
/*--------------------- 네번째 게시물 관련 라벨 ----------------------*/		
		
		//다섯번째 게시물 작성자 프로필
		listProfile5 = new JLabel();
		listProfile5.setBackground(Color.white);
		listProfile5.setLayout(null);
		listProfile5.setBounds(53, 636, 37, 40);  
//		listProfile5.setIcon(new ImageIcon("")); <-- 아직 미지정
		
		//다섯번째 게시물 작성자 닉네임
		nickName5 = new JLabel();
		nickName5.setBackground(Color.white);
		nickName5.setLayout(null);
		nickName5.setBounds(89, 636, 101, 44);  
//		nickName5.setIcon(new ImageIcon("")); <-- 아직 미지정
		
		//다섯번째 게시물 지역
		location5 = new JLabel();
		location5.setBackground(Color.white);
		location5.setLayout(null);
		location5.setBounds(383, 633, 46, 25);  
//		location5.setIcon(new ImageIcon("")); <-- 아직 미지정
		
		//다섯번째 게시물 제목
		article5 = new JLabel();
		article5.setBackground(Color.white);
		article5.setLayout(null);
		article5.setBounds(55, 685, 396, 29);  
//		article5.setIcon(new ImageIcon("")); <-- 아직 미지정
		
//----------------------------------------------------------------		
		
	}
	
	//검색돋보기 클릭
	private void clickAim() {
		bottomPanel();
		aim = new JButton();
		aim.setIcon(new ImageIcon("image/search/aim.png"));
		aim.setContentAreaFilled(false);
		aim.setBorderPainted(false);
		aim.setBounds(59, 168, 29, 29);  
		
		aim.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 키워드검색 후 조회화면
				System.out.println("키워드 검색 후 조회화면으로");
			}});
	}
	
//		//키워드입력 텍스트필드        <-- 오류났음
//		private void writeKeyword() {
//			search = new JTextField();
//			search.setBorder(null);
//			search.setDisabledTextColor(Color.white);
//			search.setOpaque(false);
//			search.setBounds(106, 168, 326, 29);  
//			search.setColumns(10);
//		}
//	
	
	
	
	//첫번째 게시물 진입
	private void clickAllBoardList1() {
		bottomPanel();
		AllBoardList1 = new JButton();
//		AllBoardList1.setIcon(new ImageIcon(""));
		AllBoardList1.setContentAreaFilled(false);
		AllBoardList1.setBorderPainted(false);
		AllBoardList1.setBounds(35, 152, 431, 105);  
		
		aim.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 첫번째 게시물 진입
				System.out.println("첫번째 게시물에 진입");
			}});
	}
	
	//첫번째 게시물 진입
		private void clickAllBoardList2() {
			bottomPanel();
			AllBoardList2 = new JButton();
//			AllBoardList2.setIcon(new ImageIcon(""));
			AllBoardList2.setContentAreaFilled(false);
			AllBoardList2.setBorderPainted(false);
			AllBoardList2.setBounds(35, 270, 431, 105);  
			
			aim.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// 두번째 게시물 진입
					System.out.println("두번째 게시물에 진입");
				}});
		}
		
		//세번째 게시물 진입
		private void clickAllBoardList3() {
			bottomPanel();
			AllBoardList3 = new JButton();
//			AllBoardList3.setIcon(new ImageIcon(""));
			AllBoardList3.setContentAreaFilled(false);
			AllBoardList3.setBorderPainted(false);
			AllBoardList3.setBounds(35, 388, 431, 105);  
			
			aim.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// 세번째 게시물 진입
					System.out.println("세번째 게시물에 진입");
				}});
		}
		
		//네번째 게시물 진입
		private void clickAllBoardList4() {
			bottomPanel();
			AllBoardList4 = new JButton();
//			AllBoardList4.setIcon(new ImageIcon(""));
			AllBoardList4.setContentAreaFilled(false);
			AllBoardList4.setBorderPainted(false);
			AllBoardList4.setBounds(35, 506, 431, 105);  
			
			aim.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// 네번째 게시물 진입
					System.out.println("네번째 게시물에 진입");
				}});
		}
		
		//다섯번째 게시물 진입
		private void clickAllBoardList5() {
			bottomPanel();
			AllBoardList5 = new JButton();
//			AllBoardList5.setIcon(new ImageIcon(""));
			AllBoardList5.setContentAreaFilled(false);
			AllBoardList5.setBorderPainted(false);
			AllBoardList5.setBounds(35, 624, 431, 105);  
			
			aim.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// 다섯번째 게시물 진입
					System.out.println("다섯번째 게시물에 진입");
				}});
		}
		
		
	
}


