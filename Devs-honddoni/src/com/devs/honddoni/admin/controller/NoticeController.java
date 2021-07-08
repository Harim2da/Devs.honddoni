package com.devs.honddoni.admin.controller;

import java.text.SimpleDateFormat;

import com.devs.honddoni.admin.model.service.AdminService;
import com.devs.honddoni.common.dto.PostDTO;

public class NoticeController {

	private AdminService adminService = new AdminService();

	public int writeNoticeBoardPost(PostDTO postDTO) {

		int postMemberNo = 16; //관리자 번호

		/* 등록하는 오늘 날짜 추출 */
		java.util.Date today = new java.util.Date(System.currentTimeMillis());
		SimpleDateFormat postdayFormat = new SimpleDateFormat("yyMMdd");
		SimpleDateFormat postTimeFormat = new SimpleDateFormat("HH:mm");

		String postWritingDate = postdayFormat.format(today);
		postDTO.setPostWritingDate(postWritingDate);

		String postWritingTime = postTimeFormat.format(today);
		postDTO.setPostWritingTime(postWritingTime);
		
		postDTO.setPostMemberNo(postMemberNo);
		postDTO.setPostWritingDate(postWritingDate);
		postDTO.setPostWritingTime(postWritingTime);
		
		int result = adminService.insertNoticePost(postDTO);
		
		return result;
	}
	
	/* 선택한 공지글 세부내용 조회 */
	public PostDTO selectTheNoticePost(int postNo) {

		PostDTO postDTO = new PostDTO();
		postDTO = adminService.selectTheNoticePost(postNo);

		return postDTO;

	}
	
	/* 공지글 조회 */
	public int modifyNotice(PostDTO postDTO) {

		int postMemberNo = 16; //관리자 번호

		/* 등록하는 오늘 날짜 추출 */
		java.util.Date today = new java.util.Date(System.currentTimeMillis());
		SimpleDateFormat postdayFormat = new SimpleDateFormat("yyMMdd");
		SimpleDateFormat postTimeFormat = new SimpleDateFormat("HH:mm");

		String postWritingDate = postdayFormat.format(today);
		postDTO.setPostWritingDate(postWritingDate);

		String postWritingTime = postTimeFormat.format(today);
		postDTO.setPostWritingTime(postWritingTime);
		
		//다 안해줘도 되지않나..?
		postDTO.setPostMemberNo(postMemberNo);
		postDTO.setPostWritingDate(postWritingDate);
		postDTO.setPostWritingTime(postWritingTime);
		
		int result = adminService.modifyNotice(postDTO);
		
		return result;
	}

}
