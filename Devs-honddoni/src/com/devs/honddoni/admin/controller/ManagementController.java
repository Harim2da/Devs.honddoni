package com.devs.honddoni.admin.controller;

import java.util.List;

import com.devs.honddoni.admin.dto.AdminDTO;
import com.devs.honddoni.admin.model.service.AdminService;



public class ManagementController {
   
	private AdminService adminService = new AdminService();

	
	/* 모든 회원 정보 조회용 메소드(List로 조회할 것) */
	public void totalUserList() {
		
		List<AdminDTO> adminList = adminService.totalUserList();
		
//		memberResultView.display(memberList);
	}
}
