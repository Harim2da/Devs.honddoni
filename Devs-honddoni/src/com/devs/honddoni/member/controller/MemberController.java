package com.devs.honddoni.member.controller;

import java.util.List;

import com.devs.honddoni.common.mainframe.MainFrame;
import com.devs.honddoni.common.mainframe.PopupFrame;
import com.devs.honddoni.member.model.dto.ChangePwdDTO;
import com.devs.honddoni.member.model.dto.MemberInfoDTO;
import com.devs.honddoni.member.model.dto.MemberRegistDTO;
import com.devs.honddoni.member.model.service.MemberService;
import com.devs.honddoni.member.view.DuplCheckResult;
import com.devs.honddoni.member.view.MyPageResultView;
import com.devs.honddoni.memberLog.view.FirstView;

public class MemberController {
	
	private MemberService memberService = new MemberService();
	private DuplCheckResult duplCheckResult = new DuplCheckResult();
	private MyPageResultView myPageResultView = new MyPageResultView();
	private MainFrame mainFrame;
	
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
			System.out.println("비밀번호 일치");
		} else {
			System.out.println("비밀번호 불일치");
			myPageResultView.failedView("chageInfoFailed");
			
		}
		
		
		return result > 0 ? true : false;
	}

	public void newPwdEqualCheck(ChangePwdDTO changePwd) {
		
		String newPwd = changePwd.getMemberNewPassword();	//새 비번
		String newPwdRe = changePwd.getMemberNewPasswordRecheck();	//새 비번 확인
		
		if(newPwd.equals(newPwdRe)){
			System.out.println("새비번 일치");
			modifyPassword(changePwd);
		} else {
			System.out.println("새비번 불일치");
			myPageResultView.failedView("chageInfoFailed");
		}
		
	}
	
	public int modifyPassword(ChangePwdDTO changePwd) {
		
		int result = memberService.modifyPassword(changePwd);
		
		if(result > 0) {
			System.out.println("비번변경 성공");
			myPageResultView.successView("chageInfoSuccess");
		} else {
			System.out.println("비번변경 실패");
			myPageResultView.failedView("chageInfoFailed");
		}
		
		return result;
	}

	public MemberInfoDTO callMemberInfo(String testId) {
		
		MemberInfoDTO memberInfo = new MemberInfoDTO();
		memberInfo = memberService.callMemberInfo(testId);
		System.out.println(memberInfo);
		
		
		return memberInfo;
		
	}

	public void changeProfile(String profile) {
		
		int result = 0;
		
		result = memberService.changeProfile(profile);
		
		if(result > 0) {
			System.out.println("프로필 변경 성공");
			myPageResultView.successView("chageInfoSuccess");
		} else {
			System.out.println("프로필 변경 실패");
			myPageResultView.failedView("chageInfoFailed");
		}
		
	}

	public void changeCharacter(Integer newCharacterCode) {

		int result = 0;
		
		result = memberService.changeCharacter(newCharacterCode);
		
		if(result > 0) {
			System.out.println("성향 변경 성공");
			myPageResultView.successView("chageInfoSuccess");
		} else {
			System.out.println("성향 변경 실패");
			myPageResultView.failedView("chageInfoFailed");
		}
		
	}

	public void changeInfo(MemberInfoDTO memberInfo) {
		int result = 0;
		
		result = memberService.changeInfo(memberInfo);
		
		if(result > 0) {
			System.out.println("정보 변경 성공");
			myPageResultView.successView("chageInfoSuccess");
		} else {
			System.out.println("정보 변경 실패");
			myPageResultView.failedView("chageInfoFailed");
		}
	}

	public void deleteMember(String userId) {
		
		int result = 0;
		
		result = memberService.deleteMember(userId);
		
		if(result > 0) {
			System.out.println("회원탈퇴 성공");
			new FirstView(mainFrame);
			myPageResultView.successView("deleteSuccess");
		} else {
			System.out.println("회원탈퇴 실패");
			myPageResultView.failedView("chageInfoFailed");
		}
		
	}

}
