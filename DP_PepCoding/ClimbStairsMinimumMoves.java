package com.company.DP_PepCoding;

import java.util.Scanner;

public class ClimbStairsMinimumMoves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        Integer[] dp = new Integer[n + 1];
        dp[n] = 1;
        for(int i=n-1;i>=0;i--) {
            if(a[i]>0){
                int min=Integer.MAX_VALUE;
                for (int j = 0; j < a[i]&&i+j<dp.length; j++) {
                    if(dp[i+j]!=null)
                    min=Math.min(min,dp[i+j]);
                }
                if(min!=Integer.MAX_VALUE)
                dp[i]=1+min;
                else dp[i]=null;
            }
        }
        System.out.println(dp[0]);
    }
}
