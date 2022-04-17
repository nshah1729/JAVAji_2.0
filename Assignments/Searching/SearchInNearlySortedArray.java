package com.company.Assignments.Searching;

public class SearchInNearlySortedArray {
    public static void main(String[] args) {
        int[] a={2,5,10,30,20};
        System.out.println(searchin(a,5));
        System.out.println(searchin(a,20));
        System.out.println(searchin(a,2));
        System.out.println(searchin(a,13));
        System.out.println(searchin(a,30));
    }

    private static int searchin(int[] a, int t) {
        int s=0,e=a.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(a[m]==t)return m;
            else if(m<e&&a[m+1]==t)return m+1;
            else if(m>s&&a[m-1]==t)return m-1;
            else if(a[m]>t)e=m-2;
            else s=m+2;
        }
        return -1;
    }
}
