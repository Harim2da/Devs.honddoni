package com.devs.honddoni.post.model.dao;

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

import com.devs.honddoni.common.dto.CommentsDTO;
import com.devs.honddoni.common.dto.PageInfoCommentsDTO;
import com.devs.honddoni.common.dto.PageInfoPostDTO;
import com.devs.honddoni.common.dto.PostDTO;

import static com.devs.honddoni.common.JDBCTemplate.close;

public class PagingDAO {

	private Properties prop;
	
	public PagingDAO() {
		this.prop = new Properties();
		try {
			prop.loadFromXML(new FileInputStream("postmapper/paging-query.xml"));
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int selectWholePostNum(Connection con) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int result = 0;
		String query = prop.getProperty("selectWholePostNum");
		try {
			pstmt = con.prepareStatement(query);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				result = rset.getInt("COUNT(*)");
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		
		return result;
	}
	
	public int freeWholePostNum(Connection con) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int result = 0;
		String query = prop.getProperty("freeWholePostNum");
		try {
			pstmt = con.prepareStatement(query);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				result = rset.getInt("COUNT(*)");
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		
		return result;
	}
	
	public int totalWholePostNum(Connection con) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int result = 0;
		String query = prop.getProperty("totalWholePostNum");
		try {
			pstmt = con.prepareStatement(query);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				result = rset.getInt("COUNT(*)");
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
				
		return result;
	}
	
	public int selectWholeCommentsNum(Connection con) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int result = 0;
		String query = prop.getProperty("selectWholeCommentsNum");
		try {
			pstmt = con.prepareStatement(query);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				result = rset.getInt("COUNT(*)");
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
				
		return result;
	}

	public List<PostDTO> selectPostList(Connection con, PageInfoPostDTO pageInfo, String area, String category) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		PostDTO row = null;
		List<PostDTO> postList = null;
		
		String query = prop.getProperty("selectPostList");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, area);
			pstmt.setString(2, category);
			pstmt.setInt(3, pageInfo.getStartRow());
			pstmt.setInt(4, pageInfo.getEndRow());
			
			rset = pstmt.executeQuery();
			
			postList = new ArrayList<>();
			
			while(rset.next()) {
				row = new PostDTO();
				
				row.setPostNo(rset.getInt("POST_NO"));
				row.setPostName(rset.getString("POST_NAME"));
				row.setPostContents(rset.getString("POST_CONTENTS"));
				row.setPostCategory(rset.getString("POST_CATEGORY"));
				row.setPostMemberNo(rset.getInt("POST_MEMBER_NO"));
				row.setPostMeetingDate(rset.getString("POST_MEETINGDATE"));
				row.setPostMeetingTime(rset.getString("POST_MEETINGTIME"));
				row.setPostWritingDate(rset.getString("POST_WRITINGDATE"));
				row.setPostWritingTime(rset.getString("POST_WRITINGTIME"));
				row.setLocalName(rset.getString("LOCAL_NAME"));
				row.setCategoryName(rset.getString("CATEGORY_NAME"));
				row.setPostDelStatus(rset.getString("POST_DEL_STATUS"));
				row.setPostNumberOfPeopleNumber(rset.getInt("POST_NUMBER_OF_PEOPLE"));
		
				postList.add(row);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return postList;
	}
	
	public List<PostDTO> freePostList(Connection con, PageInfoPostDTO pageInfo) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		PostDTO row = null;
		List<PostDTO> postList = null;
		
		String query = prop.getProperty("freePostList");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, pageInfo.getStartRow());
			pstmt.setInt(2, pageInfo.getEndRow());
			
			rset = pstmt.executeQuery();
			
			postList = new ArrayList<>();
			
			while(rset.next()) {
				row = new PostDTO();
				
				row.setPostNo(rset.getInt("POST_NO"));
				row.setPostName(rset.getString("POST_NAME"));
				row.setPostContents(rset.getString("POST_CONTENTS"));
				row.setPostCategory(rset.getString("POST_CATEGORY"));
				row.setPostMemberNo(rset.getInt("POST_MEMBER_NO"));
				row.setPostWritingDate(rset.getString("POST_WRITINGDATE"));
				row.setPostWritingTime(rset.getString("POST_WRITINGTIME"));
				row.setPostDelStatus(rset.getString("POST_DEL_STATUS"));
				
				postList.add(row);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return postList;
		
	}
	
	public List<PostDTO> totalPostList(Connection con, PageInfoPostDTO pageInfo) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		PostDTO row = null;
		List<PostDTO> postList = null;
		
		String query = prop.getProperty("wholePostList");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, pageInfo.getStartRow());
			pstmt.setInt(2, pageInfo.getEndRow());
			
			rset = pstmt.executeQuery();
			
			postList = new ArrayList<>();
			
			while(rset.next()) {
				row = new PostDTO();
				
				row.setPostNo(rset.getInt("POST_NO"));
				row.setPostName(rset.getString("POST_NAME"));
				row.setPostContents(rset.getString("POST_CONTENTS"));
				row.setPostCategory(rset.getString("POST_CATEGORY"));
				row.setPostMemberNo(rset.getInt("POST_MEMBER_NO"));
				row.setPostMeetingDate(rset.getString("POST_MEETINGDATE"));
				row.setPostMeetingTime(rset.getString("POST_MEETINGTIME"));
				row.setPostWritingDate(rset.getString("POST_WRITINGDATE"));
				row.setPostWritingTime(rset.getString("POST_WRITINGTIME"));
				row.setLocalName(rset.getString("LOCAL_NAME"));
				row.setCategoryName(rset.getString("CATEGORY_NAME"));
				row.setPostDelStatus(rset.getString("POST_DEL_STATUS"));
				row.setPostNumberOfPeopleNumber(rset.getInt("POST_NUMBER_OF_PEOPLE"));
		
				postList.add(row);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return postList;
	}

	public List<CommentsDTO> selectCommentsList(Connection con, PageInfoCommentsDTO pageInfo, int postNo) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		CommentsDTO row = null;
		List<CommentsDTO> commentsList = null;
		
		String query = prop.getProperty("selectCommentsList");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, postNo);
			pstmt.setInt(2, pageInfo.getStartRow());
			pstmt.setInt(3, pageInfo.getEndRow());
			
			rset = pstmt.executeQuery();
			
			commentsList = new ArrayList<>();
			
			while(rset.next()) {
				row = new CommentsDTO();
				
				row.setCommentsNo(rset.getInt("COMMENTS_NO"));
				row.setCommentsDate(rset.getString("COMMENTS_DATE"));
				row.setCommentsTime(rset.getString("COMMENTS_TIME"));
				row.setCommentsContents(rset.getString("COMMENTS_CONTENTS"));
				row.setPostNo(rset.getInt("POST_NO"));
				row.setMemberNo(rset.getInt("MEMBER_NO"));
				
				commentsList.add(row);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return commentsList;
	}



	

	

	

	

	

	
}