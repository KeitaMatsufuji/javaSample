import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Ex3 {
  public static void main(String[] args) {
    int[] a;
    int b[];
    int[][] c;
    int d[][];
    int[] e[];
    int[][] f[];
    int[] g[][][];

    String[] array = new String[3];
    array[1] = "10";
    array[2] = "20";
    // array[3] = "30";
    // System.out.println(array[1] + array[2] + array[3]);

    ArrayList<String> words = new ArrayList<String>();
    words.add("Good");
    words.add(" mornig");
        
    // for(int word : words) {
    //     System.out.print(word);
    // }

    ArrayList<Integer> al = new ArrayList<>();
    for(int i = 1; i <= 3; i++) {
        al.add(i);
    }
    System.out.println(al.get(1));

    int total = 0;
    a : for (int i = 0; i < 5; i++) {
      b : for(int j = 0; j < 5; j++) {
        if (i % 2 == 0) continue a;
        if (3 < j) break b;
        total += j;
        System.out.println("iは" + i + ",jは"+ j + ",合計で"+ total);
      }
    }
    System.out.println(total);

  }
}
