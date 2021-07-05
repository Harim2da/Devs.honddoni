package com.devs.honddoni.common.mainframe;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import com.devs.honddoni.admin.viewpenel.Notice;
import com.devs.honddoni.member.view.MyPage;
import com.devs.honddoni.memberLog.view.FirstView;

public class MainFrame extends JFrame{
	

	FirstView firstView;
	MainFrame mainFrame;
	
	public MainFrame() {
		
		this.setBounds(100, 100, 516, 909);
		this.setLayout(null);
		this.setTitle("혼또니(혼자 또 여행왔니?)");
		try {
			this.setIconImage(ImageIO.read(new File("image/memberLog/login/login_1_logo.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		this.add(new FirstView());
		this.add(new MyPage());
		
//		new SelectAllHonPost(this);
		
//		FrameManager.initPanel(this, new SelectAllHonPost());
		
		//예슬 실험중
		new Notice(this);
	}
	
}
