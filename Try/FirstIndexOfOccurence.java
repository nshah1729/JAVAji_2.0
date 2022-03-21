package com.company.Try;

import java.util.Scanner;

public class FirstIndexOfOccurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={3,2,4,3,545,35};
        System.out.print("Enter Element to be searched: ");
        int target=sc.nextInt();
//        System.out.println("First index of "+ target+" is "+firstIndexOf(a,target,0));
        if(lastIndexOf(a,target,a.length-1)==-1) System.out.println("Element not found!!");
        else {
            System.out.println("Last index of " + target + " is " + lastIndexOf(a, target, a.length - 1));
        }
    }

    private static int lastIndexOf(int[] a, int target, int i) {
        if(i==-1)return -1;
        if(a[i]==target)return i;
        return lastIndexOf(a,target,i-1);
    }

    private static int firstIndexOf(int[] a, int target,int i) {
        if(a[i]==target)return i;
        return firstIndexOf(a,target,i+1);
    }
}
