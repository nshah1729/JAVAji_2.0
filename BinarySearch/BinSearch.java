package com.company.BinarySearch;

import java.util.*;

public class BinSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a= {2,3,4,5,6,8,9,12};
        System.out.print("Enter target: ");
        int target= sc.nextInt();
        System.out.println(binSeach(a,target));
    }

    private static boolean binSeach(int[] a, int target) {
        int s=0,e=a.length-1;
        while(s<=e){
            int m=(s+e)/2;

            if(a[m]==target)return true;    //Element found!

            else if(a[m]>target)e=m-1;     //Target element is less than the found element

            else s=m+1;
        }
        return false;
    }
}
