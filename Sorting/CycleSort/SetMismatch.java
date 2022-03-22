package com.company.Sorting.CycleSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class SetMismatch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] a={1,2,2,4};
        System.out.println((mismatch(a)));
    }

    private static ArrayList mismatch(int[] a) {
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            int correctIndex=a[i]-1;
            while(a[i]!=i+1){
                if(set.contains(a[i]))continue;
                else{
                    swap(a,i,correctIndex);
                    set.add(a[i]);
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
                if(a[i]!=i+1){
                    list.add(i+1);
                    list.add(a[i]);
                }
        }
        return list;
    }

    private static void swap(int[] a, int i, int correctIndex) {
        int temp=a[i];
        a[i]=a[correctIndex];
        a[correctIndex]=temp;
    }
}
