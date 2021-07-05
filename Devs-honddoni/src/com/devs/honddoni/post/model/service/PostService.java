package com.devs.honddoni.post.model.service;

import static com.devs.honddoni.common.JDBCTemplate.close;
import static com.devs.honddoni.common.JDBCTemplate.commit;
import static com.devs.honddoni.common.JDBCTemplate.getConnection;
import static com.devs.honddoni.common.JDBCTemplate.rollback;

import java.sql.Connection;

import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.post.model.dao.PostDAO;

public class PostService {

	private PostDAO postDAO;
		
	public PostService() {
		postDAO = new PostDAO();
	}

	/* DB에 게시글 등록하기 위한 부분*/
	public int insertHonddoniPost(PostDTO post) {

		Connection con = getConnection();

		int result = 0;

		int postHonddoniResult = postDAO.insertNewHonPost(con, post);

		if(postHonddoniResult > 0) {
			commit(con);
			result = 1;
		} else {
			rollback(con);
		}

		close(con);

		return result;

	}
	
	public int searchLocalCode(String localName) {
		Connection con = getConnection();

		int searchLocalCode = postDAO.searchLocalCode(con, localName);
			
		close(con);
		
		return searchLocalCode;
	}

	public int searchCategoryCode(String categoryName) {
		Connection con = getConnection();

		int searchCategoryCode = postDAO.searchCategoryCode(con, categoryName);
			
		close(con);
		
		return searchCategoryCode;
	}
	
	/* 선택한 게시글 세부 내용 조회 */
	public PostDTO selectThePostList(int postNo) {
		
		Connection con = getConnection();
		
		PostDTO postDTO = new PostDTO();
		
		postDTO = postDAO.selectPost(con, postNo);
		
		return postDTO;
	}
	
	
	
	
	
}
