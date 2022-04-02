package com.company.Arrays;

import java.util.Scanner;

public class MultiplyMatrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] a= {{1,23,3},{1,34,3},{11,2,3}};
        int[][] b= {{2,2,3},{1,8,3},{1,2,9}};
        System.out.println("Matrix 1:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("Matrix 2:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        //Multiply:
        System.out.println();
        System.out.print("The answer is:");
        if(a[0].length==b.length){
            int[][] c= new int[a.length][b[0].length];
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[i].length; j++) {
                    for (int k = 0; k < b.length; k++) {
                        c[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
            //Display:
            System.out.println();
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[i].length; j++) {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
        else System.out.println("Invalid");
    }
}
