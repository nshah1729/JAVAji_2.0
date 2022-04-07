package com.company.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class InverseOfArray {
    public static void main(String[] args) {
        int[] a={3,4,1,2,0};
        int[] inv=inverse(a);
        System.out.println(Arrays.toString(inv));
    }

    private static int[] inverse(int[] a) {
        int[] ans=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int v=a[i];
            ans[v]=i;
        }
        return ans;
    }
}
