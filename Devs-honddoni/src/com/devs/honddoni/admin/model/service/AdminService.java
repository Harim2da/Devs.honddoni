package com.devs.honddoni.admin.model.service;

import java.sql.Connection; 

import java.util.List;

import static com.devs.honddoni.common.JDBCTemplate.getConnection;
import static com.devs.honddoni.common.JDBCTemplate.rollback;
import static com.devs.honddoni.common.JDBCTemplate.close;
import static com.devs.honddoni.common.JDBCTemplate.commit;

import com.devs.honddoni.admin.model.dto.*;
import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.admin.model.dao.AdminDAO;


public class AdminService {
	
	Connection con = getConnection();
   
	private AdminDAO adminDAO = new AdminDAO();
	

	public List<AdminDTO> onlyNicname() {
		
		Connection con = getConnection();
		
		List <AdminDTO> adminList = null;
		
		adminList = adminDAO.onlyNicname(con);
		
		close(con);
		
		return adminList;
	}


	public int insertNoticePost(PostDTO postDTO) {
		
		Connection con = getConnection();
		
		int result = adminDAO.insertNoticePost(con, postDTO);
		
		if(result > 0) {
			commit(con);
			result = 1;
		} else {
			rollback(con);
		}
		
		close(con);
		
		return result;
	}


	public PostDTO selectTheNoticePost(int postNo) {
		
		Connection con = getConnection();

		PostDTO postDTO = new PostDTO();
		postDTO = adminDAO.selectTheNoticePost(con, postNo);
		
		close(con);
		
		return postDTO;
		
	}
	
}

