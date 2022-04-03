package com.company.Arrays;

public class SpiralTraversal {
    public static void main(String[] args) {
        int[][] a={{1,2,3},
                   {4,5,6},
                   {7,8,9}};
        spiralAntiClockwise(a);
    }

    private static void spiralClockwise(int[][] a) {
        int startingRow=0;
        int endingRow=a.length-1;
        int startingCol=0;
        int endingCol=a[0].length-1;
        int count=0;
        while(count<a.length*a[0].length){
            //Print Starting Row:
            for (int i = startingCol; i <= endingCol; i++) {
                System.out.println(a[startingRow][i]);
                count++;
            }
            startingRow++;

            //Print Last Column:
            for (int i = startingRow; i <= endingRow; i++) {
                System.out.println(a[i][endingCol]);
                count++;
            }
            endingCol--;

            //Print Last Row:
            for (int i = endingCol; i >=startingCol ; i--) {
                System.out.println(a[endingRow][i]);
                count++;
            }
            endingRow--;

            //Print First Column:
            for (int i = endingRow; i >=startingRow ; i--) {
                System.out.println(a[i][startingCol]);
                count++;
            }
            startingCol++;
        }
    }

    private static void spiralAntiClockwise(int[][] a) {
        int minr=0;
        int maxr=a.length-1;
        int minc=0;
        int maxc=a[0].length-1;
        int count=0;
        while(count<a.length*a[0].length){
            //Print left wall:
            for (int i = minr; i <=maxr ; i++) {
                System.out.println(a[i][minc]);
                count++;
            }
            minc++;

            //Print bottom wall:
            for (int i = minc; i <=maxc; i++) {
                System.out.println(a[maxr][i]);
                count++;
            }
            maxr--;

            //Print right wall:
            for (int i = maxr; i >=minr; i--) {
                System.out.println(a[i][maxc]);
                count++;
            }
            maxc--;

            //Print top wall:
            for (int i = maxc; i >=minc; i--) {
                System.out.println(a[minr][i]);
                count++;
            }
            minr++;
        }

    }
}
