public class Ex5 {
    public static void main(String[] args) {
        String a = "sample";
        String b = "sample";
        System.out.println((a == b) + ", " + (a.equals(b)));

        String str = "abcde";
        // System.out.println(str.charAt(5));

        String str2 = "hoge, world.";
        hello(str2);
        System.out.println(str2);

        StringBuffer sb1 = new StringBuffer("hello");
        sb1.append(" world.");
        System.out.println(sb1);
    }

    private static void hello(String msg) {
        msg.replaceAll("hoge", "hello");
    }
    
}
