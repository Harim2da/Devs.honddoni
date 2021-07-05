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

import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.post.controller.ContactController;

public class PostModify extends JFrame{
	/* 게시글 세부 조회
	 * 리스트에서 클릭 시 */

	private JFrame mainframe = new JFrame(); 
	private JPanel bottomPanel = new JPanel();
	private JLabel postLabel;
	private JTextField postTitle;
	private JTextField postTitleEdit;
	private JTextArea postContents;
	private JTextArea postContentsEdit;
	private JTextField joinmember;
	private JComboBox selectCategorycombo = PostActionCategory.getInstance();
	
	private JButton postbtn; //게시글 작성 완료 버튼
	
	private JComboBox meetingYear; // 만남 년도 콤보박스
	private JComboBox meetingMonth; // 만남 월 콤보박스
	private JComboBox meetingDay; // 만남 일 콤보박스
	private JComboBox meetingHour; // 만남 시간 콤보박스
	private JComboBox meetingMinutes; // 만남 분 콤보박스
	private PostDTO postDTO;
	private ContactController contactController = new ContactController();
	private JButton commentcheck;
	private JButton modify;
	private JButton delete;
	


	public PostModify() {
		this.setBounds(100, 100, 516, 909);
		this.setLayout(null);

		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.white);	
		this.add(bottomPanel);
		modifyPostTitle();
		modifyPostContents();
		modifyJoinmember();
		selectBtn();
		addComponents();
		
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}


	private void addComponents() {

		postLabel = new JLabel();   // 하단 패널 위 게시글 라벨
		postLabel.setBackground(Color.white);
		postLabel.setLayout(null);
		postLabel.setBounds(35, 0, 500, 724); 
		postLabel.setIcon(new ImageIcon("image/post/detailpost.png"));
		bottomPanel.add(postLabel);

		//		pagebarLabel = new JLabel("");		//페이지 표기 바
		//		pagebarLabel.setLayout(null);
		//		pagebarLabel.setIcon(new ImageIcon("image/post/nextPageButton.png"));
		//		pagebarLabel.setBounds(182, 112, 137, 22);
		//		bottomPanel.add(pagebarLabel);
	}

	/* 게시글 제목 */
	private void modifyPostTitle() {
		postDTO = contactController.selectThePost(10); // 게시글 번호 받아오기

		String title = postDTO.getPostName();
		System.out.println(title);

		postTitle = new JTextField();
		postTitle.setEditable(false);
		postTitle.setBorder(null);
		//		postTitle.setDisabledTextColor(Color.WHITE);
		postTitle.setOpaque(false);
		postTitle.setBounds(113, 30, 322, 28);	// 폰트 크기 키우면 y축 위치 조정
		//		postTitle.setColumns(10);
		postTitle.setText(title);
		bottomPanel.add(postTitle);

	}
	/* 게시글 내용 */
	private void modifyPostContents() {
		postDTO = contactController.selectThePost(10); //괄호 속 게시글 번호 입력받기

		String contents = postDTO.getPostContents();
		System.out.println(contents);
		postContents = new JTextArea();
		postContents.setOpaque(false);
		postContents.setBounds(59, 320, 399, 273);
		postContents.setText(contents);
		postContents.setLineWrap(true);  // 줄바꿈 처리
		postContents.setEditable(false); //수정 불가
		bottomPanel.add(postContents);
		
	}

	/* 모일 인원 */
	private void modifyJoinmember() {
		postDTO = contactController.selectThePost(10);  //괄호 속 게시글 번호 입력받기
		String join = Integer.valueOf(postDTO.getPostNumberOfPeopleNumber()).toString();
		
		joinmember = new JTextField();
		joinmember.setBorder(null);
		joinmember.setOpaque(false);
		joinmember.setBounds(350, 95, 108, 28); // 폰트 크기 키우면 y축 위치 조정
		joinmember.setColumns(10);
		joinmember.setText(join);
		joinmember.setEditable(false);
		bottomPanel.add(joinmember);
	}
	/* 하단 버튼 세 개 - 댓글확인, 게시글 수정, 게시글 삭제 */
	private void selectBtn() {
		commentcheck = new JButton();
		commentcheck.setBounds(35, 683, 140,41);
		commentcheck.setContentAreaFilled(false);
		commentcheck.setBorderPainted(true);
		commentcheck.setOpaque(false);
		bottomPanel.add(commentcheck);
		
		
		modify = new JButton();
		modify.setBounds(180, 683, 140,41);
		modify.setContentAreaFilled(false);
		modify.setBorderPainted(true);
		modify.setOpaque(false);
		bottomPanel.add(modify);
		
		delete = new JButton();
		delete.setBounds(326, 683, 140,41);
		delete.setContentAreaFilled(false);
		delete.setBorderPainted(true);
		delete.setOpaque(false);
		bottomPanel.add(delete);
		
		delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int postNo = postDTO.getPostNo();
			//	int postNo = 10; 테스트용
				contactController.deleteThePost(postNo);
			}
		});
		
	}
	
	
	private void deleteThePost() {
		// 선택한 게시글 삭제 클릭
	}









}
