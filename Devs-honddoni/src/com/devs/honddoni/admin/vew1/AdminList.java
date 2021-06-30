package com.devs.honddoni.admin.vew1;

//import java.awt.Button;
//import java.awt.Graphics;
//import java.awt.Image;
//
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//
//import com.devs.honddoni.admin.view.viewframe;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class AdminList extends JFrame {
	
	static JButton b1=new JButton("");
	private Image background=new ImageIcon(AdminList.class.getResource("../images/Check withdrawal request member data.png")).getImage();
	
	public AdminList() {
		homeframe();
		btn();
		
	}
	
	public void homeframe() {
		setTitle("1");//타이틀
		setSize(400,600);//프레임의 크기
		setResizable(false);//창의 크기를 변경하지 못하게
		setLocationRelativeTo(null);//창이 가운데 나오게
		setLayout(null);//레이아웃을 내맘대로 설정가능하게 해줌.
		setVisible(true);//창이 보이게
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	/*버튼설정*/
	public void btn() {
		b1.setLayout(null);//레이아웃
		b1.setBounds(0, 0, 100, 100);//위치,크기
		add(b1);//프레임에 추가
	}
	public void paint(Graphics g) {//그리는 함수
		g.drawImage(background, 0, 0, null);//background를 그려줌
		//paintComponents(g);//add로 추가해준부분을 그려줌
	}
	/*메인함수*/
	public static void main(String[] args){
		new AdminList();
	}
}

	
//	private Image screenImage;
//	private Graphics screenGraphic;
//	
//	private Image introBackground = new ImageIcon(Main.class.getResource("../images/코린이.png")).getImage();
//	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/코린이.png")));
//	private JButton exitButton = new JButton(new ImageIcon(Main.class.getResource("../images/Check withdrawal request member data.png")));
//	
	
//	private Button exitButton4 = new Button(new ImageIcon(Main.class.getResource("../images/Check withdrawal request member data.png")));
//	
//	public AdminList () {
//		
//		setTitle("혼또니");
//		setBounds(100, 100, 516, 909);
//		setResizable(false);
//		setLocationRelativeTo(null);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setVisible(true);
//		setLayout(null);
//		
//		menuBar.setBounds(0, 0, 498, 862);
//		add(menuBar);
//		
//		JPanel panel = new JPanel();
//		panel.setBounds(0, 0, 500, 870);
//		add(panel);
		
	
//		
//	    Button exitButton = new Button("");
//		exitButton.setBounds(35, 129, 430, 121);
//		add(exitButton);
//		
//		
//		Button exitButton1 = new Button("");
//		exitButton.setBounds(34, 293, 430, 121);
//		add(exitButton1);
//		
//		Button exitButton3 = new Button("");
//		exitButton.setBounds(34, 456, 430, 121);
//		add(exitButton3);
//		
//		Button exitButton4 = new Button("");
//		exitButton.setBounds(33, 620, 430, 121);
//		add(exitButton4);
		
		
		
		
		
	

