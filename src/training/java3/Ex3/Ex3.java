package training.java3.Ex3;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex3 {
	public static void main(String[] args) {
		// A[] array = {new A(), new B(), new C(), new D()};
		
		try {
			test(0);
		} catch (IOException e) {
			System.out.println("IOException発生");
		}
	}

	private static void test(int i) throws IOException, IndexOutOfBoundsException {
		if (i < 10) {
			throw new FileNotFoundException();
		} else {
			throw new IndexOutOfBoundsException();
		}
	}
}
