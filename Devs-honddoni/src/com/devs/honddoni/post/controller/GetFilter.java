package com.devs.honddoni.post.controller;

public class GetFilter {

	private static GetFilter getFilter;
	
	private String localName;
	private String categoryName;
	
	private GetFilter() {}

	public static GetFilter getInstance() {
		
		if(getFilter == null) {
			getFilter = new GetFilter();
		}
		
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
