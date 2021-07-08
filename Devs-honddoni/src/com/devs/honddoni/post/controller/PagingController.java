package com.devs.honddoni.post.controller;

import java.util.List;

import com.devs.honddoni.common.PagenationComments;
import com.devs.honddoni.common.PagenationPost;
import com.devs.honddoni.common.dto.CommentsDTO;
import com.devs.honddoni.common.dto.PageInfoCommentsDTO;
import com.devs.honddoni.common.dto.PageInfoPostDTO;
import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.post.model.service.PagingService;
import com.devs.honddoni.post.view.SelectedComment;


public class PagingController {

	private PagingService pagingService;

	public PagingController() {
		this.pagingService = new PagingService();
	}
	
	/* 혼또니 게시판 갯수 불러오기 컨트롤러*/
	public int selectWholePostNum(String localName, String categoryName) {

		int result = pagingService.selectWholePostNum(localName, categoryName);

		return result;
		
	}
	
	/* 자유 게시판 갯수 불러오기 컨트롤러*/
	public int freeWholePostNum() {

		int result = pagingService.freeWholePostNum();

		PageInfoPostDTO dto = new PageInfoPostDTO();

		return result;
		
	}
	
	/* 전체 게시판 갯수 불러오기 컨트롤러*/
	public int totalWholePostNum() {

		int result = pagingService.totalWholePostNum();

		PageInfoCommentsDTO dto = new PageInfoCommentsDTO();

		return result;
		
	}
	
	/* 댓글 갯수 불러오기 컨트롤러*/
	public int selectWholeCommentsNum(int postNo) {

		int result = pagingService.selectWholeCommentsNum(postNo);
		
		return result;
	}
	
	/* 혼또니 게시판 리스트 불러오기 컨트롤러*/
	public List<PostDTO> selectPostList(int pageNo, String area, String  category) {

		/* 전체 게시물 수가 필요하다.
		 * 데이터베이스에서 먼저 전체 게시물 수를 조회해올 것이다.
		 * */
		PageInfoPostDTO dto = new PageInfoPostDTO();
		int totalCount = pagingService.selectWholePostNum(area, category);
		PagenationPost pagenationPost = new PagenationPost();

		/* 한 페이지에 보여 줄 게시물 수 */
		int limit = 5;      //얘도 파라미터로 전달받아도 된다.
		/* 한 번에 보여질 페이징 버튼의 갯수 */
		int buttonAmount = 2;
		
		/* 페이징 처리를 위한 로직 호출 후 페이징 처리에 관한 정보를 담고 있는 인스턴스를 반환받는다. */
		PageInfoPostDTO pageInfo = pagenationPost.getPostPageInfo(pageNo, totalCount, limit, buttonAmount);

		/* 조회해온다 */
		List<PostDTO> postList = pagingService.selectPostList(pageInfo, area, category);

		return postList;
		
	}
	
	/* 자유 게시판 리스트 불러오기 컨트롤러*/
	public List<PostDTO> freePostList(int pageNo){
		
		PageInfoPostDTO dto = new PageInfoPostDTO();
		int totalCount = dto.getTotalCount();
		PagenationPost pagenationPost = new PagenationPost();
		
		int limit = 5;
		
		int buttonAmount = 2;
		
		PageInfoPostDTO pageInfo = pagenationPost.getPostPageInfo(pageNo, totalCount, limit, buttonAmount);
		
		List<PostDTO> postList = pagingService.freePostList(pageInfo);

		return postList;
		
	}
	
	/* 전체 게시판 리스트 불러오기 컨트롤러*/
	public List<PostDTO> wholePostList(int pageNo) {
		
		PageInfoPostDTO dto = new PageInfoPostDTO();
		int totalCount = dto.getTotalCount();
		PagenationPost pagenationPost = new PagenationPost();
		
		int limit = 5;
		
		int buttonAmount = 2;
		
		PageInfoPostDTO pageInfo = pagenationPost.getPostPageInfo(pageNo, totalCount, limit, buttonAmount);
		
		List<PostDTO> postList = pagingService.totalPostList(pageInfo);

		return postList;
	}

	/* 댓글 리스트 불러오기 컨트롤러*/
	public List<CommentsDTO> selectCommentsList(int pageNo, int postNo) {

		PageInfoCommentsDTO dto = new PageInfoCommentsDTO();
		PagenationComments pagenationComments = new PagenationComments();
		int totalCount = dto.getTotalCount();

		int limit = 10;
		int buttonAmount = 2;
		
		PageInfoCommentsDTO pageInfo = pagenationComments.getCommentsPageInfo(pageNo, totalCount, limit, buttonAmount);
		
		List<CommentsDTO> commentsList = pagingService.selectCommentsList(pageInfo, postNo);
		
		return commentsList;
	}

	/* 공지 게시판 갯수 불러오기 컨트롤러*/
	public int NoticeWholePostNum() {

		int result = pagingService.NoticeWholePostNum();

		return result;		
	}
	
	/* 해당 페이지의 공지글 리스트 불러오기 컨트롤러*/
	public List<PostDTO> NoticePostList(int pageNo){
		
		PageInfoPostDTO dto = new PageInfoPostDTO();
		int totalCount = dto.getTotalCount();
		PagenationPost pagenationPost = new PagenationPost();
		
		int limit = 5;		
		int buttonAmount = 2;
		
		PageInfoPostDTO pageInfo = pagenationPost.getPostPageInfo(pageNo, totalCount, limit, buttonAmount);
		
		List<PostDTO> postList = pagingService.NoticePostList(pageInfo);
		
		return postList;
	}

}
