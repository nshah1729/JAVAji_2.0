package com.company.SanketSinghRecursionBacktracking;

import java.io.*;
        import java.util.*;

public class tryrr {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(str.split(" ")[j]);
            }
        }

        floodfill(arr, 0, 0, "", new boolean[n][m]);
        System.out.println(totalPath);
    }
    static int totalPath=0;

    public static void floodfill(int[][] maze, int r, int c, String psf, boolean[][] visited){
        if(r < 0 || c < 0 || r >= maze.length || c >= maze[0].length ||
                maze[r][c] == 1 || visited[r][c]){
            return;
        } else if(r == maze.length - 1 && c == maze[0].length - 1){
            totalPath++;
            System.out.println(psf);
            return;
        }

        visited[r][c] = true;
        floodfill(maze, r - 1, c, psf + "t", visited);
        floodfill(maze, r, c - 1, psf + "l", visited);
        floodfill(maze, r + 1, c, psf + "d", visited);
        floodfill(maze, r, c + 1, psf + "r", visited);
        visited[r][c] = false;
    }

}












