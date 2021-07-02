package com.devs.honddoni.post.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.devs.honddoni.common.PagenationComments;
import com.devs.honddoni.common.dto.CommentsDTO;
import com.devs.honddoni.common.dto.PageInfoCommentsDTO;
import com.devs.honddoni.post.controller.PagingController;

public class CommentMain extends JFrame {

	private JPanel upPanel; 		//상단패널
	private JPanel downPanel;		//하단패널
	private JButton sidebarBtn;		//사이드바버튼
	private JButton logoBtn;		//로고버튼
	private JButton commentWriteBtn; //댓글 작성 버튼
	private JLabel commentLongbarLabel; //페이지를 나타낼때 아래 깔래는 바
	private JButton backBtn;         //뒤로 가기
	private JLabel beforeNumber;	      //페이지를 나타내는 앞의 숫자
	private JLabel afterNumber;				//페이지를 나타내는 뒤의 숫자
	private int frontPage = 1;			//현재 페이지
	private JButton beforeBtn;			//페이지를 앞으로 이동하는 버튼
	private JButton afterBtn;			//페이지를 뒤로 이동하는 버튼
	private JLabel commentList;    //댓글리스트의 밑바탕
	List<CommentsDTO> commentListDTO = null;
	
	/* 프레임에서 패널을 더해주기 위한 getter */
	public JPanel getUpPanel() {
		return upPanel;
	}
	public JPanel getDownPanel() {
		return downPanel;
	}
	public JButton getSidebarBtn() {
		return sidebarBtn;
	}
	public JButton getLogoBtn() {
		return logoBtn;
	}
	public JButton getCommentWriteBtn() {
		return commentWriteBtn;
	}
	public JLabel getCommentLongbarLabel() {
		return commentLongbarLabel;
	}
	public JButton getBackBtn() {
		return backBtn;
	}
	public JLabel getBeforeNumber() {
		return beforeNumber;
	}
	public JLabel getAfterNumber() {
		return afterNumber;
	}
	public int getFrontPage() {
		return frontPage;
	}
	public void setFrontPage(int frontPage) {
		this.frontPage = frontPage;
	}
	public JButton getBeforeBtn() {
		return beforeBtn;
	}
	public JButton getAfterBtn() {
		return afterBtn;
	}
	public JLabel getCommentList() {
		return commentList;
	}
	/* 프레임을 제외한 나머지를 합친 것 */
	public void collect() {
		
		upPanel();
		downPanel();
		sidebarBtn();
		logoBtn();
		commentWriteBtn();
		commentLongbarLabel();
		backBtn();
		beforeNumber();
		afterNumber(1);
		beforeBtn(1);
		afterBtn(1);
		commentList(1);
		upPanel.add(sidebarBtn);
		upPanel.add(logoBtn);
		downPanel.add(commentWriteBtn);
		downPanel.add(commentLongbarLabel);
		downPanel.add(backBtn);		
		commentLongbarLabel.add(beforeNumber);
		commentLongbarLabel.add(afterNumber);
		commentLongbarLabel.add(beforeBtn);
		commentLongbarLabel.add(afterBtn);
		
		
		
	}
	/* 상단 패널 */
	public void upPanel() {
		
		upPanel = new JPanel();
		upPanel.setBounds(0, 0, 500, 100);
		upPanel.setLayout(null);
		upPanel.setBackground(Color.WHITE);
		
	}
	
	/* 하단 패널 */
	public void downPanel() {
		
		downPanel = new JPanel();
		downPanel.setBounds(0, 100, 500, 770);
		downPanel.setLayout(null);
		downPanel.setBackground(Color.WHITE);
		
	}
	
	/* 사이드바 3줄 버튼 */
	public void sidebarBtn() {
		
		sidebarBtn = new JButton("");
		sidebarBtn.setIcon(new ImageIcon("image/common/Group 1014.png"));
		sidebarBtn.setContentAreaFilled(false);
		sidebarBtn.setBorderPainted(false);
		sidebarBtn.setBounds(35, 33, 34, 20);
		sidebarBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("사이드바 호출");
				/* 사이드바 나타남 */
				
			}
		});
	}
	
	/* 로고 버튼*/
	public void logoBtn() {
		
		logoBtn = new JButton("");
		logoBtn.setIcon(new ImageIcon("image/post/logoButton.png"));
		logoBtn.setContentAreaFilled(false);
		logoBtn.setBorderPainted(false);
		logoBtn.setBounds(304, 28, 173, 71);
		logoBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("메인페이지 호출");
				/* 메인페이지로 이동 */
				
			}
		});
		
	}
	
	/* 댓글 작성 버튼 */
	public void commentWriteBtn() {
		
		commentWriteBtn = new JButton("");
		commentWriteBtn.setIcon(new ImageIcon("image/post/commentWriteButton.png"));
		commentWriteBtn.setContentAreaFilled(false);
		commentWriteBtn.setBorderPainted(false);
		commentWriteBtn.setBounds(35, 17, 72, 22);
		commentWriteBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("댓글 작성란 호출");
				/* 댓글 작성란 호출 */
			}
		});
		
	}
	
	public void commentLongbarLabel() {
		
		commentLongbarLabel = new JLabel("");
		commentLongbarLabel.setLayout(null);
		commentLongbarLabel.setIcon(new ImageIcon("image/post/nextPageButton.png"));
		commentLongbarLabel.setBounds(182, 17, 137, 22);

	}
	
	public void backBtn() {
		
		backBtn = new JButton("");
		backBtn.setIcon(new ImageIcon("image/post/backButton.png"));
		backBtn.setContentAreaFilled(false);
		backBtn.setBorderPainted(false);
		backBtn.setBounds(444, 17, 22, 22);
		backBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("게시글 조회 호출");
				/* 게시글 조회 호출 */
			}
		});
	}
	
	public void beforeBtn(int postNo) {
		
		int pageNo = frontPage;
//		PageInfoCommentsDTO dto = new PageInfoCommentsDTO();
//		new PagingController().selectWholeCommentsNum(postNo);
//		int totalCount = dto.getTotalCount();	
//		PagenationComments pagenationComments = new PagenationComments();
//		PageInfoCommentsDTO pageInfo = pagenationComments.getCommentsPageInfo(pageNo, totalCount, 2, 5);
		
		beforeBtn = new JButton("");
		beforeBtn.setIcon(new ImageIcon("image/post/beforePageButton.png"));
		beforeBtn.setContentAreaFilled(false);
		beforeBtn.setBorderPainted(false);
		beforeBtn.setBounds(15, 4, 14, 14);
		if(pageNo == 1) {
			beforeBtn.setVisible(false);
		}
		beforeBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("이전페이지로 이동");
				/* 이전페이지 호출*/
			}
		});

		
	}
	
	public void afterBtn(int postNo) {
		
		int pageNo = frontPage;
		PageInfoCommentsDTO dto = new PageInfoCommentsDTO();
		new PagingController().selectWholeCommentsNum(postNo);
		int totalCount = dto.getTotalCount();	
		PagenationComments pagenationComments = new PagenationComments();
		PageInfoCommentsDTO pageInfo = pagenationComments.getCommentsPageInfo(pageNo, totalCount, 2, 5);
		
		afterBtn = new JButton("");
		afterBtn.setIcon(new ImageIcon("image/post/afterPageButton.png"));
		afterBtn.setContentAreaFilled(false);
		afterBtn.setBorderPainted(false);
		afterBtn.setBounds(120, 4, 14, 14);
		if(pageNo == pageInfo.getMaxPage()) {
			afterBtn.setVisible(false);
		}
		afterBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("다음페이지 호출");
				/* 다음페이지 호출*/
			}
		});
	}
	
	public void beforeNumber() {
		
		
		String frontPageString = Integer.valueOf(frontPage).toString();
		
		beforeNumber = new JLabel(frontPageString);
		beforeNumber.setLayout(null);
		beforeNumber.setBounds(50, 4, 14, 14);
		
	}
	
	public void afterNumber(int postNo) {
		
		int pageNo = frontPage;
		
		PageInfoCommentsDTO dto = new PageInfoCommentsDTO();
		new PagingController().selectWholeCommentsNum(postNo);
		int totalCount = dto.getTotalCount();
		PagenationComments pagenationComments = new PagenationComments();
		PageInfoCommentsDTO pageInfo = pagenationComments.getCommentsPageInfo(pageNo, totalCount, 2, 5);
		
		String backPageString = Integer.valueOf(pageInfo.getMaxPage()).toString();
		
		afterNumber = new JLabel(backPageString);
		afterNumber.setLayout(null);
		afterNumber.setBounds(85, 4, 14, 14);
		
	}

	public void commentList(int postNo) {
		
		int pageNo = frontPage;
		int y = 52;
		
		commentListDTO = new PagingController().selectCommentsList(pageNo, postNo);
		
		if(commentListDTO != null) {
			for(int i = 0; i < commentListDTO.size(); i++) {
				
				commentList = new JLabel("");
				commentList.setLayout(null);
				commentList.setIcon(new ImageIcon("image/post/commentWriteListLabelOne.png"));
				commentList.setBounds(35, y, 431, 61);
				
				downPanel.add(commentList);
				
				y += 62;
				
				
			}
		} else {
			commentList.setVisible(false);
		}
		
	}
	
}
