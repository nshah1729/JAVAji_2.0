package com.company.Sorting.CycleSort;

import java.util.*;

public class SetMismatch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] a={1,2,2,4};
        System.out.println(Arrays.toString(mismatch(a)));
    }

    private static int[] mismatch(int[] a) {
        int i=0;
        while(i<a.length){
            int correctIndex=a[i]-1;
            if(a[i]!=a[correctIndex])swap(a,i,correctIndex);
            else i++;
        }
        for (int j = 0; j < a.length; j++) {
            if(a[j]!=j+1) return new int[]{a[j],j+1};
        }
        return new int[]{-1,-1};
    }

    private static void swap(int[] a, int i, int correctIndex) {
        int temp=a[i];
        a[i]=a[correctIndex];
        a[correctIndex]=temp;
    }
}
