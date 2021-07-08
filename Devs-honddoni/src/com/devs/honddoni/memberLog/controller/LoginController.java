package com.devs.honddoni.memberLog.controller;

import com.devs.honddoni.member.model.dto.MemberRegistDTO;
import com.devs.honddoni.memberLog.model.dto.LoginDataDTO;
import com.devs.honddoni.memberLog.model.service.MemberLogService;

public class LoginController {

	private MemberLogService memberLogService = new MemberLogService();
	private MemberRegistDTO memberDBDTO;

	public int userLogin(LoginDataDTO loginDataDTO) {

		int result = 0;

		/* 1. id를 공란으로 입력했는지부터 판단 */
		if(loginDataDTO.getMemberId().equals("")) {
			System.out.println("id 공란");
			result = 0;

		} else {

			/* 2. DB에서 회원번호, 패스워드, 탈퇴여부, 권한 가져오기 */
			memberDBDTO = memberLogService.userLogin(loginDataDTO);
			
			/* 3. 탈퇴여부 확인 */
			if(memberDBDTO.getMemberStatus().equals("N")) {

				//가져온 비밀번호를 DTO에 넣기
				String getPassword = loginDataDTO.getMemberPassword();

				/* 4. 입력한 비밀번호와 DB에서 가져온 비밀번호가 일치하는지 판단 */
				if(memberDBDTO.getMemberPassword().equals(getPassword)) {
					//일치한다면 로그인 성공
					result = 1; 					
				}


				//로그인 성공시 
				if(result == 1) {			

					// 멤버의 권한이 "관리자"인 경우, 관리자 로그인쪽으로 전달
					if((memberDBDTO.getMemberAccess()).equals("관리자")) {				
						result = 2;
					}

					/* 싱글톤 */
					//로그인한 이 유저의 Id를 저장히기
					String loginMemberId = loginDataDTO.getMemberId();
					//DB에서 로그인 유저Id를 회원번호로 조회해오기(MVC)
					int loginMemberNo = memberLogService.getLoginMemberNo(loginMemberId);

					//로그인 성공시, 로그인 유저No를 싱글톤으로 작성
					GetLoginMember getLoginMember = GetLoginMember.getInstance();
					getLoginMember.setLoginMemberNo(loginMemberNo);
					getLoginMember.setLoginMemberId(loginMemberId);

					//가져다 쓰실 때			
					//GetLoginMemberId getLoginMemberId = GetLoginMemberId.getInstance();
					int memberNo = getLoginMember.getLoginMemberNo();
					String memberId = getLoginMember.getLoginMemberId();


				} else {
					System.out.println("로그인 실패!");
				}

			} else {
				System.out.println("탈퇴한 회원!");

		} 

		
	}
		
		return result;
	}
	
	
}
