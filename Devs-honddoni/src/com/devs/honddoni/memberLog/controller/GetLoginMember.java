package com.devs.honddoni.memberLog.controller;

public class GetLoginMember {
	
	private static GetLoginMember getLoginMember;
	
	private String loginMemberId;
	private int loginMemberNo;
	
	private GetLoginMember() {}
	
	public static GetLoginMember getInstance() {
		
		if(getLoginMember == null) {
			getLoginMember = new GetLoginMember();
		}		
		
		return getLoginMember;
	}
	
	public String getLoginMemberId() {
		return loginMemberId;
	}

	public void setLoginMemberId(String loginMemberId) {
		this.loginMemberId = loginMemberId;
	}

	public int getLoginMemberNo() {
		return loginMemberNo;
	}

	public void setLoginMemberNo(int loginMemberNo) {
		this.loginMemberNo = loginMemberNo;
	}
	
}
