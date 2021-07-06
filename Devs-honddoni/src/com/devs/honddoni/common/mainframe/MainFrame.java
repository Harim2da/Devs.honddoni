package com.devs.honddoni.common.mainframe;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import com.devs.honddoni.memberLog.view.FirstView;
import com.devs.honddoni.post.view.PostModify;



public class MainFrame extends JFrame{
	

	FirstView firstView;
	public static MainFrame mf;
	
	public MainFrame() {
		
		this.setBounds(100, 100, 516, 909);
		this.setLayout(null);
		this.setTitle("혼또니(혼자 또 여행왔니?)");
		try {
			this.setIconImage(ImageIO.read(new File("image/memberLog/login/login_1_logo.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}

//		new MyPage(this);

//		new FirstView(this);
		
		
//		new SelectedComment(this, 1);
//		new SelectAllHonPost2(this);


		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		this.add(new FirstView());
//		this.add(new MyPage());
		
//		new SelectAllHonPost(this);
		
//		FrameManager.initPanel(this, new SelectAllHonPost());
		
		//예슬 실험중
//		new FirstView(this);
//		new Notice(this);
		
		//태훈 실험중(메인바텀패널)
//		new MainBottomPanel(this);
		
//		new AllBoardList(this);
		
		/*하림 test*/
		new PostModify(this);
	}
	
}
