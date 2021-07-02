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

public class PagingService {

	private PagingDAO pagingDAO;

	public PagingService() {
		this.pagingDAO = new PagingDAO();
	}


	public int selectWholePostNum(String categoryName) {

		Connection con = getConnection();

		int result = pagingDAO.selectWholePostNum(con, categoryName);

		close(con);

		return result;
	}

	public int freeWholePostNum() {

		Connection con = getConnection();

		int result = pagingDAO.freeWholePostNum(con);

		close(con);

		return result;
	}

	public int totalWholePostNum() {

		Connection con = getConnection();

		int result = pagingDAO.totalWholePostNum(con);

		close(con);

		return result;
	}

	public int selectWholeCommentsNum(int postNo) {

		Connection con = getConnection();

		int result = pagingDAO.selectWholeCommentsNum(con, postNo);

		close(con);

		return result;
	}

	public List<PostDTO> selectPostList(PageInfoPostDTO pageInfo, String area, String category) {

		Connection con = getConnection();

		List<PostDTO> postList = pagingDAO.selectPostList(con, pageInfo, area, category);

		close(con);

		return postList;
	}

	public List<PostDTO> freePostList(PageInfoPostDTO pageInfo) {

		Connection con = getConnection();

		List<PostDTO> postList = pagingDAO.freePostList(con, pageInfo);

		close(con);

		return postList;
	}

	public List<PostDTO> totalPostList(PageInfoPostDTO pageInfo) {

		Connection con = getConnection();

		List<PostDTO> postList = pagingDAO.totalPostList(con, pageInfo);

		close(con);

		return postList;
	}



	public List<CommentsDTO> selectCommentsList(PageInfoCommentsDTO pageInfo, int postNo) {

		Connection con = getConnection();

		List<CommentsDTO> commentsList = pagingDAO.selectCommentsList(con, pageInfo, postNo);

		close(con);

		return commentsList;
	}











}
