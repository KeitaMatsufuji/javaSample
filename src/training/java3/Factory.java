package training.java3;

// インスタンスを作って渡すためだけのクラス
public class Factory {
	SampleInterface manufactureInstance() {
		return new PoliC();
	}
}
