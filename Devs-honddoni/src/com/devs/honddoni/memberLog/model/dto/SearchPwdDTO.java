package com.devs.honddoni.memberLog.model.dto;

public class SearchPwdDTO {
	
	private String name;
	private String id;
	private String phone;
	private String newPwd;
	
	public SearchPwdDTO() {}
	
	public SearchPwdDTO(String name, String id, String phone, String newPwd) {
		super();
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.newPwd = newPwd;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNewPwd() {
		return newPwd;
	}

	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}

	@Override
	public String toString() {
		return "SearchPwdDTO [name=" + name + ", id=" + id + ", phone=" + phone + ", newPwd=" + newPwd + "]";
	}

	
	
	

}
