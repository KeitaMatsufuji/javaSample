package training.java4;

public class Sub1 implements Int1 {
//	@Override
//	public A sample() {
//		return new B();
//	}
	
	
	@Override
	public B sample() {
		return new B();
	}
	
	@Override
	public Sub1 sample2() {
		return new Sub1();
	}
	
	@Override
	public String sample3() {
		return "sample3";
	}
	
}
