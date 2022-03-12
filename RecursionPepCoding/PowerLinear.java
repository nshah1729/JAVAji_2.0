package com.company.RecursionPepCoding;

import java.util.Scanner;

public class PowerLinear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x: ");
        int x= sc.nextInt();
        System.out.print("Enter n: ");
        int n= sc.nextInt();
        System.out.println(pL(x,n));
    }

    private static int pL(int x, int n) {
        if(n==0)return 1;
        return x*pL(x,n-1);
    }
}
