package training.java2_2;

import training.java2.PackageSample2;

public class PackageSampleB {
	public static void main(String[] args) {
		// インポートしているのでパッケージごと書かなくてもよい
		PackageSample2 ps = new PackageSample2();
		System.out.println(ps.publicAccess);
		
		// インポートしていないものは完全限定名で書く
		java.util.ArrayList<String> fullNmList = new java.util.ArrayList<String>();
	}
}