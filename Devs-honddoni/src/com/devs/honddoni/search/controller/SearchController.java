package com.devs.honddoni.search.controller;

import java.text.SimpleDateFormat;
import java.util.List;

import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.common.mainframe.PopupFrame;
import com.devs.honddoni.memberLog.controller.GetLoginMember;
import com.devs.honddoni.search.model.service.SearchService;

public class  SearchController {
	
	
	private SearchService searchService  = new SearchService();
	
	GetLoginMember loginMember = GetLoginMember.getInstance();
	PopupFrame popup;
	
	
	//전제조회하는 메소드
	public void selectSearch() {
		// PostDTO에 대한 정보를 한개아닌 여러정보를 다 담아야하니깐 List묶고 받아온다
		List<PostDTO> post = searchService.selectList();
		//System.out.println(post);
		for(PostDTO postList: post) {
			System.out.println(postList);
		}
		
	
	}
	
	//자유게시판조회하는 메소드
	public void selectFreeSearch() {
		// PostDTO에 대한 정보를 한개아닌 여러정보를 다 담아야하니깐 List묶고 받아온다
		List<PostDTO> post = searchService.selectList();
		//System.out.println(post);
		for(PostDTO postList: post) {
			System.out.println(postList);
		}
	
	}
	
	//게시글 등록
	public void writeFreeBoard(PostDTO postDTO) {
		
		String postName = postDTO.getPostName(); //게시글 제목
		String postContents = postDTO.getPostContents();
		int postMemberNo = postDTO.getPostMemberNo();
		
		// 게시글 등록 날짜, 시간
		java.util.Date today = new java.util.Date(System.currentTimeMillis());
		SimpleDateFormat postdayFormat = new SimpleDateFormat("yyMMdd");
		SimpleDateFormat postTimeFormat = new SimpleDateFormat("HH:mm");
		
		String postWritingDate = postdayFormat.format(today);
		postDTO.setPostWritingDate(postWritingDate);
		
		String postWritingTime = postdayFormat.format(today);
		postDTO.setPostWritingTime(postWritingTime);
		
		int postNumberOfPeopleNumber = postDTO.getPostNumberOfPeopleNumber();
		
		
		// 서비스 전달용 DTO 담기
		PostDTO post = new PostDTO();
		post.setPostName(postName);
		post.setPostContents(postContents);
		post.setPostMemberNo(postMemberNo);
		post.setPostWritingDate(postWritingDate);
		post.setPostWritingTime(postWritingTime);
		post.setPostNumberOfPeopleNumber(postNumberOfPeopleNumber);
		
		// 서비스 호출 결과 리턴 받기(팝업 띄워주기)
		int result = searchService.insertFreeBoardPost(post);
		if(result > 0) {
			popup.popup("image/post/updateSuccess.png");
		} else {
			popup.popup("image/post/updateSuccess.png");
		}
		
	}
	
	public void updateFreeBoard(PostDTO postDTO) {
		
		int postNo = postDTO.getPostNo();
		String postName = postDTO.getPostName();
		String postContents = postDTO.getPostContents();
		
		int postNumberOfPeopleNumber = postDTO.getPostNumberOfPeopleNumber();
		
		// 서비스 전달용 DTO 담기
		PostDTO post = new PostDTO();
		post.setPostNo(postNo);
		post.setPostName(postName);
		post.setPostContents(postContents);
		post.setPostNumberOfPeopleNumber(postNumberOfPeopleNumber);
		
		// 서비스 호출 결과 리턴 받기(팝업 띄워주기)
		int result = searchService.updateThePost(post);
		
		if(result > 0) {
			popup.popup("image/post/updateSuccess.png");
		} else {
			popup.popup("image/post/updateSuccess.png");
		}		
	}
	
	
	
	
	
	
}











