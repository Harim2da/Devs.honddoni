package com.devs.honddoni.member.model.service;

import java.sql.Connection;
import java.util.List;

import com.devs.honddoni.member.model.dao.MemberDAO;
import com.devs.honddoni.member.model.dto.MemberRegistDTO;

import static com.devs.honddoni.common.JDBCTemplate.getConnection;
import static com.devs.honddoni.common.JDBCTemplate.close;
import static com.devs.honddoni.common.JDBCTemplate.commit;
import static com.devs.honddoni.common.JDBCTemplate.rollback;

public class MemberService {
	
	private MemberDAO memberDAO;
	
	public MemberService() {
		this.memberDAO = new MemberDAO();
	}

	public int idDuplCheck(String getUserId) {
		
		Connection con = getConnection();
		
		/* 중복이면 1 반환, 중복이 아니면 0 반환 */
		int result = memberDAO.idDuplCheck(con, getUserId);
		
		close(con);
		
		return result;
	}

	public int registMember(MemberRegistDTO member) {
		
		Connection con = getConnection();
		int result = 0;
		
		int registMemberResult = memberDAO.registNewMember(con, member);
		
		if(registMemberResult > 0) {
			commit(con);
			result = 1;
		} else {
			rollback(con);
		}
		
		close(con);
		
		return result;
	}

	public int pwdCheck(String oldPwd) {
		
		Connection con = getConnection();
		
		int result = 0;
		
		int pwdCheck = memberDAO.pwdCheck(con, oldPwd);
		
		close(con);
		
		return result;
	}


}
