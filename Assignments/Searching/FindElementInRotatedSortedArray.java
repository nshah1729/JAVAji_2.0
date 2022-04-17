package com.company.Assignments.Searching;

public class FindElementInRotatedSortedArray {
    public static void main(String[] args) {
        int[] a={11,12,14,2,5,6,8};
        System.out.println(searchi(a,5));
    }

    private static int searchi(int[] a, int t) {
        int s=0;
        int e=a.length-1;
        int peak=-1;
        //Finding peak element:
        while(s<=e){
            int m=s+(e-s)/2;
            if(a[m]>a[m+1]&&a[m]>a[m-1]){
                peak=m;
                break;
            }
            else if(a[m]>a[m-1]&&a[m]<a[0])e=m-1;
            else s=m+1;
        }
        if(t>a[0])return BinariSearch(a,0,peak,t);
        else return BinariSearch(a,peak+1,a.length,t);
    }

    private static int BinariSearch(int[] a, int s, int e,int t) {
        while(s<=e){
            int m=s+(e-s)/2;
            if(a[m]==t)return m;
            else if(a[m]>t)e=m-1;
            else s=m+1;
        }
        return -1;
    }
}
