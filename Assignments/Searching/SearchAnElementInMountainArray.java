package com.company.Assignments.Searching;

public class SearchAnElementInMountainArray {
    public static void main(String[] args) {
        int[] a = {3,5,3,2,0};
        System.out.println(se(a,2));
    }

    private static boolean se(int[] a, int t) {
        int i=findPeak(a);
        boolean f=false,s=false;
         f=bS(a,0,i,t);
         s=bS(a,i,a.length-1,t);
        return f?f:s;
    }
    private static boolean bS(int[] a,int s,int e,int t) {
        while(s<=e){
            int m=s+(e-s)/2;
            if(a[m]==t)return true;
            else if(a[m]>t)e=m-1;
            else s=m+1;
        }
        return false;
    }
    private static int findPeak(int[] a) {
        int s=0,e=a.length-1;
        while(s<e){
            int m=s+(e-s)/2;
            if(a[m]>a[m+1])e=m;
            else s=m+1;
        }
        return s;
    }
}
