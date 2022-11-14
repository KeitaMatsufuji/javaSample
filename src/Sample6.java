import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Sample6 {
    public static void main(String[] args) {
        // 配列を宣言
        int[] iArray1;
        // 初期化して使わないとエラーになる
        // iArray1[0] = 1;
        // 初期化
        iArray1 = new int[5];
        // intの初期値は0
        System.out.println("int配列初期値 : " + iArray1[0]);
        
        // 初期化と宣言を同時に([]は変数名の側につけてもいい)
        String sArray[] = new String[3];
        // String(参照型)配列の初期値はnull
        System.out.println("String配列初期値 : " + sArray[0]);
        
        // 要素格納(インデックスは0スタート)
        iArray1[0] = 2;
        iArray1[1] = 4;
        iArray1[2] = 6;
        iArray1[3] = 8;
        iArray1[4] = 10;
        // 要素を表示
        System.out.println("インデックス3 : " +iArray1[3]);
        // 長さ
        System.out.println("配列の長さ : " + iArray1.length);
        // 無いインデックスを指定するとエラーになる
        // System.out.println(iArray1[6]);
        
        // 要素数4で初期化と宣言と代入もやる
        String sArray2[] = {"a","b","c","d"};

        // 多次元配列
        int arrayInArray[][] = {{0,1,2}, {3,4,5}};
        // 要素にアクセス
        System.out.println("多次元配列 : " + arrayInArray[1][1]);

        // sysoutで配列を指定しても中身は出ない(ハッシュコード)
        System.out.println("ハッシュコード : " + iArray1);

        // リスト
        List<Integer> integerList = new ArrayList<>();
        // 値追加
        integerList.add(99);
        integerList.add(98);
        integerList.add(97);
        integerList.add(96);
        // 値代入(上書き)
        integerList.add(3, 9);
        // 大きさ
        // System.out.println("リストのサイズ " + integerList.size());
        // 要素取得
        // System.out.println("インデックス3 : " +integerList.get(3));
        // リストはsysoutするとカンマ区切りで表示できる
        // System.out.println("リストの中身一覧表示 : " + integerList);
        // 無いインデックスを指定した場合実行時エラー
        // System.out.println(integerList.get(100));
        
        // 連想配列
        Map<String, String> map = new HashMap<>();
        map.put("userNm", "松藤");
        map.put("userCd", "Matsufuji");
        map.put("emailAddress", "k1-matsufuji@ask-planning.co.jp");
        // 要素取得
        // System.out.println("松藤のメールアドレス : " + map.get("emailAddress"));
        System.out.println(map);

        // コマンドライン引数
        // System.out.println("コマンドライン引数配列 : " + args.length);
        // if (args.length > 1)
        // System.out.println("コマンドライン引数 : " + args[1]);

        List<Integer> integerList2 = new ArrayList<>();
        // 配列の繰り返し
        for (int i = 0 ; i < iArray1.length; i++) {
            // System.out.println("配列のインデックスiを繰り返し表示 : " + iArray1[i]);
            integerList2.add(iArray1[i]);
        }

        //　リストの繰り返し
        for (int i = 0 ; i < integerList2.size(); i++) {
            // System.out.println("リストのインデックスiを繰り返し表示 : " + integerList2.get(i));
        }

        for (int loopI : integerList2) {
            // System.out.println("配列の要素すべてを繰り返し表示 : " + loopI);
        }

        // 拡張for文
        int outsideI = 0;
        for (String loopString : sArray2) {
            System.out.println("配列の要素すべてを繰り返し表示 : " + loopString);
            outsideI++;
            System.out.println("インデックス : " + outsideI);
        }

        // 連想配列の拡張for文
        for (Map.Entry<String, String> loopMap : map.entrySet()) {
            System.out.println(loopMap.getKey() + " : " + loopMap.getValue());
        }
        
        // break
        int[] iBCArray = {10,20,30,40,50};
        loopa : for (int i = 0; i < iBCArray.length; i++) {
            // ln無しでprintだけだと改行しない
            System.out.print(iBCArray[i]);
            if (i > 1) {
                // loopaを終わる
                break loopa;
            }
            System.out.print(",");
        }
        System.out.println("");

        // continue
        int[] iBCArray2 = {10,20,30,40,50};
        for (int i = 0; i < iBCArray2.length; i++) {
            System.out.print(iBCArray2[i]);
            if (i > 1) {
                // 残りを実行せずに次の周回に進む
                continue;
            }
            System.out.print(",");
        }
        System.out.println("");

    }
}
