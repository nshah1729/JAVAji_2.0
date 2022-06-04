package com.company.DP_PepCoding;

import java.util.Scanner;

public class MinimumCostPath {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//        int m= sc.nextInt();
//        int[][] a=new int[n][m];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                a[i][j]=sc.nextInt();
//            }
//        }
//        int[][] dp=new int[n][m];
//        //Tabulation:
//        for (int i = n-1; i >=0; i--) {
//            for (int j = m-1; j >=0; j--) {
//                if(i==n-1&&j==m-1)dp[i][j]=a[i][j];//Last Element
//                //Last Row
//                else if(i==n-1){
//                    dp[i][j]=a[i][j]+a[i][j+1];
//                }//Last Column
//                else if(j==m-1){
//                    dp[i][j]=a[i][j]+a[i+1][j];
//                }//All other Elements
//                else{
//                    dp[i][j]=a[i][j]+Math.min(a[i][j+1],a[i+1][j]);
//                }
//            }
//        }
//        System.out.println(dp[0][0]);
        Scanner sc=new Scanner(System.in);
        int[] a={1,2,2,2,2,2,2,2,2,3,4,6,6,9};
//        System.out.println(CeilValue(a,10));
//        System.out.println(BSRecursive(a,0,a.length-1,31));
        int firstO=firBS(a,2);
        int lastO=lastBS(a,2);
        System.out.println(lastO-firstO+1);
    }

    private static int fir(int[] a,int t) {
        int s=0,e=a.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(a[m]==t)e=m-1;
            else if(a[m]>t)e=m-1;
            else s=m+1;
        }
        return s;
    }

    private static int firBS(int[] a,int t) {
        int ans=-1;
        int s=0,e=a.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(a[m]==t){
                ans=m;
                e=m-1;
            }
            else if(a[m]>t)e=m-1;
            else s=m+1;
        }
        return ans;
    }


    private static int lastBS(int[] a,int t) {
        int ans=-1;
        int s=0,e=a.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(a[m]==t){
                ans=m;
                s=m+1;
            }
            else if(a[m]>t)e=m-1;
            else s=m+1;
        }
        return e;
    }

    private static int BSRecursive(int[] a,int s,int e,int t) {
            if(s>e)return -1;

            int m=s+(e-s)/2;
            if(a[m]==t)return m;
            else if(a[m]>t) return BSRecursive(a,s,m-1,t);
            else return BSRecursive(a,m+1,e,t);
    }

    private static int CeilValue(int[] a,int t) {
        if(t>a[a.length-1])return -1;
        int s=0,e=a.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(a[m]==t)e=m-1;
            else if(a[m]>t)e=m-1;
            else s=m+1;
        }
        return a[s];
    }

}
