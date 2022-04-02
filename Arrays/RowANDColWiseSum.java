package com.company.Arrays;

public class RowANDColWiseSum {
    public static void main(String[] args) {
        int[][] a= {{1,23,3},{1,34,3},{11,2,3}};
        System.out.println("The matrix is:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        sumRowWise(a);
        System.out.println();
        sumColWise(a);
    }

    private static void sumColWise(int[][] a) {
        for (int col = 0; col < a.length; col++) {
            int sumColWise = 0;
            for (int row = 0; row < a[col].length; row++) {
                sumColWise +=a[row][col];
            }
            System.out.println(col+1+"th col sum is: "+sumColWise);
            sumColWise=0;
        }
    }

    private static void sumRowWise(int[][] a) {
        for (int row = 0; row < a.length; row++) {
            int sumRowWise = 0;
            for (int col = 0; col < a[row].length; col++) {
                sumRowWise +=a[row][col];
            }
            System.out.println(row+1+"th row sum is: "+sumRowWise);
            sumRowWise=0;
        }
    }
}
