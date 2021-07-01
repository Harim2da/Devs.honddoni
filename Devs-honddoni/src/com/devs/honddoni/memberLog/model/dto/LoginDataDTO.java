package com.devs.honddoni.memberLog.model.dto;

public class LoginDataDTO implements java.io.Serializable{
	
	private String memberId;
	private String memberPassword;
	
	public LoginDataDTO() {}

	public LoginDataDTO(String memberId, String memberPassword) {
		super();
		this.memberId = memberId;
		this.memberPassword = memberPassword;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	@Override
	public String toString() {
		return "LoginDataDTO [memberId=" + memberId + ", memberPassword=" + memberPassword + "]";
	}
	
	
	

}
