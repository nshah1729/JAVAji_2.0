package com.company.RecursionPepCoding;

import java.util.Scanner;

public class PDI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter n: ");
//        int n= sc.nextInt();
        printDI(5);
    }

    private static void printDI(int i) {
        if(i==0)return;
        System.out.println(i);
        printDI(i-1);
        System.out.println(i);
    }
}
