package com.company.SanketSinghRecursionBacktracking;

import java.util.Scanner;

public class KnightTours {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] chess=new int[n][n];
        int move=1;
        priint(chess,r,c,move);
    }

    private static void priint(int[][] chess, int r, int c, int move) {
        if(r<0||c<0||r>=chess.length||c>= chess.length||chess[r][c]>0)return;
        else if(move== chess.length* chess.length){
            chess[r][c]=move;
            displayBoard(chess);
            chess[r][c]=0;
            return;
        }
        chess[r][c]=move;
        priint(chess,r-2,c+1,move+1);
        priint(chess,r-1,c+2,move+1);
        priint(chess,r+1,c+2,move+1);
        priint(chess,r+2,c+1,move+1);
        priint(chess,r-2,c-1,move+1);
        priint(chess,r-1,c-2,move+1);
        priint(chess,r+1,c-2,move+1);
        priint(chess,r+2,c-1,move+1);
        chess[r][c]=0;
    }

    private static void displayBoard(int[][] chess) {
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++) {
                System.out.print(chess[i][j]+" ");
            }
            System.out.println();
        }
    }
}
