package com.devs.honddoni.admin.view123;

import java.io.Serializable;

public class MemberDTO implements Serializable{
	
	private String memberId;
	private String memberNickname;
	private String memberProfile;
	private String memberRegistDate;
	
	public MemberDTO() {}

	public MemberDTO(String memberId, String memberNickname, String memberProfile, String memberRegistDate) {
		super();
		this.memberId = memberId;
		this.memberNickname = memberNickname;
		this.memberProfile = memberProfile;
		this.memberRegistDate = memberRegistDate;
	}

	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}

	/**
	 * @return the memberNickname
	 */
	public String getMemberNickname() {
		return memberNickname;
	}

	/**
	 * @return the memberProfile
	 */
	public String getMemberProfile() {
		return memberProfile;
	}

	/**
	 * @return the memberRegistDate
	 */
	public String getMemberRegistDate() {
		return memberRegistDate;
	}

	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	/**
	 * @param memberNickname the memberNickname to set
	 */
	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}

	/**
	 * @param memberProfile the memberProfile to set
	 */
	public void setMemberProfile(String memberProfile) {
		this.memberProfile = memberProfile;
	}

	/**
	 * @param memberRegistDate the memberRegistDate to set
	 */
	public void setMemberRegistDate(String memberRegistDate) {
		this.memberRegistDate = memberRegistDate;
	}

	@Override
	public String toString() {
		return "MemberDTO [memberId=" + memberId + ", memberNickname=" + memberNickname + ", memberProfile="
				+ memberProfile + ", memberRegistDate=" + memberRegistDate + "]";
	}
	
}

	
	

	
	
	