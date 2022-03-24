package com.company.Sorting.CycleSort;

import java.util.Arrays;
import java.util.Scanner;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] a={7,8,9,11,12};
        System.out.println((miss(a)));
    }
    private static int miss(int[] a) {
        int i=0;
        while(i<a.length){
            int correctIndex=a[i]-1;
            if(a[i]>0&&a[i]<=a.length&&a[i]!=a[correctIndex])swap(a,i,correctIndex);
            else i++;
        }
        for (int j = 0; j < a.length; j++) {
            //Case 1:
            if(a[j]!=j)return j+1;
        }
        //Case 2:
        return a.length+1;
    }
    private static void swap(int[] a, int i, int correctIndex) {
        int t=a[i];
        a[i]=a[correctIndex];
        a[correctIndex]=t;
    }
}
