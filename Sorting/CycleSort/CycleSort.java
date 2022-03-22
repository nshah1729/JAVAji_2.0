package com.company.Sorting.CycleSort;

import java.util.Arrays;
import java.util.Scanner;

public class CycleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={3,5,4,1,2};
        cycle(a);
        System.out.println(Arrays.toString(a));
    }

    private static void cycle(int[] a) {
        for(int i=0;i<a.length;i++){
            int correctIndex=a[i]-1;
            if(i!=a[i]-1){  //If the Element is not at its correct index
                int temp=a[i];
                a[i]=a[correctIndex];
                a[correctIndex]=temp;
            }

        }
    }
}
