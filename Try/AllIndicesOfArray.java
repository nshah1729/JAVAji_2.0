package com.company.Try;

import java.util.Scanner;

public class AllIndicesOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={3,2,4,3,545,35,3,232,245,3,3,32463,2,3};
        System.out.print("Enter Element to be searched: ");
        int target=sc.nextInt();
          all(a, target, 0);
    }

    private static void all(int[] a, int target, int i) {
        if(i==a.length)return;
        if(a[i]==target) System.out.println(i);
        all(a,target,i+1);

    }
}
