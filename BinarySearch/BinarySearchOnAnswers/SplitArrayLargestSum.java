package com.company.BinarySearch.BinarySearchOnAnswers;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] a = {7,2,5,10,8};int m = 2;
        System.out.println(splitArray(a,m));
    }
    public static int splitArray(int[] a, int n) {
        int s=0,e=0;
        for(int val:a)s=Math.max(s,val);
        for(int val:a)e+=val;
        while(s<e){
            int m=s+(e-s)/2;
            if(isPossible(a,m,n))e=m;
            else s=m+1;
        }
        return e;
    }

    private static boolean isPossible(int[] a, int maxSize, int n) {
        int sa=1;//Sub-Array Count
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
            if(sum>maxSize){
                sa++;
                sum=a[i];
            }
        }
        return sa==n;
    }
}
