package com.devs.honddoni.post.view;

import com.devs.honddoni.post.controller.PagingController;

public class CommentRun {

	public static void main(String[] args) {
		
//		new PagingController().selectWholeCommentsNum(1);
//		new MemberController().writtenCommentsUser(1, 1);
		new PagingController().selectCommentsList(1, 1);
//		new PagingController().selectWholePostNum("맛집탐방");
	}
}
