package training.java3;

public class Sub1 extends Super1 {
	Sub1() {
		System.out.println("subコンストラクタ");
	}
	Sub1(int i) {
		super(i);
		System.out.println("subコンストラクタ(int引数)" + (i + 2));
	}

	@Override
	public void print() {
		System.out.println("sub");
	};

	public void print2() {
		System.out.println("スーパークラスのprintを呼び出し");
		super.print();
	};
}