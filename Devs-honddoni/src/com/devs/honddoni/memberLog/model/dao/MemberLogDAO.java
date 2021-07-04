package com.devs.honddoni.memberLog.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import com.devs.honddoni.memberLog.model.dto.LoginDataDTO;
import com.devs.honddoni.memberLog.model.dto.SearchIdDTO;
import com.devs.honddoni.memberLog.model.dto.SearchPwdDTO;

import static com.devs.honddoni.common.JDBCTemplate.close;

public class MemberLogDAO {
	
	Properties prop = new Properties();
	
	public MemberLogDAO() {
		this.prop = new Properties();
		
		try {
			prop.loadFromXML(new FileInputStream("mapper/member-log-query.xml"));
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String userLogin(Connection con, LoginDataDTO loginDataDTO) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String userPassword = "";
		
		String query = prop.getProperty("getMemberPassword");
				
		try {
			pstmt = con.prepareStatement(query);
			//스트링으로 잘 들어갈까..?
			pstmt.setString(1, loginDataDTO.getMemberId());
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				userPassword = rset.getString("MEMBER_PASSWORD");
			} else {
				System.out.println("Password 값없음");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
				
		return userPassword;
	}

	public String searchId(Connection con, SearchIdDTO searchIdDTO) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String userId = "";
		
		String query = prop.getProperty("searchByPhone");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, searchIdDTO.getPhone());
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				userId = rset.getString("MEMBER_ID");
			} else {
				userId = "입력오류";
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
				
		
		return userId;
	}

	public int searchPwd(Connection con, SearchPwdDTO searchPwdDTO) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		int result = 0;
		
		String query = prop.getProperty("searchById");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, searchPwdDTO.getId());
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				System.out.println("기존 비밀번호는 : " + rset.getString("MEMBER_PASSWORD"));
				result = 1;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}		
		
		return result;
	}

}
