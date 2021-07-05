package com.devs.honddoni.admin.viewpenel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.devs.honddoni.admin.model.dto.SearchSingletonDTO;
import com.devs.honddoni.common.PagenationComments;
import com.devs.honddoni.common.dto.CommentsDTO;
import com.devs.honddoni.common.dto.PageInfoCommentsDTO;
import com.devs.honddoni.common.dto.PageInfoPostDTO;
import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.post.controller.PagingController;


//공지사항 게시판 화면
public class Notice extends JPanel{
	
	private JFrame frame;
	private Notice notice;
	
	private AdminList adminList; //newPanel로 쓸 것
	private NoticeWrite noticeWrite; //newPanel로 쓸 것
	private PagingController pagingController;
	
	private JLabel beforeNumberlb = new JLabel("");
	private JLabel afterNumberlb;
	private JLabel beforeNumber = new JLabel("");  //페이지를 나타내는 앞의 숫자
	private JLabel afterNumber;
	public static int frontPage = 1;
	private JButton beforeBtn = new JButton();
	private JButton afterBtn = new JButton();
	private JLabel[] postListLb;
	private JButton[] postBtn;
	private List<PostDTO> postDTOLIst = null;
	private JLabel[] title;	
	
	private int postNo;
	private int totalPostNum;
	private PostDTO postDTO;
			
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
		int noticeWholePostNum = pagingController.NoticeWholePostNum();
		
		
		//페이징 버튼과 숫자들		
		beforeNumber();
		afterNumber(1);		
		beforeBtn();
		afterBtn(1);
		
		
		
		//다음 페이지 번호 라벨
		
		/* 다음 페이지로 이동 버튼*/
		
		
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
	    
	    //페이징 버튼들 추가
	    this.add(beforeNumber);
		this.add(afterNumber);
		this.add(beforeBtn);
		this.add(afterBtn);
	    
	    System.out.println("notice패널 : " + notice); //확인용 출력
//	    frame.add(notice);
	    
	    this.setVisible(true);
	}
	
	/* 현재페이지를 나타내는 숫자 */
	public void beforeNumber() {

		String frontPageString = Integer.valueOf(frontPage).toString();

		beforeNumber.setText(frontPageString);
		beforeNumber.setLayout(null);
		beforeNumber.setBounds(230, 206, 14, 14);
		System.out.println(frontPageString);

	}
	
	/* 이전페이지로 이동 버튼*/
	public void beforeBtn() {		
		int pageNo = frontPage;
		
		beforeBtn.setIcon(new ImageIcon("image/post/beforePageButton.png"));
		beforeBtn.setContentAreaFilled(false);
		beforeBtn.setBorderPainted(false);
		beforeBtn.setBounds(185, 205, 14, 14);

		if(pageNo < 2) {
			beforeBtn.setVisible(false);
		} else {
			beforeBtn.setVisible(true);
		}

		System.out.println("frontPage : " + frontPage);

		beforeBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {				
				if(frontPage >= 2 ) { //현재있는 페이지
					frontPage--;
				}

				int noticeWholePostNum = pagingController.NoticeWholePostNum();
				
				postListLb(noticeWholePostNum);

				beforeBtn();
				beforeNumber();
				afterBtn(1);
				System.out.println("frontPage : " + frontPage);
			}
		});
	
	}
	
	/* 최종페이지를 나타내는 숫자 */
	public void afterNumber(int postNo) {
		int pageNo = frontPage;

		int totalCount = new PagingController().NoticeWholePostNum();

		PagenationComments pagenationComments = new PagenationComments();
		PageInfoCommentsDTO pageInfo = pagenationComments.getCommentsPageInfo(pageNo, totalCount, 10, 5);
		String backPageString = Integer.valueOf(pageInfo.getMaxPage()).toString();

		afterNumber = new JLabel(backPageString);
		afterNumber.setLayout(null);
		afterNumber.setBounds(85, 4, 14, 14);

	}
	
	/* 다음페이지로 이동버튼 */
	public void afterBtn(int postNo) {

		this.postNo = postNo;
		int pageNo = frontPage;

		int totalCount = new PagingController().selectWholeCommentsNum(postNo);

		PagenationComments pagenationComments = new PagenationComments();
		PageInfoCommentsDTO pageInfo = pagenationComments.getCommentsPageInfo(pageNo, totalCount, 10, 5);

		afterBtn.setIcon(new ImageIcon("image/.png"));
		afterBtn.setContentAreaFilled(false);
		afterBtn.setBorderPainted(false);
		afterBtn.setBounds(120, 4, 14, 14);

		if(pageNo == pageInfo.getMaxPage()) {
			afterBtn.setVisible(false);
		} else {
			afterBtn.setVisible(true);
		}


		afterBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if(frontPage < pageInfo.getMaxPage()) {
					frontPage++;
				}
				
				afterBtn(1);
				beforeBtn();
				beforeNumber();		

			}
		});
	}
	
	/* 게시물 내용을 나타내는 밑바탕라벨 (디자인용도) */
	public void postListLb(int postNo) {

		int pageNo = frontPage;
		int y = 254; //늘어나는 y축 값
		
		//해당페이지에 맞는 포스트DTO를 List에 담아온다
		postDTOLIst = new PagingController().NoticePostList(pageNo);

		//반복문으로 밑바탕라벨을 깔아준다
		for(int i = 0; i < postDTOLIst.size(); i++) {
//			commentInfo = commentListDTO.get(i);

			postListLb = new JLabel[postDTOLIst.size()];
			postListLb[i] = new JLabel();
			postListLb[i].setLayout(null);
			postListLb[i].setIcon(new ImageIcon("image//notice_postArea.png"));
			postListLb[i].setBounds(35, y, 431, 61);
			notice.add(postListLb[i]);
			y += 62;
		}
	}
	
	/* 해당 게시물로 가는 버튼 */
	public void postBtnAdd(int postNo) {
		
		int pageNo = frontPage;
		int j = 265; //늘어나는 y축 값
		
		postDTOLIst = new PagingController().NoticePostList(pageNo);
		
		for(int i = 0; postDTOLIst.size(); i++) {
			postBtn = new JButton[postDTOLIst.size()];
		}
		
	}
	
	
	
	
	
}

		