package com.devs.honddoni.memberLog.controller;

import com.devs.honddoni.memberLog.model.dto.SearchIdDTO;
import com.devs.honddoni.memberLog.model.dto.SearchPwdDTO;
import com.devs.honddoni.memberLog.model.service.MemberLogService;

public class MemberLogController {
	
	private MemberLogService memberLogService = new MemberLogService();

	public String searchId(SearchIdDTO searchIdDTO) {
		
		//제대로 찾았다면, 해당하는 아이디 값을 주겠지
		String result = memberLogService.searchId(searchIdDTO);
		
		if(result.equals("입력오류")) {
			System.out.println("입력오류!");			
		} else {
			System.out.println("입력일치");
		}
		
		return result;
	}

	public int searchPwd(SearchPwdDTO searchPwdDTO) {
		
		int result = memberLogService.searchPwd(searchPwdDTO);
		
		//음..  어떻게 판단해야 되지?? 일단 보류
		if(result > 0) {
			System.out.println("일치");
		} else {
			System.out.println("불일치!");
		}
		
		return result;
	}

}
