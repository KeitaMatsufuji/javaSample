package training.java2;

import java.util.ArrayList;
import java.util.List;

public class Sample2_1 {
	public static void main(String[] args) {
		// オブジェクト生成
		EmployeeInfo1 e1 = new EmployeeInfo1();
		EmployeeInfo1 e2 = new EmployeeInfo1();

		// メソッド呼び出しでセット
		e1.setId(1);
		e2.setId(2);
		System.out.println("e1に対してgetId：" + e1.getId());
		System.out.println("e2に対してgetId：" + e2.getId());
		
		// インスタンス変数を直接使用
//		System.out.println("e1のidを直接使用：" + e1.id);
//		System.out.println("e2のidを直接使用：" + e2.id);
		
		// 値を直接書き換える
		e1.mailAddress = "tanaka" + e1.mailAddress;
		e2.mailAddress = "suzuki" + e2.mailAddress;
		System.out.println("e1のmailAddressを直接使用" + e1.mailAddress);
		System.out.println("e1のmailAddressを直接使用" + e2.mailAddress);
		
		String[] array = {"a","b","c","d"};
		// 配列クラスのインスタンス変数「length」を表示
		System.out.println(array.length);
		
		List<EmployeeInfo1> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		// リストクラスのメソッド「size」を利用
		System.out.println(list.size());
		System.out.println("リストから引っ張る" + list.get(0).getId());
		
		String s1 = "文字列1";
		String s2 = new String("文字列1");
		// Stringクラスのメソッド「equals」を利用
		System.out.println(s1.equals(s2));
		
		// コンストラクタ呼び出し
		EmployeeInfo2 e3 = new EmployeeInfo2(19);
		EmployeeInfo2 e4 = new EmployeeInfo2("matsufuji");
		EmployeeInfo2 e5 = new EmployeeInfo2();
		System.out.println(e3.id);
		System.out.println(e4.mailAddress);
		System.out.println(e5.userCd);
		System.out.println(e5.mailAddress);

		// 直接static呼び出し
		System.out.println("インスタンス化せずにstatic変数呼び出し : " + StaticSample.staticInt);
		System.out.println("インスタンス化せずにstaticメソッド呼び出し : " + StaticSample.staticMethod());
		// オブジェクトからのstatic呼び出しもできる(非推奨なので警告は出る)
		StaticSample sS1 = new StaticSample();
		System.out.println("インスタンス化してstatic変数呼び出し : " + sS1.staticInt);
		System.out.println("インスタンス化してstaticメソッド呼び出し : " + sS1.staticMethod());
		// インスタンス変数、メソッドはインスタンス化しないと使用できない。
//		 System.out.println("インスタンス化せずにインスタンス変数呼び出し : " + StaticSample.dynamicInt);
//		 System.out.println("インスタンス化せずにインスタンスメソッド呼び出し : " + StaticSample.dynamicMethod());
		System.out.println("その行でだけインスタンス化してインスタンス変数呼び出し : " + new StaticSample().dynamicInt);

		// staticの値は共有される。
		StaticSample sS2 = new StaticSample();
		// sS1オブジェクトの数値を加算
		sS1.staticInt += 1;
		// sS2オブジェクトから表示
		System.out.println("staticの値は共有される : " + sS2.staticInt);
		
		StringBuilder sb = new StringBuilder("aaabbbccc");
		System.out.println(sb.delete(2, 4));

		// カプセル化
		EmployeeInfo1 e6 = new EmployeeInfo1();
		EmployeeInfo1 e7 = new EmployeeInfo1();
		EmployeeInfo1 e8 = new EmployeeInfo1();
		EmployeeInfo1 e9 = new EmployeeInfo1();
		EmployeeInfo1 e10 = new EmployeeInfo1();
		// 直接アクセス
//		e6.id = 10;
//		System.out.println(e6.id);
//		e7.id = 11;
//		System.out.println(e7.id);
//		e8.id = 12;
//		System.out.println(e8.id);
//		e9.id = 13;
//		System.out.println(e9.id);
//		e10.id = 14;
//		System.out.println(e10.id);
		
		// メソッドでアクセス
		e6.setId(99);
		System.out.println(e6.getId());
		e7.setId(98);
		System.out.println(e7.getId());
		e8.setId(97);
		System.out.println(e8.getId());
		e9.setId(96);
		System.out.println(e9.getId());
		e10.setId(95);
		System.out.println(e10.getId());
		
		
		e6.setUserNm("namae");
		e6.setMailAddress("AAA");
		
		e7.mailAddress =("bbb");
		
		System.out.println(e6.getMailAddress());
		System.out.println(e7.mailAddress);
		
		
	}
}