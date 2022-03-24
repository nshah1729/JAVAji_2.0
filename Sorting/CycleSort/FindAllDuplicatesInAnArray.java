package com.company.Sorting.CycleSort;

import java.util.ArrayList;
import java.util.Scanner;

public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={4,3,2,7,8,2,3,1};
        System.out.println(dup(a));
    }

    private static ArrayList<Integer> dup(int[] a) {
        int i=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(i< a.length){
            int correctIndex=a[i]-1;
            if(a[i]!=a[correctIndex])swap(a,i,correctIndex);
            else i++;
        }
//        for (int j = 0; j < a.length; j++) {
//            int correctIndex=a[j]-1;
//            if(a[j]!=j+1)list.add(a[j]);
//        }
        for (int j = 0; j < a.length; j++) {
            int correctIndex=a[j]-1;
            if(a[j]==a[correctIndex]&&j!=correctIndex)list.add(a[j]);
        }
        return list;
    }

    private static void swap(int[] a, int i, int correctIndex) {
        int t=a[i];
        a[i]=a[correctIndex];
        a[correctIndex]=t;
    }
}
