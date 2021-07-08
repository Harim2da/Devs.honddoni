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
	
	/* 현재 접속중인 사용자의 개인정보를 받아오기 위해 아이디 전달 */
	public MemberInfoDTO callMemberInfo(String userId) {
		
		MemberInfoDTO memberInfo = new MemberInfoDTO();
		memberInfo = memberService.callMemberInfo(userId);
		
		
		return memberInfo;
		
	}

 

	/* 콤보박스를 통해 선택한 성향 정보를 전달 받아서 서비스로 전달 */
	public void changeCharacter(Integer newCharacterCode) {

		int result = 0;
		
		result = memberService.changeCharacter(newCharacterCode);
		
		if(result > 0) {
			myPageResultView.successView("chageInfoSuccess");
		} else {
			myPageResultView.failedView("chageInfoFailed");
		}
		
	}

	/* 변경된 사용자의 정보를 전달 */
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
	
	/* 사용자가 선택한 프로필 사진의 정보를 전달 */
	   public void changeProfile(String profile) {
	      
	      int result = 0;
	      
	      result = memberService.changeProfile(profile);
	      
	      if(result > 0) {
	         myPageResultView.successView("chageInfoSuccess");
	      } else {
	         myPageResultView.failedView("chageInfoFailed");
	      }
	      
	   }

}
