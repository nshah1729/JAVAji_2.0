package com.company.BinarySearch;

import java.util.Scanner;

public class StriverBS {
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
        int[] b={1,2,3,4,5};
        int[] c={3,4,5,1,2};
        int[] d={2,2,2,0,1};
        int[] e={11,13,15,17};

//        System.out.println(minimumInRotatedArray(b));
        System.out.println(maxSum(b,15));
    }

    private static int bS(int[] a,int t) {
        int s=0,e=a.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(a[m]==t)e=m-1;
            else if(a[m]>t)e=m-1;
            else s=m+1;
        }
        return s;
    }   //1

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
    }  //2

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
    }  //3

    private static int BSRecursive(int[] a,int s,int e,int t) {
            if(s>e)return -1;

            int m=s+(e-s)/2;
            if(a[m]==t)return m;
            else if(a[m]>t) return BSRecursive(a,s,m-1,t);
            else return BSRecursive(a,m+1,e,t);
    }  //4

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
    }  //5

    private static int sq(int n){
        int s=1;
        int e=(int)(Math.sqrt(n));
        while(s<=e){
            int m=s+(e-s)/2;
            int square=m*m;
            if(square==n)return m;
            else if(square>n)e=m-1;
            else s=m+1;
        }
        return e;
    } //6

    private static int cb(int n){  //7
        int s=1;
        int e=n;
        while(s<=e){
            int m=s+(e-s)/2;
            int cube=m*m*m;
            if(cube==n)return m;
            else if(cube>n)e=m-1;
            else s=m+1;
        }
        return e;
    } //7

    private static int minimumInRotatedArray(int[] a){
        int s=0,e=a.length-1;
        while(s<e){
            int m=s+(e-s)/2;
            if(a[m]<a[e])e=m;
            else s=m+1;
        }
        return a[s];
    } //8

    private static int maxSum(int[] a,int t){
        boolean ansPoss=false;
        int ans=-1;
        int s=1,e=a.length;
        while(s<=e){
            int m=s+(e-s)/2;
            if(slideWindow(a,m,t)){
                ans=m;
                ansPoss=true;
                if(m==a.length)break;
                e=m;
            }else{
                s=m+1;
            }
        }
        return ansPoss?ans:0;
    }

    private static boolean slideWindow(int[] a, int k, int t) {
        int sum=0;
        for(int i=0;i<k;i++)sum+=a[i];
        int maxSum=sum;
        int l=0,r=k;
        while(r!=a.length){
            sum-=a[l];
            l++;
            sum+=a[r];
            r++;
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum>=t;
    }
}
//[3,4,5,1,2]
//[4,5,6,7,0,1,2]
//[11,13,15,17]