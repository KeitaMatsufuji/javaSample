public class Sample7 {
    public static void main(String[] args) {
        int clc = add(2, 3);
        // System.out.println("計算結果 : " + clc);
        // voidなので変数で受けない
        returnErr(2);

        clc = add(2);
        // System.out.println("計算結果 : " + clc);
        
        // オーバーロード
        String result;
        // intは小数に変換できるがどちらをfloatにしてどちらをdoubleにすればいいのか判断不能なのであいまいエラーになる。
        // result = overRoadTest(1, 2);
        // 引数を明白にすれば呼べる
        result = overRoadTest(0.1f, 0.3);
        // System.out.println("呼び出したメソッドは : " + result);
        // System.out.println(overRoadTest2(1,1));
        long longNum = 4;
        // System.out.println(overRoadTest2(4,longNum));
        // System.out.println(overRoadTest2(4L,4));
        
        // 可変長引数
        clc = add(1,2,3,4,5,6);
        // System.out.println("計算結果 : " + clc);
        
        // voidなのに値を返そうとするとエラーになる。
        // return clc;
    }

    static int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
    
    static void returnErr(int i){
        if (i > 1) {
            System.out.println("分岐");
            return;
        }
        System.out.println(i);
        return;
        // System.out.println(i); // ここは絶対到達できないのでエラーとなる
    }

    static int add(int num1) {
        System.out.println("引数int");
        int result = num1 + 100;
        return result;
    }

    static int add(long num1) {
        System.out.println("引数long");
        int result = (int)num1 + 100;
        return result;
    }

    static String overRoadTest(double d, float f) {
        return "double float";
    }

    static String overRoadTest(float f, double d) {
        return "float double";
    }

    static String overRoadTest2(int i, long l) {
        return "int long";
    }

    static String overRoadTest2(long l, int i) {
        return "long int";
    }

    static int add(int numFirst, int... nums) {
        for (int loopI : nums) {
           numFirst += loopI;
        }
        return numFirst;
    }
    
    
}