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
		
		/* DB에서 id를 찾는 기능연결 */
		String dBid = memberLogService.searchId(searchIdDTO);
		
		if(dBid.equals("입력오류")) {
			PopupFrame.popup("image/memberLog/findPassword/findpassword_4_check_popup.png");			
		} else {
			editPwdPopup(dBid);
		}
		
		return dBid;
	}

	public int searchPwd(SearchPwdDTO searchPwdDTO) {
		
		int result = memberLogService.searchPwd(searchPwdDTO);
		
		return result;
	}
	
	public int editPwd(SearchPwdDTO searchPwdDTO) {
		
		int result = memberLogService.editPwd(searchPwdDTO);
		
		if(result > 0) {
			editPwdPopup(searchPwdDTO.getNewPwd());
		} else {
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
		newPwd.setText(editPwd + " 입니다.");		
		popupLabel.add(newPwd);
		
		popupFrame.add(popupLabel);
	}

}
