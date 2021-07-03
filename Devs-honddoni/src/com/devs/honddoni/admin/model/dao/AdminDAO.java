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

import com.devs.honddoni.admin.view123.PostDTO;
import com.devs.honddoni.common.dto.PageInfoPostDTO;

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
      
      String query = prop.getProperty("selectAllMembers");
      
      try {
         pstmt = con.prepareStatement(query);
         
         rset = pstmt.executeQuery();
         
         memberList = new ArrayList<>();
         
         while(rset.next()) {
         MemberDTO member = new MemberDTO();
         member.setMemberId(rset.getString("MEMBER_ID"));
         member.setMemberNickname(rset.getString("MEMBER_NICKNAME"));
         member.setMemberProfile(rset.getString("MEMBER_PROFILE"));
         member.setMemRegistdate(rset.getString("MEM_REGIST_DATE"));
         
         
         
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


   public List<PostDTO> selectAllPosts(Connection con) {
   
   PreparedStatement pstmt = null;
   ResultSet rset = null;
   
   List<PostDTO> postList = null;
   
   String query = prop.getProperty("selectAllPosts");
   
   try {
      pstmt = con.prepareStatement(query);
      
      rset = pstmt.executeQuery();
      
      postList = new ArrayList<>();
      
      while(rset.next()) {
      PostDTO post = new PostDTO();
      post.setPostName(rset.getString("POST_NAME"));
      post.setMemberNickname(rset.getString("MEMBER_NICKNAME"));
      post.setMemberProfile(rset.getString("MEMBER_PROFILE"));
      post.setLocalName(rset.getString("LOCAL_NAME"));
      post.setCategoryName(rset.getString("CATEGORY_NAME"));
      post.setAchivType(rset.getString("ACHIV_TYPE"));
      
      postList.add(post);
      }
   } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
   } finally {
      close(rset);
      close(pstmt);
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
}