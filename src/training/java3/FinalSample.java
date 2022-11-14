package training.java3;

public final class FinalSample { // このクラスは継承不可
	protected final void print() { // このメソッドは書き換え(オーバーライド不可)
		System.out.println("final");
	};
}