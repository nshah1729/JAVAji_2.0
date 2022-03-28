package com.company.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] b={1,2,3,4};
        System.out.println(miss(b,2));
    }

    private static int miss(int[] a,int k) {
        ArrayList<Integer> list= new ArrayList<>();
        for (int i = 1; i <=a[a.length-1]+k ; i++) {
            boolean is_found=false;
            for (int j = 0; j < a.length; j++) {
                if(i==a[j]){
                    is_found=true;
                    break;
                }
            }
            if(!is_found)list.add(i);
        }
        return list.get(k-1);
    }
}
