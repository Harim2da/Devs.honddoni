package com.devs.honddoni.common.dto;

public class CommentsDTO implements java.io.Serializable {

	private int commentsNo;
	private String commentsDate;
	private String commentsTime;
	private String commentsContents;
	private int postNo;
	private int memberNo;
	
	public CommentsDTO() {}

	public CommentsDTO(int commentsNo, String commentsDate, String commentsTime, String commentsContents, int postNo,
			int memberNo) {
		super();
		this.commentsNo = commentsNo;
		this.commentsDate = commentsDate;
		this.commentsTime = commentsTime;
		this.commentsContents = commentsContents;
		this.postNo = postNo;
		this.memberNo = memberNo;
	}

	public int getCommentsNo() {
		return commentsNo;
	}

	public void setCommentsNo(int commentsNo) {
		this.commentsNo = commentsNo;
	}

	public String getCommentsDate() {
		return commentsDate;
	}

	public void setCommentsDate(String commentsDate) {
		this.commentsDate = commentsDate;
	}

	public String getCommentsTime() {
		return commentsTime;
	}

	public void setCommentsTime(String commentsTime) {
		this.commentsTime = commentsTime;
	}

	public String getCommentsContents() {
		return commentsContents;
	}

	public void setCommentsContents(String commentsContents) {
		this.commentsContents = commentsContents;
	}

	public int getPostNo() {
		return postNo;
	}

	public void setPostNo(int postNo) {
		this.postNo = postNo;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	@Override
	public String toString() {
		return "CommentsDTO [commentsNo=" + commentsNo + ", commentsDate=" + commentsDate + ", commentsTime="
				+ commentsTime + ", commentsContents=" + commentsContents + ", postNo=" + postNo + ", memberNo="
				+ memberNo + "]";
	}
	
	
}
