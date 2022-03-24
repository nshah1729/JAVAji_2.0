package com.company.Sorting.CycleSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NumbersDisappeared {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={4,3,2,7,8,2,3,1};
        System.out.println(dis(a));
    }

    private static ArrayList<Integer> dis(int[] a) {
        int i=0;

        //Cyclic Sort:
        while(i< a.length){
            int correctIndex=a[i]-1;
            if(a[i]!=a[correctIndex]) swap(a,i,correctIndex);
            else i++;
        }

        ArrayList<Integer> list=new ArrayList<>();
        //Checking:
        for (int index = 0; index < a.length; index++) {
            if(a[index]!=index+1)list.add(index+1);
        }
        return list;
    }

    private static void swap(int[] a, int i, int correctIndex) {
        int t=a[i];
        a[i]=a[correctIndex];
        a[correctIndex]=t;
    }
}
