package com.devs.honddoni.admin.model.service;

import java.sql.Connection;

import java.util.List;

import static com.devs.honddoni.common.JDBCTemplate.getConnection;
import static com.devs.honddoni.common.JDBCTemplate.close;

import com.devs.honddoni.admin.model.dao.AdminDAO;
import com.devs.honddoni.admin.view123.MemberDTO;

import com.devs.honddoni.admin.view123.PostDTO;
import com.devs.honddoni.admin.view123.TotalDTO;



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
   
   
   
   public List<TotalDTO> totalPostList() {
	      
	      Connection con = getConnection();
	      
	      List<com.devs.honddoni.admin.view123.TotalDTO> TotalList = adminDao.totalPostList(con);
	      
	      
	      close(con);
	      
	      return TotalList;
   
}

}