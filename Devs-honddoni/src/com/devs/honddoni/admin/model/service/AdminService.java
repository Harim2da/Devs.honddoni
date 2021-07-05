package com.devs.honddoni.admin.model.service;

import java.sql.Connection;  

import java.util.List;

import static com.devs.honddoni.common.JDBCTemplate.getConnection;
import static com.devs.honddoni.common.JDBCTemplate.close;

import com.devs.honddoni.admin.model.dto.*;
import com.devs.honddoni.admin.model.dao.AdminDAO;







public class AdminService {
   
private AdminDAO adminDao;
	
	public onlyNicname() {
		this.adminDao = new AdminDAO();
	}

	public List<AdminDTO> onlyNicnamet() {
		
		Connection con = getConnection();
		
		List <AdminDTO> adminList = null;
		
		adminList = adminDao.onlyNicname(con);
		
		close(con);
		
		return adminList;
	}

}