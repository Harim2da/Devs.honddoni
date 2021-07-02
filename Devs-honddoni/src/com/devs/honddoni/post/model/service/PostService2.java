package com.devs.honddoni.post.model.service;

import static com.devs.honddoni.common.JDBCTemplate.getConnection;
import static com.devs.honddoni.common.JDBCTemplate.close;

import java.sql.Connection;

import com.devs.honddoni.common.dto.CommentsDTO;
import com.devs.honddoni.post.model.dao.PostDAO2;

public class PostService2 {

	private PostDAO2 postDAO2;

	public PostService2() {
		this.postDAO2 = new PostDAO2();
	}
	
	public int communicationComment(CommentsDTO newComment) {
		
		Connection con = getConnection();
		
		int result = postDAO2.communicationComment(con, newComment);
		
		close(con);
		
		return result;
	}

}
