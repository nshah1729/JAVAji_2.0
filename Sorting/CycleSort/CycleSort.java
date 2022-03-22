package com.company.Sorting.CycleSort;

import java.util.Arrays;
import java.util.Scanner;

public class CycleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={0,1,2,3};
//        cycle(a);
        cycling(a);
        System.out.println(Arrays.toString(a));
    }

    private static void cycling(int[] a) {
        int i=0;
        while(i<a.length){
            int correctIndex=a[i]-1;
            if(a[i]!=a[correctIndex]){
                int temp=a[i];
                a[i]=a[correctIndex];
                a[correctIndex]=temp;
            }
        }
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
