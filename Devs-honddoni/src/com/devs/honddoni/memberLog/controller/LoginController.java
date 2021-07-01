package com.devs.honddoni.memberLog.controller;

import com.devs.honddoni.memberLog.model.dto.LoginDataDTO;
import com.devs.honddoni.memberLog.model.service.MemberLogService;
import com.devs.honddoni.memberLog.view.LoginFail;
import com.devs.honddoni.memberLog.view.LoginSuccess;

public class LoginController {
	
	private MemberLogService memberLogService = new MemberLogService();

	public void userLogin(LoginDataDTO loginDataDTO) {
		
		String userPassword = memberLogService.userLogin(loginDataDTO);
		
		String getPassword = loginDataDTO.getMemberPassword();
		System.out.println(getPassword);
		
		//입력한 비밀번호와 DB에서 가져온 비밀번호가 일치하는지 판단
		int result = 0;		
		if(userPassword.equals(getPassword)) {
			result = 1;
		}
			
		if(result == 1) {
			//로그인 성공 패널로 이동... 아님 다이얼로그?!
			
			LoginSuccess loginSuccess = new LoginSuccess();
			System.out.println("로그인 완료~");
		} else {
			//로그인 실패 패널로 이동
			LoginFail loginFail = new LoginFail();
			System.out.println("로그인 실패!");
		}
		
	}

}
