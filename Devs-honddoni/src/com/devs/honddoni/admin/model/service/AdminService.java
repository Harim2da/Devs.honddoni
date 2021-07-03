package com.devs.honddoni.admin.model.service;

import java.sql.Connection;

import java.util.List;

import static com.devs.honddoni.common.JDBCTemplate.getConnection;
import static com.devs.honddoni.common.JDBCTemplate.close;

import com.devs.honddoni.admin.model.dao.AdminDAO;
import com.devs.honddoni.admin.view123.MemberDTO;

import com.devs.honddoni.admin.view123.PostDTO;



public class AdminService {
   
   private AdminDAO adminDao;
   
   public AdminService() {
	   this.adminDao = new AdminDAO();
   }


   public List<MemberDTO> selectAllMembers() {
      
	   Connection con = getConnection();
 
      List<com.devs.honddoni.admin.view123.MemberDTO> memberList = adminDao.selectAllMembers(con);
      
      
      close(con);
      
      return memberList;
      
   }
   
   
   public List<PostDTO> selectAllPosts() {
      
      Connection con = getConnection();
      
      List<com.devs.honddoni.admin.view123.PostDTO> postList = adminDao.selectAllPosts(con);
      
      
      close(con);
      
      return postList;
   }
   
}

