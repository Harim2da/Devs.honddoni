package com.devs.honddoni.member.view;

public class DuplCheckResult {
	
	public void displayDuplCheckResult(String code) {
		
		if(code.equals("중복아님")) {
			System.out.println("사용할 수 있는 아이디입니다.");
		} else if(code.equals("중복")) {
			System.out.println("사용할 수 없는 아이디입니다. ");
		} else {
			System.out.println("알 수 없는 에러 발생!");
		}
		
	}

}
