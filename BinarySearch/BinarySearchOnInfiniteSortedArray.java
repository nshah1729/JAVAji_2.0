package com.company.BinarySearch;

import java.util.Scanner;

public class BinarySearchOnInfiniteSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={2,3,5,9,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28};
//        int target=sc.nextInt();
        System.out.println(searchInfi(a,2));
    }

    private static int searchInfi(int[] a, int target) {
        int s=0,e=1;
        while(target>a[e]){
            s=e;
            e*=2;
            if(a[e]>target)break;
        }
        while(s<=e){
            int m=s+(e-s)/2;
            if(a[m]==target)return m;
            else if(a[m]<target)s=m+1;
            else e=m-1;
        }
        return -1;
    }
}
