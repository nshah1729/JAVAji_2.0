package com.company.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FindFirstandLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={5,7,7,7,8,8,10};
        int target=8;
        System.out.println((firstLast(a,target)));

    }

    private static int firstLast(int[] a, int target) {
        int s=0,e=a.length-1;
        while (s<=e){
            int m=s+(e-s)/2;
            if(a[m]==target)return m;
            else if(a[m]>target)e=m-1;
            else s=m+1;
        }
        return -1;
    }
}
