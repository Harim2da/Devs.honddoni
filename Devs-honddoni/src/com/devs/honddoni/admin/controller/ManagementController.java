package com.devs.honddoni.admin.controller;

import java.util.List; 

import com.devs.honddoni.admin.model.dto.*;
import com.devs.honddoni.admin.model.service.AdminService;
import com.devs.honddoni.common.dto.PostDTO;



public class ManagementController {
   
//	private AdminService adminService = new AdminService();



	public List<AdminDTO> totalUserList() {
		
		List<AdminDTO> adminListDTO = new AdminService().totalUserList();
		
//		if(adminListDTO != null) {
//			System.out.println("등록 성공");
//		} else {
//			System.out.println("등록 실패");
//		}
		
		return adminListDTO;
	}
}



