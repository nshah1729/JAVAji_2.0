package com.company.RecursionPepCoding;

import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        pzz(n);
    }

    private static void pzz(int n) {
        if(n==0)return;
        System.out.println("pre "+n);
        pzz(n-1);
        System.out.println("in "+n);
        pzz(n-1);
        System.out.println("post "+n);
    }

}
