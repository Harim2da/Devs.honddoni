package com.devs.honddoni.memberLog.controller;

import com.devs.honddoni.memberLog.model.dto.LoginDataDTO;
import com.devs.honddoni.memberLog.model.service.MemberLogService;

public class LoginController {
	
	private MemberLogService memberLogService = new MemberLogService();

	public void userLogin(LoginDataDTO loginDataDTO) {
		
		int result = memberLogService.userLogin(loginDataDTO);
		
		if(result == 1) {
			System.out.println("로그인 완료~");
		} else {
			System.out.println("로그인 실패!");
		}
		
	}

}
