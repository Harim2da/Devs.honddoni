package com.devs.honddoni.post.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import java.util.Properties;

import com.devs.honddoni.common.dto.CommentsDTO;

import static com.devs.honddoni.common.JDBCTemplate.close;

public class PostDAO2 {

	private Properties prop;

	public PostDAO2() {
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

	public int deleteComment(Connection con, List<CommentsDTO> deleteCommentList) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		String query = prop.getProperty("deleteComment");
		System.out.println();
		
			try {
				pstmt = con.prepareStatement(query);
				for(int i = 0; i < deleteCommentList.size(); i++) {
					
					pstmt.setInt(1, deleteCommentList.get(i).getCommentsNo());
					System.out.println(deleteCommentList.get(i).getCommentsNo());
				}

				result = pstmt.executeUpdate();
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				close(pstmt);
			}
			
			
		
		return result;
	}

	public int updateComment(Connection con, CommentsDTO updateComment) {

		PreparedStatement pstmt = null;
		int result = 0;
		String query = prop.getProperty("updateComment");
		System.out.println("dao : " + updateComment.getCommentsNo());
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

}
