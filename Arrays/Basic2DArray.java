package com.company.Arrays;

import java.util.Scanner;

public class Basic2DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[3][4];

        //Taking input:
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        //Displaying the array:
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
