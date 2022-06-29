package com.company.DP_PepCodings;

public class Fibonacci {
    public static void main(String[] args) {
        int n=30;
        int ans=fiboDP(n,new int[n+1]);
//        int ans1=fibo(30);
        System.out.println(ans);
//        System.out.println(ans1);
    }


    //POOR CODE W/O DP
    private static int fibo(int n) {
        if(n==1||n==0)return n;
        System.out.println("Hello "+n);
        return fibo(n-1)+fibo(n-2);
    }


    //REFACTORED CODE USING DP
    private static int fiboDP(int n, int[] dp) {

        if(n==1||n==0)return n;
        if(dp[n]!=0)return dp[n];
        System.out.println("Hello "+n);
        int fibnm1=fiboDP(n-1,dp);
        int fibnm2=fiboDP(n-2,dp);

        dp[n]=fibnm1+fibnm2;

        return fibnm1+fibnm2;
    }
}
