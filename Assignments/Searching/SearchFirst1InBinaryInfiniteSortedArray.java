package com.company.Assignments.Searching;

public class SearchFirst1InBinaryInfiniteSortedArray {
    public static void main(String[] args) {
        int[] a={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1};
        int[] b={0,0,0,0,0,0,0,1,1};
        System.out.println(search(b));
    }

    private static int search(int[] a) {
        int ans=-1;
        int s=0,e=1;
        while(1>a[e]){
            s=e;
            e*=2;
        }
        while(s<=e){
            int m=s+(e-s)/2;
            if(a[m]==1){
                ans=m;
                e=m-1;
            }
            else s=m+1;
        }
        return ans;
    }
}
