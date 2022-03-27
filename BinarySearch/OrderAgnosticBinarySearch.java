package com.company.BinarySearch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a= {2,3,4,5,6,8,9,12};
        int[] b= {12,11,10,5,3,1,-1};
        System.out.print("Enter target: ");
        int target= sc.nextInt();
        System.out.println(binSearch(a,target));
    }

    private static int binSearch(int[] a, int target) {
        int s=0,e=a.length-1;
        while(s<=e){
            int m=s+(e-s)/2;

            //Element Found!
            if(a[m]==target)return m;

            //For Descending Order:
            if(a[s]>a[e]){
                if(target>a[m])e=m-1;
                else s=m+1;
            }
            //For Ascending Order:
            else{
                if(target<a[m])e=m-1;
                else s=m+1;
            }
        }
        //Element not Found!
        return -1;
    }
}
