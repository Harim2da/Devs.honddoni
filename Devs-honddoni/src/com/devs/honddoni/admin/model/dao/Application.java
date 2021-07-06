package com.devs.honddoni.admin.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.devs.honddoni.admin.model.dto.AdminDTO;

import static com.devs.honddoni.common.JDBCTemplate.getConnection;
import static com.devs.honddoni.common.JDBCTemplate.close;

//public class Application {
//	
//	public static void main(String[] args) {
//		
//		Connection con = getConnection();
//		
//		PreparedStatement pstmt = null;
//		ResultSet rset = null;
//		
//		List<AdminDTO> adminList = null;
//		
//		
//		try {
//			pstmt = con.prepareStatement("SELECT MEMBER_NAME FROM TBL_MEMBER");
//			
//			rset = pstmt.executeQuery();
//			
//			adminList = new ArrayList<>();
//			
//			while(rset.next()) {
//				System.out.println(rset.getString("MEMBER_NAME"));
//			}
//			
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close(rset);
//			close(pstmt);
//			close(con);
//		}
//
//	}
//
//}
