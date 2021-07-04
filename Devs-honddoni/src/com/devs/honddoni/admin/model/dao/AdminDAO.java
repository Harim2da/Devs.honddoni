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

import com.devs.honddoni.admin.view123.MemberDTO;
import com.devs.honddoni.admin.view123.TotalDTO;
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
//   public List<MemberDTO> selectAllMembers(Connection con) {
//      
//      PreparedStatement pstmt = null;
//      ResultSet rset = null;
//      
//      List<MemberDTO> memberList = null;
//      
//      String query = prop.getProperty("selectAllMembers");
//      
//      try {
//         pstmt = con.prepareStatement(query);
//         
//         rset = pstmt.executeQuery();
//         
//         memberList = new ArrayList<>();
//         
//         while(rset.next()) {
//         MemberDTO member = new MemberDTO();
//         member.setMemberId(rset.getString("MEMBER_ID"));
//         member.setMemberNickname(rset.getString("MEMBER_NICKNAME"));
//         member.setMemberProfile(rset.getString("MEMBER_PROFILE"));
//         member.setMemRegistdate(rset.getString("MEM_REGIST_DATE"));
//         
//         
//         
//         memberList.add(member);
//         }
//      } catch (SQLException e) {
//         // TODO Auto-generated catch block
//         e.printStackTrace();
//      } finally {
//         close(rset);
//         close(pstmt);
//      }
//      return memberList;
//   }
   
   public List<TotalDTO> totalPostList(Connection con) {
	      
	      PreparedStatement pstmt = null;
	      ResultSet rset = null;
	      
	      List<TotalDTO> totalList = null;
	      
	      String query = prop.getProperty("totalPostList");
	      
	      try {
	         pstmt = con.prepareStatement(query);
	         
	         rset = pstmt.executeQuery();
	         
	         totalList = new ArrayList<>();
	         
	         while(rset.next()) {
	        	 	TotalDTO total = new TotalDTO();
	        	 	total.setMemberId(rset.getString("MEMBER_ID"));
					total.setMemberNickname(rset.getString("MEMBER_NICKNAME"));
					total.setMemberProfile(rset.getString("MEMBER_PROFILE"));
					total.setMemRegistdate(rset.getString("MEM_REGIST_DATE"));
//					total.setPostNo(rset.getInt("POST_NO"));
//					total.setPostName(rset.getString("POST_NAME"));
//					total.setPostContents(rset.getString("POST_CONTENTS"));
//					total.setPostCategory(rset.getString("POST_CATEGORY"));
//					total.setPostMemberno(rset.getString("POST_MEMBER_NO"));
//					total.setPostmeetingDate(rset.getString("POST_MEETINGDATE"));
//					total.setPostmeetingTime(rset.getString("POST_MEETINGTIME"));
//					total.setPostwritingDate(rset.getString("POST_WRITINGDATE"));
//					total.setPostwritingTime(rset.getString("POST_WRITINGTIME"));
//					total.setLocalName(rset.getString("LOCAL_NAME"));
//					total.setCategoryName(rset.getString("CATEGORY_NAME"));
//					total.setPostdelStatus(rset.getString("POST_DEL_STATUS"));
//					total.setPostnumberofPeople(rset.getInt("POST_NUMBER_OF_PEOPLE"));
				
			                   




	         
	         
	         
	         totalList.add(total);
	         }
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      } finally {
	         close(rset);
	         close(pstmt);
	      }
	      return totalList;
	   }
}


//   public List<TotalDTO> totalPostList(Connection con, PageInfoPostDTO pageInfo) {
//		
//		PreparedStatement pstmt = null;
//		ResultSet rset = null;
//		TotalDTO total = null;
//		List<TotalDTO> TotalList = null;
//		
//		String query = prop.getProperty("wholePostList");
//		
//		try {
//			pstmt = con.prepareStatement(query);
//			pstmt.setInt(1, pageInfo.getStartRow());
//			pstmt.setInt(2, pageInfo.getEndRow());
//			
//			rset = pstmt.executeQuery();
//			
//			TotalList = new ArrayList<>();
//			
//			while(rset.next()) {
//				total = new TotalDTO();
//				
//				
//				total.setMemberId(rset.getString("MEMBER_ID"));
//				total.setMemberNickname(rset.getString("MEMBER_NICKNAME"));
//				total.setMemberProfile(rset.getString("MEMBER_PROFILE"));
//				total.setMemRegistdate(rset.getString("MEM_REGIST_DATE"));
//				
//				total.setPostNo(rset.getInt("POST_NO"));
//				total.setPostName(rset.getString("POST_NAME"));
//				total.setPostContents(rset.getString("POST_CONTENTS"));
//				total.setPostCategory(rset.getString("POST_CATEGORY"));
//				total.setPostMemberno(rset.getString("POST_MEMBER_NO"));
//				total.setPostmeetingDate(rset.getString("POST_MEETINGDATE"));
//				total.setPostmeetingTime(rset.getString("POST_MEETINGTIME"));
//				total.setPostwritingDate(rset.getString("POST_WRITINGDATE"));
//				total.setPostwritingTime(rset.getString("POST_WRITINGTIME"));
//				total.setLocalCode(rset.getInt("LOCAL_CODE"));
//				total.setCategoryName(rset.getString("CATEGORY_NAME"));
//				total.setPostdelStatus(rset.getString("POST_DEL_STATUS"));
//				total.setPostnumberofPeople(rset.getInt("POST_NUMBER_OF_PEOPLE"));
//		
//				TotalList.add(total);
//				
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close(pstmt);
//			close(rset);
//		}
//		
//		return TotalList;
	