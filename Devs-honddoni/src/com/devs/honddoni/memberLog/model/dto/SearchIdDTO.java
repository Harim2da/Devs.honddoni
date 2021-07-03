package com.devs.honddoni.memberLog.model.dto;

public class SearchIdDTO implements java.io.Serializable {
	
	private String name;
	private String phone;
	
	public SearchIdDTO() {}
	
	public SearchIdDTO(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "SearchIdDTO [name=" + name + ", phone=" + phone + "]";
	}	

}
