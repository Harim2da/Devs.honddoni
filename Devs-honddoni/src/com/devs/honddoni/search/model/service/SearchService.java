package com.devs.honddoni.search.model.service;

import static com.devs.honddoni.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.List;

import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.search.model.dao.SearchDAO;

public class SearchService {
	
	private SearchDAO searchDAO;
	

	

	public List<PostDTO> selectList() {
	
		Connection con = getConnection();
		
		// 조회
		 List<PostDTO> selectList = searchDAO.selectList(con);
	
		return selectList;
	}

}
