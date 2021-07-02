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
	// 작성자 회원번호, 지역번호 및 카테고리 받아오는 메소드 작성

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

}
