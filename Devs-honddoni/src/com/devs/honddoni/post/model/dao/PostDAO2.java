package com.devs.honddoni.post.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import java.util.Properties;

import com.devs.honddoni.common.dto.CommentsDTO;
import com.devs.honddoni.common.dto.reportDTO;

import static com.devs.honddoni.common.JDBCTemplate.close;

public class PostDAO2 {

	private Properties prop;

	public PostDAO2() {
		this.prop = new Properties();
		try {
			prop.loadFromXML(new FileInputStream("postmapper/comment-query.xml"));
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/* 댓글 작성하여 DB에 저장하는 DAO */
	public int communicationComment(Connection con, CommentsDTO newComment) {

		PreparedStatement pstmt = null;
		int result = 0;
		String query = prop.getProperty("communicationComment");

		try {
			pstmt = con.prepareStatement(query);

			pstmt.setString(1, newComment.getCommentsDate());
			pstmt.setString(2, newComment.getCommentsTime());
			pstmt.setString(3, newComment.getCommentsContents());
			pstmt.setInt(4, newComment.getPostNo());
			pstmt.setInt(5, newComment.getMemberNo());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

	/* 댓글 삭제하여 DB에 저장하는 DAO */
	public int deleteComment(Connection con,CommentsDTO deleteComment) {

		PreparedStatement pstmt = null;
		int result = 0;
		String query = prop.getProperty("deleteComment");

		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, deleteComment.getCommentsNo());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
		
	}

	/* 댓글 수정하여 DB에 저장하는 DAO */
	public int updateComment(Connection con, CommentsDTO updateComment) {

		PreparedStatement pstmt = null;
		int result = 0;
		String query = prop.getProperty("updateComment");

		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, updateComment.getCommentsContents());
			pstmt.setInt(2, updateComment.getCommentsNo());

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}
	
	/* 게시글의 번호를 통해 게시글의 분류를 알아오는 DAO */
	public String selectPostCategory(Connection con, int postNo) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String result = "";
		String query = prop.getProperty("selectPostCategory");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, postNo);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				result = rset.getString("POST_CATEGORY");
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} close(pstmt);
		
		return result;
	}
	
	/* 댓글신고 등록 DAO */
	public int reportComment(Connection con, reportDTO reportDTO) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		String query = prop.getProperty("reportComment");

		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, reportDTO.getReportCategory());
			pstmt.setString(2, reportDTO.getBroadType());
			pstmt.setInt(3, reportDTO.getBroadNo());
			pstmt.setInt(4, reportDTO.getReportMemberNo());
			pstmt.setInt(5, reportDTO.getReportedMemberNo());

			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;

	}

}
