package com.company.KunalRecursionSheet;

public class MaxMinInArray {
    public static void main(String[] args) {
        int[] a={1,3,4,2,5,6};
//        System.out.println(min(a,0));
//        System.out.println(max(a,0));
        pi(10);
    }

    private static int min(int[] a,int k) {
        if(k==a.length)return a[a.length-1];
        return Math.min(a[k], min(a, k + 1));
    }

    private static int max(int[] a, int k) {
        if(k==a.length)return a[k-1];
        if(k==a.length-1)return a[a.length-1];
        return Math.max(a[k], max(a, k + 1));
    }
    private static void pi(int n) {
        if(n==0)return;

        pi(n-1);System.out.println(n);
    }
}
//