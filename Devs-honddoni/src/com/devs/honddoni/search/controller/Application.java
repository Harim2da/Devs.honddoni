package com.devs.honddoni.search.controller;

import java.util.List;

import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.post.controller.PagingController;

public class Application {

	public static void main(String[] args) {

		//pagingController에서 댓글내용쪽 commentListDTO쪽
		PagingController allBoardList = new PagingController();
		List<PostDTO> allList = allBoardList.wholePostList(1);
		
		for(PostDTO postList: allList) {
			System.out.println(postList);
		} 
		
		PagingController freeBoardList = new PagingController();
		List<PostDTO> freeList = freeBoardList.freePostList(1);
		
		for(PostDTO postList: freeList) {
			System.out.println(postList);
		} 
	}

}
