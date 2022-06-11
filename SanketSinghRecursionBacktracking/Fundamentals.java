package com.company.SanketSinghRecursionBacktracking;

public class Fundamentals {
    public static void main(String[] args) {
        int[] a={3,2,1};
        int[] b={1,2,3,4,5,6,7,9};
        System.out.println(sor(a,0));
        System.out.println(sor(b,0));
    }
    public static long fid(int a,int b){
        if(b==0) return 1;
        return a*fid(a,b-1);
    }
    public static long fidk(int a,int b){
        if(b==0) return 1;
        long temp=fidk(a,b/2);
        if(b%2==0){
            return temp*temp;
        }else{
            return a*temp*temp;
        }
    }
    public static long fidkA(int a,int b){
        if(b==0) return 1;
        return b%2==0?fidkA(a,b/2)*fidkA(a,b/2):a*fidkA(a,b/2)*fidkA(a,b/2);
    }

    public static void pat(int n,int i){
        if(n==0)return;
        if(i<n){
            System.out.print("* ");
            pat(n,i+1);
        }else{
            System.out.println();
            pat(n-1,0);
        }
    }
    public static void pat1(int n,int i){
        if(n==0)return;
        if(i<n){
            System.out.print("* ");
            pat1(n,i+1);
        }else{
            System.out.println();
            pat1(n-1,0);
        }
    }

    public static boolean sor(int[] a,int i){
        if(i==a.length-1)return true;
        return sor(a,i+1)&&a[i]<=a[i+1];
    }
}
