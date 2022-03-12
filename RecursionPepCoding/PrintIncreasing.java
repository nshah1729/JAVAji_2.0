package com.company.RecursionPepCoding;

import java.util.Scanner;

public class PrintIncreasing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter n: ");
//        int n= sc.nextInt();
        printIncreasing(5);
    }
    public static void printIncreasing(int x){
        if(x==0){
            return;
        }
//        System.out.println(x);
        printIncreasing(x-1);
        System.out.println(x);
    }
}
