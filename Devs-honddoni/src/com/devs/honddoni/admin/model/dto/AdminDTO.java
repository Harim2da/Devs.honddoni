package com.devs.honddoni.admin.model.dto;

public class AdminDTO implements java.io.Serializable {
	



	private String MemberNicname;
	private String MemberProfile;
	private String MemberId;
	private String MemRegistdate;
	
	public AdminDTO () {
		
	
	}


	public AdminDTO(String memberNicname, String memberProfile, String memberId, String memRegistdate) {
		super();
		MemberNicname = memberNicname;
		MemberProfile = memberProfile;
		MemberId = memberId;
		MemRegistdate = memRegistdate;
		
		
	}

	/**
	 * @return the memberNicname
	 */
	public String getMemberNicname() {
		return MemberNicname;
	}

	/**
	 * @return the memberProfile
	 */
	public String getMemberProfile() {
		return MemberProfile;
	}

	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return MemberId;
	}

	/**
	 * @return the memRegistdate
	 */
	public String getMemRegistdate() {
		return MemRegistdate;
	}

	/**
	 * @param memberNicname the memberNicname to set
	 */
	public void setMemberNicname(String memberNicname) {
		MemberNicname = memberNicname;
	}

	/**
	 * @param memberProfile the memberProfile to set
	 */
	public void setMemberProfile(String memberProfile) {
		MemberProfile = memberProfile;
	}

	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		MemberId = memberId;
	}

	/**
	 * @param memRegistdate the memRegistdate to set
	 */
	public void setMemRegistdate(String memRegistdate) {
		MemRegistdate = memRegistdate;
		
		
	}

	@Override
	public String toString() {
		return "AdminDTO [MemberNicname=" + MemberNicname + ", MemberProfile=" + MemberProfile + ", MemberId="
				+ MemberId + ", MemRegistdate=" + MemRegistdate + "]";
	}
	
}
	
