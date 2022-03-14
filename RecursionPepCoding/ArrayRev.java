package com.company.RecursionPepCoding;

import java.util.Scanner;

public class ArrayRev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={1,2,3,4,34,324,1342,141};int i=0;
        System.out.println("");
        printRevv(a,a.length-1);
    }

    private static void printRevv(int[] a, int i) {
        if(i==-1)return;
        System.out.println(a[i]);
        printRevv(a,i-1);
    }
}
