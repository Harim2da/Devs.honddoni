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
				userPassword = rset.getString("A.MEMBER_PASSWORD");
			} else {
				System.out.println("Password 값없음");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		return userPassword;
	}

}
