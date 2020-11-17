package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i=1; i<=100;i++) {
            String result="";

            if(i%3 ==0) {
                result = result + "Fizz";
            }
            if (i%5==0){
                result= result+"Buzz";
            }
            if (result==""){
                result= String.valueOf(i);
            }
            System.out.println(result);
        }

    }
}
