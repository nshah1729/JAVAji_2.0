package com.company.BinarySearch.BinarySearchOnAnswers;

import java.util.Arrays;

public class MaximumCandies {
    public static void main(String[] args) {
        int[] a = {5,8,6}; int k = 3;
//        int[] a = {5,8,6}; int k = 20;
        System.out.println(maximumCandies(a,k));
    }
    public static int maximumCandies(int[] a, long k) {

        int s=0,e;
        int sum=0;
        for(int val:a)sum+=val;
        e= (int) (sum/k);
        if(k>sum)return 0;
        while(s<e){
            int m=s+(e-s)/2;
            if(m==0)return 0;
            if(isPoss(a,m,k))s=m+1;
            else e=m;
        }
        return e;
        }

    private static boolean isPoss(int[] a, int m, long k) {
        int NoOfsubPiles=0;
        for (int i = 0; i < a.length; i++) {
            NoOfsubPiles+=a[i]/m;
        }
        return NoOfsubPiles>=k;
}
}
