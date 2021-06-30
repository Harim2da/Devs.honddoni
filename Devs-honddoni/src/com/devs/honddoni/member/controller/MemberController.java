package com.devs.honddoni.member.controller;

import com.devs.honddoni.member.model.service.MemberService;
import com.devs.honddoni.member.view.DuplCheckResult;

public class MemberController {
	
	private MemberService memberService = new MemberService();
	private DuplCheckResult duplCheckResult = new DuplCheckResult();

	public void idDuplCheck(String getUserId) {
		
		int result = memberService.idDuplCheck(getUserId);
		
		if(result == 1) {
			duplCheckResult.displayDuplCheckResult("중복아님");
		} else {
			duplCheckResult.displayDuplCheckResult("중복");
		}
		
		
	}

}
