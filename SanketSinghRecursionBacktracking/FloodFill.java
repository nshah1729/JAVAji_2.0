package com.company.SanketSinghRecursionBacktracking;

import java.util.*;

public class FloodFill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[][] maze=new int[n][m];

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                maze[i][j]= sc.nextInt();
            }
        }
        boolean[][] visited=new boolean[n][m];
        floodFill(maze,0,0,"",visited);
    }

    private static void floodFill(int[][] maze, int r, int c, String psf, boolean[][] visited) {
        //Handling -ve Base Cases:
        if(r<0||c<0||r>= maze.length||c>=maze[r].length||maze[r][c]==1||visited[r][c]== true)return;
       //Handling Base Case:
        else if(r==maze.length-1&&c==maze[0].length-1){
            System.out.println(psf);
            return;
        }
        //Recursion:
        visited[r][c]=true;
        //Top:
        floodFill(maze,r-1,c,psf+"T",visited);
        //Left:
        floodFill(maze,r,c-1,psf+"L",visited);
        //Down:
        floodFill(maze,r+1,c,psf+"D",visited);
        //Right:
        floodFill(maze,r,c+1,psf+"R",visited);

        visited[r][c]=false;

    }
}
