package com.devs.honddoni.admin.model.dto;

import com.devs.honddoni.memberLog.controller.GetLoginMember;

public class SearchSingletonDTO {
	
	private static SearchSingletonDTO searchSingletonDTO;	
	private String getSearchWord;
	
	/* 공지사항게시판의 검색어를 받아오는 싱글톤 */
	private SearchSingletonDTO() {}
	
	public static SearchSingletonDTO getInstance() {
		
		if(searchSingletonDTO == null) {
			searchSingletonDTO = new SearchSingletonDTO();
		}		
		
		return searchSingletonDTO;
	}
	
	public String getGetSearchWord() {
		return getSearchWord;
	}
	public void setGetSearchWord(String getSearchWord) {
		this.getSearchWord = getSearchWord;
	}
	
	

}
