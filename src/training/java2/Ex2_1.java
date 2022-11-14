package training.java2;

public class Ex2_1 {
	public static void main(String[] args) {
		// 1
		Item a = new Item();
		Item b = new Item();
		b.setNum(20);
		System.out.println(a.getNm());
		
		// 2
		Ex2_1 ex2_1 = new Ex2_1();
		System.out.println(ex2_1.sum(99,99));
		
		// 3
		System.out.println(new A().id);
		
		
		// 4
		 Sample3 s3 = new Sample3();
		 s3.Sample3();
		
		// 5
		Sample4.num = 10;
		Sample4 s4 = new Sample4();
		Sample4 s4_2 = new Sample4();
		s4.num += 10;
		s4_2.num = 30;
		System.out.println(Sample4.num);
		
		// 6
		Sample5 s5 = new Sample5();
		System.out.println(Sample5.a + s5.b);
		
		
	}

	private int sum(int i, int j) {
		return i + j;
	}
}

class Item {
	private int num = 10;
	
	public void setNum(int num) {
		this.num = num;
	}
	public int getNm() {
		return this.num;
	}
}
	
class Sample2 {
	void Sample2() {
		System.out.println("hello.");
	}
}

class Sample3 {
	void Sample3() {
		System.out.println("hello.");
	}
	
	Sample3(String str) {
		System.out.println(str);
	}
	
	Sample3() {}
}

class Sample4 {
	static int num = 10;
}

class Sample5 {
	static int a = 10;
	int b = 20;
}

class A {
	String id = "A";
}