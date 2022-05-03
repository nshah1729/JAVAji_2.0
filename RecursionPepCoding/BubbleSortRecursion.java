package com.company.RecursionPepCoding;

import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] a={2,1,4,1,0,-1,9};
        sortRec(a,a.length);
        System.out.println(Arrays.toString(a));
    }

    private static void sortRec(int[] a,int n) {
        if(n<=1)return;

        for (int i = 0; i < n-1; i++) {
            if(a[i]>a[i+1]){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
       sortRec(a,n-1);
    }
}
