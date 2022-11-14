package training.java3;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import training.java3.test.Sub2;
import training.java3.test.Super3;

public class Sample3 extends Super3 {
	public static void main(String[] args) throws IOException {
		// サブクラスをインスタンス化
		SalesInfo salesInfo = new SalesInfo();
		// EmployeeInfo salesInfo2 = new SalesInfo();
		salesInfo.setUserCd("Morita");
//		System.out.println(salesInfo.getMailAddress());
//		System.out.println(salesInfo.getInvoice());
		
		SalesLeaderInfo sli = new SalesLeaderInfo();
		sli.setUserCd("Okubo");
		
//		System.out.println(sli.getClass());
//		System.out.println(sli.toString());

		Sub1 sub = new Sub1();
		//sub.print(); // サブクラスが呼ばれる
		sub.print2();

		Sub1 sub2 = new Sub1(100);
		
		
		
		// protected確認
		Sub2 sub2Obj = new Sub2();
		System.out.println(sub2Obj.getProtectedTest());
		
		Super3 s3 = new Super3();
		// System.out.println(s3.test2);
		
		// static
		System.out.println(Super3.test);
		
		
		// コンストラクタ呼び出し
		System.out.println("----------------コンストラクタ呼び出し----------------");
		Sub1 sub1 = new Sub1(100);
		System.out.println("----------------コンストラクタ呼び出し完了----------------");

		C c = new C();
		System.out.println(c.getA());
		
		
		System.out.println("----------------型互換呼び出し----------------");
		AA aa = new BB();
		// aa.subprint();
		BB bb = (BB) aa;
		bb.subPrint();
		
		// BB b2 = (BB) new AA();
		// b2.subPrint();
		System.out.println("----------------型互換呼び出し完了----------------");
		

		System.out.println("----------------ポリモーフィズム----------------");
		// 別のクラスでも同じ型の配列に入れられる
		List<SampleInterface> siList = new ArrayList<>() {
			{
				add(new PoliA());
				add(new PoliB());
				add(new PoliC());
			}
		};
		// 同じ型なのでループで回せる								
		for (SampleInterface si : siList) {
			// 各々でオーバーライドされたメソッドが呼ばれる
			si.print();
			System.out.println(si.calc(4, 10));
		}
		
		// PoliDが出てきたときに全部直す(修正5)
		PoliC poliC = new PoliC();
		poliC.print();
		System.out.println(poliC.calc(10, 20));
		
		// PoliDが出てきてきてもnew以下の部分を直すだけでいい(修正1)
		SampleInterface sI = new PoliC();
		sI.print();
		System.out.println(sI.calc(10, 20));
		
		
		// こう書くと修正0
		SampleInterface sIDI = new Factory().manufactureInstance();
		System.out.println(sIDI.calc(10, 20));
		sIDI.print();
		
		ArrayList<String> list = new ArrayList<>();
		CopyOnWriteArrayList<String> list2 = new CopyOnWriteArrayList<>();
		
		List<String> list3 = new ArrayList<>();
		List<String> list4 = new CopyOnWriteArrayList<>();
		
		System.out.println("----------------ポリモーフィズム----------------");
		
		try {
			String[] arr = {"A","B"};
			// System.out.println(arr[2]);
			//loop();
			// throw new StackOverflowError();
			throw new SQLException();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("そんなインデックス無いよ");
		} catch (StackOverflowError e) {
			System.out.println("無限ループしてるよ");
		} catch (Exception e) {
			System.out.println("とにかく例外起きたよ");
		} finally {
			System.out.println("何が起ころうと呼び出されるよ");
		}
		
		
		try {
			throw new StackOverflowError();
		} catch (StackOverflowError e) {}
		System.out.println("エラーなんて無かった");
		
		List<String> sList = new ArrayList<>() {
			{
				add("A");
				add("B");
				add("C");
			}
		};
		// System.out.println(sList.get(3));
		
		try {
			DBAccess db = new DBAccess();
			db.Insert();
			db.update();
		} catch (SQLException e) {
			System.out.println("SQL Exception発生");
		}catch (Exception e) {
			System.out.println("Exception発生");
		}
		
		
		// 通常
		ConsumerImpl<String> ci = new ConsumerImpl<>();
		ci.accept("aaa");
		
		// ラムダ式(通常)
		Consumer<String> lamda = (var x) -> {System.out.println(x);};
		lamda = x -> System.out.println(x);
		// ラムダ式(メソッド参照)
		Consumer<String> lamda2 = System.out::println;
		
		lamda.accept("ラムダ式実行");
		lamda2.accept("ラムダ式実行２");
		
		// Function
		Function<String, Integer> f1 = (var x) -> {return x.length();};
		f1 = x -> x.length();
		System.out.println(f1.apply("文字列"));
		
		// UnaryOperator(引数と戻り値の型が同じでいいならこっち)
		UnaryOperator<Integer> u1 = x -> x + 10;
		System.out.println(u1.apply(1));
		
		// Supplier
		Supplier<String> s1 = () -> "Supplier";
		System.out.println(s1.get());
		
		// Predicate
		Predicate<Integer> p1 = i -> i > 100;
		System.out.println(p1.test(99));
		
		// リストをラムダ式でループする
		List<String> listX = List.of("a","b","c","d");
		for (String str : listX) {
			System.out.println(str.toUpperCase());
		}
		listX.forEach(x -> System.out.println(x.toUpperCase()));
		listX.forEach(System.out::println);
	}
	
	public static void loop () {
		loop();
	}
	
	public void protectedTest() {
		System.out.println(test2);
		Super3 super3 = new Super3();
		// System.out.println(super3.test2);
		Sample3 s3 = new Sample3();
		System.out.println(s3.test2);
	}
	
}