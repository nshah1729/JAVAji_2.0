package com.company.RecursionPepCoding;

import java.util.Scanner;

public class MaximumInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={1,2,3,235,5,19, 10, 8, 17,235, 9};
        System.out.print("THE MAXIMUM IS: "+Arrmax(a,0));
    }

    private static int Arrmax(int[] a, int i) {
        //Base Case:
        if(i==a.length)return a[i-1];
        return Math.max(a[i],Arrmax(a,i+1));
//        int max=a[i];
//        int temp=Arrmax(a,i+1);
//        if(Arrmax(a,i+1)>max)max=Arrmax(a,i+1);
//        return max;
    }
}
