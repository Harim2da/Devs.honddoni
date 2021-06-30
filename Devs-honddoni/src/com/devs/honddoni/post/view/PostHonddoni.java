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

public class PostHonddoni extends JFrame{
	
	private JFrame mainFrame;
	private JPanel topPanel;
	private JPanel bottomPanel;
	private JLabel bottomLabel;
	private JButton postTypebtn;
	private JTextField postTitle;
	private JButton localSelectbtn;
	private JTextField joinmember;
	private JTextArea postContents;
	private JComboBox selectCategorycombo = PostActionCategory.getInstance();
	private JButton postbtn;
	private JComboBox meetingYear;
	private JComboBox meetingMonth;
	private JComboBox meetingDay;
	private JComboBox meetingHour;
	private JComboBox meetingMinutes;
	
	/*혼또니 게시글 작성 화면 불러오기*/
	public PostHonddoni() {
		this.setBounds(100, 100, 516, 909);
		this.setLayout(null);
		topPanel();
		selectPost();
		createPostTitle();
		selectLocal();
		insertJoinMember();
		postContents();
		postButton();
		addPostComponent();

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	/*상단 패널 생성*/
	public void topPanel() {
		topPanel = new JPanel();
		topPanel.setBounds(0, 0, 500, 100);
		topPanel.setLayout(null);
		topPanel.setBackground(Color.WHITE);
		
	}
	
	/*하단 패널 생성*/
	public void bottomPanel() {
		bottomPanel = new JPanel();
		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.WHITE);		
		
		bottomLabel = new JLabel("");
		bottomLabel.setBackground(Color.WHITE);
		bottomLabel.setLayout(null);
		bottomLabel.setBounds(35, 14, 431, 648);            
		bottomLabel.setIcon(new ImageIcon(PostView.class.getResource("/post/postbtmpanel.png")));

	}
	
	/* 게시글 작성 화면 내 쌓아올리기 - 순서 중요 */
	public void addPostComponent() {
		
		this.add(topPanel);
		this.add(bottomPanel);
		bottomPanel.add(postTypebtn);
		bottomPanel.add(postTitle);
		bottomPanel.add(localSelectbtn);
		bottomPanel.add(joinmember);	
		bottomPanel.add(selectCategorycombo);
		
		bottomPanel.add(postContents);
		bottomPanel.add(postbtn);
		bottomPanel.add(bottomLabel);
//		this.repaint();
//		this.revalidate();
		
	}
	
	/*게시판 종류 선택*/
	private void selectPost() {
		bottomPanel();
		postTypebtn = new JButton();
		postTypebtn.setIcon(new ImageIcon(PostView.class.getResource("/post/postcategory.png")));
		postTypebtn.setContentAreaFilled(false);
		postTypebtn.setBorderPainted(false);
		postTypebtn.setBounds(43, 20, 56, 30);
		
	
		postTypebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 자유게시판으로 전환
				System.out.println("자유게시판 전환");
			}
		});
	}
	
	/*혼또니 게시판 제목 작성*/
	private void createPostTitle() {
		postTitle = new JTextField();
		postTitle.setBorder(null);
		postTitle.setDisabledTextColor(Color.WHITE);
		postTitle.setOpaque(false);
		postTitle.setBounds(113, 25, 322, 28);	// 폰트 크기 키우면 y축 위치 조정
		postTitle.setColumns(10);
	}
	
	/*지역 선택 버튼*/
	private void selectLocal() {
		localSelectbtn = new JButton("");
		localSelectbtn.setOpaque(false);
		localSelectbtn.setContentAreaFilled(false);
		localSelectbtn.setBorderPainted(false);
		localSelectbtn.setBounds(105, 78, 125, 31);
		localSelectbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 지도 팝업
				System.out.println("지도팝업");
			}
		});
		
	}
	
	/*모집 인원 기입*/
	private void insertJoinMember() {
		joinmember = new JTextField();
		joinmember.setBorder(null);
		joinmember.setOpaque(false);
		joinmember.setBounds(327, 90, 108, 28); // 폰트 크기 키우면 y축 위치 조정
		joinmember.setColumns(10);
	}
	
	/* 게시글 작성*/
	private void postContents() {
		postContents = new JTextArea();
		postContents.setOpaque(false);
		postContents.setBounds(59, 305, 399, 273);
		
	}
	
	private void postMeetingTime() {
		
		meetingYear = new JComboBox();
		meetingMonth
		meetingDay
		meetingHour
		meetingMinutes
	}
	
	
	
	
	
	
	
	/* 게시글 작성 완료 버튼*/
	private void postButton() {
		postbtn = new JButton();
		postbtn.setBounds(129, 684, 263, 41);
		postbtn.setIcon(new ImageIcon(PostView.class.getResource("/post/postbutton.png")));
		postbtn.setContentAreaFilled(false);
		postbtn.setBorderPainted(false);
	}
	
	
}
