package com.devs.honddoni.member.controller;

import java.util.List;

import com.devs.honddoni.member.model.dto.ChangePwdDTO;
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

	public boolean pwdCheck(ChangePwdDTO changePwd) {
		
		int result = memberService.pwdCheck(changePwd);
		
		if(result > 0) {
			System.out.println("일치");
		} else {
			System.out.println("불일치");
		}
		
		return result > 0 ? true : false;
	}

	public void newPwdEqualCheck(ChangePwdDTO changePwd) {
		
		String newPwd = changePwd.getMemberNewPassword();	//새 비번
		String newPwdRe = changePwd.getMemberNewPassword();	//새 비번 확인
		
		if(newPwd.equals(newPwdRe)){
			System.out.println("새비번 일치");
			updateMemberPwd(changePwd);
		}		
	}
	
	public void updateMemberPwd(ChangePwdDTO changePwd) {
		
		int result = memberService.updateMemberPwd(changePwd);
		
		if(result > 0) {
			System.out.println("비번변경 성공");
		} else {
			System.out.println("비번변경 실패");
		}
	}
}
