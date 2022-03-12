package com.company.RecursionPepCoding;

import java.util.Scanner;

public class CalculatePowerUsingLogarithmicTC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x: ");
        int x= sc.nextInt();
        System.out.print("Enter n: ");
        int n= sc.nextInt();
        System.out.println(pLTC(x,n));
    }

    private static int pLTC(int x, int n) {
        if(n==0)return 1;
        int xpn2=pLTC(x,n/2);
        int ans=xpn2*xpn2;
        if(n%2==1)ans*=x;
        return ans;
    }
}
