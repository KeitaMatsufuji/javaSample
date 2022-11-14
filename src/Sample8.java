

import java.util.ArrayList;
import java.util.List;

public class Sample8 {
    public static void main(String[] args) {
        // Integer integer = new Integer(1); 
        // Integer integer2 = Integer.valueOf(1); 

        // 参照型比較(String)
        String sIns = "instance";
        String sIns2 = "instance";
        String newIns = new String("instance");
        System.out.println("sIns == sIns2 : " + (sIns == sIns2));
        System.out.println("sIns == newIns : " + (sIns == newIns));

        // シャローコピー
        int[] iArray = {10,11};
        int[] iArray2 = {10,11};
        System.out.println("iArray2 == iArray(同値) : " + (iArray == iArray2));
        iArray[0] = 20;
        for (int j : iArray) {
            System.out.println("iArray2 == iArrayがfalseのときのiArray: " + j);
        }
        for (int k : iArray2) {
            System.out.println("iArray2 == iArrayがfalseのときのiArray2: " + k);
        }
        System.out.println("iArray2 == iArray(中身の比較は同一) : " + (iArray.length == iArray2.length));
        // 代入により参照が同じになり同一となる
        iArray2 = iArray;
        System.out.println("iArray2 == iArray(同一) : " + (iArray == iArray2));
        iArray2[1] = 21;
        for (int j : iArray) {
            System.out.println("iArray2 == iArrayがtrueのときのiArray: " + j);
        }
        for (int k : iArray2) {
            System.out.println("iArray2 == iArrayがtrueのときのiArray2: " + k);
        }

        // ディープコピー
        List<Integer> arrCopyFrom = new ArrayList<>(){
            {   add(2);
                add(4);
                add(8);
                add(16);
            }
        };
        List<Integer> arrCopyTo = new ArrayList<>();
        // 繰り返し処理でコピー元から値を1つずつ取り出して詰めなおす。
        for (int loopInt : arrCopyFrom) {
            arrCopyTo.add(loopInt);
        }
        for (int loopInt : arrCopyTo) {
            System.out.println("コピー先 : " + loopInt);
        }
        System.out.println("arrCopyFrom == arrCopyTo(同一ではない) : " + (arrCopyFrom == arrCopyTo));

        String sEmpty = "";    // 空文字を格納した変数
        String sNull = null;  // nullを格納した変数
        System.out.println(sEmpty.length()); // 0
        // System.out.println(sNull.length()); // ぬるぽ

        String str1 = "あいうえお"; 
        String str2 = "あいうえお"; // 別々にnewしているが同じ文字列は同じ参照
        System.out.println("str1 == str2 : " + (str1 == str2));
        str1 = "かきくけこ"; // 勝手にnewをしているので”あいうえお”のオブジェクトは不変
        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);
        String str3 = new String("あいうえお"); //　わざわざnewと書いてあるので別のオブジェクトを作る
        System.out.println("str2 == str3 : " + (str2 == str3));

        // 参照とは関係なく文字列の値が同じかを見たい場合はStringクラスのequalsメソッドを使う
        System.out.println("equalsで比較 : " + ("あいうえお".equals(str3)));

        String str4 = "CON";
        /*str4 = */str4.concat("CAT");
        System.out.println(str4);

        StringBuilder sb = new StringBuilder("aaabbbccc");
        sb.append("ddd"); // 末尾に文字列を追加するメソッド(オブジェクト(インスタンス)を直接書き換えているので変数で受けなくてもよい)
        System.out.println(sb); // aaabbbcccddd


    }
}
