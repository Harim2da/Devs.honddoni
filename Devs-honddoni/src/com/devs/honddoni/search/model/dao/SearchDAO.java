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
				post.setPostNo(rset.getInt("POST_NO"));
				post.setPostName(rset.getString("POST_NAME"));
				post.setPostContents(rset.getString("POST_CONTENTS"));
				post.setPostCategory(rset.getString("POST_CATEOGORY"));
				post.setPostMemberNo(rset.getInt("POST_MEMBER_NO"));
				post.setPostMeetingDate(rset.getString("POST_MEETING_DATE"));
				post.setPostMeetingTime(rset.getString("POST_MEETING_TIME"));
				post.setPostWritingDate(rset.getString("POST_WRITING_DATE"));
				post.setPostMeetingTime(rset.getString("POST_WRITING_TIME"));
				post.setLocalName(rset.getString("LOCAL_NAME"));
				post.setCategoryName(rset.getString("CATEGORY_NAME"));
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
