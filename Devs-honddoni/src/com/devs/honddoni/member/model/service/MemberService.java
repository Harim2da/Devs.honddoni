package com.devs.honddoni.member.model.service;

import java.sql.Connection;
import java.util.List;

import com.devs.honddoni.member.model.dao.MemberDAO;
import com.devs.honddoni.member.model.dto.ChangePwdDTO;
import com.devs.honddoni.member.model.dto.MemberInfoDTO;
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

	public int pwdCheck(ChangePwdDTO changePwd) {
		
		Connection con = getConnection();
		
		int pwdCheck = memberDAO.pwdCheck(con, changePwd);
		
		close(con);
		
		return pwdCheck;
	}

	public int modifyPassword(ChangePwdDTO changePwd) {
		
		Connection con = getConnection();
		
		int result = memberDAO.modifyPassword(con, changePwd);
		
		close(con);
		
		return result;
	}

	public MemberInfoDTO callMemberInfo(String testId) {
		
		Connection con = getConnection();
		
		MemberInfoDTO memberInfo = memberDAO.callMemberInfo(con, testId);
		
		close(con);
		
		return memberInfo;
	}

	public int changeProfile(String profile) {
		
		Connection con = getConnection();
		
		int result = memberDAO.changeProfile(con, profile);
		
		close(con);
		
		return result;
		
	}

	public int changeCharacter(Integer newCharacterCode) {
		
		Connection con = getConnection();
		
		int result = memberDAO.changeCharacter(con, newCharacterCode);
		
		close(con);
		
		return result;
	}

	public int changeInfo(MemberInfoDTO memberInfo) {
		Connection con = getConnection();
		
		int result = memberDAO.changeInfo(con, memberInfo);
		
		close(con);
		
		return result;
	}

	public int deleteMember(String userId) {
		Connection con = getConnection();
		
		int result = memberDAO.deleteMember(con, userId);
		
		close(con);
		
		return result;
	}

}
