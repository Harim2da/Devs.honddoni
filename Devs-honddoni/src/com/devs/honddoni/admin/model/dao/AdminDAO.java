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

import com.devs.honddoni.admin.model.dto.*;
import com.devs.honddoni.admin.viewpenel.AdminList;
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

	public List<AdminDTO> onlyNicname(Connection con) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		List<AdminDTO> adminList = null;
		
		String query = prop.getProperty("onlyNicname");
		
		try {
			pstmt = con.prepareStatement(query);
			
			rset = pstmt.executeQuery();
			
			adminList = new ArrayList<>();
			
			while(rset.next()) {
				
			AdminDTO admin = new AdminDTO();
			admin.setMEMBER_NICKNAME(rset.getString("MEMBER_NICKNAME"));
//			admin.setMEMBER_ID(rset.getString("MEMBER_ID"));
//			admin.setMEM_REGIST_DATE(rset.getString("MEM_REGIST_DATE"));
			
			adminList.add(admin);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return adminList;
	}
}