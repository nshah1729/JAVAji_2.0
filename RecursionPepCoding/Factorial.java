package com.company.RecursionPepCoding;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= sc.nextInt();
        System.out.println(fac(n));
    }

    private static int fac(int n) {
        //Base Case
        if(n==0)return 1;
        return n*fac(n-1);
    }

}
