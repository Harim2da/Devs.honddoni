package com.devs.honddoni.member.controller;

import java.util.List;

import com.devs.honddoni.member.model.dto.MemberRegistDTO;
import com.devs.honddoni.member.model.service.MemberService;
import com.devs.honddoni.member.view.DuplCheckResult;

public class MemberController {
	
	private MemberService memberService = new MemberService();
	private DuplCheckResult duplCheckResult = new DuplCheckResult();

	public void idDuplCheck(String getUserId) {
		
		int result = memberService.idDuplCheck(getUserId);
		
		if(result == 0) {
			duplCheckResult.displayDuplCheckResult("중복아님");
		} else {
			duplCheckResult.displayDuplCheckResult("중복");
		}
				
	}

	public void registMember(MemberRegistDTO member) {
		
		int result = memberService.registMember(member);
		
		if(result == 1) {
			System.out.println("등록완료~");
		} else {
			System.out.println("등록실패!");
		}
		
	}

	public void modifyPassword(String getUserPwd) {
		
	}
}
