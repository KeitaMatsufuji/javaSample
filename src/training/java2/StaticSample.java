package training.java2;

class StaticSample {
	// 実体が無いのでコピーして使う
	int dynamicInt = 10;
	//　最初から実体はできているので直接使う
	static int staticInt = 20;
	int dynamicMethod(){return 100;}
	static int staticMethod(){return 200;}
}