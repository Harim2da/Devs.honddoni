package com.devs.honddoni.member.model.dto;

public class MemberInfoDTO implements java.io.Serializable {

	private String profile;
	private String name;
	private String id;
	private String birth;
	private String gender;
	private String nickName;
	private String address;
	private String phone;
	private String email;
	private int characterCode;
	
	public MemberInfoDTO() {}

	public MemberInfoDTO(String profile, String name, String id, String birth, String gender, String nickName,
			String address, String phone, String email, int characterCode) {
		super();
		this.profile = profile;
		this.name = name;
		this.id = id;
		this.birth = birth;
		this.gender = gender;
		this.nickName = nickName;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.characterCode = characterCode;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCharacterCode() {
		return characterCode;
	}

	public void setCharacterCode(int characterCode) {
		this.characterCode = characterCode;
	}

	@Override
	public String toString() {
		return "MemberInfoDTO [profile=" + profile + ", name=" + name + ", id=" + id + ", birth=" + birth + ", gender="
				+ gender + ", nickName=" + nickName + ", address=" + address + ", phone=" + phone + ", email=" + email
				+ ", characterCode=" + characterCode + "]";
	}
	
	
	
}
