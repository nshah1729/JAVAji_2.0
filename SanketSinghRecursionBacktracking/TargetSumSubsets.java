package com.company.SanketSinghRecursionBacktracking;

public class TargetSumSubsets {
    public static void main(String[] args) {
        int[] a={20,10,30,40,50};
        int t=30;
        printSumSubsets(a,t,0,0,"");
    }
    public static void printSumSubsets(int[] a,int t,int i,int sum,String set){
        if(sum==t){
            System.out.println(set);
            return;
        }
        if(i>=a.length)return;
        printSumSubsets(a,t,i+1,sum+a[i],set+" "+a[i]);
        printSumSubsets(a,t,i+1,sum,set);
    }
}
