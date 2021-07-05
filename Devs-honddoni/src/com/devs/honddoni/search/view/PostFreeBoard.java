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

import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.common.mainframe.MainFrame;


public class PostFreeBoard extends JPanel {
	
		private PostFreeBoard postFreeBoard;
		private MainFrame frame;

//		private JFrame mainFrame; // 메인프레임
		private JPanel topPanel;  // 상단 패널
		private JPanel bottomPanel; // 하단 패널
		private JLabel bottomLabel; // 하단 게시판 라벨
		private JButton postFreeBtn; // 혼또니 게시판 버튼 -> 자유로
		private JTextField postTitle; // 게시글 제목
		private JTextArea postContents; // 게시글 내용 
		private JButton postbtn; //게시글 작성 완료 버튼
		private PostDTO postDTO = new PostDTO();
		
		


		/*자유 게시글 작성 화면 불러오기*/
		public PostFreeBoard(MainFrame frame) {
			
			
			postFreeBoard = this;
			this.frame = frame;
			this.postFreeBoard = this;
//			this.setBounds(100, 100, 516, 909);
//			this.setLayout(null);
//			topPanel();
			selectPost();
			createPostTitle();
			postContents();
			postButton();
		
			addPostComponent();
			
			this.setVisible(true);
//			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}

//		/*상단 패널 생성*/
//		public void topPanel() {
//			topPanel = new JPanel();
//			topPanel.setBounds(0, 0, 500, 100);
//			topPanel.setLayout(null);
//			topPanel.setBackground(Color.WHITE);
//
//		}

		/*하단 패널 생성*/
		public void bottomPanel() {
			bottomPanel = new JPanel();
			bottomPanel.setBounds(0, 100, 500, 770);
			bottomPanel.setLayout(null);
			bottomPanel.setBackground(Color.WHITE);		

			/* 하단 패널 위 라벨 생성*/
			bottomLabel = new JLabel("");
			bottomLabel.setBackground(Color.WHITE);
			bottomLabel.setLayout(null);
			bottomLabel.setBounds(35, 14, 431, 648);            
			bottomLabel.setIcon(new ImageIcon("image/post/postbtmpanel.png"));

		}


		/* 게시글 작성 화면 내 쌓아올리기  */
		public void addPostComponent() {

			this.add(topPanel);
			this.add(bottomPanel);
			
			bottomPanel.add(postFreeBtn);
			bottomPanel.add(postTitle);
			bottomPanel.add(postContents);
			bottomPanel.add(postbtn);
			bottomPanel.add(bottomLabel);
			
			this.repaint();
			this.revalidate();

		}

		/*게시판 종류 선택 - 자유*/
		private void selectPost() {
			bottomPanel();
			postFreeBtn = new JButton();
			postFreeBtn.setIcon(new ImageIcon("image/search/freebutton.png"));
			postFreeBtn.setContentAreaFilled(false);
			postFreeBtn.setBorderPainted(false);
			postFreeBtn.setBounds(43, 20, 56, 30);


			postFreeBtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// 자유게시판으로 전환
					System.out.println("자유게시판 전환");
				}
			});
		}

		/*자유 게시판 제목 작성*/
		private void createPostTitle() {
			postTitle = new JTextField();
			postTitle.setBorder(null);
			postTitle.setDisabledTextColor(Color.WHITE);
			postTitle.setOpaque(false);
			postTitle.setBounds(113, 25, 322, 28);	
			postTitle.setColumns(10);
		}

		/* 게시글 작성*/
		private void postContents() {
			postContents = new JTextArea();
			postContents.setOpaque(false);
			postContents.setBounds(59, 305, 399, 273);

		}

		
		/* 게시글 작성 완료 버튼*/
		private void postButton() {
			postbtn = new JButton();
			postbtn.setBounds(129, 684, 263, 41);
			postbtn.setIcon(new ImageIcon("image/post/postbutton.png"));
			postbtn.setContentAreaFilled(false);
			postbtn.setBorderPainted(false);
			postbtn.setOpaque(false);


			postbtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					postDTO = new PostDTO();


					/* 게시글 정보 담기 : 게시글 제목, 내용  */
					postDTO.setPostName(postTitle.getText()); //게시글 제목
					postDTO.setPostContents(postContents.getText()); // 게시글 내용
					postDTO.setPostCategory("자유");
					
					System.out.println("호출");
				}
			});


		}

	}


	
	
	
	
	
	
	
	

