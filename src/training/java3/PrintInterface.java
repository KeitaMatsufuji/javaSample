package training.java3;

interface PrintInterface {
	String rule = "書かなくてもpublic static finalがついているものとして扱う";
	// 抽象メソッド(書かなくてもpublic abstractがついているものとして扱う)
	void printMyName();
	void sameName();
	String getField();
}
