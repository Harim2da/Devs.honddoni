package com.devs.honddoni.admin.controller;

import java.util.List;

import com.devs.honddoni.admin.model.service.AdminService;
import com.devs.honddoni.admin.view123.MemberDTO;

import com.devs.honddoni.admin.view123.PostDTO;


public class ManagementController {
   
   private AdminService adminService = new AdminService();
   
   public void selectAllMembers() {
      
      List<MemberDTO> memberList = adminService.selectAllMembers();
   }
      
//      memberResultView.display(memberList);
      
   public void selectAllPosts() {
   
      List<PostDTO> memberList = adminService.selectAllPosts();
   }
   


}