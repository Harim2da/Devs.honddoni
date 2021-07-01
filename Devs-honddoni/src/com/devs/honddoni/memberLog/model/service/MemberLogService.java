package com.devs.honddoni.memberLog.model.service;

import java.sql.Connection;

import com.devs.honddoni.memberLog.model.dao.MemberLogDAO;
import com.devs.honddoni.memberLog.model.dto.LoginDataDTO;

import static com.devs.honddoni.common.JDBCTemplate.getConnection;
import static com.devs.honddoni.common.JDBCTemplate.close;
import static com.devs.honddoni.common.JDBCTemplate.commit;
import static com.devs.honddoni.common.JDBCTemplate.rollback;

public class MemberLogService {
	
	private MemberLogDAO memberLogDAO;

	public int userLogin(LoginDataDTO loginDataDTO) {
		
		Connection con = getConnection();
		int result = 0;
		
		result = memberLogDAO.userLogin(loginDataDTO);
		
		if(result > 0) {
			commit(con);
			result = 1;
		} else {
			rollback(con);
		}
		
		close(con);
				
		return result;
	}

}
