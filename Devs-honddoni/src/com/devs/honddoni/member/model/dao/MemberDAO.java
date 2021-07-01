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

import com.devs.honddoni.member.model.dto.MemberRegistDTO;

public class MemberDAO {

	Properties prop = new Properties();

	public MemberDAO() {
		this.prop = new Properties();

		try {
			prop.loadFromXML(new FileInputStream("mapper/member-regist-query.xml"));
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

	public List<MemberRegistDTO> writtenCommentsUser(Connection con, int commentsNo, int postNo) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		List<MemberRegistDTO> memberList = null;
		
		String query = prop.getProperty("writtenCommentsUser");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, postNo);
			pstmt.setInt(2, commentsNo);
			
			rset = pstmt.executeQuery();
			
			memberList = new ArrayList<>();
			if(rset.next()) {
				MemberRegistDTO row = new MemberRegistDTO();
				
				row.setMemberNickname(rset.getString("MEMBER_NICKNAME"));
				row.setMemberProfile(rset.getString("MEMBER_PROFILE"));
				
				memberList.add(row);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return memberList;
	}

}
