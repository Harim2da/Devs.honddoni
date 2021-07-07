package com.devs.honddoni.post.controller;

import java.text.SimpleDateFormat;

import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.memberLog.controller.GetLoginMember;
import com.devs.honddoni.post.model.service.PostService;
import com.devs.honddoni.post.view.PostResultView;

public class ContactController {
	
	private PostService postService = new PostService();
	GetLoginMember loginMember = GetLoginMember.getInstance();
	PostResultView postResultView;
	public void writeHonddoniBoardPost(PostDTO postDTO) {
		

		String postName = postDTO.getPostName();
		String postContents = postDTO.getPostContents();
		String postCategory = postDTO.getPostCategory();
		int postMemberNo = loginMember.getLoginMemberNo();
		
		String postMeetingDate = postDTO.getPostMeetingDate();
		String postMeetingTime = postDTO.getPostMeetingTime();
		
		/* 등록하는 오늘 날짜 추출 */
		java.util.Date today = new java.util.Date(System.currentTimeMillis());
		SimpleDateFormat postdayFormat = new SimpleDateFormat("yyMMdd");
		SimpleDateFormat postTimeFormat = new SimpleDateFormat("HH:mm");
		
		String postWritingDate = postdayFormat.format(today);
		postDTO.setPostWritingDate(postWritingDate);
		
		String postWritingTime = postTimeFormat.format(today);
		postDTO.setPostWritingTime(postWritingTime);
		
		/*선택한 지역명의 코드를 조회*/		
		String localName= postDTO.getLocalName();
		int localCode = postService.searchLocalCode(localName);
		
		/*선택한 카테고리명의 코드를 조회*/
		String categoryName = postDTO.getCategoryName();
		int categoryCode = postService.searchCategoryCode(categoryName);
		
		
		int postNumberOfPeopleNumber = postDTO.getPostNumberOfPeopleNumber();
		
		
		
		/* 서비스 전달용  DTO 담기 */
		PostDTO post = new PostDTO();
		post.setPostName(postName);
		post.setPostContents(postContents);
		post.setPostCategory(postCategory);	
		post.setPostMemberNo(postMemberNo);
		post.setPostMeetingDate(postMeetingDate);
		post.setPostMeetingTime(postMeetingTime);
		post.setPostWritingDate(postWritingDate);
		post.setPostWritingTime(postWritingTime);
		post.setLocalCode(localCode);
		post.setCategoryCode(categoryCode);
		post.setPostNumberOfPeopleNumber(postNumberOfPeopleNumber);
		
		
		/* 서비스 호출 결과 리턴 받기 */
		int result = postService.insertHonddoniPost(post);
		
		if(result > 0) {
			postResultView.displayResult("updateSuccess");
		} else {
			postResultView.displayResult("updatefail");
		}
		
	}

	/* 선택한 게시글 세부 내용 조회 */
	public PostDTO selectThePost(int postNo) {
		
		PostDTO postDTO = new PostDTO();
		
		postDTO = postService.selectThePostList(postNo);
		
		return postDTO;
	}
	
	public void deleteThePost(int postNo) {
		
		int result = postService.deleteThePost(postNo);
		
		if(result > 0) {
			postResultView.displayResult("deleteSuccess");
		}
	}
	
	
public void updateThePost(PostDTO postDTO) {
		
		int postNo = postDTO.getPostNo();
		String postName = postDTO.getPostName();
		String postContents = postDTO.getPostContents();
		String postCategory = postDTO.getPostCategory();
		
		String postMeetingDate = postDTO.getPostMeetingDate();
		String postMeetingTime = postDTO.getPostMeetingTime();
		
		
		/*선택한 카테고리명의 코드를 조회*/
		String categoryName = postDTO.getCategoryName();
		int categoryCode = postService.searchCategoryCode(categoryName);
		
		
		int postNumberOfPeopleNumber = postDTO.getPostNumberOfPeopleNumber();
		
		
		
		/* 서비스 전달용  DTO 담기 */
		PostDTO post = new PostDTO();
		post.setPostNo(postNo);
		post.setPostName(postName);
		post.setPostContents(postContents);
		post.setPostCategory(postCategory);	
		post.setPostMeetingDate(postMeetingDate);
		post.setPostMeetingTime(postMeetingTime);
		post.setCategoryCode(categoryCode);
		post.setPostNumberOfPeopleNumber(postNumberOfPeopleNumber);
		
		
		/* 서비스 호출 결과 리턴 받기 */
		int result = postService.updateThePost(post);
		
		if(result > 0) {
			postResultView.displayResult("updateSuccess");
		} else {
			postResultView.displayResult("updatefail");
		}
	}
	
	
	
	
	
	
}
