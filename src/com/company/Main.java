package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 255; i++) {
            String result = "";
            if (i % 3 == 0) {
                result = result + "Fizz";
            }
            if (i % 13 == 0) {
                result = result + "Fezz";
            }
            if (i % 5 == 0) {
                result = result + "Buzz";
            }
            if (i % 7 == 0) {
                result = result + "Bang";
            }
            if (i % 11 == 0) {
                if (result.contains("Fezz")){
                    result="FezzBong";
                }else {
                    result = "Bong";
                }
            }
            if(i % 17 ==0){
                int rlen= result.length()/4;
                String tempresult="";
                for(int j=rlen;j>0;j--){
                    int key = 4*j;
                    tempresult=tempresult+result.substring(key-4,key);
                }
                result=tempresult;
            }

            if (result.equals("")) {
                result = String.valueOf(i);
            }
            System.out.println(result);
        }
    }
}
