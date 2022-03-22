package com.company.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a={3,5,1,4,2,0,9};
        Selection(a);
        System.out.println(Arrays.toString(a));
    }

    private static void Selection(int[] a) {
        for (int i = 0; i <a.length; i++) {
            int last=a.length-i-1;
            int maxIndex=getMaxIndex(a,last);
            swap(a,last,maxIndex);
        }
    }

    private static void swap(int[] a, int last, int maxIndex) {
        int temp=a[last];
        a[last]=a[maxIndex];
        a[maxIndex]=temp;
    }

    private static int getMaxIndex(int[] a, int last) {
        int maxIndex= 0;
        for (int i = 1; i <= last; i++) {
            if(a[maxIndex]<a[i])maxIndex=i;
        }
        return maxIndex;
    }
}
