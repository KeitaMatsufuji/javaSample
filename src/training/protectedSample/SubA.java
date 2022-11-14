package training.protectedSample;

import training.protectedSample.another.SuperA;

public class SubA extends SuperA {
	// protected String prot = "protected";
	
	public void getProtectedField() {
		System.out.println(prot);
	}
}
