package com.devs.honddoni.admin.viewpenel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.common.font.FontManager;
import com.devs.honddoni.common.mainframe.MainFrame;

/* 공지사항 내용 확인 패널 */
public class NoticeContentView extends JPanel{
	
	private MainFrame frame;
	private NoticeContentView noticeContentView;
	
	private AdminList adminList; //newPanel로 쓸 것
	private NoticeModify noticeModify;
	
	private PostDTO postDTO;
	
	FontManager font = new FontManager();
	
	/* 공지내용 확인 겸, 수정버튼 */
	public NoticeContentView(MainFrame frame, PostDTO postinfoDTO) {
		
		this.frame = frame;
		this.noticeContentView = this;
		this.postDTO = postinfoDTO;		
		
		/* 제일 기본 패널 */
		this.setBounds(0, 0, 500, 870);
		this.setLayout(null);
		this.setBackground(Color.WHITE);
		frame.add(this);

		/* 혼또니 로고버튼 */
		JButton honddoniBtn = new JButton("");
		honddoniBtn.setBounds(305, 29, 173, 71);
		honddoniBtn.setIcon(new ImageIcon("image/admin/HondoniWrite.png"));
		honddoniBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.remove(noticeContentView);
				noticeContentView.setVisible(false);
				adminList = new AdminList(frame);
				frame.repaint();
				frame.revalidate();
				
			}
		});
		
		/* 공지겸 내용 라벨 */
		JLabel writeLb = new JLabel();
		writeLb.setBounds(35, 115, 433, 652);
		writeLb.setBackground(null);
		writeLb.setIcon(new ImageIcon("image/admin/noticeWrite_area.png"));		
		
		/* 제목라벨, 내용라벨 DTO에서 내용받아서 설정 */
		JTextField titleTf = new JTextField();
		titleTf.setBounds(70, 7, 335, 26);
		titleTf.setOpaque(false);				//배경투명
		titleTf.setEditable(false);				//수정불가
		titleTf.setFont(font.customFont12);
		titleTf.setText(postDTO.getPostName());
		
		JTextArea contentTa = new JTextArea();
		contentTa.setBounds(20, 116, 396, 515);
		contentTa.setOpaque(false);				//배경투명
		contentTa.setLineWrap(true);  			//줄바꿈 처리
		contentTa.setEditable(false); 			//수정 불가
		contentTa.setFont(font.customFont12);
		contentTa.setText(postDTO.getPostContents());
		
		/* 수정하기 버튼 */
		JButton modifyBtn = new JButton("");
		modifyBtn.setBounds(130, 789, 245, 42);
		modifyBtn.setIcon(new ImageIcon("image/admin/noticeboard_5_modify_compleate_btn.png"));
		modifyBtn.addActionListener(new ActionListener() {				
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.remove(noticeContentView);
				noticeContentView.setVisible(false);
				noticeModify = new NoticeModify(frame, postDTO);
				frame.repaint();
				frame.revalidate();
				
			}
		});				
		
		
		/* 컴포넌트 붙이기 */		
		this.add(modifyBtn);			
		this.add(honddoniBtn);
		writeLb.add(titleTf);
		writeLb.add(contentTa);	
		this.add(writeLb);
		
		frame.repaint();
		frame.revalidate();		
	}	

}
