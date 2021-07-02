package com.devs.honddoni.post.controller;

import java.text.SimpleDateFormat;

import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.post.model.service.PostService;

public class ContactController {
	
	private PostService postService;
	
	
	public void writeHonddoniBoardPost(PostDTO postDTO) {
		

//		private int postMemberNo;
//		private String localName;
//		private String categoryName;		//맛집탐방, 산책 등등

		
		
		// 시퀀스로 db에 있는 postNO 가져오기

		String postName = postDTO.getPostName();
		String postContents = postDTO.getPostContents();
		String postCategory = postDTO.getPostCategory();
		
		// db에 있는 회원번호 가져오기

		String postMeetingDate = postDTO.getPostMeetingDate();
		String postMeetingTime = postDTO.getPostMeetingTime();
		
		/* 등록하는 오늘 날짜 추출 */
		java.util.Date today = new java.util.Date(System.currentTimeMillis());
		SimpleDateFormat postdayFormat = new SimpleDateFormat("yyMMdd");
		SimpleDateFormat postTimeFormat = new SimpleDateFormat("hh:mm");
		
		String postWritingDate = postdayFormat.format(today);
		postDTO.setPostWritingDate(postWritingDate);
		
		String postWritingTime = postTimeFormat.format(today);
		postDTO.setPostWritingTime(postWritingTime);
		
		// db에 있는 지역코드 받아와서 콤보박스에서 선택한 것과 대조 후, 진행
		
		// db에 있는 카테고리코드(맛집 탐방 등) 받아와서 콤보박스에서 선택한 것과 대조 후, 진행
		
		
		String postDelStatus = "N";
		int postNumberOfPeopleNumber = postDTO.getPostNumberOfPeopleNumber();
		
		
		
		/* 서비스 전달용  DTO 담기 */
		PostDTO post = new PostDTO();
		post.setPostName(postName);
		post.setPostContents(postContents);
		post.setPostCategory(postCategory);
//		post.setPostMemberNo();		
		post.setPostMeetingDate(postMeetingDate);
		post.setPostMeetingTime(postMeetingTime);
		post.setPostWritingDate(postWritingDate);
		post.setPostWritingTime(postWritingTime);
//		post.setLocalName();
//		post.setCategoryName();
		post.setPostDelStatus(postDelStatus);
		post.setPostNumberOfPeopleNumber(postNumberOfPeopleNumber);
		
		
		/* 서비스 호출 결과 리턴 받기 */
		int result = postService.insertHonddoniPost(post);
		
		if(result > 0) {
			System.out.println("등록 성공");
		} else {
			System.out.println("등록 실패");
		}
		
	}

	
	
}
