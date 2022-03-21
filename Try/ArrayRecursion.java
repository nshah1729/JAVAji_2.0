package com.company.Try;

public class ArrayRecursion {
    public static void main(String[] args) {
        int[] a={1,2,-1,3,4};
        printNormally(a,0);
        System.out.println();
        System.out.println();
        printInReverse(a,a.length-1);
        System.out.println();
        System.out.println();
        System.out.println(printMax(a,0));
    }

    private static int printMax(int[] a, int i) {
        if(i==a.length-1)return a[i];
        int max=Integer.MIN_VALUE;
        int maxOfLengthPlus1=printMax(a,i+1);
        if(a[i]>maxOfLengthPlus1)return a[i];
        return maxOfLengthPlus1;
    }

    private static void printInReverse(int[] a, int i) {
        if(i==-1)return;
        System.out.println(a[i]);
        printInReverse(a,i-1);
    }

    private static void printNormally(int[] a, int index) {
        if(index==a.length)return;
        System.out.println(a[index]);
        printNormally(a,index+1);
    }
}
