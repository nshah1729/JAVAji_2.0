package com.company.Sorting.CycleSort;

import java.util.Arrays;

public class trying {
    public static void main(String[] args) {
        int[] a={3,5,2,1,4};
        Selection(a);
        System.out.println(Arrays.toString(a));
    }

    private static void Selection(int[] a) {
        int i=0;
        while(i<a.length){
            int correctIndex=a[i]-1;
            if(a[i]!=a[correctIndex]){
                swap(a,i,correctIndex);
            }
            else i++;
        }
    }

    private static void swap(int[] a, int i, int correctIndex) {
        int temp=a[i];
        a[i]=a[correctIndex];
        a[correctIndex]=temp;
    }
}
