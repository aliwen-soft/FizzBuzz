package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Max number?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<String> arrayargs=Arrays.asList(args);

        FizzBuzzStream.create(arrayargs).limit(n+1).forEach(System.out::println);

    }

}