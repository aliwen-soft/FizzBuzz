package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> arrayargs=Arrays.asList(args);

        System.out.println("Max number?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            String result = "";
            if (i % 3 == 0 && arrayargs.contains("3")) {
                result = result + "Fizz";
            }
            if (i % 13 == 0 && arrayargs.contains("13")) {
                result = result + "Fezz";
            }
            if (i % 5 == 0 && arrayargs.contains("5")) {
                result = result + "Buzz";
            }
            if (i % 7 == 0 && arrayargs.contains("7")) {
                result = result + "Bang";
            }
            if (i % 11 == 0 && arrayargs.contains("11")) {
                if (result.contains("Fezz")){
                    result="FezzBong";
                }else {
                    result = "Bong";
                }
            }
            if(i % 17 ==0 && arrayargs.contains("17")){
                result=buzzreverse(result);
            }

            if (result.equals("")) {
                result = String.valueOf(i);
            }
            System.out.println(result);
        }
    }
    public static String buzzreverse(String string){
        int rlen= string.length()/4;
        String tempresult="";
        for(int j=rlen;j>0;j--){
            int key = 4*j;
            tempresult=tempresult+string.substring(key-4,key);
        }
        return tempresult;
    }
}
