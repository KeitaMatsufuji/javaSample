package training.java2;

public class PackageSample {
	public static void main(String[] args) {
		PackageSample2 ps = new PackageSample2();
		// どこからでもアクセス可
		System.out.println(ps.publicAccess);
		// 同パッケージなのでアクセス可
		System.out.println(ps.protectedAccess);
		System.out.println(ps.noWriteAccess);
		// 他所からのアクセス不可
//		System.out.println(ps.privateAccess);
	}
}