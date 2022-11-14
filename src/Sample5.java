public class Sample5 {
    public static void main(String[] args) {
        // 変数宣言
        int i;
        // 変数は初期化して使わないとエラーになる
        // System.out.println(i);
        i = 10;
        int j = 100;
        int k = 200, l = 300;
        // System.out.println("加算 : " + (i + j + k + l));
        
        // 定数
        final double tax = 0.1;
        // System.out.println(tax);
        // 定数の再代入はエラーになる。
        // tax = 0.05;

        // 変数はスコープ外で使用しようとするとエラーになる
        if (true) {
            int scope = 1;
        }
        // System.out.println(scope);

        // 2進数(5)
        byte b = 0b101;
        // 8進数(37)
        short s = 045;
        // 16進数(12)
        int i2 = 0xc;
        // Lをつける
        long l2 = 1234567891011121314L;
        // Fをつける
        float f = 0.1234567F;
        double d = 5.5;
        // N進数はsysoutでは10進数で表示される。
        // System.out.println("byte b :" + b);
        // System.out.println("short s :" + s);
        // System.out.println("int i2 :" + i2);
        // System.out.println("long l2 : "+l2);
        // System.out.println("float f : " + f);
        // System.out.println("double d : " + d);

        // キャストしないで代入するとエラーになる
        //i2 = l2;
        // longをintにキャスト
        i2 = (int)l2;
        // System.out.println("キャストして値が変わる : " + i2);

        // charは数値を入れると対応したコードの文字となる(M)
        char c = 77;
        // System.out.println("char c : " + c);
        // unicodeも入る(あ)
        char c2 = '\u3042';
        // System.out.println("char c2 : " + c2);

        // booleanはtrueかfalseしか入らない
        boolean flg = false;
        // System.out.println("boolean flg : " + flg);

        // Stringは参照型
        String str = "aaa";
        System.out.println("String s : " + str);

        //基本データ型にnullを入れるとエラーになる
        // int primitive = null;

        // エスケープ
        System.out.println("エスケープでダブルクォーテーションを表示 : \"\"");

        var v = "varを文字列に";
        System.out.println(v);
        // 最初の型(文字列)と違う型(数値)を入れるとエラーになる。
        // var = i;
        // 初期化せずに宣言できない
        // var v2;
    }
  }