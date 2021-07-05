package com.devs.honddoni.post.model.dao;

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

import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.post.model.service.PostService;

public class PostDAO {

	private Properties prop;
	private PostService sv;

	public PostDAO() {
		this.prop = new Properties();

		try {
			prop.loadFromXML(new FileInputStream("postmapper/honddonipost-query.xml"));
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int insertNewHonPost(Connection con, PostDTO post) {
		//게시글 번호 - DB에서 받, 카테고리명 /지역명은 DTO에서 String으로 받아서 여기서 int로 변환 

		PreparedStatement pstmt = null;
		int result = 0;

		//		String localCode = prop.getProperty("searchLocalCode");
		//		int categoryCode = Integer.parseInt(prop.getProperty("searchCategoryCode"));

		String query = prop.getProperty("insertNewHonPost");
		System.out.println(post);

		try {
			pstmt = con.prepareStatement(query);

			pstmt.setString(1, post.getPostName());
			pstmt.setString(2, post.getPostContents());
			pstmt.setString(3, post.getPostCategory());
			pstmt.setInt(4, post.getPostMemberNo());
			pstmt.setString(5, post.getPostMeetingDate());
			pstmt.setString(6, post.getPostMeetingTime());
			pstmt.setString(7, post.getPostWritingDate());
			pstmt.setString(8, post.getPostWritingTime());
			pstmt.setInt(9, post.getLocalCode());
			pstmt.setInt(10, post.getCategoryCode()); 
			pstmt.setInt(11, post.getPostNumberOfPeopleNumber());

			result = pstmt.executeUpdate();


		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

	public int searchLocalCode(Connection con, String localName) {

		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int result = 0;

		String localCode = prop.getProperty("searchLocalCode");

		try {
			pstmt = con.prepareStatement(localCode);
			pstmt.setString(1, localName);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				result = rset.getInt("LOCAL_CODE");			
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return result;
	}

	public int searchCategoryCode(Connection con, String categoryName) {

		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int result = 0;

		String categoryCode = prop.getProperty("searchCategoryCode");

		try {
			pstmt = con.prepareStatement(categoryCode);
			pstmt.setString(1, categoryName);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				result = rset.getInt("CATEGORY_CODE");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}


		return result;
	}



	public PostDTO selectPost(Connection con, int postNo) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		PostDTO postDTO = null;
		
		String query = prop.getProperty("selectThePostList");
		

		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, postNo);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				postDTO = new PostDTO();
				postDTO.setPostName(rset.getString("POST_NAME"));
				postDTO.setPostContents(rset.getString("POST_CONTENTS"));
				postDTO.setCategoryName(rset.getString("POST_CATEGORY"));
				postDTO.setPostMemberNo(rset.getInt("POST_MEMBER_NO"));
				postDTO.setPostMeetingDate(rset.getString("POST_MEETINGDATE"));
				postDTO.setPostMeetingTime(rset.getString("POST_MEETINGTIME"));
				postDTO.setPostWritingDate(rset.getString("POST_WRITINGDATE"));
				postDTO.setPostWritingDate(rset.getString("POST_WRITINGTIME"));
				postDTO.setLocalName(rset.getString("LOCAL_NAME"));
				postDTO.setCategoryName(rset.getString("CATEGORY_NAME"));
				postDTO.setPostDelStatus(rset.getString("POST_DEL_STATUS"));
				postDTO.setPostNumberOfPeopleNumber(rset.getInt("POST_NUMBER_OF_PEOPLE"));
				postDTO.setMemberNickname(rset.getString("MEMBER_NICKNAME"));
				postDTO.setMemberProfile(rset.getString("MEMBER_PROFILE"));
			
			
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		return postDTO;
	}

	/* 게시글 삭제 */
	public int deleteThePost(Connection con, int postNo) {
		
		PreparedStatement pstmt = null;
		int result = 0;

		String query = prop.getProperty("deleteThePost");

		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, postNo);
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	
	public int updateThePost(Connection con, PostDTO post) {
		//게시글 번호 - DB에서 받, 카테고리명 /지역명은 DTO에서 String으로 받아서 여기서 int로 변환 

		PreparedStatement pstmt = null;
		int result = 0;

		String query = prop.getProperty("updateThePost");
		System.out.println(post);

		try {
			pstmt = con.prepareStatement(query);

			pstmt.setString(1, post.getPostName());
			pstmt.setString(2, post.getPostContents());
			pstmt.setString(3, post.getPostCategory());
			pstmt.setString(4, post.getPostMeetingDate());
			pstmt.setString(5, post.getPostMeetingTime());
			pstmt.setInt(6, post.getLocalCode());
			pstmt.setInt(7, post.getCategoryCode()); 
			pstmt.setInt(8, post.getPostNumberOfPeopleNumber());
			pstmt.setInt(9, post.getPostNo());

			result = pstmt.executeUpdate();


		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

}	
