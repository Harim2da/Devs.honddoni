package com.devs.honddoni.member.model.dto;

public class MemberRegistDTO implements java.io.Serializable{
	
	private int memberNo;
	private String memberId;
	private String memberPassword;
	private String memberName;
	private String memberBirth;
	private String memberGender;
	private String memberAddress;
	private String memberNickname;
	private String memberPhone;
	private String memberEmail;
	private String memberStatus;
	private String memberProfile;
	private String memberAccess;
	private String memRegistDate;
	private String memWithdrawDate;
	private String memberCharacter;
	private int profileCode;
	
	public MemberRegistDTO() {}

	public MemberRegistDTO(int memberNo, String memberId, String memberPassword, String memberName, String memberBirth,
			String memberGender, String memberAddress, String memberNickname, String memberPhone, String memberEmail,
			String memberStatus, String memberProfile, String memberAccess, String memRegistDate,
			String memWithdrawDate, String memberCharacter, int profileCode) {
		super();
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberPassword = memberPassword;
		this.memberName = memberName;
		this.memberBirth = memberBirth;
		this.memberGender = memberGender;
		this.memberAddress = memberAddress;
		this.memberNickname = memberNickname;
		this.memberPhone = memberPhone;
		this.memberEmail = memberEmail;
		this.memberStatus = memberStatus;
		this.memberProfile = memberProfile;
		this.memberAccess = memberAccess;
		this.memRegistDate = memRegistDate;
		this.memWithdrawDate = memWithdrawDate;
		this.memberCharacter = memberCharacter;
		this.profileCode = profileCode;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberBirth() {
		return memberBirth;
	}

	public void setMemberBirth(String memberBirth) {
		this.memberBirth = memberBirth;
	}

	public String getMemberGender() {
		return memberGender;
	}

	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public String getMemberNickname() {
		return memberNickname;
	}

	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberStatus() {
		return memberStatus;
	}

	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}

	public String getMemberProfile() {
		return memberProfile;
	}

	public void setMemberProfile(String memberProfile) {
		this.memberProfile = memberProfile;
	}

	public String getMemberAccess() {
		return memberAccess;
	}

	public void setMemberAccess(String memberAccess) {
		this.memberAccess = memberAccess;
	}

	public String getMemRegistDate() {
		return memRegistDate;
	}

	public void setMemRegistDate(String memRegistDate) {
		this.memRegistDate = memRegistDate;
	}

	public String getMemWithdrawDate() {
		return memWithdrawDate;
	}

	public void setMemWithdrawDate(String memWithdrawDate) {
		this.memWithdrawDate = memWithdrawDate;
	}

	public String getMemberCharacter() {
		return memberCharacter;
	}

	public void setMemberCharacter(String memberCharacter) {
		this.memberCharacter = memberCharacter;
	}

	public int getProfileCode() {
		return profileCode;
	}

	public void setProfileCode(int profileCode) {
		this.profileCode = profileCode;
	}

	@Override
	public String toString() {
		return "MemberRegistDTO [memberNo=" + memberNo + ", memberId=" + memberId + ", memberPassword=" + memberPassword
				+ ", memberName=" + memberName + ", memberBirth=" + memberBirth + ", memberGender=" + memberGender
				+ ", memberAddress=" + memberAddress + ", memberNickname=" + memberNickname + ", memberPhone="
				+ memberPhone + ", memberEmail=" + memberEmail + ", memberStatus=" + memberStatus + ", memberProfile="
				+ memberProfile + ", memberAccess=" + memberAccess + ", memRegistDate=" + memRegistDate
				+ ", memWithdrawDate=" + memWithdrawDate + ", memberCharacter=" + memberCharacter + ", profileCode="
				+ profileCode + "]";
	}
	
	
	
	

}
