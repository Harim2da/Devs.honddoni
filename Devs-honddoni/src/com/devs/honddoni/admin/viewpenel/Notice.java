package com.devs.honddoni.admin.viewpenel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.devs.honddoni.member.controller.MemberController;

//공지사항 화면

public class Notice extends JPanel{
	
	MainFrame1 frame;
	Notice notice;
	
	private AdminList adminList; //newPanel로 쓸 것
	
	private MemberController memberController = new MemberController();
	
	private JButton btn1;
	
	public Notice(MainFrame1 mainFrame1) {

		this.frame = mainFrame1;
		this.notice = this;
		
		
		/* 제일 기본 패널 */
		notice.setBounds(0, 0, 500, 870);
		notice.setLayout(null);
		notice.setBackground(Color.yellow);

		frame.add(notice);
		

		/* 혼또니 로고버튼 */
		JButton honddoniBtn = new JButton("");
		honddoniBtn.setBounds(305, 29, 173, 71);
		honddoniBtn.setIcon(new ImageIcon("image/admin/Mark.png"));
		honddoniBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//관리자메인 페이지로 이동
//				adminList = new AdminList();				
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
		
		/* 개인정보 입력받아서 검색하는 버튼 */
		JButton searchBtn = new JButton();
		searchBtn.setBounds(60, 144, 29, 29);
//		searchBtn.setIcon(new ImageIcon(""));		// 이미지를 새로 넣어야 함
		searchBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//검색할 단어
				String getText = searchTf.getText();
				
				//게시판 검색...				
				
			}
		});
		
		
		/* 공지사항 작성 버튼 */
		JButton writeNoticeBtn = new JButton();
		searchBtn.setBounds(60, 144, 29, 29);
		
		
		
	    //패널에 버튼 추가
	    notice.add(honddoniBtn);
	    notice.add(searchLb);
	    notice.add(searchTf);
	    notice.add(searchBtn);
	       
	       
	   
	     
	     

	}
}

		