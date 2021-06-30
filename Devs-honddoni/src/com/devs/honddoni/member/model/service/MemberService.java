package com.devs.honddoni.member.model.service;

import java.sql.Connection;

import com.devs.honddoni.member.model.dao.MemberDAO;

public class MemberService {
	
	private MemberDAO memberDAO;
	
	public MemberService() {
		this.memberDAO = new MemberDAO();
	}

	public int idDuplCheck(String getUserId) {
		
		Connection con = getConnection();
		
		int result = 1;
		
		return result;
	}

}
