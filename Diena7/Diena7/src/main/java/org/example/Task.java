package org.example;

public class Task {

    public static double task1(double [] arr){
        double answ = 0;
        

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > answ){
                answ-=answ;
                answ+= arr[i];
            }else if(arr[i] > answ){

            }
        }
        return answ;
    }





}

