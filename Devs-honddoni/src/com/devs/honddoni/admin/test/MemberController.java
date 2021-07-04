package com.devs.honddoni.admin.test;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import com.devs.honddoni.admin.view123.TotalDTO;
import com.devs.honddoni.admin.test.*;
import com.devs.honddoni.admin.test.*;
import com.devs.honddoni.admin.test.*;

public class MemberController {
	
	/* MemberResultView 클래스에 작성한 display 메소드로 출력할 것
	 * display 메소드로 출력할 필요 없는 내용은 간단히 콘솔에 직접 출력
	 * dml 수행 결과는 MemberResultView의 displayDmlResult()를 이용할 것
	 * */
	
	private MemberResultView memberResultView = new MemberResultView();
	private MemberService memberService = new MemberService();

	/* 신규 회원 등록용 메소드 */
	
//	public void selectAllMembers() {
//		
//		List<MemberDTO> memberList = memberService.selectAllMembers();
//
//		memberResultView.display(memberList);
	
//	

	public void totalPostList() {
		
		List<TotalDTO> totalList = memberService.totalPostList();

		memberResultView.display(totalList);
}
}

