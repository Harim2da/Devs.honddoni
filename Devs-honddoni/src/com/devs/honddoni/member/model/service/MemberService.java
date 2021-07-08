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

	/* 현재 접속중인 사용자의 개인정보를 받아오기 위해 아이디 전달 */
	public MemberInfoDTO callMemberInfo(String userId) {
		
		Connection con = getConnection();
		
		MemberInfoDTO memberInfo = memberDAO.callMemberInfo(con, userId);
		
		close(con);
		
		return memberInfo;
	}

	/* 사용자가 선택한 프로필 사진의 정보를 전달 */
	public int changeProfile(String profile) {
		
		Connection con = getConnection();
		
		int result = memberDAO.changeProfile(con, profile);
		
		close(con);
		
		return result;
		
	}

	
	/* 콤보박스를 통해 선택한 성향 정보를 전달 받아서 서비스로 전달 */
	public int changeCharacter(Integer newCharacterCode) {
		
		Connection con = getConnection();
		
		int result = memberDAO.changeCharacter(con, newCharacterCode);
		
		close(con);
		
		return result;
	}

	/* 변경된 사용자의 정보를 전달 */
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
