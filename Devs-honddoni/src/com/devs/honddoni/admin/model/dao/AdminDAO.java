package com.devs.honddoni.admin.model.dao;

import static com.devs.honddoni.common.JDBCTemplate.close;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.devs.honddoni.admin.model.dto.AdminDTO;
import com.devs.honddoni.common.dto.PostDTO;



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




	public int insertNoticePost(Connection con, PostDTO postDTO) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("insertNoticePost");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, postDTO.getPostName());
			pstmt.setString(2, postDTO.getPostContents());
			pstmt.setString(3, postDTO.getPostWritingDate());
			pstmt.setString(4, postDTO.getPostWritingTime());
			
			result = pstmt.executeUpdate();			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}		
		
		return result;
	}

	public PostDTO selectTheNoticePost(Connection con, int postNo) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		PostDTO postDTO = null;
		
		String query = prop.getProperty("selectTheNoticePost");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, postNo);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				postDTO = new PostDTO();
				
				postDTO.setPostName(rset.getString("POST_NAME"));
				postDTO.setPostContents(rset.getString("POST_CONTENTS"));
//				postDTO.setCategoryName(rset.getString("POST_CATEGORY"));
				postDTO.setPostMemberNo(rset.getInt("POST_MEMBER_NO"));
//				postDTO.setPostMeetingDate(rset.getString("POST_MEETINGDATE"));
//				postDTO.setPostMeetingTime(rset.getString("POST_MEETINGTIME"));
				postDTO.setPostWritingDate(rset.getString("POST_WRITINGDATE"));
				postDTO.setPostWritingDate(rset.getString("POST_WRITINGTIME"));
//				postDTO.setLocalName(rset.getString("LOCAL_NAME"));
//				postDTO.setCategoryName(rset.getString("CATEGORY_NAME"));
				postDTO.setPostDelStatus(rset.getString("POST_DEL_STATUS"));
//				postDTO.setPostNumberOfPeopleNumber(rset.getInt("POST_NUMBER_OF_PEOPLE"));
//				postDTO.setMemberNickname(rset.getString("MEMBER_NICKNAME"));
//				postDTO.setMemberProfile(rset.getString("MEMBER_PROFILE"));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return postDTO;
	}


	public List<AdminDTO> totalUserList(Connection con) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		List<AdminDTO> adminList = null;
		
		String query = prop.getProperty("totalUserList");
		
		try {
			pstmt = con.prepareStatement(query);
			rset = pstmt.executeQuery();
			adminList = new ArrayList<>();
			
			while(rset.next()) {
				AdminDTO row = new AdminDTO();
				
				row.setMemberId("MEMBER_ID");
				row.setMemberNicname("MEMBER_NICKNAME");
				row.setMemberProfile("MEMBER_PROFILE");
				row.setMemRegistdate("MEM_REGIST_DATE");
//				row.setMEMBER_NICKNAME(mEMBER_NICKNAME);
//				row.setMEMBER_NICKNAME(mEMBER_NICKNAME);
//				row.setMEMBER_NICKNAME(mEMBER_NICKNAME);
//				row.setMEMBER_NICKNAME(mEMBER_NICKNAME);
//				row.setMEMBER_NICKNAME(mEMBER_NICKNAME);
//				row.setMEMBER_NICKNAME(mEMBER_NICKNAME);
				
				adminList.add(row);
			}

			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);

			close(rset);
		}
		
		return adminList;

	}


	public int modifyNotice(Connection con, PostDTO postDTO) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("modifyNotice");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, postDTO.getPostName());
			pstmt.setString(2, postDTO.getPostContents());
			pstmt.setString(3, postDTO.getPostWritingDate());
			pstmt.setString(4, postDTO.getPostWritingTime());
			pstmt.setInt(5, postDTO.getPostNo());
			
			result = pstmt.executeUpdate();			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}		
		
		return result;
	}
}