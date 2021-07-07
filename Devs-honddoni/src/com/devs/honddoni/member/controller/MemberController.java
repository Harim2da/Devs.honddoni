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
	
	public int idDuplCheck(String getUserId) {
		
		int result = memberService.idDuplCheck(getUserId);
		
		if(result == 0) {
			duplCheckResult.displayDuplCheckResult("중복아님");
		} else {
			duplCheckResult.displayDuplCheckResult("중복");
		}
		
		return result;
	}

	public int registMember(MemberRegistDTO member) {
		
		int result = memberService.registMember(member);
		
		if(result == 1) {
			System.out.println("등록완료~");
		} else {
			System.out.println("등록실패!");
		}
		
		return result;
	}

	public boolean pwdCheck(ChangePwdDTO changePwd) {
		
		int result = memberService.pwdCheck(changePwd);
		
		if(result > 0) {
			/* view 에서 newPwdEqualCheck로 넘어감 */
		} else {
			myPageResultView.failedView("chageInfoFailed");
			
		}
		
		
		return result > 0 ? true : false;
	}

	public void newPwdEqualCheck(ChangePwdDTO changePwd) {
		
		String newPwd = changePwd.getMemberNewPassword();	//새 비번
		String newPwdRe = changePwd.getMemberNewPasswordRecheck();	//새 비번 확인
		
		if(newPwd.equals(newPwdRe)){
			modifyPassword(changePwd);
		} else {
			myPageResultView.failedView("chageInfoFailed");
		}
		
	}
	
	public int modifyPassword(ChangePwdDTO changePwd) {
		
		int result = memberService.modifyPassword(changePwd);
		
		if(result > 0) {
			myPageResultView.successView("chageInfoSuccess");
		} else {
			myPageResultView.failedView("chageInfoFailed");
		}
		
		return result;
	}

	public MemberInfoDTO callMemberInfo(String testId) {
		
		MemberInfoDTO memberInfo = new MemberInfoDTO();
		memberInfo = memberService.callMemberInfo(testId);
		
		
		return memberInfo;
		
	}

	public void changeProfile(String profile) {
		
		int result = 0;
		
		result = memberService.changeProfile(profile);
		
		if(result > 0) {
			myPageResultView.successView("chageInfoSuccess");
		} else {
			myPageResultView.failedView("chageInfoFailed");
		}
		
	}

	public void changeCharacter(Integer newCharacterCode) {

		int result = 0;
		
		result = memberService.changeCharacter(newCharacterCode);
		
		if(result > 0) {
			myPageResultView.successView("chageInfoSuccess");
		} else {
			myPageResultView.failedView("chageInfoFailed");
		}
		
	}

	public void changeInfo(MemberInfoDTO memberInfo) {
		int result = 0;
		
		result = memberService.changeInfo(memberInfo);
		
		if(result > 0) {
			myPageResultView.successView("chageInfoSuccess");
		} else {
			myPageResultView.failedView("chageInfoFailed");
		}
	}

	public void deleteMember(String userId) {
		
		int result = 0;
		
		result = memberService.deleteMember(userId);
		
		if(result > 0) {
			new FirstView(mainFrame);
			myPageResultView.successView("deleteSuccess");
		} else {
			myPageResultView.failedView("chageInfoFailed");
		}
		
	}

}
