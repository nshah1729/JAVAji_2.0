package com.company.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a={};
        int[] b={1,2,3,4};
        Bubsort2(a);
          Bubsort(b);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(a));
    }

    private static void Bubsort(int[] a) {

        for(int i=a.length-1;i>= 0;i--){
            boolean isSwapped=false;
            for (int j = 0; j < a.length-1; j++) {
                if (a[j] > a[j + 1]) {
                    isSwapped = true;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            if(!isSwapped)break;
        }
    }
    private static void Bubsort2(int[] a) {

        for(int i=0;i<a.length;i++){
            boolean isSwapped=false;
            for (int j = 1; j <= a.length-1-i; j++) {
                if (a[j] < a[j - 1]) {
                    isSwapped = true;
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
            if(!isSwapped)break;
        }
    }

}
