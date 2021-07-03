package com.devs.honddoni.memberLog.controller;

import com.devs.honddoni.memberLog.model.dto.LoginDataDTO;
import com.devs.honddoni.memberLog.model.service.MemberLogService;
import com.devs.honddoni.memberLog.view.LoginFail;
import com.devs.honddoni.memberLog.view.LoginSuccess;

public class LoginController {
	
	private MemberLogService memberLogService = new MemberLogService();

	public int userLogin(LoginDataDTO loginDataDTO) {
		
		String userPassword = memberLogService.userLogin(loginDataDTO);
		
		String getPassword = loginDataDTO.getMemberPassword();
		System.out.println(getPassword);
		
		//입력한 비밀번호와 DB에서 가져온 비밀번호가 일치하는지 판단
		int result = 0;		
		if(userPassword.equals(getPassword)) {
			
			result = 1; //일치한다면 로그인 성공
			
		}
			
		//로그인 성공시, 아이디가 어드민인 경우, 관리자로 그인쪽으로 전달
		if(result == 1) {			
			
			if((loginDataDTO.getMemberId()).equals("admin")) {				
				result = 2;
			}
			
			//로그인한 이 유저의 Id를 저장하기
			String loginMemberId = loginDataDTO.getMemberId();
			
			//DB에서 로그인 유저Id를 회원번호로 조회해오기(MVC)
//			int loginMemberNo = memberLogService.getLoginMemberNo(loginMemberId);
			int loginMemberNo = 1;
			
			
			//로그인 성공시, 로그인유저No를 ... 싱글톤으로 작성
			GetLoginMemberId getLoginMemberId = GetLoginMemberId.getInstance();
//			GetLoginMemberId getLoginMemberId = new GetLoginMemberId();
			getLoginMemberId.setLoginMemberNo(loginMemberNo);
			getLoginMemberId.setLoginMemberId(loginMemberId);
			
			
			//가져다 쓰실 때			
//			GetLoginMemberId getLoginMemberId = GetLoginMemberId.getInstance();
			int memberNo = getLoginMemberId.getLoginMemberNo();
			String memberId = getLoginMemberId.getLoginMemberId();
			//확인용
			System.out.println(memberNo);
			System.out.println(memberId);
			
			
			
		} else {
			System.out.println("로그인 실패!");
		}
		
		return result;
	}
	

}
