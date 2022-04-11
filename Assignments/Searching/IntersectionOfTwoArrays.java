package com.company.Assignments.Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={1,3};
        int[] ans=common(a,b);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] common(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        HashSet<Integer> set=new HashSet<>();
        int i=0,j=0;
        while(i < a.length && j < b.length){
            if(a[i] == b[j]){
                set.add(a[i]);
                i++;j++;
            }
            else if(a[i] > a[j])j++;
            else i++;
        }
        int[] ans=new int[set.size()];
        int k=0;
        for(int val:set){
            ans[k++]=val;
        }
        return ans;
    }
}
