package com.devs.honddoni.search.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.devs.honddoni.post.view.PostView;

public class FreeBoard extends JFrame {

//	private JFrame mainFrame;
	private JPanel topPanel;
	private JPanel bottomPanel;
	private JLabel bottomLabel;
	private JButton selectBoardType;
	private JTextField freeBoardTitle;
	private JTextArea freeBoardContents;
	private JButton uploadBtn;
	
	// 자유게시글 작성 화면 불러오기
	public FreeBoard() {
		this.setBounds(100, 100, 516, 909);
		this.setLayout(null);
		topPanel();
		selectBoard();
		createFreeBoardTitle();
		freeBoardContents();
		uploadButton();
		
		addFreeBoardComponent();
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// 상단 패널 생성
	public void topPanel() {
		topPanel = new JPanel();
		topPanel.setBounds(0, 0, 500, 100);
		topPanel.setLayout(null);
		topPanel.setBackground(Color.white);
	}
	
	// 하단 패널 생성
	public void bottomPanel() {
		bottomPanel = new JPanel();
		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.white);
		
		bottomLabel = new JLabel("");
		bottomLabel.setBounds(35, 14, 431, 648);
		bottomLabel.setLayout(null);
		bottomLabel.setBackground(Color.white);
		bottomLabel.setIcon(new ImageIcon(FreeBoardView.class.getResource("/post/postbtmpanel.png")));
	}
	
	// 게시판 종류 선택
	private void selectBoard() {
		bottomPanel();
		selectBoardType = new JButton();
		selectBoardType.setIcon(new ImageIcon(PostView.class.getResource("/search/freeboardtype.png")));
		selectBoardType.setContentAreaFilled(false);
		selectBoardType.setBorderPainted(false);
		selectBoardType.setBounds(43, 20, 56, 30);
		
		selectBoardType.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("혼또니게시판 전환");
			}
		});
		
	}
	
	// 자유게시판 제목 작성
	private void createFreeBoardTitle() {
		freeBoardTitle = new JTextField();
		freeBoardTitle.setBorder(null);
		freeBoardTitle.setDisabledTextColor(Color.white);
		freeBoardTitle.setOpaque(false);
		freeBoardTitle.setBounds(113, 25, 322, 28);
		freeBoardTitle.setColumns(10);
	}
	
	// 게시글 작성
	private void freeBoardContents() {
		freeBoardContents = new JTextArea();
		freeBoardContents.setOpaque(false);
		freeBoardContents.setBounds(59, 305, 399, 273);
		
	}
	
	/* 게시글 작성 완료 버튼*/
	private void uploadButton() {
		uploadBtn = new JButton();
		uploadBtn.setBounds(129, 684, 263, 41);
		uploadBtn.setIcon(new ImageIcon(PostView.class.getResource("/post/postbutton.png")));
		uploadBtn.setContentAreaFilled(false);
		uploadBtn.setBorderPainted(false);
	}
	
	
	public void addFreeBoardComponent() {
		
		this.add(topPanel);
		this.add(bottomPanel);
		bottomPanel.add(selectBoardType);
		bottomPanel.add(freeBoardTitle);
		bottomPanel.add(freeBoardContents);
		
		bottomPanel.add(bottomLabel);
		this.getIgnoreRepaint();
		this.revalidate();
	}
	
	
	
	
	
}








