package com.devs.honddoni.memberLog.controller;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.devs.honddoni.common.mainframe.PopupFrame;
import com.devs.honddoni.memberLog.model.dto.SearchIdDTO;
import com.devs.honddoni.memberLog.model.dto.SearchPwdDTO;
import com.devs.honddoni.memberLog.model.service.MemberLogService;

public class MemberLogController {
	
	private MemberLogService memberLogService = new MemberLogService();

	public String searchId(SearchIdDTO searchIdDTO) {
		
		//제대로 찾았다면, 해당하는 아이디 값을 주겠지
		String result = memberLogService.searchId(searchIdDTO);
		
		if(result.equals("입력오류")) {
			System.out.println("입력오류!");			
		} else {
			System.out.println("입력일치");
		}
		
		return result;
	}

	public int searchPwd(SearchPwdDTO searchPwdDTO) {
		
		int result = memberLogService.searchPwd(searchPwdDTO);
		
		//음..  어떻게 판단해야 되지?? 일단 보류
		if(result > 0) {
			System.out.println("일치");
		} else {
			System.out.println("불일치!");
		}
		
		return result;
	}
	
	public int editPwd(SearchPwdDTO searchPwdDTO) {
		
		int result = memberLogService.editPwd(searchPwdDTO);
		
		if(result > 0) {
			System.out.println("비번변경 성공");
			editPwdPopup(searchPwdDTO.getNewPwd());
		} else {
			System.out.println("비번변경 실패");
			PopupFrame.popup("image/memberLog/findPassword/findpassword_4_check_popup.png");
		}
		
		return result;		
	}
	
	//비번변경 성공시, 임시비밀번호 6자리 숫자를 팝업으로 띄워 줌
	public void editPwdPopup(String editPwd) {
		
		ImageIcon popup = new ImageIcon("image/memberLog/findPassword/findpassword_4_password_popup.png");
		
		JFrame popupFrame = new JFrame();
		popupFrame.setTitle("혼또니(혼자 또 여행왔니?)");
		popupFrame.setVisible(true); 
		popupFrame.setBounds(130,400,458,271);
		
//		JPanel popupPanel = new JPanel(); //필요없는듯
		try {
			/* 상단 혼또니 아이콘 */
			popupFrame.setIconImage(ImageIO.read(new File("image/memberLog/login/login_1_logo.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
		JLabel popupLabel = new JLabel();
		popupLabel.setSize(458,271);
		popupLabel.setIcon(popup);
		
		JLabel newPwd = new JLabel();
		newPwd.setBounds(140, 130, 200, 26);
		newPwd.setText("임시비밀번호는 " + editPwd + " 입니다.");		
		popupLabel.add(newPwd);
		
//		popupFrame.add(popupPanel);
		popupFrame.add(popupLabel);
	}

}
