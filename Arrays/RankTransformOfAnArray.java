package com.company.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class RankTransformOfAnArray {
    public static void main(String[] args) {
        int[] a={37,12,28,9,100,56,80,5,12};
        System.out.println(Arrays.toString(rank(a)));
    }

    private static int[] rank(int[] a) {
        //If all the elements of the array are same
        HashSet<Integer> set=new HashSet<>();
        for (int val:a) {
           set.add(val);
        }
        if(set.size()==1){
            int[] ans= new int[a.length];
            Arrays.fill(ans, 1);
            return ans;
        }
        //If we have unique elements also
        int[] ans=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int rank=a.length;
            for (int j = 0; j <a.length ; j++) {
                if(a[i]<=a[j])rank--;
            }
            ans[i]=rank;
        }


        return ans;
    }
}
