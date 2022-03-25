package com.company.BinarySearch;

import java.util.*;

public class BinSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a= {2,3,4,5,6,8,9,12};
        System.out.print("Enter target: ");
        int target= sc.nextInt();
//        System.out.println(binSearch(a,target));
        System.out.println(binSearchRec(a,target,0,a.length-1));
    }

    //Binary Search using Recursion:
    private static int binSearchRec(int[] a, int target,int s,int e) {
        int m=(s+e)/2;
        if(a[m]==target)return m;
        if(a[m]>target)return binSearchRec(a,target,s,m-1);
        if(a[m]<target)return binSearchRec(a,target,m+1,e);
        return -1;
    }

    private static int binSearch(int[] a, int target) {
        int s=0,e=a.length-1;
        while(s<=e){
            int m=(s+e)/2;

            if(a[m]==target)return m;    //Element found!

            else if(a[m]>target)e=m-1;     //Target element is less than the found element

            else s=m+1;                   //Target element is more than the found element
        }
        return -1;
    }
}
