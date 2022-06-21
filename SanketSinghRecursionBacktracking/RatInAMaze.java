package com.company.SanketSinghRecursionBacktracking;

import java.util.*;
import java.util.Scanner;

public class RatInAMaze {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[7][7];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j]=(sc.nextInt());
            }
        }
        System.out.println(pathForRat(a));

    }

    static int totalPaths=0;
    public static void helper(int i,int j,int n,int[][] a,boolean[][] visited){
        if(i==n-1&&j==n-1){
            totalPaths+=1;
            return;
        }
        if(isItSafe(i,j,n,visited)){
            //Pruning
            return;
        }
        visited[i][j]=true;
        //Down
        if(a[i+1][j]==0)helper(i+1,j,n,a,visited);
        //Up
        if(a[i-1][j]==0)helper(i-1,j,n,a,visited);
        //Right
        if(a[i][j+1]==0)helper(i,j+1,n,a,visited);
        //Left
        if(a[i][j-1]==0)helper(i,j-1,n,a,visited);

        visited[i][j]=false;
    }
    public static boolean isItSafe(int i,int j,int n,boolean[][] visited){
        return j>=0&&i>=0&&i<n&&j<n&& !visited[i][j];
    }
    private static int pathForRat(int[][] a) {
        int n=a.length;
        boolean[][] visited=new boolean[n][n];

        for (int i = 0; i < visited.length; i++)
            for (int j = 0; j < visited.length; j++)
                visited[i][j]=false;

        helper(0,0,n,a,visited);
        return totalPaths;
    }

}
