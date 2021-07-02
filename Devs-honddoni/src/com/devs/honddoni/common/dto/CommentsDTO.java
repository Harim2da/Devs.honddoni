package com.devs.honddoni.common.dto;

public class CommentsDTO implements java.io.Serializable {

	private int commentsNo;
	private String commentsDate;
	private String commentsTime;
	private String commentsContents;
	private int postNo;
	private int memberNo;
	private String memberNickname;
	private String memberProfile;
	
	public CommentsDTO() {}

	public CommentsDTO(int commentsNo, String commentsDate, String commentsTime, String commentsContents, int postNo,
			int memberNo, String memberNickname, String memberProfile) {
		super();
		this.commentsNo = commentsNo;
		this.commentsDate = commentsDate;
		this.commentsTime = commentsTime;
		this.commentsContents = commentsContents;
		this.postNo = postNo;
		this.memberNo = memberNo;
		this.memberNickname = memberNickname;
		this.memberProfile = memberProfile;
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

	@Override
	public String toString() {
		return "CommentsDTO [commentsNo=" + commentsNo + ", commentsDate=" + commentsDate + ", commentsTime="
				+ commentsTime + ", commentsContents=" + commentsContents + ", postNo=" + postNo + ", memberNo="
				+ memberNo + ", memberNickname=" + memberNickname + ", memberProfile=" + memberProfile + "]";
	}

	
	
	
	
}
