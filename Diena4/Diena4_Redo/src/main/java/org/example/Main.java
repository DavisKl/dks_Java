package org.example;

public class Main {
    public static void main(String[] args) {

        task2b(-10);

        task2(10);

        task1("aaaaaa", "bbbbb", "ccccc");

        sampleWithParams(3, 3);
        sampleWithParams(99, -15);

        anotherSampleWithSample("Parametrs");

        String c = "aeaadadafasfafdfd";
        anotherSampleWithSample(c);

        c = "wqdqdq";
        anotherSampleWithSample(c);

    }
    public static void task2b(int count){
        String a = "";

        for(int i = 0; i < count; i++){
            a = a + "$";
            if(count < 1){
                a = "$";
            }
            System.out.println(a);
        }

    }

    public static void task2(int count){
        String a = "";

        if(count >= 1){
            for(int i = 0; i < count; i++){
                a = a + "$";
                System.out.println(a);
            }

            }else {
            System.out.println("$");
        }
    }


    public static void task1(String a, String b, String c){

        if(a.length() + b.length() + c.length() > 15){
            System.out.println(a + c);
        }else{
            System.out.println(c + a + b);
        }

    }
    public static void anotherSampleWithSample(String a){
        System.out.println(a);

    }
    public static void sampleWithParams(int a, int b){
        System.out.println("Summa ir: ");
        System.out.println(a+b);
    }


}