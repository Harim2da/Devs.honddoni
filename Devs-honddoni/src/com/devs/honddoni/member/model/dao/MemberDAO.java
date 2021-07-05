package com.devs.honddoni.member.model.dao;

import static com.devs.honddoni.common.JDBCTemplate.close;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import java.util.Properties;

import com.devs.honddoni.member.model.dto.ChangePwdDTO;
import com.devs.honddoni.member.model.dto.MemberInfoDTO;
import com.devs.honddoni.member.model.dto.MemberRegistDTO;

public class MemberDAO {

	Properties prop = new Properties();

	public MemberDAO() {
		this.prop = new Properties();

		try {
			prop.loadFromXML(new FileInputStream("mapper/member-query.xml"));
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int idDuplCheck(Connection con, String getUserId) {

		PreparedStatement pstmt = null;
		ResultSet rset = null;

		int result = 0;

		String query = prop.getProperty("idDuplCheck");

		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, getUserId);

			rset = pstmt.executeQuery();


			/* 카운트가 0개 = 중복아님 = 0 */
			if(rset.next()) {
				
				if(rset.getInt("COUNT(*)") == 1) {
					result = 1;
				} else {
					result = 0;
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


	public int registNewMember(Connection con, MemberRegistDTO member) {

		PreparedStatement pstmt = null;

		int result = 0;

		String query = prop.getProperty("registNewMember");

		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPassword());
			pstmt.setString(3, member.getMemberName());
			pstmt.setString(4, member.getMemberBirth());
			pstmt.setString(5, member.getMemberGender());
			pstmt.setString(6, member.getMemberAddress());
			pstmt.setString(7, member.getMemberNickname());
			pstmt.setString(8, member.getMemberPhone());
			pstmt.setString(9, member.getMemberEmail());
			pstmt.setString(10, member.getMemRegistDate());
			pstmt.setString(11, member.getMemberCharacter());

			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

	public int pwdCheck(Connection con, ChangePwdDTO changePwd) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		int result = 0;
		
		String query = prop.getProperty("checkPassword");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, "user06");
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				
				System.out.println("rset.getStr : " + rset.getString("MEMBER_PASSWORD"));
				System.out.println("oldPwd");
				if(rset.getString("MEMBER_PASSWORD").equals(changePwd.getMemberOldPassword())) {
					result = 1;
				} else {
					result = 0;
				}
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int modifyPassword(Connection con, ChangePwdDTO changePwd) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("modifyPassword");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, changePwd.getMemberNewPassword());
			pstmt.setString(2, "user06");
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		
		
		return result;
	}

	public MemberInfoDTO callMemberInfo(Connection con, String testId) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		MemberInfoDTO memberInfo = null;
		
		String query = prop.getProperty("callMemberInfo");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, testId);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				memberInfo = new MemberInfoDTO();
				memberInfo.setProfile(rset.getString("MEMBER_PROFILE"));
				memberInfo.setName(rset.getString("MEMBER_NAME"));
				memberInfo.setId(rset.getString("MEMBER_ID"));
				memberInfo.setBirth(rset.getString("MEMBER_BIRTH"));
				memberInfo.setGender(rset.getString("MEMBER_GENDER"));
				memberInfo.setNickName(rset.getString("MEMBER_NICKNAME"));
				memberInfo.setAddress(rset.getString("MEMBER_ADDRESS"));
				memberInfo.setPhone(rset.getString("MEMBER_PHONE"));
				memberInfo.setEmail(rset.getString("MEMBER_EMAIL"));
				memberInfo.setCharacterCode(rset.getInt("MEM_CHARACTER_CODE"));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		
		return memberInfo;
	}

	public int changeProfile(Connection con, String profile) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("changeProfile");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, profile);
			pstmt.setString(2, "user06");
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		
		
		return result;
				
		
	}

	public int changeCharacter(Connection con, Integer newCharacterCode) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("changeCharacter");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, newCharacterCode);
			pstmt.setString(2, "user06");
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		
		
		return result;
	}

	public int changeInfo(Connection con, MemberInfoDTO memberInfo) {

		PreparedStatement pstmt = null;
		int result = 0;
		String query = prop.getProperty("changeInfo");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, memberInfo.getNickName());
			pstmt.setString(2, memberInfo.getAddress());
			pstmt.setString(3, memberInfo.getPhone());
			pstmt.setString(4, memberInfo.getEmail());
			pstmt.setString(5, "user06");
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		
		
		return result;
	}

	

}
