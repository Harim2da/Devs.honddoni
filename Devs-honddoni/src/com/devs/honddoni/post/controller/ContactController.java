package com.devs.honddoni.post.controller;

import java.text.SimpleDateFormat;

import com.devs.honddoni.common.dto.PostDTO;

public class ContactController {

	
	
	public void writeHonddoniBoardPost(PostDTO postDTO) {
		
//		private int postNo;

//		private int postMemberNo;


//		private String localName;
//		private String categoryName;		//맛집탐방, 산책 등등
//		private String postDelStatus;
//		private int postNumberOfPeopleNumber;
		
		
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
		
		
	}

}
