package com.devs.honddoni.memberLog.view;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.devs.honddoni.common.mainframe.FrameManager;
import com.devs.honddoni.common.mainframe.MainFrame;

public class FirstView extends JPanel{
	
	MemberLogView memberLogView = new MemberLogView();
	
	private JPanel firstViewPanel;
	private JButton btnNewButton;
	private JLabel honttoniLb;
	
	public FirstView(MainFrame mainFrame) {		
		
		//시작화면에 올릴 전체크기패널 
//		firstViewPanel = new JPanel();
		firstViewPanel.setBounds(0, 0, 500, 870);
		firstViewPanel.setLayout(null);
		firstViewPanel.setBackground(Color.red);
		
		//로고버튼
		btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("image/memberLog/login/login_1_logo.png"));
		btnNewButton.setBounds(174, 276, 152, 154);
		btnNewButton.setBorderPainted(false);

		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//로그인창으로 바꾸기...?
				FrameManager.changePanel(mainFrame, firstViewPanel, memberLogView);
				
				//혹시 몰라서 프레임 리프레쉬
//				FrameManager.refresh();
			}
		});
		
		//그냥 혼또니 로고버튼
		honttoniLb = new JLabel();
		honttoniLb.setBounds(130, 443, 241, 99);
//		honttoniLb.setBorderPainted(false);  //선 어떻게 없애드라..
		honttoniLb.setIcon(new ImageIcon("image/common/honddoniLogo.png"));
		
		
		//전체패널에 컴포넌트 2개 올리기
		firstViewPanel.add(btnNewButton);
		firstViewPanel.add(honttoniLb);

		firstViewPanel.setVisible(true);
		
	}
	
}
