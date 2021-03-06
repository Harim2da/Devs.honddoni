package com.devs.honddoni.member.model.dto;

public class ChangePwdDTO implements java.io.Serializable {

	private String memberOldPassword;
	private String memberNewPassword;
	private String memberNewPasswordRecheck;
	private String userId;
	
	public ChangePwdDTO() {}

	public ChangePwdDTO(String memberOldPassword, String memberNewPassword) {
		super();
		this.memberOldPassword = memberOldPassword;
		this.memberNewPassword = memberNewPassword;
		this.memberNewPasswordRecheck = memberNewPasswordRecheck;
		this.userId = userId;
	}

	public String getMemberOldPassword() {
		return memberOldPassword;
	}

	public void setMemberOldPassword(String memberOldPassword) {
		this.memberOldPassword = memberOldPassword;
	}

	public String getMemberNewPassword() {
		return memberNewPassword;
	}

	public void setMemberNewPassword(String memberNewPassword) {
		this.memberNewPassword = memberNewPassword;
	}

	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMemberNewPasswordRecheck() {
		return memberNewPasswordRecheck;
	}

	public void setMemberNewPasswordRecheck(String memberNewPasswordRecheck) {
		this.memberNewPasswordRecheck = memberNewPasswordRecheck;
	}

	@Override
	public String toString() {
		return "ChangePwdDTO [memberOldPassword=" + memberOldPassword + ", memberNewPassword=" + memberNewPassword
				+ ", memberNewPasswordRecheck=" + memberNewPasswordRecheck + ", userId=" + userId + "]";
	}


	
	
}
