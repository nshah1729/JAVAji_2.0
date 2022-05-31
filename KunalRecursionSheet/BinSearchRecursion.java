package com.company.KunalRecursionSheet;

public class BinSearchRecursion {
    public static void main(String[] args) {
        int[] a={1,3,4,2,5,6};
        System.out.println(searchBin(a,0,a.length-1,5));
    }

    private static int searchBin(int[] a, int s,int e,int target) {
        int m=s+(e-s)/2;
        if(a[m]==target)return m;
        if(s>e)return -1;
        if(a[m]<target)s=m+1;
        else if(a[m]>target)e=m-1;
       return searchBin(a,s,e,target);
    }
}
