package training.protectedSample;

import training.protectedSample.another.SuperA;

public class SubRun extends SuperA {
	// protected String prot = "protected";
	public static void main(String[] args) {
		SuperA spA = new SuperA();
		System.out.println(spA.prot);
		
		SubA sbA = new SubA();
		sbA.getProtectedField();
		System.out.println(sbA.prot);
		
		SubRun subRun = new SubRun();
		System.out.println(subRun.prot);
		subRun.method();
	}

}
