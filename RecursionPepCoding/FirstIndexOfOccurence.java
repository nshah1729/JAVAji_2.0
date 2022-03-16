package com.company.RecursionPepCoding;

import java.util.*;

public class FirstIndexOfOccurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={1,2,3,5,7,2,5};
        System.out.print("Enter the number to be searched: ");
        int target= sc.nextInt();
        System.out.println(first(a,target,0));
    }

    private static int first(int[] a, int target,int index) {
        if(a[index]==target)return index;
        return first(a,target,index+1);
    }

}
