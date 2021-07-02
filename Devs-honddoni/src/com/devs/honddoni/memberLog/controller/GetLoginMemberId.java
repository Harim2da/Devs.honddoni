package com.devs.honddoni.memberLog.controller;

public class GetLoginMemberId {
	
	private static GetLoginMemberId getLoginMemberId;
	private static String loginMemberId;
	
	private GetLoginMemberId() {}
	
	public static GetLoginMemberId getInstance() {
		
		//LazySingleton (chap06/section06/singleton/LazySingleton.java 강의)
		if(getLoginMemberId == null) {
			getLoginMemberId = new GetLoginMemberId();
		}		
		
		return getLoginMemberId;
	}

}
