package com.company.Assignments.Searching;

public class MinimumDifferenceElementInSortedArray {
    public static void main(String[] args) {
        int[] a={2,5,10,14,20};
        int t=12;
        System.out.println(minDiff(a,t));
    }

    private static int minDiff(int[] a, int t) {
        int s=0,e=a.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(a[m]==t)return t;
            else if(a[m]>t)e=m-1;
            else s=m+1;
    }
        return t-a[s]>t-a[e]?a[e]:a[s];
    }
}
