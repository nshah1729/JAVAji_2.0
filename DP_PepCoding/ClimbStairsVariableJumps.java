package com.company.DP_PepCoding;

import java.util.Scanner;

public class ClimbStairsVariableJumps {
    public static void main(String[] args) {
        int n=10;

        int ans=countPathsDPTab(n);
        System.out.println(ans);

//        int ans1= countPathsDPTab(n);
//        System.out.println(ans1);
    }


//    private static int countPathsDPTab(int n) {
//        int[] dp=new int[n+1];
//        dp[n]=1;
//        int[] cho={3 ,0, 2, 1, 2, 4, 2, 0,1,2};
//        for (int i = n-1; i >=0; i--) {
//            for (int j = 0; j <=cho[i]&&(i+j)<dp.length ; j++) {
//                dp[i]+=dp[i+j];
//            }
//        }
//        return dp[0];
//    }
    private static int countPathsDPTab(int n) {
        int[] dp=new int[n+1];
        dp[n]=1;

        int[] a={3 ,0, 2, 1, 2, 4, 2, 0,0};
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= a[i] && (i + j) < dp.length ; j++) {
                dp[i] += dp[i + j];
            }
        }
        return dp[0];
    }
}
