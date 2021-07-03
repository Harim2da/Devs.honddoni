package com.devs.honddoni.memberLog.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.devs.honddoni.common.mainframe.FrameManager;
import com.devs.honddoni.common.mainframe.MainFrame;

public class LoginFail extends JPanel {
	
	MainFrame frame;
//	FrameManager fm = new FrameManager();
	
	private JPanel firstPanel;
	
	public LoginFail(MainFrame mainframe) {
		
		this.frame = mainframe;
		
		/* 제일 기본 패널 */
		firstPanel = new JPanel();
		firstPanel.setBounds(0, 0, 500, 870);
		firstPanel.setLayout(null);
		
		/* 혼또니 로고버튼 */
		JButton honddoniBtn = new JButton("");
		honddoniBtn.setBounds(305, 29, 173, 71);
		honddoniBtn.setIcon(new ImageIcon("image/common/honddoniLogo.png"));
		honddoniBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {

				/* 로고버튼 누를 시, 로그인 창으로 이동 */			
				if(e.getSource() == honddoniBtn) {
					System.out.println("로그인창으로 이동");
					
//					FrameManager.changePanel(mainframe, firstPanel, newPanel);
				}
				
			}
		});
		
		/* 내용 공간 */
		JLabel memberDataLb = new JLabel();
		memberDataLb.setBounds(29, 125, 443, 617);
		memberDataLb.setBackground(null);
		memberDataLb.setIcon(new ImageIcon("image/member/regist/regist_1.png"));
		
		
//		frame.add(firstPanel);	
		
	}
	
	

}
