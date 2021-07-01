package com.devs.honddoni.search.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AllBoardList extends JFrame{

	private JPanel mainPanel;
	private JPanel topPanel;
	private JPanel bottomPanel;
	private JLabel bottomLabel;
	private JLabel searchBar;
	private JButton aim;
	private JTextField serach;
	//페이징
	
	// 첫번째 게시물
	private JButton AllBoardList1;
	private JLabel listProfile1;
	private JLabel nickName1;
	private JLabel location1;
	//z order로(하트버튼)
	private JLabel article1; //100byte
	
	// 두번째 게시물
	private JButton AllBoardList2;
	private JLabel listProfile2;
	private JLabel nickName2;
	private JLabel location2;
	//z order로
	private JLabel article2; //100byte
	
	// 세번째 게시물
	private JButton AllBoardList3;
	private JLabel listProfile3;
	private JLabel nickName3;
	private JLabel location3;
	//z order로
	private JLabel article3; //100byte
	
	// 네번째 게시물
	private JButton AllBoardList4;
	private JLabel listProfile4;
	private JLabel nickName4;
	private JLabel location4;
	//z order로
	private JLabel article4; //100byte	
	
	// 다섯번째 게시물
	private JButton AllBoardList5;
	private JLabel listProfile5;
	private JLabel nickName5;
	private JLabel location5;
	//z order로
	private JLabel article5; //100byte
	
	//전체게시물 조회 화면 불러오기
	public AllBoardList() {
		this.setBounds(100, 100, 516, 909);
		this.setLayout(null);
		topPanel();
		
		searchAim();

		/*첫번째 게시물 관련*/
		updateAllBoardList1();
		
		
		
		addAllBoardListComponent();
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public void addAllBoardListComponent() {
		
	}
	
	//상단패널생성
	public void topPanel() {
		topPanel = new JPanel();
		topPanel.setBounds(0, 0, 500, 100);
		topPanel.setLayout(null);
		topPanel.setBackground(Color.white);
		
	}
	
	//하단패널생성
	public void bottomPanel() {
		bottomPanel = new JPanel();
		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.white);
		
		
		bottomLabel = new JLabel("");
		bottomLabel.setBounds(0, 100, 500, 770);
		bottomLabel.setLayout(null);
		bottomLabel.setBackground(Color.white);
		bottomLabel.setIcon(new ImageIcon(AllBoardListView.class.getResource("/seach/search.png")));
		
	}
	
	private void searchAim() {
		bottomPanel();
		
		
		
	}
	
	private void updateAllBoardList1() {
		
		
	}
	
	
	
}





































