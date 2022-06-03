package com.company.DP_PepCoding;

import java.util.Scanner;

public class MinimumCostPath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[][] a=new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        int[][] dp=new int[n][m];
        //Tabulation:
        for (int i = n-1; i >=0; i--) {
            for (int j = m-1; j >=0; j--) {
                if(i==n-1&&j==m-1)dp[i][j]=a[i][j];//Last Element
                //Last Row
                else if(i==n-1){
                    dp[i][j]=a[i][j]+a[i][j+1];
                }//Last Column
                else if(j==m-1){
                    dp[i][j]=a[i][j]+a[i+1][j];
                }//All other Elements
                else{
                    dp[i][j]=a[i][j]+Math.min(a[i][j+1],a[i+1][j]);
                }
            }
        }
        System.out.println(dp[0][0]);
    }
}
