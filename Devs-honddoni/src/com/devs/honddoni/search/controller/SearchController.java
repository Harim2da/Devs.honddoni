package com.devs.honddoni.search.controller;

import java.util.List;

import com.devs.honddoni.common.dto.PostDTO;
import com.devs.honddoni.search.model.service.SearchService;

public class  SearchController {
	
	
	private SearchService searchService  = new SearchService();
	
	
//	public SearchController(SearchService searchService) {
//		this.searchService = searchService;
//	}
	
	
	//전제조회하는 메소드
	public void selectSearch() {
		// PostDTO에 대한 정보를 한개아닌 여러정보를 다 담아야하니깐 List묶고 받아온다
		List<PostDTO> post = searchService.selectList();
		//System.out.println(post);
		for(PostDTO postList: post) {
			System.out.println(postList);
		}
	
	}
	
	//자유게시판조회하는 메소드
	
	
	
	
	
	
	
}