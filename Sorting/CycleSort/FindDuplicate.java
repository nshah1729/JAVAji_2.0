package com.company.Sorting.CycleSort;

import java.util.Scanner;

public class FindDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={1,3,4,2,2};
        System.out.println(dup(a));
    }

    private static int dup(int[] a) {
        int i=0;
        while(i<a.length){
            int correctIndex=a[i]-1;
            if(a[i]!=a[correctIndex])swap(a,i,correctIndex);
            else if(a[i]==a[correctIndex]&&i!=correctIndex)return a[i];
            else i++;
        }
        return -1;
    }
    private static void swap(int[] a, int i, int correctIndex) {
        int t=a[i];
        a[i]=a[correctIndex];
        a[correctIndex]=t;
    }
}
