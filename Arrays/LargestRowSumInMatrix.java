package com.company.Arrays;

public class LargestRowSumInMatrix {
    public static void main(String[] args) {
        int[][] a={{1,2,3},
                {4,5,6},
                {7,8,9}};
        rowSum(a);
        System.out.println();
        largest(a);
    }

    private static void rowSum(int[][] a) {
        for (int row = 0; row < a.length; row++) {
            int sum=0;
            for (int col = 0; col < a[row].length; col++) {
                sum+=a[row][col];
            }
            System.out.println("Sum of "+(row+1)+"th row is --> "+sum);
        }
    }

    private static void largest(int[][] a) {
        int rowOfLargestSum=-1;
        int sumOfLargestRow=Integer.MIN_VALUE;
        for (int row = 0; row < a.length; row++) {
            int sum=0;
            for (int col = 0; col < a[row].length; col++) {
                sum+=a[row][col];
            }
            if(sum>sumOfLargestRow){
                sumOfLargestRow=sum;
                rowOfLargestSum=row+1;
            }
        }
        System.out.println(rowOfLargestSum+"th row has largest sum ="+sumOfLargestRow);
    }
}
