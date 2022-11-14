package training.java3.test;

public class Sub2 extends training.java3.Super2 {
	// protected static String test = "protected呼び出し";
	
	public String getProtectedTest() {
		return protectedTest;
	}
	public void setProtectedTest(String protectedTest) {
		this.protectedTest = protectedTest;
	}
//	public String getNoWriteTest() {
//		return noWriteTest;
//	}
//	public void setNoWriteTest(String noWriteTest) {
//		this.noWriteTest = noWriteTest;
//	}
	
}
