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

import static com.greedy.common.JDBCTemplate.close;

import com.devs.honddoni.common.dto.MemberDTO;

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
	public List<MemberDTO> selectAllPosts(Connection con) {
		
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
			member.setMemberNo(rset.getInt("MEMBER_NO"));
			member.setMemberId(rset.getString("MEMBER_ID"));
			member.setEmrollDate(rset.getString("ENROLL_DATE"));
			member.setMemberImage(rset.getString("MEMBER_IMAGE"));
			
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