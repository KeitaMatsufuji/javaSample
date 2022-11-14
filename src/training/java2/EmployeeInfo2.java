package training.java2;

public class EmployeeInfo2 {
	int id;
	String userNm;
	String userCd;
	String mailAddress = "@ask-planning.co.jp";
	
	EmployeeInfo2(int i) {
		System.out.println("引数intのコンストラクタ");
		this.id = i;
	}

	EmployeeInfo2(String userCd) {
		System.out.println("引数Stringのコンストラクタ");
		mailAddress = userCd + mailAddress;
	}

	EmployeeInfo2() {
		this("空");
	}
	
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
		this.mailAddress = mailAddress;
	}
}