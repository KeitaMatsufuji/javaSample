package training.java2;

public class PackageSample2 {
	public String publicAccess = "どこからでも使える(public)。";
	protected String protectedAccess = "training.java2パッケージかPackageSample2のサブクラスで使える";
	String noWriteAccess = "training.java2パッケージで使える(記述なし)";
	private String privateAccess = "PackageSample2クラスの中でしか使えない。";
	
	
}