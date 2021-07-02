package com.devs.honddoni.admin.controller;

import java.util.List;

import com.devs.honddoni.admin.model.service.AdminService;
import com.devs.honddoni.common.dto.MemberDTO;

public class ManagementController {
	
	private AdminService memberService = new AdminService();
	
	public void selectAllPosts() {
		
		List<MemberDTO> memberList = AdminService.selectAllPosts();
		
//		memberResultView.display(memberList);
	}

}
