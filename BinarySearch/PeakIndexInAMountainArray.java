package com.company.BinarySearch;

import java.util.Scanner;

public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={5,6,7,4,3};
       int[] b= {3,4,5,1};
        System.out.println((peak(b)));

    }

    private static int peak(int[] a) {
    int s=0,e=a.length-1;
    int m=s+(e-s)/2;
    while(a[m-1]>a[m]&&a[m]<a[m+1]){
        if(a[m]<a[m+1])s=m+1;
        else e=m-1;
        m=s+(e-s)/2;
    }
    return e-1;
    }
}
