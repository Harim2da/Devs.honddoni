package com.devs.honddoni.admin.dto;

import com.devs.honddoni.memberLog.controller.GetLoginMember;

public class SearchSingletonDTO {
	
	private static SearchSingletonDTO searchSingletonDTO;	
	private String getSearchWord;
	
	
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
