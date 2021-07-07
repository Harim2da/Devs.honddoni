package com.devs.honddoni.member.view;

import com.devs.honddoni.common.mainframe.PopupFrame;

public class MyPageResultView {

	public void successView(String keyword) {
		
		switch(keyword){
			case "chageInfoSuccess" : PopupFrame.popup("image/popup/modifySuccess.png"); break;		//개인정보 변경 성공
			case "pwdCheckSuccess" : PopupFrame.popup("image/popup/modifySuccess.png"); break;		//비밀번호 변경 성공
			case "deleteSuccess" : PopupFrame.popup("/image/popup/deleteSuccess.png"); break;		//비밀번호 변경 성공
		}
	}
	
	public void failedView(String keyword) {
		
		switch(keyword){
		case "chageInfoFailed" : PopupFrame.popup("image/popup/FailMessage.png"); break;			//비밀번호 변경 실패
		}
	}
	
}
