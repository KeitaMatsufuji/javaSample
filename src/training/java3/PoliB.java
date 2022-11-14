package training.java3;

public class PoliB implements SampleInterface {

	@Override
	public void print() {
		System.out.println("B");
	}

	@Override
	public int calc(int i, int i2) {
		return i + i2;
	}

}
