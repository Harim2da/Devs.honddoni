package com.devs.honddoni.admin.model.service;

import java.sql.Connection;

import java.util.List;

import static com.devs.honddoni.common.JDBCTemplate.getConnection;
import static com.devs.honddoni.common.JDBCTemplate.close;

import com.devs.honddoni.admin.model.dao.AdminDAO;
import com.devs.honddoni.common.dto.MemberDTO;

public class AdminService {
	
	private AdminDAO adminDao;
	
	public AdminService() {
		this.adminDao = new AdminDAO();
	}

	public List<MemberDTO> selectAllMembers() {
		
		Connection con = getConnection();
		
		List <MemberDTO> memberList = null;
		
		memberList = adminDao.selectAllMembers(con);
		
		close(con);
		
		return memberList;
	}
	
}
