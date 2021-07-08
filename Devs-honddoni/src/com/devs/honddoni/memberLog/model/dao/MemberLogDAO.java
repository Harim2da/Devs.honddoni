package com.devs.honddoni.memberLog.model.dao;

import static com.devs.honddoni.common.JDBCTemplate.close;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import com.devs.honddoni.member.model.dto.MemberRegistDTO;
import com.devs.honddoni.memberLog.model.dto.LoginDataDTO;
import com.devs.honddoni.memberLog.model.dto.SearchIdDTO;
import com.devs.honddoni.memberLog.model.dto.SearchPwdDTO;

public class MemberLogDAO {

	Properties prop = new Properties();
	
	private MemberRegistDTO memberDBDTO;

	public MemberLogDAO() {
		this.prop = new Properties();

		try {
			prop.loadFromXML(new FileInputStream("mapper/member-log-query.xml"));
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public MemberRegistDTO userLogin(Connection con, LoginDataDTO loginDataDTO) {

		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String userPassword = "";

		String query = prop.getProperty("getMemberPassword");

		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, loginDataDTO.getMemberId());

			rset = pstmt.executeQuery();

			if(rset.next()) {
				memberDBDTO = new MemberRegistDTO();
				
				memberDBDTO.setMemberNo(rset.getInt("MEMBER_NO"));
				memberDBDTO.setMemberPassword(rset.getString("MEMBER_PASSWORD"));
				memberDBDTO.setMemberStatus(rset.getString("MEMBER_STATUS"));
				memberDBDTO.setMemberProfile(rset.getString("MEMBER_ACCESS"));
				
			} else {
				System.out.println("Password 값 없음");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}

		return memberDBDTO;
	}

	public String searchId(Connection con, SearchIdDTO searchIdDTO) {

		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String userId = "";

		String query = prop.getProperty("searchByPhone");

		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, searchIdDTO.getPhone());

			rset = pstmt.executeQuery();

			if(rset.next()) {
				if((searchIdDTO.getName()).equals(rset.getString("MEMBER_NAME"))) {
					userId = rset.getString("MEMBER_ID");
				}
				
			} else {
				userId = "입력오류";
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}


		return userId;
	}

	public int searchPwd(Connection con, SearchPwdDTO searchPwdDTO) {

		PreparedStatement pstmt = null;
		ResultSet rset = null;

		int result = 0;
		

		String query = prop.getProperty("searchById");

		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, searchPwdDTO.getId());

			rset = pstmt.executeQuery();

			if(rset.next()) {
				
				String getName = searchPwdDTO.getName();
				String getId = searchPwdDTO.getId();
				String getPhone = searchPwdDTO.getPhone();
				
				//3개가 다 일치하는 경우, 1을 반환
				if(getName.equals(rset.getString("MEMBER_NAME"))) {
					if(getId.equals(rset.getString("MEMBER_ID"))) {
						if(getPhone.equals(rset.getString("MEMBER_PHONE"))) {
							
							result = 1;
						}
					}
				}
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}		

		return result;
	}

	public int editPwd(Connection con, SearchPwdDTO searchPwdDTO) {

		PreparedStatement pstmt = null;
		int result = 0;

		String query = prop.getProperty("editPwd");

		try {
			/* 난수를, 이름이 같은곳에 비밀번호로 설정한다. */
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, searchPwdDTO.getNewPwd());
			pstmt.setString(2, searchPwdDTO.getName());

			result = pstmt.executeUpdate();			

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

	public int getLoginMemberNo(Connection con, String loginMemberId) {

		PreparedStatement pstmt = null;
		ResultSet rset = null;

		int result = 0;
		int userNo = 0;

		String query = prop.getProperty("searchById");

		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, loginMemberId);

			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				userNo = rset.getInt("MEMBER_NO");
			} 

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}

		return userNo;
	}

}
