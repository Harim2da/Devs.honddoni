package com.devs.honddoni.common.dto;

public class reportDTO {

	private int reportNo;				//신고번호
	private String reportCategory;		//신고 유형
	private String broadType;			//글 유형
	private int broadNo;				//글 번호
	private int reportMemberNo;			//신고자 회원번호
	private int reportedMemberNo;		//피신고자 회원번호
	
	public reportDTO() {}

	public reportDTO(int reportNo, String reportCategory, String broadType, int broadNo, int reportMemberNo,
			int reportedMemberNo) {
		super();
		this.reportNo = reportNo;
		this.reportCategory = reportCategory;
		this.broadType = broadType;
		this.broadNo = broadNo;
		this.reportMemberNo = reportMemberNo;
		this.reportedMemberNo = reportedMemberNo;
	}

	public int getReportNo() {
		return reportNo;
	}

	public void setReportNo(int reportNo) {
		this.reportNo = reportNo;
	}

	public String getReportCategory() {
		return reportCategory;
	}

	public void setReportCategory(String reportCategory) {
		this.reportCategory = reportCategory;
	}

	public String getBroadType() {
		return broadType;
	}

	public void setBroadType(String broadType) {
		this.broadType = broadType;
	}

	public int getBroadNo() {
		return broadNo;
	}

	public void setBroadNo(int broadNo) {
		this.broadNo = broadNo;
	}

	public int getReportMemberNo() {
		return reportMemberNo;
	}

	public void setReportMemberNo(int reportMemberNo) {
		this.reportMemberNo = reportMemberNo;
	}

	public int getReportedMemberNo() {
		return reportedMemberNo;
	}

	public void setReportedMemberNo(int reportedMemberNo) {
		this.reportedMemberNo = reportedMemberNo;
	}

	@Override
	public String toString() {
		return "reportDTO [reportNo=" + reportNo + ", reportCategory=" + reportCategory + ", broadType=" + broadType
				+ ", broadNo=" + broadNo + ", reportMemberNo=" + reportMemberNo + ", reportedMemberNo="
				+ reportedMemberNo + "]";
	}

	

	
	
	
}
