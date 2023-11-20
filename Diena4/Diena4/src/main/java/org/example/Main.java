public class Main {
    public static void main(String[] args) {
        String a = "aaaa";
        String b = "bbbb";
        String c = "cccc";
        task1(a, b, c);
        task2("aaa", "bbb", "ccc");

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
}