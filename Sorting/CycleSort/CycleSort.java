package com.company.Sorting.CycleSort;

import java.util.Arrays;
import java.util.Scanner;

public class CycleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={3,5,2,1,4};
        cycle(a);
        System.out.println(Arrays.toString(a));
    }

    private static void cycle(int[] a) {

        for(int i=0;i<a.length;i++){

            while(i!=a[i]-1) {  //Till the Element at "i" is not at its correct index

                int correctIndex = a[i] - 1;
                       //Swap
                    int temp = a[i];
                    a[i] = a[correctIndex];
                    a[correctIndex] = temp;

            }
        }
    }
}
