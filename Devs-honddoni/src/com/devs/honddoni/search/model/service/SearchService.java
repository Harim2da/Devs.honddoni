package com.devs.honddoni.search.model.service;

import static com.devs.honddoni.common.JDBCTemplate.getConnection;
import static com.devs.honddoni.common.JDBCTemplate.close;
import static com.devs.honddoni.common.JDBCTemplate.commit;
import static com.devs.honddoni.common.JDBCTemplate.rollback;



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
	
		 if(selectList != null) {
			 commit(con);
		 } else {
			 rollback(con);
		 }
		 
		 close(con);
		return selectList;
	}
}



















//	public int insertFreeBoardPost(PostDTO post) {
//
//		Connection con = getConnection();
//		
//		int result = 0;
//		
//		int postFreeBoardResult = searchDAO.insertNewFreeBoard(con, post);
//		
//		if(postFreeBoardResult > 0) {
//			commit(con);
//			result = 1;
//		} else {
//			rollback(con);
//		}
//		close(con);
//		
//		return result;
//	}
//
//}












