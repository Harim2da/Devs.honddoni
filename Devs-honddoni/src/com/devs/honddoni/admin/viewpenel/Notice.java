package com.devs.honddoni.admin.viewpenel;

import java.awt.Color; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.devs.honddoni.admin.dto.SearchSingletonDTO;
import com.devs.honddoni.member.controller.MemberController;

//공지사항 화면

public class Notice extends JPanel{
	
	JFrame frame;
	Notice notice;
	
//	private AdminList adminList; //newPanel로 쓸 것
	private NoticeWrite noticeWrite; //newPanel로 쓸 것
			
	public Notice() {

		this.frame = FrameManagerYs.getFrame();
		this.notice = this;
		
		/* 제일 기본 패널 (init)*/
		this.setBounds(0, 0, 500, 870);
		this.setLayout(null);
		this.setBackground(Color.yellow);
		System.out.println("Notice 패널 생성");	

		/* 혼또니 로고버튼 */
		JButton honddoniBtn = new JButton("");
		honddoniBtn.setBounds(305, 29, 173, 71);
		honddoniBtn.setIcon(new ImageIcon("image/admin/HondoniWrite.png"));
		honddoniBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//관리자메인 페이지로 이동
//				FrameManagerYs.changePanel(notice, new 관리자메인());
//				frame.remove(notice);
//				frame.add(adminList);
//				frame.repaint();
//				frame.revalidate();
				
			}
		});
		
		/* 검색창 라벨 */
		JLabel searchLb = new JLabel();
		searchLb.setBounds(35, 127, 433, 62);
		searchLb.setBackground(null);
		searchLb.setIcon(new ImageIcon("image/admin/Find.png"));
		
		/* 입력받는 텍스트필드들 */
		JTextField searchTf = new JTextField();
		searchTf.setBounds(107, 143, 328, 30);
		
		/* 검색어입력 받아서 검색하는 버튼 */
		JButton searchBtn = new JButton();
		searchBtn.setBounds(60, 144, 29, 29);
//		searchBtn.setIcon(new ImageIcon(""));		// 이미지를 새로 넣어야 함
		searchBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//검색할 단어
				String getText = searchTf.getText();
				
				//게시판 검색...	
				SearchSingletonDTO searchSingletonDTO = SearchSingletonDTO.getInstance();
				searchSingletonDTO.setGetSearchWord(getText);
				
				//싱글톤갖다쓸 때
//				SearchSingletonDTO searchSingletonDTO = SearchSingletonDTO.getInstance();
//				searchSingletonDTO.getGetSearchWord();
				
				FrameManagerYs.changePanel(notice, new NoticeWrite());
			}
		});
		
		
		/* 공지사항 작성 버튼 */
		JButton writeNoticeBtn = new JButton();
		writeNoticeBtn.setBounds(60, 144, 29, 29);
		writeNoticeBtn.setBorderPainted(false);
		writeNoticeBtn.setIcon(new ImageIcon("image/admin/NoticeWrite.png"));
		
		
		/* 공지사항 게시글 반복문 */
		//페이징에서 전체글 수 받아오기
		
		//반복문
		//패널깔기
		//패널이미지는 "image/admin/NoticeButton.png"
		//제목라벨생성(좌표에 +100정도)
		//제목라벨붙이기
		
		
		
		
		
	    //패널에 버튼 추가
	    this.add(honddoniBtn);
	    this.add(searchLb);
	    this.add(searchTf);
	    this.add(searchBtn);
	    this.add(writeNoticeBtn);	     
	    
	    System.out.println(notice);
	    frame.add(notice);
	    this.setVisible(true);
	}
}

		