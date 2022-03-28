package com.company.Arrays;

import java.util.Scanner;

public class KeepMultiplyingFoundValuesbyTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int original=sc.nextInt();
        int[] a={5,3,6,1,12};
        System.out.println(fin(a,original));
    }

    private static int fin(int[] a, int original) {
        int i=0;
        boolean found=false;
        while(original!=a[i]){
            if(original==a[i]){
                found=true;
                a[i]*=2;
                original=a[i];
            }
            else if(i==a.length-1&& !found)break;
            else i++;
        }
        return original;
    }
}
