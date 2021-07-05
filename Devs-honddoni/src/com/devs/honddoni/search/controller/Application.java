package com.devs.honddoni.search.controller;

import java.util.List;

import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.post.controller.PagingController;

public class Application {

	public static void main(String[] args) {

//		SearchController sc; 
//		sc = new SearchController();
//		sc.selectSearch();
		
		//pagingController에서 댁글내용쪽 commentListDTO쪽
		PagingController pc = new PagingController();
		List<PostDTO> post = pc.wholePostList(1);
		
		for(PostDTO postList: post) {
			System.out.println(postList);
		} 

	}

}
