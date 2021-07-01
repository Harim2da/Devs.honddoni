package com.devs.honddoni.common.dto;

public class PostDTO implements java.io.Serializable {
	
	private int postNo;
	private String postName;
	private String postContents;
	private String postCategory; 
	private int postMemberNo;
	private String postMeetingDate;
	private String postMeetingTime;
	private String postWritingDate;
	private String postWritingTime;
	private String localName;
	private String categoryName;
	private String postDelStatus;
	private int postNumberOfPeopleNumber;
	
	public PostDTO() {}

	public PostDTO(int postNo, String postName, String postContents, String postCategory, int postMemberNo,
			String postMeetingDate, String postMeetingTime, String postWritingDate, String postWritingTime,
			String localName, String categoryName, String postDelStatus, int postNumberOfPeopleNumber) {
		super();
		this.postNo = postNo;
		this.postName = postName;
		this.postContents = postContents;
		this.postCategory = postCategory;
		this.postMemberNo = postMemberNo;
		this.postMeetingDate = postMeetingDate;
		this.postMeetingTime = postMeetingTime;
		this.postWritingDate = postWritingDate;
		this.postWritingTime = postWritingTime;
		this.localName = localName;
		this.categoryName = categoryName;
		this.postDelStatus = postDelStatus;
		this.postNumberOfPeopleNumber = postNumberOfPeopleNumber;
	}

	public int getPostNo() {
		return postNo;
	}

	public void setPostNo(int postNo) {
		this.postNo = postNo;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public String getPostContents() {
		return postContents;
	}

	public void setPostContents(String postContents) {
		this.postContents = postContents;
	}

	public String getPostCategory() {
		return postCategory;
	}

	public void setPostCategory(String postCategory) {
		this.postCategory = postCategory;
	}

	public int getPostMemberNo() {
		return postMemberNo;
	}

	public void setPostMemberNo(int postMemberNo) {
		this.postMemberNo = postMemberNo;
	}

	public String getPostMeetingDate() {
		return postMeetingDate;
	}

	public void setPostMeetingDate(String postMeetingDate) {
		this.postMeetingDate = postMeetingDate;
	}

	public String getPostMeetingTime() {
		return postMeetingTime;
	}

	public void setPostMeetingTime(String postMeetingTime) {
		this.postMeetingTime = postMeetingTime;
	}

	public String getPostWritingDate() {
		return postWritingDate;
	}

	public void setPostWritingDate(String postWritingDate) {
		this.postWritingDate = postWritingDate;
	}

	public String getPostWritingTime() {
		return postWritingTime;
	}

	public void setPostWritingTime(String postWritingTime) {
		this.postWritingTime = postWritingTime;
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

	public String getPostDelStatus() {
		return postDelStatus;
	}

	public void setPostDelStatus(String postDelStatus) {
		this.postDelStatus = postDelStatus;
	}

	public int getPostNumberOfPeopleNumber() {
		return postNumberOfPeopleNumber;
	}

	public void setPostNumberOfPeopleNumber(int postNumberOfPeopleNumber) {
		this.postNumberOfPeopleNumber = postNumberOfPeopleNumber;
	}

	@Override
	public String toString() {
		return "PostDTO [postNo=" + postNo + ", postName=" + postName + ", postContents=" + postContents
				+ ", postCategory=" + postCategory + ", postMemberNo=" + postMemberNo + ", postMeetingDate="
				+ postMeetingDate + ", postMeetingTime=" + postMeetingTime + ", postWritingDate=" + postWritingDate
				+ ", postWritingTime=" + postWritingTime + ", localName=" + localName + ", categoryName=" + categoryName
				+ ", postDelStatus=" + postDelStatus + ", postNumberOfPeopleNumber=" + postNumberOfPeopleNumber + "]";
	}

	
	
	

}
