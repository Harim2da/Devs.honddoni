package com.devs.honddoni.memberLog.model.service;

import static com.devs.honddoni.common.JDBCTemplate.close;
import static com.devs.honddoni.common.JDBCTemplate.getConnection;
import static com.devs.honddoni.common.JDBCTemplate.commit;
import static com.devs.honddoni.common.JDBCTemplate.rollback;

import java.sql.Connection;

import com.devs.honddoni.member.model.dto.MemberRegistDTO;
import com.devs.honddoni.memberLog.model.dao.MemberLogDAO;
import com.devs.honddoni.memberLog.model.dto.LoginDataDTO;
import com.devs.honddoni.memberLog.model.dto.SearchIdDTO;
import com.devs.honddoni.memberLog.model.dto.SearchPwdDTO;

public class MemberLogService {

	private MemberLogDAO memberLogDAO = new MemberLogDAO();
	private MemberRegistDTO memberDBDTO;

	public MemberRegistDTO userLogin(LoginDataDTO loginDataDTO) {

		Connection con = getConnection();

		/* DB에서 넘버, 패스워드, 탈퇴여부, 권한 가져오기 */
		memberDBDTO = memberLogDAO.userLogin(con, loginDataDTO);

		close(con);

		return memberDBDTO;
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

	public int editPwd(SearchPwdDTO searchPwdDTO) {

		Connection con = getConnection();

		int result = memberLogDAO.editPwd(con, searchPwdDTO);
		
		if(result > 0) {
			commit(con);
			result = 1;
		} else {
			rollback(con);
		}
		
		close(con);

		return result;
	}

	public int getLoginMemberNo(String loginMemberId) {
		
		Connection con = getConnection();

		int memberNo = memberLogDAO.getLoginMemberNo(con, loginMemberId);
		
		close(con);

		return memberNo;
	}

}
