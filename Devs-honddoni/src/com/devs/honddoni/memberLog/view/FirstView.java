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
	
	private MainFrame frame; //4조참조
	private FirstView firstView; //4조참조
	
	private MemberLogView memberLogView;	
	
	private JButton btnNewButton;
	private JLabel honttoniLb;
	
	public FirstView(MainFrame mainFrame) {	
		
		this.frame = mainFrame; //4조참조
		this.firstView = this; //4조참조
				
		//시작화면에 올릴 전체크기패널 
//		firstViewPanel = new JPanel();
		firstView.setBounds(0, 0, 500, 870);
		firstView.setLayout(null);
		firstView.setBackground(Color.yellow);
		
		//로고버튼
		btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("image/memberLog/login/login_1_logo.png"));
		btnNewButton.setBounds(174, 276, 152, 154);
		btnNewButton.setBorderPainted(false);

		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				memberLogView = new MemberLogView(frame);
				
				//로그인창으로 바꾸기...?
				FrameManager.changePanel(mainFrame, firstView, memberLogView);
				
				//혹시 몰라서 프레임 리프레쉬
//				FrameManager.refresh();
			}
		});
		
		//그냥 혼또니 로고버튼
		honttoniLb = new JLabel();
		honttoniLb.setBounds(130, 443, 241, 99);
		honttoniLb.setIcon(new ImageIcon("image/memberLog/login/login_2_logo2.png"));
		
				
		//전체패널에 컴포넌트 2개 올리기
		firstView.add(btnNewButton);
		firstView.add(honttoniLb);

		firstView.setVisible(true);
		
	}
	
}
