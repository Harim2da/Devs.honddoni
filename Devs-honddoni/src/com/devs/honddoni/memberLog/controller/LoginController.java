package com.devs.honddoni.memberLog.controller;

import com.devs.honddoni.memberLog.model.dto.LoginDataDTO;
import com.devs.honddoni.memberLog.model.service.MemberLogService;
import com.devs.honddoni.memberLog.view.LoginFail;

public class LoginController {

	private MemberLogService memberLogService = new MemberLogService();

	public int userLogin(LoginDataDTO loginDataDTO) {

		int result = 0;

		//id를 공란으로 입력했는지부터 판단
		if(loginDataDTO.getMemberId().equals("")) {
			result = 0;
			
		} else {

			//DB에서 해당 ID의 비밀번호 가져오기 
			String userPassword = memberLogService.userLogin(loginDataDTO);

			//가져온 비밀번호를 DTO에 넣기
			String getPassword = loginDataDTO.getMemberPassword();


			//입력한 비밀번호와 DB에서 가져온 비밀번호가 일치하는지 판단
			if(userPassword.equals(getPassword)) {
				//일치한다면 로그인 성공
				result = 1; 					
			}
			

			//로그인 성공시 
			if(result == 1) {			

				// 아이디가 어드민인 경우, 관리자로 그인쪽으로 전달
				if((loginDataDTO.getMemberId()).equals("admin01")) {				
					result = 2;
				}

				/* 로그인한 이 유저의 Id를 저장하기 */
				String loginMemberId = loginDataDTO.getMemberId();

				//DB에서 로그인 유저Id를 회원번호로 조회해오기(MVC)
				int loginMemberNo = memberLogService.getLoginMemberNo(loginMemberId);
//				int loginMemberNo = 1;


				//로그인 성공시, 로그인유저No를 ... 싱글톤으로 작성
				GetLoginMember getLoginMember = GetLoginMember.getInstance();
				//GetLoginMemberId getLoginMemberId = new GetLoginMemberId(); 이렇게 쓰지않는다.
				getLoginMember.setLoginMemberNo(loginMemberNo);
				getLoginMember.setLoginMemberId(loginMemberId);


				//가져다 쓰실 때			
				//			GetLoginMemberId getLoginMemberId = GetLoginMemberId.getInstance();
				int memberNo = getLoginMember.getLoginMemberNo();
				String memberId = getLoginMember.getLoginMemberId();
				//확인용
				System.out.println("로그인하면서 싱글톤에 저장된 회원번호 : " + memberNo);
				System.out.println("로그인하면서 싱글톤에 저장된 회원id : " + memberId);


			} else {
				System.out.println("로그인 실패!");
			}

		} 
		

		return result;
	}


}
