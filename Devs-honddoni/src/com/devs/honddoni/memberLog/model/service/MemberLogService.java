package com.devs.honddoni.memberLog.model.service;

import static com.devs.honddoni.common.JDBCTemplate.close;
import static com.devs.honddoni.common.JDBCTemplate.getConnection;

import java.sql.Connection;

import com.devs.honddoni.memberLog.model.dao.MemberLogDAO;
import com.devs.honddoni.memberLog.model.dto.LoginDataDTO;
import com.devs.honddoni.memberLog.model.dto.SearchIdDTO;
import com.devs.honddoni.memberLog.model.dto.SearchPwdDTO;

public class MemberLogService {
	
	private MemberLogDAO memberLogDAO = new MemberLogDAO();

	public String userLogin(LoginDataDTO loginDataDTO) {
		
		Connection con = getConnection();
		
		/* id에 해당하는 패스워드를 가져옴 */
		String userPassword = memberLogDAO.userLogin(con, loginDataDTO);
		
		close(con);
				
		return userPassword;
	}

	public String searchId(SearchIdDTO searchIdDTO) {
		
		Connection con = getConnection();
		
		String result = memberLogDAO.searchId(con, searchIdDTO);
		
		close(con);
		
		return result;
	}

	public int searchPwd(SearchPwdDTO searchPwdDTO) {
		
		Connection con = getConnection();
		
		int result = memberLogDAO.searchPwd(con, searchPwdDTO);
		
		close(con);
		
		return result;
	}

}
