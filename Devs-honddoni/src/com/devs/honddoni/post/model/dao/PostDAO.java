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
	
	
}	
