package com.devs.honddoni.post.model.service;

import static com.devs.honddoni.common.JDBCTemplate.getConnection;
import static com.devs.honddoni.common.JDBCTemplate.rollback;
import static com.devs.honddoni.common.JDBCTemplate.close;
import static com.devs.honddoni.common.JDBCTemplate.commit;

import java.sql.Connection;
import java.util.List;

import com.devs.honddoni.common.dto.CommentsDTO;
import com.devs.honddoni.post.model.dao.PostDAO2;

public class PostService2 {

	private PostDAO2 postDAO2;

	public PostService2() {
		this.postDAO2 = new PostDAO2();
	}
	
	/* 댓글 작성하여 DB에 저장하기위한 service 단계 */
	public int communicationComment(CommentsDTO newComment) {

		Connection con = getConnection();
		
		int result = postDAO2.communicationComment(con, newComment);

		if(result > 0) {
			commit(con);
		} else {
			rollback(con);
		}
		
		close(con);

		return result;
	}

	/* 댓글 삭제하여 DB에 저장하기위한 service 단계 */
	public int deleteComment(CommentsDTO deleteComment) {

		Connection con = getConnection();

		int result = postDAO2.deleteComment(con, deleteComment);

		if(result > 0) {
			commit(con);
		} else {
			rollback(con);
		}
		
		close(con);

		return result;
	}
	
	/* 댓글 수정하여 DB에 저장하기위한 service 단계 */
	public int updateComment(CommentsDTO updateComment) {

		Connection con = getConnection();

		int result = postDAO2.updateComment(con, updateComment);

		if(result > 0) {
			commit(con);
		} else {
			rollback(con);
		}
		
		close(con);

		return result;
			
	}

}
