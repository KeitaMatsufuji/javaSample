package training.java3;

public class Super1 {
	Super1() {
		System.out.println("superコンストラクタ");
	}
	Super1(int i) {
		System.out.println("superコンストラクタ" + (i + 1));
	}

	protected void print() {
		System.out.println("super");
	}
	
	public final void finalMethod() {
		System.out.println("final");
	}

}