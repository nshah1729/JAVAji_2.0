package com.company.Arrays;

import java.util.ArrayList;

//https://leetcode.com/problems/add-to-array-form-of-integer/
//The array-form of an integer num is an array representing its digits in left to right order.
//
//For example, for num = 1321, the array form is [1,3,2,1].
//Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] a={9,9};
        int k=1;
        System.out.println(arr(a,k));
    }

    private static ArrayList<Integer> arr(int[] a, int k) {
        int i=a.length-1;
        int num=0;
        int constant=1;
        while(i>=0){
            num+=constant*a[i];
            constant*=10;
            i--;
        }
        num+=k;
        ArrayList<Integer> temp=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        while(num>0){
            temp.add(num%10);
            num/=10;
        }
        for (int j = temp.size()-1; j >=0 ; j--) {
            ans.add(temp.get(j));
        }
        return ans;
    }
}
