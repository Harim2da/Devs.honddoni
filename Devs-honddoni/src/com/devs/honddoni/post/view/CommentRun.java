package com.devs.honddoni.post.view;

import com.devs.honddoni.post.controller.PagingController;

public class CommentRun {

	public static void main(String[] args) {
		
		new PagingController().selectWholeCommentsNum(1);
		
	}
}
