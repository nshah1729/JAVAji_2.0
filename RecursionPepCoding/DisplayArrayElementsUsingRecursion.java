package com.company.RecursionPepCoding;

import java.util.Scanner;

public class DisplayArrayElementsUsingRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={1,2,3,4,34,324,1342,141};int i=0;
        print(a,i);
        System.out.println("");
        printRev(a,a.length-1);
    }

    private static void print(int[] a,int i) {
        //Base Case:
        if(i==a.length)return;

        System.out.print(a[i]+" ");
        //Faith:
        print(a,i+1);
    }
    private static void printRev(int[] a,int i) {
        //Base Case:
        if(i==0){
            System.out.print(" "+a[i]);
            return;
        }

        System.out.print(" "+a[i]);
        //Faith:
        printRev(a,i-1);
    }

}
