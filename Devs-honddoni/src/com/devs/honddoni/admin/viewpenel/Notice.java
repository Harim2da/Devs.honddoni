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

import com.devs.honddoni.admin.model.dto.SearchSingletonDTO;
import com.devs.honddoni.post.controller.PagingController;
import com.devs.honddoni.common.dto.PageInfoCommentsDTO;
import com.devs.honddoni.post.controller.PagingController;


//공지사항 게시판 화면
public class Notice extends JPanel{
	
	private JFrame frame;
	private Notice notice;
	
	private AdminList adminList; //newPanel로 쓸 것
	private NoticeWrite noticeWrite; //newPanel로 쓸 것
	
	private JLabel beforeNumber = new JLabel("");
			
	public Notice() {

		this.frame = FrameManagerYs.getFrame(); //요래...해볼까
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
				
				//관리자메인 페이지로 나감
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
		searchLb.setIcon(new ImageIcon("image/admin/notice_searchArea.png"));
		
		/* 입력받는 텍스트필드들 */
		JTextField searchTf = new JTextField();
		searchTf.setBounds(107, 143, 328, 30);
		
		/* 검색어입력 받아서 검색하는 버튼 */
		JButton searchBtn = new JButton();
		searchBtn.setBounds(60, 144, 29, 29);
		searchBtn.setIcon(new ImageIcon("image/admin/notice_glassBtn.png"));
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
				
//				FrameManagerYs.changePanel(notice, new NoticeWrite());
				frame.remove(notice);
				frame.add(new NoticeWrite());
				frame.repaint();
				frame.revalidate();
			}
		});
		
		
		/* 공지사항 작성 버튼 */
		JButton writeNoticeBtn = new JButton();
		writeNoticeBtn.setBounds(36, 228, 72, 22);
		writeNoticeBtn.setBorderPainted(false);
		writeNoticeBtn.setIcon(new ImageIcon("image/admin/NoticeWrite.png"));
		
		
		/* 공지사항 게시글 반복문 */
		//페이징에서 공지게시판 전체글 수 받아오기
		PagingController pagingController = new PagingController();		
		pagingController.NoticeWholePostNum();
		
		
		
		//반복문
		//패널깔기
		//패널이미지는 "image/admin/NoticeButton.png"
		
		//제목라벨생성(좌표에 +100정도)
		//제목라벨붙이기
		//해당공지로 넘어가는 버튼 - 액션리스너 - noticeContentView로 넘어가야
		
		
		
		
		
	    //패널에 버튼 추가
	    this.add(honddoniBtn);
	    this.add(searchLb);
	    this.add(searchTf);
	    this.add(searchBtn);
	    this.add(writeNoticeBtn);	     
	    
	    System.out.println("notice패널 : " + notice); //확인용 출력
//	    frame.add(notice);
	    
	    this.setVisible(true);
	}
}

		