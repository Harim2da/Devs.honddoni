
package com.devs.honddoni.admin.view123;

import com.devs.honddoni.post.controller.PagingController;

public class Application {
	
	public static void main(String[] args) {
		
		
//		new MemberMenu().displayMenu();
////		
//		System.out.println("회원관리 프로그램을 종료합니다.");
		
		new PagingController().wholePostList(2);
	}

}

