package com.devs.honddoni.admin.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.devs.honddoni.admin.test.*;;

public class MemberMenu {
	
	private Scanner sc = new Scanner(System.in);

	public void displayMenu() {
		
		MemberController memberController = new MemberController();
		
		do {
			System.out.println("\n *** 회원 관리 프로그램 *** \n");
			System.out.println("1. 모든게시물 조회");
			System.out.println("2. 모든 회원 조회");
			System.out.print("번호 선택 : ");
			int no = sc.nextInt();
			
			switch(no) {
				case 1 : memberController.totalPostList(); break;
//				case 2 : memberController.selectAllMembers(); break;

				case 0 : return;
				default : System.out.println("잘못된 번호입니다. 다시 입력해주세요. \n");
				
			}
			
		}while(true);
		
	}
	
}