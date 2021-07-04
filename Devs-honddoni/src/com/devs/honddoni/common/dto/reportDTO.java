package com.devs.honddoni.common.dto;

public class reportDTO {

	private int reportNo;				//신고번호
	private String category;			//신고 유형
	private String broadType;			//글 유형
	private int broadNo;				//글 번호
	private int reportMemberNo;			//신고자 회원번호
	private int reportedMeberNo;		//피신고자 회원번호
	
	public reportDTO() {}

	public reportDTO(int reportNo, String category, String broadType, int broadNo, int reportMemberNo,
			int reportedMeberNo) {
		super();
		this.reportNo = reportNo;
		this.category = category;
		this.broadType = broadType;
		this.broadNo = broadNo;
		this.reportMemberNo = reportMemberNo;
		this.reportedMeberNo = reportedMeberNo;
	}

	public int getReportNo() {
		return reportNo;
	}

	public void setReportNo(int reportNo) {
		this.reportNo = reportNo;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public int getReportedMeberNo() {
		return reportedMeberNo;
	}

	public void setReportedMeberNo(int reportedMeberNo) {
		this.reportedMeberNo = reportedMeberNo;
	}

	@Override
	public String toString() {
		return "reportDTO [reportNo=" + reportNo + ", category=" + category + ", broadType=" + broadType + ", broadNo="
				+ broadNo + ", reportMemberNo=" + reportMemberNo + ", reportedMeberNo=" + reportedMeberNo + "]";
	}
	
	
}
