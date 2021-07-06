package com.devs.honddoni.search.view.useless;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.devs.honddoni.common.mainframe.MainFrame;

public class FreeBoard extends JPanel {
	
	private FreeBoard freeBoard;
	private MainFrame frame;
	
	private JPanel mainPanel;
	private JPanel upPanel;
	private JPanel bottomPanel;
	private JLabel bottomLabel;
	private JButton selectBoardType;
	private JTextField freeBoardTitle;
	private JTextArea freeBoardContents;
	private JButton uploadBtn;
	
	private JButton myHonddoniBtn;								//마이페이지 이동 버튼
	private JButton searchHonddoniBtn;							//게시글 작성페이지 이동 버튼
	private JButton homeBtn;									//메인화면이동 버튼
	private JButton interestingBtn;								//관심글 목록 이동 버튼
	private JButton noticeBtn;									//공지사항 목록 이동 버튼	
	private JLabel backgroundImage;								//로고 포함 테두리 배경 (디자인용)
	
	// 자유게시글 작성 화면 불러오기
	public FreeBoard() {
//		this.setBounds(100, 100, 516, 909);
//		this.setLayout(null);
//		topPanel();
		
		freeBoard = this;
		this.frame = frame;
		this.freeBoard = this;
		
		/* 상단패널에 포함될 버튼 */
		myHonddoniBtn();
		searchHonddoniBtn();
		homeBtn();
		interestingBtn();
		noticeBtn();
		
		selectBoard();
		createFreeBoardTitle();
		freeBoardContents();
		uploadButton();
		
		addFreeBoardComponent();
		
		/* 버튼들을 상단패널에 더해줌 */
		upPanel.add(myHonddoniBtn);
		upPanel.add(searchHonddoniBtn);
		upPanel.add(homeBtn);
		upPanel.add(interestingBtn);
		upPanel.add(noticeBtn);
		upPanel.add(backgroundImage);
		
		frame.add(this);
//		this.setVisible(true);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// 상단 패널 생성
//	public void topPanel() {
//		topPanel = new JPanel();
//		topPanel.setBounds(0, 0, 500, 100);
//		topPanel.setLayout(null);
//		topPanel.setBackground(Color.white);
//	}
//	
	// 하단 패널 생성
//	public void bottomPanel() {
//		bottomPanel = new JPanel();
//		bottomPanel.setBounds(0, 100, 500, 770);
//		bottomPanel.setLayout(null);
//		bottomPanel.setBackground(Color.white);
//		
//		bottomLabel = new JLabel("");
//		bottomLabel.setBounds(35, 14, 431, 648);
//		bottomLabel.setLayout(null);
//		bottomLabel.setBackground(Color.white);
//		bottomLabel.setIcon(new ImageIcon("image/search/writeFreeBoard"));
//		
//		frame.repaint();
//		frame.revalidate();
//		bottomPanel.repaint();
//		bottomPanel.revalidate();
		
//	}

/* 상단 패널 */
public void upPanel() {

	upPanel = new JPanel();
	upPanel.setBounds(0, 0, 500, 100);
	upPanel.setLayout(null);
	upPanel.setBackground(Color.WHITE);

	/* 상단 패널 뒷배경 생성 */
	backgroundImage = new JLabel("");
	backgroundImage.setBounds(0, 0, 500, 100);
	backgroundImage.setIcon(new ImageIcon("image/common/toppanel/backgroundImage.png"));
	backgroundImage.setVisible(true); 

}


/* 하단 패널 */
public void bottomPanel() {

	bottomPanel = new JPanel();
	bottomPanel.setBounds(0, 100, 500, 770);
	bottomPanel.setLayout(null);
	bottomPanel.setBackground(Color.WHITE);
	
	this.add(bottomPanel);

}
	
/* My혼또니(마이페이지 화면으로 이동) 버튼 */
public void myHonddoniBtn() {

	myHonddoniBtn = new JButton("");
	myHonddoniBtn.setBounds(171,23,56,56);
	myHonddoniBtn.setIcon(new ImageIcon("image/common/toppanel/myHonddoniBtn.png"));
	myHonddoniBtn.setBorderPainted(false);
	myHonddoniBtn.setContentAreaFilled(false);
	myHonddoniBtn.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("my혼또니 버튼 클릭");
		}
	});

}

/* 혼또니 찾기(게시글 작성) 버튼 */
public void searchHonddoniBtn() {

	searchHonddoniBtn = new JButton("");
	searchHonddoniBtn.setBounds(234,23,56,56);
	searchHonddoniBtn.setIcon(new ImageIcon("image/common/toppanel/SearchHonddoniBtn.png"));
	searchHonddoniBtn.setBorderPainted(false);
	searchHonddoniBtn.setContentAreaFilled(false);
	searchHonddoniBtn.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("혼또니 찾기 버튼 클릭");
		}
	});

}

/* Home(메인화면으로 이동) 버튼 생성 */
public void homeBtn() {

	homeBtn = new JButton("");
	homeBtn.setBounds(298,23,56,56);
	homeBtn.setIcon(new ImageIcon("image/common/toppanel/HomeBtn.png"));
	homeBtn.setBorderPainted(false);
	homeBtn.setContentAreaFilled(false);
	homeBtn.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("홈  버튼 클릭");
		}
	});

}

/* 관심금 목록페이지로 이동하는 버튼 생성 */
public void interestingBtn() {

	interestingBtn = new JButton("");
	interestingBtn.setBounds(362,23,56,56);
	interestingBtn.setIcon(new ImageIcon("image/common/toppanel/InterestingBtn.png"));
	interestingBtn.setBorderPainted(false);
	interestingBtn.setContentAreaFilled(false);
	interestingBtn.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("관심글 목록 버튼 클릭");
		}
	});

}

/* 공지사항목록을 조회할 수 있는 버튼 생성 */
public void noticeBtn() {

	noticeBtn = new JButton("");
	noticeBtn.setBounds(426,23,56,56);
	noticeBtn.setIcon(new ImageIcon("image/common/toppanel/NoticeBtn.png"));
	noticeBtn.setBorderPainted(false);
	noticeBtn.setContentAreaFilled(false);
	noticeBtn.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("공지사항 버튼 클릭");
		}
	});

}

	// 게시판 종류 선택
	public void selectBoard() {
		bottomPanel();
		selectBoardType = new JButton();
		selectBoardType.setIcon(new ImageIcon("image/search/freeboardtype"));
		selectBoardType.setContentAreaFilled(false);
		selectBoardType.setBorderPainted(false);
		selectBoardType.setBounds(43, 20, 56, 30);
		
		selectBoardType.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("자유 전환");
			}
		});
		
	}
	
	// 자유게시판 제목 작성
	public void createFreeBoardTitle() {
		freeBoardTitle = new JTextField();
		freeBoardTitle.setBorder(null);
		freeBoardTitle.setDisabledTextColor(Color.white);
		freeBoardTitle.setOpaque(false);
		freeBoardTitle.setBounds(113, 25, 322, 28);
		freeBoardTitle.setColumns(10);
	}
	
	// 게시글 작성
	public void freeBoardContents() {
		freeBoardContents = new JTextArea();
		freeBoardContents.setOpaque(false);
		freeBoardContents.setBounds(59, 305, 399, 273);
		
	}
	
	/* 게시글 작성 완료 버튼*/
	public void uploadButton() {
		uploadBtn = new JButton();
		uploadBtn.setBounds(129, 684, 263, 41);
		uploadBtn.setIcon(new ImageIcon("image/seach/post/postbutton.png"));
		uploadBtn.setContentAreaFilled(false);
		uploadBtn.setBorderPainted(false);
	}
	
	
	public void addFreeBoardComponent() {
		
//		this.add(topPanel);
//		this.add(bottomPanel);
		bottomPanel.add(selectBoardType);
		bottomPanel.add(freeBoardTitle);
		bottomPanel.add(freeBoardContents);
		
		bottomPanel.add(bottomLabel);
//		this.getIgnoreRepaint();
//		this.revalidate();
		
//		frame.repaint();
//		frame.revalidate();
		bottomPanel.repaint();
		bottomPanel.revalidate();
	}
	
	
	
	
	
}








