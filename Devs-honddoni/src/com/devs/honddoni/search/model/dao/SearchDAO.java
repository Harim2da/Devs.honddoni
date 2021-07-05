package com.devs.honddoni.search.model.dao;

import java.io.FileInputStream;


import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.devs.honddoni.common.dto.PostDTO;
import static com.devs.honddoni.common.JDBCTemplate.close;

public class SearchDAO {

	private Properties prop;

	public SearchDAO() {
		this.prop = new Properties();
		try {
			prop.loadFromXML(new FileInputStream("postmapper/paging-query.xml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	public List<PostDTO> selectList(Connection con) {

		Statement stmt =  null; 
		ResultSet rset = null;

		List<PostDTO> postList = null;

		String query = prop.getProperty("wholePostList");

		try {
			stmt = con.createStatement();
			rset = stmt.executeQuery(query);
			
			postList = new ArrayList<>();
			
			while(rset.next()) {
				PostDTO post = new PostDTO();
				post.setPostNo(rset.getInt("POST_NO"));  //게시글 번호
				post.setPostName(rset.getString("POST_NAME"));  //게시글 이름
				post.setPostContents(rset.getString("POST_CONTENTS"));  // 게시글내용
				post.setPostCategory(rset.getString("POST_CATEOGORY"));  //게시글종류
				post.setPostMemberNo(rset.getInt("POST_MEMBER_NO"));  // 게시글 작성자 번호
				post.setPostMeetingDate(rset.getString("POST_MEETING_DATE"));  //만나는날짜
				post.setPostMeetingTime(rset.getString("POST_MEETING_TIME"));  //맞나는시간
				post.setPostWritingDate(rset.getString("POST_WRITING_DATE"));  // 작성날짜
				post.setPostMeetingTime(rset.getString("POST_WRITING_TIME"));  //작성시간
				post.setLocalName(rset.getString("LOCAL_NAME"));  //지역
				post.setCategoryName(rset.getString("CATEGORY_NAME"));  //카테고리이름
				post.setPostDelStatus(rset.getString("POST_DEL_STATUS"));  
				post.setMemberNickname(rset.getString("MEMBER_NICKNAME"));
				post.setMemberProfile(rset.getString("MEMBER_PROFILE"));
				post.setPostNumberOfPeopleNumber(rset.getInt("POST_NUMBER_OF_PEOPLE"));
				
				
				postList.add(post);
				
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		} 
		return postList;
	}
		
			
	public List<PostDTO> freeBoardList(Connection con) {

		Statement stmt =  null; 
		ResultSet rset = null;

		List<PostDTO> postList = null;

		String query = prop.getProperty("wholePostList");

		try {
			stmt = con.createStatement();
			rset = stmt.executeQuery(query);
			
			postList = new ArrayList<>();
			
			while(rset.next()) {
				PostDTO post = new PostDTO();
				post.setPostNo(rset.getInt("POST_NO"));  //게시글번호
				post.setPostName(rset.getString("POST_NAME"));  //게시글 이름
				post.setPostContents(rset.getString("POST_CONTENTS"));  //게시글내용
				post.setPostCategory(rset.getString("POST_CATEOGORY"));  //게시글 카테고리
				post.setPostMemberNo(rset.getInt("POST_MEMBER_NO"));  //게시글 작성자 번호
				post.setPostWritingDate(rset.getString("POST_WRITING_DATE"));  //게시글 작성날짜
				post.setPostMeetingTime(rset.getString("POST_WRITING_TIME"));  //게시글 작성 시간
				post.setPostDelStatus(rset.getString("POST_DEL_STATUS"));
				post.setPostNumberOfPeopleNumber(rset.getInt("POST_NUMBER_OF_PEOPLE"));
				
				
				postList.add(post);
				
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		} 
		return postList;
	}
	
	
	
	
	
	

}
