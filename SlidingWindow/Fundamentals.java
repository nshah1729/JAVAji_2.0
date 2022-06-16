package com.company.SlidingWindow;

import java.util.*;

public class Fundamentals {
    public static void main(String[] args) {
        int[] a = {2,5,1,8,2,9,1};
        int k = 4;
//        System.out.println(MaximumSumInSubArrayOfSizeK(b,k));
    }
    public static int MaximumSumInSubArrayOfSizeK(int[] a,int k){
        int maxSum=0;
        for (int i = 0; i <k ; i++)
            maxSum+=a[i];

        int sum=maxSum;
        int i=0,j=k;
        while(j<a.length){

            sum+=a[j++];
            sum-=a[i++];
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }

    public static int FirsNegativeInSubArrayOfSizeK(int[] a,int k){
        int maxSum=0;
        for (int i = 0; i <k ; i++)
            maxSum+=a[i];

        int sum=maxSum;
        int i=0,j=k;
        while(j<a.length){

            sum+=a[j++];
            sum-=a[i++];
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
