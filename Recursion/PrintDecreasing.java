package com.company.Recursion;

import java.util.Scanner;

public class PrintDecreasing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        printDecreasing(n);
    }

    private static void printDecreasing(int n) {
        //Base Case
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
}
