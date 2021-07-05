package com.devs.honddoni.post.model.service;

import static com.devs.honddoni.common.JDBCTemplate.getConnection;
import static com.devs.honddoni.common.JDBCTemplate.rollback;
import static com.devs.honddoni.common.JDBCTemplate.close;
import static com.devs.honddoni.common.JDBCTemplate.commit;

import java.sql.Connection;
import java.util.List;

import com.devs.honddoni.common.dto.CommentsDTO;
import com.devs.honddoni.common.dto.reportDTO;
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
	
	/* 게시글의 번호를 통해 게시글의 분류를 알아오는 service */
	public String selectPostCategory(int postNo) {
		
		Connection con = getConnection();

		String result = postDAO2.selectPostCategory(con, postNo);

		if(result != null) {
			commit(con);
		} else {
			rollback(con);
		}
		
		close(con);

		return result;
		
	}
	
	/* 댓글신고 등록 service */
	public int reportComment(reportDTO reportDTO) {
		
		Connection con = getConnection();

		int result = postDAO2.reportComment(con, reportDTO);

		if(result > 0) {
			commit(con);
		} else {
			rollback(con);
		}
		
		close(con);

		return result;
		
	}

}
