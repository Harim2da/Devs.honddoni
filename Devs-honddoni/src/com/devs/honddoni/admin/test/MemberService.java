package com.devs.honddoni.admin.test;

import static com.devs.honddoni.admin.test.JDBCTemplate.close;
import static com.devs.honddoni.admin.test.JDBCTemplate.commit;
import static com.devs.honddoni.admin.test.JDBCTemplate.getConnection;
import static com.devs.honddoni.admin.test.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.List;

import com.devs.honddoni.admin.test.*;
import com.devs.honddoni.admin.view123.TotalDTO;
import com.devs.honddoni.admin.test.*;

public class MemberService {

	private MemberDAO memberDAO;

	public MemberService() {
		this.memberDAO = new MemberDAO();
	}

	public List<MemberDTO> selectAllMembers() {

		Connection con = getConnection();

		List<MemberDTO> memberList = memberDAO.selectAllMembers(con);

		close(con);
		return memberList;
	}

	public List<TotalDTO> totalPostList() {

		Connection con = getConnection();

		List<TotalDTO> totalList = memberDAO.totalPostList(con);

		close(con);
		return totalList;
	}
	
}
