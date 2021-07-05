package com.devs.honddoni.post.model.service;

import java.sql.Connection;
import java.util.List;

import com.devs.honddoni.common.dto.CommentsDTO;
import com.devs.honddoni.common.dto.PageInfoCommentsDTO;
import com.devs.honddoni.common.dto.PageInfoPostDTO;
import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.post.model.dao.PagingDAO;

import static com.devs.honddoni.common.JDBCTemplate.getConnection;
import static com.devs.honddoni.common.JDBCTemplate.close;
import static com.devs.honddoni.common.JDBCTemplate.commit;
import static com.devs.honddoni.common.JDBCTemplate.rollback;

public class PagingService {

	private PagingDAO pagingDAO;

	public PagingService() {
		this.pagingDAO = new PagingDAO();
	}

	/* 혼또니게시판 갯수 불러오기 service */
	public int selectWholePostNum(String localName, String categoryName) {

		Connection con = getConnection();

		int result = pagingDAO.selectWholePostNum(con, localName, categoryName);

		close(con);

		return result;
	}

	/* 자유게시판 갯수 불러오기 service */
	public int freeWholePostNum() {

		Connection con = getConnection();

		int result = pagingDAO.freeWholePostNum(con);

		close(con);

		return result;
	}

	/* 전체게시판 갯수 불러오기 service */
	public int totalWholePostNum() {

		Connection con = getConnection();

		int result = pagingDAO.totalWholePostNum(con);

		close(con);

		return result;
	}

	/* 댓글 갯수 불러오기 service */
	public int selectWholeCommentsNum(int postNo) {

		Connection con = getConnection();

		int result = pagingDAO.selectWholeCommentsNum(con, postNo);
		
		close(con);

		return result;
	}
	
	/* 혼또니 게시판 리스트 불러오기 service */
	public List<PostDTO> selectPostList(PageInfoPostDTO pageInfo, String area, String category) {

		Connection con = getConnection();

		List<PostDTO> postList = pagingDAO.selectPostList(con, pageInfo, area, category);

		if(postList != null) {
			commit(con);
		} else {
			rollback(con);
		}
		
		close(con);

		return postList;
	}

	/* 자유 게시판 리스트 불러오기 service */
	public List<PostDTO> freePostList(PageInfoPostDTO pageInfo) {

		Connection con = getConnection();

		List<PostDTO> postList = pagingDAO.freePostList(con, pageInfo);

		if(postList != null) {
			commit(con);
		} else {
			rollback(con);
		}
		
		close(con);

		return postList;
	}

	/* 전체 게시판 리스트 불러오기 service */
	public List<PostDTO> totalPostList(PageInfoPostDTO pageInfo) {

		Connection con = getConnection();

		List<PostDTO> postList = pagingDAO.totalPostList(con, pageInfo);

		if(postList != null) {
			commit(con);
		} else {
			rollback(con);
		}
		
		close(con);

		return postList;
	}


	/* 댓글 리스트 불러오기 service */
	public List<CommentsDTO> selectCommentsList(PageInfoCommentsDTO pageInfo, int postNo) {

		Connection con = getConnection();
		
		List<CommentsDTO> commentsList = pagingDAO.selectCommentsList(con, pageInfo, postNo);
		
		if(commentsList != null) {
			commit(con);
		} else {
			rollback(con);
		}
		
		close(con);

		return commentsList;
	}

	
	// ============ 공지게시판 사용 =========
		
	/* 공지게시판 갯수 불러오기 service */
	public int NoticeWholePostNum() {
		
		Connection con = getConnection();

		int result = pagingDAO.NoticeWholePostNum(con);

		close(con);

		return result;
	}
	
	/* 공지 게시판 리스트 불러오기 service */
	public List<PostDTO> NoticePostList(PageInfoPostDTO pageInfo) {
		
		Connection con = getConnection();

		List<PostDTO> postList = pagingDAO.NoticePostList(con, pageInfo);

		if(postList != null) {
			commit(con);
		} else {
			rollback(con);
		}
		
		close(con);

		return postList;
	}







}
