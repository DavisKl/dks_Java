import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String a = "aaaa";
//        String b = "bbbb";
//        String c = "cccc";
//        task1(a, b, c);
//        task2("aaa", "bbb", "ccc");

//        homework1(10);
        int sum = task3(4);
        System.out.println(sum);


//        int result = sampleWithReturn();
//        System.out.println(result);



    }

    public static int task3(int count){
        if(count < 1){
            System.out.println("Kļūda");
            return 0;
        }

        int sum = 0;

        for(int i = 1; i <= count; i++){
            sum = sum + i;
        }

        return sum;
        }
    }
    public static int sampleWithReturn(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi skaitli");
        int a = sc.nextInt();

        System.out.println("Ievadi skaitli");
        int b = sc.nextInt();

        int c = a + b;

        return c;
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

    }

}