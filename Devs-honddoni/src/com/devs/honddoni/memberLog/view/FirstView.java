package com.devs.honddoni.memberLog.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.devs.honddoni.admin.view.MainFrame;

public class FirstView extends JPanel{
	
	private MainFrame mf = new MainFrame();
	private JPanel firstViewPanel = new JPanel();
	
	public FirstView() {
		
		//시작화면에 올릴 전체크기패널 
		firstViewPanel.setBounds(0, 0, 500, 870);
		firstViewPanel.setLayout(null);
		
		//로고버튼
		JButton btnNewButton = new JButton("logobutton");
		btnNewButton.setIcon(new ImageIcon("image/memberLog/login/login_1_logo.png"));
		btnNewButton.setBounds(174, 276, 152, 154);
		btnNewButton.setBorderPainted(false);
		this.add(btnNewButton);

		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//로그인창 열기
				MemberLogView memberLV = new MemberLogView();
				// 창 바꾸기...?
//				mf.changePanel(firstViewPanel, memberLV)..?
				
				firstViewPanel.setVisible(false);
			}
		});
		
		//그냥 혼또니 로고버튼
		JButton btnNewButton_1 = new JButton("logo2 button");
		btnNewButton_1.setBounds(130, 443, 241, 99);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setIcon(new ImageIcon("image/common/honddoniLogo.png"));
		firstViewPanel.add(btnNewButton_1);
		
		//전체패널에 버튼 2개 올리기
		firstViewPanel.add(btnNewButton);
		firstViewPanel.add(btnNewButton_1);

		firstViewPanel.setVisible(true);
		
		//메인프레임에 전체패널을 올려야..?
		
	}
	
}
