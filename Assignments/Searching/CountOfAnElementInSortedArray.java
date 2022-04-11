package com.company.Assignments.Searching;

public class CountOfAnElementInSortedArray {
    public static void main(String[] args) {
        int[] a={1,10,10,10,11,11,14};
        System.out.println(count(a,11));
    }

    public static int count(int[] a,int t){
        int f=-1,l=-1;
        int s=0,e=a.length-1;

        //First Index
        while(s<=e){
            int m=s+(e-s)/2;
            if(a[m]>t)e=m-1;
            else if(a[m]<t)s=m+1;
            else {
                f=m;
                e=m-1;
            }
        }

        //Last Index
        s=0;e=a.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(a[m]>t)e=m-1;
            else if(a[m]<t)s=m+1;
            else {
                l=m;
                s=m+1;
            }
        }

        int[] ans={f,l};
        return ans[1]-ans[0]+1;
    }

}
