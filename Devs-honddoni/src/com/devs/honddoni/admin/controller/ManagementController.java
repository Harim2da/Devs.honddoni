package com.devs.honddoni.admin.controller;

import java.util.List; 

import com.devs.honddoni.admin.model.dto.*;
import com.devs.honddoni.admin.model.service.AdminService;
import com.devs.honddoni.common.dto.PostDTO;



public class ManagementController {
   
	private AdminService adminService = new AdminService();

	
	
	public void onlyNicname() {
		
		List<AdminDTO> adminList = adminService.onlyNicname();
		
//		memberResultView.display(memberList);
		
		
	}
}



