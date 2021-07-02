package com.devs.honddoni.common.dto;

import java.io.Serializable;

public class MemberDTO implements Serializable{
	
	private int memberNo;
	private String memberId;
	private String emrollDate;
	private String memberImage;
	
	public MemberDTO() {}

	public MemberDTO(int memberNo, String memberId, String emrollDate, String memberImage) {
		super();
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.emrollDate = emrollDate;
		this.memberImage = memberImage;
	}

	/**
	 * @return the memberNo
	 */
	public int getMemberNo() {
		return memberNo;
	}

	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}

	/**
	 * @return the emrollDate
	 */
	public String getEmrollDate() {
		return emrollDate;
	}

	/**
	 * @return the memberImage
	 */
	public String getMemberImage() {
		return memberImage;
	}

	/**
	 * @param memberNo the memberNo to set
	 */
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	/**
	 * @param emrollDate the emrollDate to set
	 */
	public void setEmrollDate(String emrollDate) {
		this.emrollDate = emrollDate;
	}

	/**
	 * @param memberImage the memberImage to set
	 */
	public void setMemberImage(String memberImage) {
		this.memberImage = memberImage;
	}

	@Override
	public String toString() {
		return "MemberDTO [memberNo=" + memberNo + ", memberId=" + memberId + ", emrollDate=" + emrollDate
				+ ", memberImage=" + memberImage + "]";
	}
	
	
	
	

}
