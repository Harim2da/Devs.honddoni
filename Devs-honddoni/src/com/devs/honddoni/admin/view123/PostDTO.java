package com.devs.honddoni.admin.view123;

public class PostDTO {
	
	private String postName;
	private String memberNickname;
	private String memberProfile;
	private String localName;
	private String categoryName;
	private String achivType;
	
	public PostDTO() {
		
	}

	public PostDTO(String postName, String memberNickname, String memberProfile, String localName, String categoryName,
			String achivType) {
		super();
		this.postName = postName;
		this.memberNickname = memberNickname;
		this.memberProfile = memberProfile;
		this.localName = localName;
		this.categoryName = categoryName;
		this.achivType = achivType;
	}

	/**
	 * @return the postName
	 */
	public String getPostName() {
		return postName;
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
	 * @return the localName
	 */
	public String getLocalName() {
		return localName;
	}

	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @return the achivType
	 */
	public String getAchivType() {
		return achivType;
	}

	/**
	 * @param postName the postName to set
	 */
	public void setPostName(String postName) {
		this.postName = postName;
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
	 * @param localName the localName to set
	 */
	public void setLocalName(String localName) {
		this.localName = localName;
	}

	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * @param achivType the achivType to set
	 */
	public void setAchivType(String achivType) {
		this.achivType = achivType;
	}

	@Override
	public String toString() {
		return "PostDTO [postName=" + postName + ", memberNickname=" + memberNickname + ", memberProfile="
				+ memberProfile + ", localName=" + localName + ", categoryName=" + categoryName + ", achivType="
				+ achivType + "]";
	}
	
	
	

}
