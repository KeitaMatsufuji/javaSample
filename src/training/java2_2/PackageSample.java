package training.java2_2;

public class PackageSample {
	public static void main(String[] args) {
		// パッケージごと書く
		training.java2.PackageSample2 ps = new training.java2.PackageSample2();
		// どこからでもアクセス可
		System.out.println(ps.publicAccess);
		// 別パッケージなのでアクセス不可
//		 System.out.println(ps.protectedAccess);
//		 System.out.println(ps.noWriteAccess);
		// 他所からのアクセス不可
//		 System.out.println(ps.privateAccess);
	}
}