package training.java2;

public class EmployeeInfo1 {
	private int id;
	private String userNm;
	private String userCd;
	String mailAddress = "@ask-planning.co.jp";
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserNm() {
		return userNm;
	}
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	public String getUserCd() {
		return userCd;
	}
	public void setUserCd(String userCd) {
		this.userCd = userCd;
	}
	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress + getMailAddress();
	}
}