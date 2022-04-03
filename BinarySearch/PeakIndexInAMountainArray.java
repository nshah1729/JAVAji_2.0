package com.company.BinarySearch;

import java.util.Scanner;

public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int[] b= {0,10,5,2};
        System.out.println((peak_2(b)));

    }

    /*=====================
        Approach 1: O(N)
      =====================*/
    private static int peak(int[] a) {
        int s=1,e=a.length-1;
        int m=s+(e-s)/2;
        while((a[m-1]<a[m]&&a[m]<a[m+1])||(a[m-1]>a[m]&&a[m]>a[m+1])){

            if(a[m]<a[m+1])s=m+1;
            else e=m-1;
            m=s+(e-s)/2;

        }
        return m;
    }
    /*=====================
        Approach 2: O(N)
      =====================*/
    private static int peak_2(int[] a) {
        int ans=-1;
        int s=0,e=a.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(a[m]>a[m+1]){
                ans=m;//POTENTIAL ANSWER
                e=m-1;
            }
            else s=m+1;
        }
        return ans;
    }
}
