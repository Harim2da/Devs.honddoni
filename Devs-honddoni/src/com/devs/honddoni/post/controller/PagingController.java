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
	public void freeWholePostNum() {

		int result = pagingService.freeWholePostNum();

		PageInfoPostDTO dto = new PageInfoPostDTO();

		dto.setTotalCount(result);
		
	}
	
	/* 전체 게시판 갯수 불러오기 컨트롤러*/
	public void totalWholePostNum() {

		int result = pagingService.totalWholePostNum();

		PageInfoCommentsDTO dto = new PageInfoCommentsDTO();

		dto.setTotalCount(result);
		
	}
	
	/* 댓글 갯수 불러오기 컨트롤러*/
	public int selectWholeCommentsNum(int postNo) {

		int result = pagingService.selectWholeCommentsNum(postNo);

		return result;
	}
	
	/* 혼또니 게시판 리스트 불러오기 컨트롤러*/
	public List<PostDTO> selectPostList(int pageNo, String area, String category) {

		/* Notice List를 조회하던 것과 동일하다. 하지만 이번에는 페이징에 대해 처리를 하면서 리스트를 조회해보자
		 * */

		/* 목록보기를 눌렀을 시 가장 처음에 보여지는 페이지는 1페이지이다.
		 * 파라미터로 전달되는 페이지가 있는 경우 currentPage는 파라미터로 전달받은 페이지 수 이다.
		 * */
		//	      String currentPage = request.getParameter("currentPage");

		//	      
		//	      if(currentPage != null && !"".equals(currentPage)) {
		//	         pageNo = Integer.parseInt(currentPage);
		//	      }
		//	      
		//	      /* 0보다 작은 숫자값을 입력해도 1페이지를 보여준다 */
		//	      if(pageNo <= 0) {
		//	         pageNo = 1;
		//	      }

		/* 전체 게시물 수가 필요하다.
		 * 데이터베이스에서 먼저 전체 게시물 수를 조회해올 것이다.
		 * */
		PageInfoPostDTO dto = new PageInfoPostDTO();
		int totalCount = dto.getTotalCount();
		PagenationPost pagenationPost = new PagenationPost();

		//	      System.out.println("totalBoardCount : " + totalCount);

		/* 한 페이지에 보여 줄 게시물 수 */
		int limit = 5;      //얘도 파라미터로 전달받아도 된다.
		/* 한 번에 보여질 페이징 버튼의 갯수 */
		int buttonAmount = 2;
		
		/* 페이징 처리를 위한 로직 호출 후 페이징 처리에 관한 정보를 담고 있는 인스턴스를 반환받는다. */
		PageInfoPostDTO pageInfo = pagenationPost.getPostPageInfo(pageNo, totalCount, limit, buttonAmount);

		//	      System.out.println(pageInfo);

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

}
