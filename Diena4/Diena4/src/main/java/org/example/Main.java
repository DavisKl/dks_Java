public class Main {
    public static void main(String[] args) {
//        String a = "aaaa";
//        String b = "bbbb";
//        String c = "cccc";
//        task1(a, b, c);
//        task2("aaa", "bbb", "ccc");

        homework1(10);

    }
    public static void task1(String a, String b, String c){
        System.out.println(c+b+a);
    }
    public static void task2 (String d, String e, String f){
        int len = d.length() + e.length() + f.length();
        if(len > 15){
            System.out.println(d + f);
        }else {
            System.out.println(f + e + d);
        }

    }
    public static void homework1(int a) {
        String symbol = "";
        for (int i = 0; i < a; i++) {
            symbol = symbol + "$";
            System.out.println(symbol);
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("$");
            }
            System.out.println();
        }
    }

}