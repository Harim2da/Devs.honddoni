package com.devs.honddoni.admin.viewpenel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class WriteNotice extends JPanel{
	
	MainFrame1 frame;
	WriteNotice writeNotice;
	
	public WriteNotice() {
//		this.frame = mainFrame1;
		this.writeNotice = this;
		
		
		/* 제일 기본 패널 */
		writeNotice.setBounds(0, 0, 500, 870);
		writeNotice.setLayout(null);
		writeNotice.setBackground(Color.yellow);

		frame.add(writeNotice);
		
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
		
	}
	
	

}
