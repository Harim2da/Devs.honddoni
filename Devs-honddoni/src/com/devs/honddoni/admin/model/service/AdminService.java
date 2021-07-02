package com.devs.honddoni.admin.model.service;

import java.sql.Connection;
import java.util.List;

import static com.devs.common.JDBCTemplate.close;
import static com.devs.common.JDBCTemplate.getConnection;

import com.devs.honddoni.admin.model.dao.AdminDAO;
import com.devs.honddoni.common.dto.MemberDTO;

public class AdminService {
	
	private AdminDAO adminDao;
	
	public AdminService() {
		this.adminDao = new AdminDAO();
	}

	public List<MemberDTO> selectAllPosts() {
		
		Connection con = getConnection();
		
		List <MemberDTO> memberList = null;
		
		memberList = adminDao.selectAllPosts(con);
		
		close(con);
		
		return memberList;
	}
	
}
