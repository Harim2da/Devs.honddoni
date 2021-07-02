package com.devs.honddoni.admin.view123;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.devs.honddoni.admin.controller.ManagementController;
import com.greedy.member.controller.MemberController;

public class MemberMenu {
	
	private Scanner sc = new Scanner(System.in);

	public void displayMenu() {
		
		ManagementController memberController = new ManagementController();
		
		do {
			System.out.println("\n *** 전체 게시글  조회 프로그램 *** \n");
			System.out.println("2. 모든 게시글 조회");
			int no = sc.nextInt();
			
			switch(no) {
				
				case 2 : memberController.selectAllMembers(); break;
				case 0 : return;
				default : System.out.println("잘못된 번호입니다. 다시 입력해주세요. \n");
			}
		}while(true);
		
	}
	
}




















