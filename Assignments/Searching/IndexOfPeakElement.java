package com.company.Assignments.Searching;

public class IndexOfPeakElement {
    public static void main(String[] args) {
        int[] a = {5, 10, 20, 15};
        int[] b = {50, 10, 12, 15};
        int[] c = {3,5,3,2,0};
        System.out.println(peaky(a));
        System.out.println(peaky(b));
        System.out.println(peaky(c));
    }

    private static int peaky(int[] a) {
       int s=0,e=a.length-1;
       while(s<e){
           int m=s+(e-s)/2;
           if(a[m]>a[m+1])e=m;
           else s=m+1;
       }
       return s;
    }
}
