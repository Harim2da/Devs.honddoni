package com.devs.honddoni.admin.test;

import static com.devs.honddoni.admin.test.JDBCTemplate.close;

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

import com.devs.honddoni.admin.test.*;
import com.devs.honddoni.admin.view123.TotalDTO;

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

	public List<MemberDTO> selectAllMembers(Connection con) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		MemberDTO row = null;
		List<MemberDTO> memberList = null;
		
		String query = prop.getProperty("selectAllMembers");
		
		try {
			pstmt = con.prepareStatement(query);
			rset = pstmt.executeQuery();
			
			memberList = new ArrayList<>();
			
			while(rset.next()) {
				row = new MemberDTO();
				row.setMemberId(rset.getString("MEMBER_ID"));
				row.setMemberPwd(rset.getString("MEMBER_PWD"));
				row.setMemberName(rset.getString("MEMBER_NAME"));
				row.setGender(rset.getString("GENDER"));
				row.setEmail(rset.getString("EMAIL"));
				row.setPhone(rset.getString("PHONE"));
				row.setAddress(rset.getString("ADDRESS"));
				row.setAge(rset.getString("AGE"));
				row.setEnrollDate(rset.getString("ENROLL_DATE"));
				
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
	
public List<TotalDTO> totalPostList(Connection con) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		TotalDTO total = null;
		List<TotalDTO> totalList = null;
		
		String query = prop.getProperty("totalPostList");
		
		try {
			pstmt = con.prepareStatement(query);
			rset = pstmt.executeQuery();
			
			totalList = new ArrayList<>();
			
			while(rset.next()) {
				TotalDTO total1 = new TotalDTO();
				total.setMemberNickname(rset.getString("MEMBER_NICKNAME"));
				total.setMemberProfile(rset.getString("MEMBER_PROFILE"));
				total.setPostName(rset.getString("POST_NAME"));
				total.setLocalName(rset.getString("LOCAL_NAME"));
				
				totalList.add(total);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}

		
		return totalList;
}
	}



