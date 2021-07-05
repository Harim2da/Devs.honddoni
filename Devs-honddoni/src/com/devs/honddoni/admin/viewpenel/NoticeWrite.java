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

import com.devs.honddoni.admin.model.dto.NoticeWriteDTO;

/* 공지사항 글쓰기 창 */
public class NoticeWrite extends JPanel{
	
	JFrame frame;
	NoticeWrite noticeWrite;
	
	public NoticeWrite() {
		
		this.frame = FrameManagerYs.getFrame();
		this.noticeWrite = this;
		
		
		/* 제일 기본 패널 */
		noticeWrite.setBounds(0, 0, 500, 870);
		noticeWrite.setLayout(null);
		noticeWrite.setBackground(Color.yellow);

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
		
		/* 공지겸 내용 라벨 */
		JLabel searchLb = new JLabel();
		searchLb.setBounds(35, 115, 433, 652);
		searchLb.setBackground(null);
		searchLb.setIcon(new ImageIcon("image/admin/noticeWrite_area.png"));		
		
		/* 제목텍필, 내용텍필 */
		JTextField titleTf = new JTextField();
		titleTf.setBounds(107, 121, 335, 26);
		JTextField contentTf = new JTextField();
		contentTf.setBounds(55, 230, 396, 515);
				
		/* 작성완료 버튼 */
		JButton completeBtn = new JButton();
		completeBtn.setBounds(130, 789, 245, 42);
		completeBtn.setIcon(new ImageIcon("image/admin/noticeWrite_complete_btn.png"));
		completeBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//저장할 제목, 내용
				String getTitle = titleTf.getText();
				String getContent = contentTf.getText();				
				
				//DTO로 뭉친다
				NoticeWriteDTO noticeWriteDTO = new NoticeWriteDTO();
				noticeWriteDTO.setTitle(getTitle);
				noticeWriteDTO.setContent(getContent);
				
				
				
				//작성완료 팝업
				
				//완료 시, 다시 공지사항게시판으로
//				frame.remove(NoticeWrite);
//				frame.add(new Notice());
//				frame.repaint();
//				frame.revalidate();
			}
		});
		
		
		
		/* 컴포넌트 붙이기 */
		noticeWrite.add(honddoniBtn);
		noticeWrite.add(searchLb);
		noticeWrite.add(titleTf);
		noticeWrite.add(contentTf);		
		noticeWrite.add(completeBtn);		
		
		
	}
	
	

}
