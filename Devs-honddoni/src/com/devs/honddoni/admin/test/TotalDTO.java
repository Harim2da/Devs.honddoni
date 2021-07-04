package com.devs.honddoni.admin.test;

public class TotalDTO {
	
	private String memberProfile;
	private String memberNickname;
	private String postName;
	private String localName;
	
	public TotalDTO () {
	
		
	}

	public TotalDTO(String memberProfile, String memberNickname, String postName, String localName) {
		super();
		this.memberProfile = memberProfile;
		this.memberNickname = memberNickname;
		this.postName = postName;
		this.localName = localName;
		
		
	}

	/**
	 * @return the memberProfile
	 */
	public String getMemberProfile() {
		return memberProfile;
	}

	/**
	 * @return the memberNickname
	 */
	public String getMemberNickname() {
		return memberNickname;
	}

	/**
	 * @return the postName
	 */
	public String getPostName() {
		return postName;
	}

	/**
	 * @return the localName
	 */
	public String getLocalName() {
		return localName;
	}

	/**
	 * @param memberProfile the memberProfile to set
	 */
	public void setMemberProfile(String memberProfile) {
		this.memberProfile = memberProfile;
	}

	/**
	 * @param memberNickname the memberNickname to set
	 */
	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}

	/**
	 * @param postName the postName to set
	 */
	public void setPostName(String postName) {
		this.postName = postName;
	}

	/**
	 * @param localName the localName to set
	 */
	public void setLocalName(String localName) {
		this.localName = localName;
		
		
	}

	@Override
	public String toString() {
		return "TotalDTO [memberProfile=" + memberProfile + ", memberNickname=" + memberNickname + ", postName="
				+ postName + ", localName=" + localName + "]";
	}
}
