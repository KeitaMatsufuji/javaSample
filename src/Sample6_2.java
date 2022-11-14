import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Sample6_2 {
    public static void main(String[] args) {
        // コマンドライン引数
        System.out.println(args.length);
        if (args.length > 1) {
            System.out.println(args[1]);
        }
    }
}
