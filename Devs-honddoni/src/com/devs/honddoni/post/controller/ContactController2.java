package com.devs.honddoni.post.controller;

import java.text.SimpleDateFormat;
import java.util.List;

import com.devs.honddoni.common.dto.CommentsDTO;
import com.devs.honddoni.common.dto.reportDTO;
import com.devs.honddoni.post.model.service.PostService2;

public class ContactController2 {

	private PostService2 postService2;

	public ContactController2() {
		this.postService2 = new PostService2();
	}
	
	/* 댓글작성 컨트롤러 */
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

	/* 댓글삭제 컨트롤러 */
	public void deleteComment(CommentsDTO deleteComment) {
	
		int result = postService2.deleteComment(deleteComment);

		if(result > 0 ) {
			System.out.println("댓글 삭제 성공");
		} else {
			System.out.println("댓글 삭제 실패");
		}

	}
	/* 댓글수정 컨트롤러 */
	public void updateComment(CommentsDTO updateComment) {

		int result = postService2.updateComment(updateComment);

		if(result > 0 ) {
			System.out.println("댓글 수정 성공");
		} else {
			System.out.println("댓글 수정 실패");
		}

	}
	
	/* 게시글의 번호를 통해 게시글의 분류를 알아오는 controller */
	public String selectPostCategory(int postNo) {
		
		String result = postService2.selectPostCategory(postNo);
		
		return result;
		
	}

	/* 댓글신고 등록 controller */
	public void reportComment(reportDTO reportDTO) {
		
		int result = postService2.reportComment(reportDTO);

		if(result > 0 ) {
			System.out.println("신고 접수 성공");
		} else {
			System.out.println("신고 접수 실패");
		}
		
		
	}


}
