package com.company.BinarySearch;

import java.util.Scanner;
//Or Search Insert Position
public class CeilingOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={1,3,5,6};
//        int target=sc.nextInt();
        System.out.println(searchCeil(a,2));
    }

    private static int searchCeil(int[] a, int target) {
        int s=0,e=a.length-1;
        while(s<=e){
            int m=(s+e)/2;
            //Element found!
            if(a[m]==target)return m;

             if(a[m]<target)s=m+1;

             else e=m-1;
        }
        return s;
    }

}
