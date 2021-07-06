package com.devs.honddoni.admin.model.dto;

public class AdminDTO implements java.io.Serializable {
	
	private String MemberNickName;
	private String M

	public AdminDTO(String mEMBER_NICKNAME) {
		super();
		MEMBER_NICKNAME = mEMBER_NICKNAME;
	}



	public AdminDTO() {
		// TODO Auto-generated constructor stub
	}



	/**
	 * @return the mEMBER_NICKNAME
	 */
	public String getMEMBER_NICKNAME() {
		return MEMBER_NICKNAME;
	}

	/**
	 * @param mEMBER_NICKNAME the mEMBER_NICKNAME to set
	 */
	public void setMEMBER_NICKNAME(String mEMBER_NICKNAME) {
		MEMBER_NICKNAME = mEMBER_NICKNAME;
		
	}

	@Override
	public String toString() {
		return "AdminDTO [MEMBER_NICKNAME=" + MEMBER_NICKNAME + "]";
	}
}
	
//	private int POST_NO;
//	private String POST_NAME;
//	private String POST_CONTENTS;
//	private String POST_CATEGORY;
//	private int POST_MEMBER_NO;
//	private String POST_MEETINGDATE;
//	private String POST_MEETINGTIME;
//	private String POST_WRITINGDATE;
//	private String POST_WRITINGTIME;
//	private int LOCAL_CODE;
//	private int CATEGORY_CODE;
//	private String POST_DEL_STATUS;
//	private int POST_NUMBER_OF_PEOPLE;
//	private int NEMBER_NO;
//	private String MEMBER_ID;
//	private String MEMBER_PASSWORD;
//	private String MEMBER_NAME;
//	private String MEMBER_BIRTH;
//	private String MEMBER_GENDER;
//	private String MEMBER_ADDRESS;
//	private String MEMBER_NICKNAME;
//	private String MEMBER_PHONE;
//	private String MEMBER_EMAIL;
//	private String MEMBER_STATUS;
//	private String MEMBER_PROFILE;
//	private String MEMBER_ACCESS;
//	private String MEM_REGIST_DATE;
//	private String MEM_WITHDRAW_DATE;
//	private String MEM_CHARACTER_CODE;
	
//	public AdminDTO() {
//		
//		
//	}

//	public AdminDTO(int pOST_NO, String pOST_NAME, String pOST_CONTENTS, String pOST_CATEGORY, int pOST_MEMBER_NO,
//			String pOST_MEETINGDATE, String pOST_MEETINGTIME, String pOST_WRITINGDATE, String pOST_WRITINGTIME,
//			int lOCAL_CODE, int cATEGORY_CODE, String pOST_DEL_STATUS, int pOST_NUMBER_OF_PEOPLE, int nEMBER_NO,
//			String mEMBER_ID, String mEMBER_PASSWORD, String mEMBER_NAME, String mEMBER_BIRTH, String mEMBER_GENDER,
////			String mEMBER_ADDRESS, String mEMBER_NICKNAME, String mEMBER_PHONE, String mEMBER_EMAIL,
//			String mEMBER_STATUS, String mEMBER_PROFILE, String mEMBER_ACCESS, String mEM_REGIST_DATE,
//			String mEM_WITHDRAW_DATE, String mEM_CHARACTER_CODE) {
	
	
//		super();
//		POST_NO = pOST_NO;
//		POST_NAME = pOST_NAME;
//		POST_CONTENTS = pOST_CONTENTS;
//		POST_CATEGORY = pOST_CATEGORY;
//		POST_MEMBER_NO = pOST_MEMBER_NO;
//		POST_MEETINGDATE = pOST_MEETINGDATE;
//		POST_MEETINGTIME = pOST_MEETINGTIME;
//		POST_WRITINGDATE = pOST_WRITINGDATE;
//		POST_WRITINGTIME = pOST_WRITINGTIME;
//		LOCAL_CODE = lOCAL_CODE;
//		CATEGORY_CODE = cATEGORY_CODE;
//		POST_DEL_STATUS = pOST_DEL_STATUS;
//		POST_NUMBER_OF_PEOPLE = pOST_NUMBER_OF_PEOPLE;
//		NEMBER_NO = nEMBER_NO;
//		MEMBER_ID = mEMBER_ID;
//		MEMBER_PASSWORD = mEMBER_PASSWORD;
//		MEMBER_NAME = mEMBER_NAME;
//		MEMBER_BIRTH = mEMBER_BIRTH;
//		MEMBER_GENDER = mEMBER_GENDER;
//		MEMBER_ADDRESS = mEMBER_ADDRESS;
//		MEMBER_NICKNAME = mEMBER_NICKNAME;
//		MEMBER_PHONE = mEMBER_PHONE;
//		MEMBER_EMAIL = mEMBER_EMAIL;
//		MEMBER_STATUS = mEMBER_STATUS;
//		MEMBER_PROFILE = mEMBER_PROFILE;
//		MEMBER_ACCESS = mEMBER_ACCESS;
//		MEM_REGIST_DATE = mEM_REGIST_DATE;
//		MEM_WITHDRAW_DATE = mEM_WITHDRAW_DATE;
//		MEM_CHARACTER_CODE = mEM_CHARACTER_CODE;
		
		
//	}

//	/**
//	 * @return the pOST_NO
//	 */
//	public int getPOST_NO() {
//		return POST_NO;
//	}
//
//	/**
//	 * @return the pOST_NAME
//	 */
//	public String getPOST_NAME() {
//		return POST_NAME;
//	}
//
//	/**
//	 * @return the pOST_CONTENTS
//	 */
//	public String getPOST_CONTENTS() {
//		return POST_CONTENTS;
//	}
//
//	/**
//	 * @return the pOST_CATEGORY
//	 */
//	public String getPOST_CATEGORY() {
//		return POST_CATEGORY;
//	}
//
//	/**
//	 * @return the pOST_MEMBER_NO
//	 */
//	public int getPOST_MEMBER_NO() {
//		return POST_MEMBER_NO;
//	}
//
//	/**
//	 * @return the pOST_MEETINGDATE
//	 */
//	public String getPOST_MEETINGDATE() {
//		return POST_MEETINGDATE;
//	}
//
//	/**
//	 * @return the pOST_MEETINGTIME
//	 */
//	public String getPOST_MEETINGTIME() {
//		return POST_MEETINGTIME;
//	}
//
//	/**
//	 * @return the pOST_WRITINGDATE
//	 */
//	public String getPOST_WRITINGDATE() {
//		return POST_WRITINGDATE;
//	}
//
//	/**
//	 * @return the pOST_WRITINGTIME
//	 */
//	public String getPOST_WRITINGTIME() {
//		return POST_WRITINGTIME;
//	}
//
//	/**
//	 * @return the lOCAL_CODE
//	 */
//	public int getLOCAL_CODE() {
//		return LOCAL_CODE;
//	}
//
//	/**
//	 * @return the cATEGORY_CODE
//	 */
//	public int getCATEGORY_CODE() {
//		return CATEGORY_CODE;
//	}
//
//	/**
//	 * @return the pOST_DEL_STATUS
//	 */
//	public String getPOST_DEL_STATUS() {
//		return POST_DEL_STATUS;
//	}
//
//	/**
//	 * @return the pOST_NUMBER_OF_PEOPLE
//	 */
//	public int getPOST_NUMBER_OF_PEOPLE() {
//		return POST_NUMBER_OF_PEOPLE;
//	}
//
//	/**
//	 * @return the nEMBER_NO
//	 */
//	public int getNEMBER_NO() {
//		return NEMBER_NO;
//	}
//
//	/**
//	 * @return the mEMBER_ID
//	 */
//	public String getMEMBER_ID() {
//		return MEMBER_ID;
//	}
//
//	/**
//	 * @return the mEMBER_PASSWORD
//	 */
//	public String getMEMBER_PASSWORD() {
//		return MEMBER_PASSWORD;
//	}
//
//	/**
//	 * @return the mEMBER_NAME
//	 */
//	public String getMEMBER_NAME() {
//		return MEMBER_NAME;
//	}
//
//	/**
//	 * @return the mEMBER_BIRTH
//	 */
//	public String getMEMBER_BIRTH() {
//		return MEMBER_BIRTH;
//	}
//
//	/**
//	 * @return the mEMBER_GENDER
//	 */
//	public String getMEMBER_GENDER() {
//		return MEMBER_GENDER;
//	}
//
//	/**
//	 * @return the mEMBER_ADDRESS
//	 */
//	public String getMEMBER_ADDRESS() {
//		return MEMBER_ADDRESS;
//	}

	/**
	 * @return the mEMBER_NICKNAME
	 */
//	public String getMEMBER_NICKNAME() {
//		return MEMBER_NICKNAME;
//	}

//	/**
//	 * @return the mEMBER_PHONE
//	 */
//	public String getMEMBER_PHONE() {
//		return MEMBER_PHONE;
//	}
//
//	/**
//	 * @return the mEMBER_EMAIL
//	 */
//	public String getMEMBER_EMAIL() {
//		return MEMBER_EMAIL;
//	}
//
//	/**
//	 * @return the mEMBER_STATUS
//	 */
//	public String getMEMBER_STATUS() {
//		return MEMBER_STATUS;
//	}
//
//	/**
//	 * @return the mEMBER_PROFILE
//	 */
//	public String getMEMBER_PROFILE() {
//		return MEMBER_PROFILE;
//	}
//
//	/**
//	 * @return the mEMBER_ACCESS
//	 */
//	public String getMEMBER_ACCESS() {
//		return MEMBER_ACCESS;
//	}
//
//	/**
//	 * @return the mEM_REGIST_DATE
//	 */
//	public String getMEM_REGIST_DATE() {
//		return MEM_REGIST_DATE;
//	}
//
//	/**
//	 * @return the mEM_WITHDRAW_DATE
//	 */
//	public String getMEM_WITHDRAW_DATE() {
//		return MEM_WITHDRAW_DATE;
//	}
//
//	/**
//	 * @return the mEM_CHARACTER_CODE
//	 */
//	public String getMEM_CHARACTER_CODE() {
//		return MEM_CHARACTER_CODE;
//	}
//
//	/**
//	 * @param pOST_NO the pOST_NO to set
//	 */
//	public void setPOST_NO(int pOST_NO) {
//		POST_NO = pOST_NO;
//	}
//
//	/**
//	 * @param pOST_NAME the pOST_NAME to set
//	 */
//	public void setPOST_NAME(String pOST_NAME) {
//		POST_NAME = pOST_NAME;
//	}
//
//	/**
//	 * @param pOST_CONTENTS the pOST_CONTENTS to set
//	 */
//	public void setPOST_CONTENTS(String pOST_CONTENTS) {
//		POST_CONTENTS = pOST_CONTENTS;
//	}
//
//	/**
//	 * @param pOST_CATEGORY the pOST_CATEGORY to set
//	 */
//	public void setPOST_CATEGORY(String pOST_CATEGORY) {
//		POST_CATEGORY = pOST_CATEGORY;
//	}
//
//	/**
//	 * @param pOST_MEMBER_NO the pOST_MEMBER_NO to set
//	 */
//	public void setPOST_MEMBER_NO(int pOST_MEMBER_NO) {
//		POST_MEMBER_NO = pOST_MEMBER_NO;
//	}
//
//	/**
//	 * @param pOST_MEETINGDATE the pOST_MEETINGDATE to set
//	 */
//	public void setPOST_MEETINGDATE(String pOST_MEETINGDATE) {
//		POST_MEETINGDATE = pOST_MEETINGDATE;
//	}
//
//	/**
//	 * @param pOST_MEETINGTIME the pOST_MEETINGTIME to set
//	 */
//	public void setPOST_MEETINGTIME(String pOST_MEETINGTIME) {
//		POST_MEETINGTIME = pOST_MEETINGTIME;
//	}
//
//	/**
//	 * @param pOST_WRITINGDATE the pOST_WRITINGDATE to set
//	 */
//	public void setPOST_WRITINGDATE(String pOST_WRITINGDATE) {
//		POST_WRITINGDATE = pOST_WRITINGDATE;
//	}
//
//	/**
//	 * @param pOST_WRITINGTIME the pOST_WRITINGTIME to set
//	 */
//	public void setPOST_WRITINGTIME(String pOST_WRITINGTIME) {
//		POST_WRITINGTIME = pOST_WRITINGTIME;
//	}
//
//	/**
//	 * @param lOCAL_CODE the lOCAL_CODE to set
//	 */
//	public void setLOCAL_CODE(int lOCAL_CODE) {
//		LOCAL_CODE = lOCAL_CODE;
//	}
//
//	/**
//	 * @param cATEGORY_CODE the cATEGORY_CODE to set
//	 */
//	public void setCATEGORY_CODE(int cATEGORY_CODE) {
//		CATEGORY_CODE = cATEGORY_CODE;
//	}
//
//	/**
//	 * @param pOST_DEL_STATUS the pOST_DEL_STATUS to set
//	 */
//	public void setPOST_DEL_STATUS(String pOST_DEL_STATUS) {
//		POST_DEL_STATUS = pOST_DEL_STATUS;
//	}
//
//	/**
//	 * @param pOST_NUMBER_OF_PEOPLE the pOST_NUMBER_OF_PEOPLE to set
//	 */
//	public void setPOST_NUMBER_OF_PEOPLE(int pOST_NUMBER_OF_PEOPLE) {
//		POST_NUMBER_OF_PEOPLE = pOST_NUMBER_OF_PEOPLE;
//	}
//
//	/**
//	 * @param nEMBER_NO the nEMBER_NO to set
//	 */
//	public void setNEMBER_NO(int nEMBER_NO) {
//		NEMBER_NO = nEMBER_NO;
//	}
//
//	/**
//	 * @param mEMBER_ID the mEMBER_ID to set
//	 */
//	public void setMEMBER_ID(String mEMBER_ID) {
//		MEMBER_ID = mEMBER_ID;
//	}
//
//	/**
//	 * @param mEMBER_PASSWORD the mEMBER_PASSWORD to set
//	 */
//	public void setMEMBER_PASSWORD(String mEMBER_PASSWORD) {
//		MEMBER_PASSWORD = mEMBER_PASSWORD;
//	}
//
//	/**
//	 * @param mEMBER_NAME the mEMBER_NAME to set
//	 */
//	public void setMEMBER_NAME(String mEMBER_NAME) {
//		MEMBER_NAME = mEMBER_NAME;
//	}
//
//	/**
//	 * @param mEMBER_BIRTH the mEMBER_BIRTH to set
//	 */
//	public void setMEMBER_BIRTH(String mEMBER_BIRTH) {
//		MEMBER_BIRTH = mEMBER_BIRTH;
//	}
//
//	/**
//	 * @param mEMBER_GENDER the mEMBER_GENDER to set
//	 */
//	public void setMEMBER_GENDER(String mEMBER_GENDER) {
//		MEMBER_GENDER = mEMBER_GENDER;
//	}
//
//	/**
//	 * @param mEMBER_ADDRESS the mEMBER_ADDRESS to set
//	 */
//	public void setMEMBER_ADDRESS(String mEMBER_ADDRESS) {
//		MEMBER_ADDRESS = mEMBER_ADDRESS;
//	}
//
//	/**
//	 * @param mEMBER_NICKNAME the mEMBER_NICKNAME to set
//	 */
//	public void setMEMBER_NICKNAME(String mEMBER_NICKNAME) {
//		MEMBER_NICKNAME = mEMBER_NICKNAME;
//	}
//
//	/**
//	 * @param mEMBER_PHONE the mEMBER_PHONE to set
//	 */
//	public void setMEMBER_PHONE(String mEMBER_PHONE) {
//		MEMBER_PHONE = mEMBER_PHONE;
//	}
//
//	/**
//	 * @param mEMBER_EMAIL the mEMBER_EMAIL to set
//	 */
//	public void setMEMBER_EMAIL(String mEMBER_EMAIL) {
//		MEMBER_EMAIL = mEMBER_EMAIL;
//	}
//
//	/**
//	 * @param mEMBER_STATUS the mEMBER_STATUS to set
//	 */
//	public void setMEMBER_STATUS(String mEMBER_STATUS) {
//		MEMBER_STATUS = mEMBER_STATUS;
//	}
//
//	/**
//	 * @param mEMBER_PROFILE the mEMBER_PROFILE to set
//	 */
//	public void setMEMBER_PROFILE(String mEMBER_PROFILE) {
//		MEMBER_PROFILE = mEMBER_PROFILE;
//	}
//
//	/**
//	 * @param mEMBER_ACCESS the mEMBER_ACCESS to set
//	 */
//	public void setMEMBER_ACCESS(String mEMBER_ACCESS) {
//		MEMBER_ACCESS = mEMBER_ACCESS;
//	}
//
//	/**
//	 * @param mEM_REGIST_DATE the mEM_REGIST_DATE to set
//	 */
//	public void setMEM_REGIST_DATE(String mEM_REGIST_DATE) {
//		MEM_REGIST_DATE = mEM_REGIST_DATE;
//	}
//
//	/**
//	 * @param mEM_WITHDRAW_DATE the mEM_WITHDRAW_DATE to set
//	 */
//	public void setMEM_WITHDRAW_DATE(String mEM_WITHDRAW_DATE) {
//		MEM_WITHDRAW_DATE = mEM_WITHDRAW_DATE;
//	}
//
//	/**
//	 * @param mEM_CHARACTER_CODE the mEM_CHARACTER_CODE to set
//	 */
//	public void setMEM_CHARACTER_CODE(String mEM_CHARACTER_CODE) {
//		MEM_CHARACTER_CODE = mEM_CHARACTER_CODE;
//		
//		
//	}
//
//	@Override
//	public String toString() {
//		return "AdminDTO [POST_NO=" + POST_NO + ", POST_NAME=" + POST_NAME + ", POST_CONTENTS=" + POST_CONTENTS
//				+ ", POST_CATEGORY=" + POST_CATEGORY + ", POST_MEMBER_NO=" + POST_MEMBER_NO + ", POST_MEETINGDATE="
//				+ POST_MEETINGDATE + ", POST_MEETINGTIME=" + POST_MEETINGTIME + ", POST_WRITINGDATE=" + POST_WRITINGDATE
//				+ ", POST_WRITINGTIME=" + POST_WRITINGTIME + ", LOCAL_CODE=" + LOCAL_CODE + ", CATEGORY_CODE="
//				+ CATEGORY_CODE + ", POST_DEL_STATUS=" + POST_DEL_STATUS + ", POST_NUMBER_OF_PEOPLE="
//				+ POST_NUMBER_OF_PEOPLE + ", NEMBER_NO=" + NEMBER_NO + ", MEMBER_ID=" + MEMBER_ID + ", MEMBER_PASSWORD="
//				+ MEMBER_PASSWORD + ", MEMBER_NAME=" + MEMBER_NAME + ", MEMBER_BIRTH=" + MEMBER_BIRTH
//				+ ", MEMBER_GENDER=" + MEMBER_GENDER + ", MEMBER_ADDRESS=" + MEMBER_ADDRESS + ", MEMBER_NICKNAME="
//				+ MEMBER_NICKNAME + ", MEMBER_PHONE=" + MEMBER_PHONE + ", MEMBER_EMAIL=" + MEMBER_EMAIL
//				+ ", MEMBER_STATUS=" + MEMBER_STATUS + ", MEMBER_PROFILE=" + MEMBER_PROFILE + ", MEMBER_ACCESS="
//				+ MEMBER_ACCESS + ", MEM_REGIST_DATE=" + MEM_REGIST_DATE + ", MEM_WITHDRAW_DATE=" + MEM_WITHDRAW_DATE
//				+ ", MEM_CHARACTER_CODE=" + MEM_CHARACTER_CODE + ", getPOST_NO()=" + getPOST_NO() + ", getPOST_NAME()="
//				+ getPOST_NAME() + ", getPOST_CONTENTS()=" + getPOST_CONTENTS() + ", getPOST_CATEGORY()="
//				+ getPOST_CATEGORY() + ", getPOST_MEMBER_NO()=" + getPOST_MEMBER_NO() + ", getPOST_MEETINGDATE()="
//				+ getPOST_MEETINGDATE() + ", getPOST_MEETINGTIME()=" + getPOST_MEETINGTIME()
//				+ ", getPOST_WRITINGDATE()=" + getPOST_WRITINGDATE() + ", getPOST_WRITINGTIME()="
//				+ getPOST_WRITINGTIME() + ", getLOCAL_CODE()=" + getLOCAL_CODE() + ", getCATEGORY_CODE()="
//				+ getCATEGORY_CODE() + ", getPOST_DEL_STATUS()=" + getPOST_DEL_STATUS()
//				+ ", getPOST_NUMBER_OF_PEOPLE()=" + getPOST_NUMBER_OF_PEOPLE() + ", getNEMBER_NO()=" + getNEMBER_NO()
//				+ ", getMEMBER_ID()=" + getMEMBER_ID() + ", getMEMBER_PASSWORD()=" + getMEMBER_PASSWORD()
//				+ ", getMEMBER_NAME()=" + getMEMBER_NAME() + ", getMEMBER_BIRTH()=" + getMEMBER_BIRTH()
//				+ ", getMEMBER_GENDER()=" + getMEMBER_GENDER() + ", getMEMBER_ADDRESS()=" + getMEMBER_ADDRESS()
//				+ ", getMEMBER_NICKNAME()=" + getMEMBER_NICKNAME() + ", getMEMBER_PHONE()=" + getMEMBER_PHONE()
//				+ ", getMEMBER_EMAIL()=" + getMEMBER_EMAIL() + ", getMEMBER_STATUS()=" + getMEMBER_STATUS()
//				+ ", getMEMBER_PROFILE()=" + getMEMBER_PROFILE() + ", getMEMBER_ACCESS()=" + getMEMBER_ACCESS()
//				+ ", getMEM_REGIST_DATE()=" + getMEM_REGIST_DATE() + ", getMEM_WITHDRAW_DATE()="
//				+ getMEM_WITHDRAW_DATE() + ", getMEM_CHARACTER_CODE()=" + getMEM_CHARACTER_CODE() + ", getClass()="
//				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
//	}
//	}
	