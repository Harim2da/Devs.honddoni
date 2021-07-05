package com.devs.honddoni.post.controller;

public class GetFilter {

	private static GetFilter getFilter;
	
	private String localName = "부산";
	private String categoryName = "맛집탐방";
	
	private GetFilter() {}

	public static GetFilter getInstance() {
		
		if(getFilter == null) {
			getFilter = new GetFilter();
		}
		System.out.println("싱글톤호출완료");
		
		return getFilter;
	}

	public String getLocalName() {
		return localName;
	}
	
	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
