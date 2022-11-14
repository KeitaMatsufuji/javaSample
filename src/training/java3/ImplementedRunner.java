package training.java3;

public class ImplementedRunner {
	public static void main(String[] args) {
		// PrintInterface（インターフェース）型の
		// Implemented(実装)オブジェクトを生成
		PrintInterface ref = new Implemented();
		// 実装したメソッドを呼び出し
		ref.printMyName();
		
		// Implemented(実装)オブジェクトを生成
		PrintInterface ref2 = new Implemented();
		// 実装したメソッドを呼び出し
		ref2.sameName();

		// Implemented ref3 = (Implemented) ref2;

		
	}
}
