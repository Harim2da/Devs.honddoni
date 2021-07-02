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
			
			//로그인 성공했을 때, 아이디가 어드민인 경우, 관리자로그인쪽으로 전달
			if((loginDataDTO.getMemberId()).equals("admin")) {
				//관리자로그인페이지로 이동
				System.out.println("관리자페이지로 이동~");
			}
			
			//로그인 아이디를... 싱글톤 쓰기...?
			GetLoginMemberId getLoginMemberId = GetLoginMemberId.getInstance();
			String loginMemberId = loginDataDTO.getMemberId();
			
			
		} else {
			//로그인 실패 패널로 이동
			LoginFail loginFail = new LoginFail();
			System.out.println("로그인 실패!");
		}
		
	}
	

}
