package com.devs.honddoni.admin.viewpenel;

import static com.devs.honddoni.common.JDBCTemplate.close;
import static com.devs.honddoni.common.JDBCTemplate.getConnection;

import java.awt.Color;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.devs.honddoni.admin.controller.ManagementController;
import com.devs.honddoni.admin.model.dto.*;
import com.devs.honddoni.admin.model.dao.AdminDAO;
import com.devs.honddoni.common.dto.CommentsDTO;
import com.devs.honddoni.post.controller.PagingController;

//모든회원정보 조회 화면

public class AllDataTest {
	
	MainFrame1 MainFrame = new MainFrame1();
//	private JButton btn1, btn2, btn3, btn4, btn5;
//	private JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10, lb11, lb12, lb13, lb14, lb15, lb16,
//	lb17, lb18, lb19, lb20, lb21;
	
	private JLabel[] adminList;								//
	private List<AdminDTO> adminListDTO = null;			//
	private JLabel[] nickName;
	
	 
	
	public AllDataTest() {

		/* 하단 패널 생성 */
		JPanel bottomPanel = new JPanel();

		bottomPanel.setBounds(0, 100, 500, 770);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.WHITE);
		MainFrame.add(bottomPanel);
		
		/* 상단 패널 생성 */
		JPanel topPanel = new JPanel();
		topPanel.setBounds(0, 0, 500, 100);
		topPanel.setLayout(null);
		topPanel.setBackground(Color.WHITE);
		MainFrame.add(topPanel);
		
		//상단 뒤로가기버튼
		 ImageIcon img0 = new ImageIcon ("image\\admin\\HondoniWrite.png");//상단 혼또니 마크
	     JButton btn0 = new JButton(img0);
	     
//	     ImageIcon img01 = new ImageIcon("image\\admin\\AllDataLogo.png");
//	     JLabel lb01 = new JLabel(img01);
	     
	     //상단패널에 혼또니마크로 뒤로가기 버튼
	     topPanel.add(btn0);
	     btn0.setBounds(303, 27, 172, 70);
	     btn0.setContentAreaFilled(false);
	     btn0.setBorderPainted(false);
	     
	     ////////////여기서부터 현수님코드★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
//	 	 AdminDTO adminDTO = null;
		 List<AdminDTO> adminListDTO = new ManagementController().totalUserList();
	     AdminDTO adminDTO = null;

	 	 for(int i = 0; i < adminListDTO.size(); i++) {

	 		
	 	 adminDTO = adminListDTO.get(i);
	 			

	 	 JLabel[] jlabel = new JLabel[adminListDTO.size()];
	 	 jlabel[i] = new JLabel(adminDTO.getMemberId());
	 	 jlabel[i] = new JLabel(adminDTO.getMemberNicname());
	 	 jlabel[i] = new JLabel(adminDTO.getMemberProfile());
	 	 jlabel[i] = new JLabel(adminDTO.getMemRegistdate());
//	 	 jlabel[i] = new JLabel(adminDTO.getMEMBER_NICKNAME());
//	 	 jlabel.setText(adminDTO.getMEMBER_NICKNAME());
	 	 jlabel[i].setLayout(null);
	 	 jlabel[i].setBounds(33, 23, 430, 121);
	 	 bottomPanel.add(jlabel[i]);


//	 	 여기까지 현수님코드★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	 	 
	 			
	       //컨테이너에 패널 추가
	 		MainFrame.add(bottomPanel);
	 	    MainFrame.setVisible(true); //창을 보이게함
	 	       
//	 	       poupfrome.pup 이미지넣기
	 	       

	 	 }
	}
}
	       


		
