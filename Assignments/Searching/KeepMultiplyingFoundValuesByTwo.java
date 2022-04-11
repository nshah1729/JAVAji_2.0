package com.company.Assignments.Searching;

import java.util.HashSet;

public class KeepMultiplyingFoundValuesByTwo {
    public static void main(String[] args) {
        int[] a={5,3,6,1,12};
        System.out.println(find(a,3));
    }

    private static int find(int[] a, int t) {
        HashSet<Integer> set=new HashSet<>();
        for(int val:a)set.add(val);
        int ans=t;
        while(BS(a,t)){
                t*=2;
                ans=t;
            }
        return ans;
    }
    public static boolean BS(int[] a,int target){
        int s=0,e=a.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(a[m]==target)return true;
            else if(a[m]>target)e=m-1;
            else s=m+1;
        }
        return false;
    }
}
