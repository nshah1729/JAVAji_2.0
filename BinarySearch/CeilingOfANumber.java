package com.company.BinarySearch;

import java.util.Scanner;
//Or Search Insert Position
public class CeilingOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={2,3,5,9,14,15,16,17,18};
//        int target=sc.nextInt();
        System.out.println(searchCeil(a,19));
    }

    private static int searchCeil(int[] a, int target) {

        if(target>a[a.length-1])return -1;//If the target is > the greatest number of the array.

       int s=0;int e=a.length-1;
       while(s<=e){
           int m=s+(e-s)/2;
           if(a[m]==target)return m;
           else if(a[m]>target)e=m-1;
           else s=m+1;
       }
       return s;
    }

}
