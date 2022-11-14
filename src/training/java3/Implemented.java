package training.java3;
// 実装クラス
class Implemented implements SubPrintInterface, PrintInterface2 {
	// 抽象メソッドをオーバーライドして実装
	@Override
	public void printMyName() {
        System.out.println( "Implemented" );
    }

	@Override
	public void printMyNameSub() {
		System.out.println( "SubInterfaceImplemented" );
	}
	
	@Override
	public void printMyName2() {
		System.out.println( "AnotherInterfaceImpl" );
	}
	
	@Override
	public void sameName() {
		System.out.println( "sameName" );
	}
	
	@Override
	public String getField() {
		return rule;
	}
}
