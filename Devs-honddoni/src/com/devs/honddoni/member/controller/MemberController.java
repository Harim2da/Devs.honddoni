
package com.devs.honddoni.member.controller;

import java.util.List;

import com.devs.honddoni.common.mainframe.MainFrame;
import com.devs.honddoni.common.mainframe.PopupFrame;
import com.devs.honddoni.member.model.dto.ChangePwdDTO;
import com.devs.honddoni.member.model.dto.MemberInfoDTO;
import com.devs.honddoni.member.model.dto.MemberRegistDTO;
import com.devs.honddoni.member.model.service.MemberService;
import com.devs.honddoni.member.view.DuplCheckResult;
import com.devs.honddoni.memberLog.view.FirstView;

public class MemberController {
	
	private MemberService memberService = new MemberService();
	private DuplCheckResult duplCheckResult = new DuplCheckResult();
	private MainFrame mainFrame;
	
	public int idDuplCheck(String getUserId) {
		
		//result가 0이면 중복아님 = 사용가능
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
			System.out.println("비밀번호 일치");
		} else {
			System.out.println("비밀번호 불일치");
		}
		
		
		return result > 0 ? true : false;
	}

	public boolean newPwdEqualCheck(ChangePwdDTO changePwd) {
		
		int result = 0;
		
		String newPwd = changePwd.getMemberNewPassword();	//새 비번
		String newPwdRe = changePwd.getMemberNewPasswordRecheck();	//새 비번 확인
		
		if(newPwd.equals(newPwdRe)){
			System.out.println("새비번 일치");
			modifyPassword(changePwd);
		} else {
			System.out.println("새비번 불일치");
		}
		
		return result > 0 ? true : false;
	}
	
	public void modifyPassword(ChangePwdDTO changePwd) {
		
		int result = memberService.modifyPassword(changePwd);
		
		if(result > 0) {
			System.out.println("비번변경 성공");
			PopupFrame.popup("image/popup/modifySuccess.png");
		} else {
			System.out.println("비번변경 실패");
			PopupFrame.popup("image/popup/FailMessage.png");
		}
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
		} else {
			System.out.println("프로필 변경 실패");
		}
		
	}

	public void changeCharacter(Integer newCharacterCode) {

		int result = 0;
		
		result = memberService.changeCharacter(newCharacterCode);
		
		if(result > 0) {
			System.out.println("성향 변경 성공");
		} else {
			System.out.println("성향 변경 실패");
		}
		
	}

	public void changeInfo(MemberInfoDTO memberInfo) {
		int result = 0;
		
		result = memberService.changeInfo(memberInfo);
		
		if(result > 0) {
			System.out.println("정보 변경 성공");
		} else {
			System.out.println("정보 변경 실패");
		}
	}

	public void deleteMember(String 테스트아이디) {
		
		int result = 0;
		
		result = memberService.deleteMember(테스트아이디);
		
		if(result > 0) {
			System.out.println("회원탈퇴 성공");
			new FirstView(mainFrame);
		} else {
			System.out.println("회원탈퇴 실패");
		}
		
	}

}

