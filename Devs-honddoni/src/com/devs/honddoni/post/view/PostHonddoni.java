package com.devs.honddoni.post.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
	private PostActionCategory postA;

	
	/*혼또니 게시글 작성 화면 불러오기*/
	public PostHonddoni() {
		this.setBounds(100, 100, 516, 909);
		this.setLayout(null);
		topPanel();
		selectPost();
		createPostTitle();
		selectLocal();
		insertJoinMember();
		postA = new PostActionCategory();
		
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


		
		
		bottomPanel.add(bottomLabel);
		
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
	
	private void createPostTitle() {
		postTitle = new JTextField();
		postTitle.setBorder(null);
		postTitle.setDisabledTextColor(Color.WHITE);
		postTitle.setOpaque(false);
		postTitle.setBounds(113, 25, 322, 28);	// 폰트 크기 키우면 y축 위치 조정
		postTitle.setColumns(10);
	}
	
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
	
	private void insertJoinMember() {
		joinmember = new JTextField();
		joinmember.setBorder(null);
		joinmember.setOpaque(false);
		joinmember.setBounds(327, 90, 108, 28); // 폰트 크기 키우면 y축 위치 조정
		joinmember.setColumns(10);
	}
	
	
	
	
}
