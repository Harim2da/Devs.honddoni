package com.devs.honddoni.memberLog.controller;

public class GetLoginMemberId {
	
	private static GetLoginMemberId getLoginMemberId;
	
	private String loginMemberId;
	private int loginMemberNo;
	
	private GetLoginMemberId() {}
	
	public static GetLoginMemberId getInstance() {
		
		//LazySingleton (chap06/section06/singleton/LazySingleton.java 강의)
		if(getLoginMemberId == null) {
			getLoginMemberId = new GetLoginMemberId();
		}		
		
		return getLoginMemberId;
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
