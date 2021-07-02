package com.devs.honddoni.post.controller;

import java.text.SimpleDateFormat;

import com.devs.honddoni.common.dto.CommentsDTO;
import com.devs.honddoni.post.model.service.PostService2;

public class ContactController2 {
	
	private PostService2 postService2;

	public ContactController2() {
		this.postService2 = new PostService2();
	}
	
	public void communicationComment(CommentsDTO newComment) {
		
		
		java.util.Date today = new java.util.Date(System.currentTimeMillis());
		SimpleDateFormat registFormatDate = new SimpleDateFormat("yyMMdd");
		String StringDate = registFormatDate.format(today);
		newComment.setCommentsDate(StringDate);
		
		SimpleDateFormat registFormatTime = new SimpleDateFormat("HH:mm");
		String StringTime = registFormatTime.format(today);
		newComment.setCommentsTime(StringTime);
		
		int result = postService2.communicationComment(newComment);
		
		
		if(result > 0) {
			System.out.println("댓글 입력 성공");
		} else {
			System.out.println("댓글 입력 실패");
		}
		
	}
}
