package com.devs.honddoni.common.dto;

public class PostDTO implements java.io.Serializable {
	
	private int postNo;							//게시글 번호
	private String postName;					//게시글 제목
	private String postContents;				//게시글 내용
	private String postCategory;				//게시글분류 (자유, 혼또니)
	private int postMemberNo;					//게시글 작성자 번호
	private String postMeetingDate;				//모임 일자
	private String postMeetingTime;				//모임 시간
	private String postWritingDate;				//작성 일자
	private String postWritingTime;				//작성 시간
	private String localName;					//지역 이름
	private int localCode;						//지역 코드
	private String categoryName; 				//혼또니게시판 카테고리 분류(맛집탐방, 산책 등등)
	private int categoryCode;					//혼또니게시판 카테고리 코드
	private String postDelStatus;				//게시글 삭제 여부
	private int postNumberOfPeopleNumber;		//모임인원
	private String memberNickname;				//닉네임
	private String memberProfile;				//프로필 사진
	
	public PostDTO() {}

	public String getMemberNickname() {
		return memberNickname;
	}




	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}




	public String getMemberProfile() {
		return memberProfile;
	}




	public void setMemberProfile(String memberProfile) {
		this.memberProfile = memberProfile;
	}




	public PostDTO(int postNo, String postName, String postContents, String postCategory, int postMemberNo,
			String postMeetingDate, String postMeetingTime, String postWritingDate, String postWritingTime,
			String localName, int localCode, String categoryName, int categoryCode, String postDelStatus,
			int postNumberOfPeopleNumber, String memberNickname, String memberProfile) {
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
		this.localCode = localCode;
		this.categoryName = categoryName;
		this.categoryCode = categoryCode;
		this.postDelStatus = postDelStatus;
		this.postNumberOfPeopleNumber = postNumberOfPeopleNumber;
		this.memberNickname = memberNickname;
		this.memberProfile = memberProfile;
	}




	public int getLocalCode() {
		return localCode;
	}

	public void setLocalCode(int localCode) {
		this.localCode = localCode;
	}

	public int getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(int categoryCode) {
		this.categoryCode = categoryCode;
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
				+ ", postWritingTime=" + postWritingTime + ", localName=" + localName + ", localCode=" + localCode
				+ ", categoryName=" + categoryName + ", categoryCode=" + categoryCode + ", postDelStatus="
				+ postDelStatus + ", postNumberOfPeopleNumber=" + postNumberOfPeopleNumber + ", memberNickname="
				+ memberNickname + ", memberProfile=" + memberProfile + "]";
	}

	
	

	
	
	

}
