package com.devs.honddoni.admin.view123;


public class MemberDTO {

	
	private String memberId;
	private String memberNickname;
	private String memberProfile;

	private String memRegistdate;
	
	public MemberDTO () {
		
	}

	public MemberDTO(String memberId, String memberNickname, String memberProfile, String memRegistdate) {

		super();
		this.memberId = memberId;
		this.memberNickname = memberNickname;
		this.memberProfile = memberProfile;

		this.memRegistdate = memRegistdate;
		

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

	 * @return the memRegistdate
	 */
	public String getMemRegistdate() {
		return memRegistdate;

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

	 * @param memRegistdate the memRegistdate to set
	 */
	public void setMemRegistdate(String memRegistdate) {
		this.memRegistdate = memRegistdate;
		

	}

	@Override
	public String toString() {
		return "MemberDTO [memberId=" + memberId + ", memberNickname=" + memberNickname + ", memberProfile="

				+ memberProfile + ", memRegistdate=" + memRegistdate + "]";
	}

}
