package com.devs.honddoni.admin.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.devs.honddoni.admin.view123.MemberDTO;

import static com.devs.honddoni.common.JDBCTemplate.close;



public class AdminDAO {
	
	private Properties prop;
	
	public AdminDAO() {
		try {
			prop = new Properties();
			prop.loadFromXML(new FileInputStream("mapper/member-allpost-query.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public List<MemberDTO> selectAllMembers(Connection con) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		List<MemberDTO> memberList = null;
		
		String query = prop.getProperty("selectAllPosts");
		
		try {
			pstmt = con.prepareStatement(query);
			
			rset = pstmt.executeQuery();
			
			memberList = new ArrayList<>();
			
			while(rset.next()) {
			MemberDTO member = new MemberDTO();
			member.setMemberId(rset.getString("MEMBER_ID"));
			member.setMemberNickname(rset.getString("MEMBER_NICKNAME"));
			member.setMemberProfile(rset.getString("MEMBER_PROFILE"));
			member.setMemberRegistDate(rset.getString("MEM_REGIST_DATE"));
			
			
			
			memberList.add(member);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return memberList;
	}
}