package com.devs.honddoni.memberLog.model.service;

import static com.devs.honddoni.common.JDBCTemplate.close;
import static com.devs.honddoni.common.JDBCTemplate.getConnection;

import java.sql.Connection;

import com.devs.honddoni.memberLog.model.dao.MemberLogDAO;
import com.devs.honddoni.memberLog.model.dto.LoginDataDTO;

public class MemberLogService {
	
	private MemberLogDAO memberLogDAO = new MemberLogDAO();

	public String userLogin(LoginDataDTO loginDataDTO) {
		
		Connection con = getConnection();
		
		/* id에 해당하는 패스워드를 가져옴 */
		String userPassword = memberLogDAO.userLogin(con, loginDataDTO);
		
		close(con);
				
		return userPassword;
	}

}
