package com.company.Assignments.Searching;

import java.util.Arrays;

public class CheckIfDoubleOfTheElementsExists {
    public static void main(String[] args) {
        int[] a={-10,12,-20,-8,15};
        System.out.println(check(a));
    }

    private static boolean check(int[] a) {
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if(BS(a,i,a.length,a[i]))return true;
        }
        return false;
    }

    private static boolean BS(int[] a, int s, int e, int target) {
        while(s<=e){
            int m=s+(e-s)/2;
            if(a[m]==target)return true;
            else if(a[m]>target)e=m-1;
            else s++;
        }
        return false;
    }
}
