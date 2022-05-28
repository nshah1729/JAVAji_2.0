package com.company.RecursionPepCoding;

import java.util.*;

public class PrintMazePathsWithJumps {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=3;
        int m=3;
        printMazePaths(1,1,n,m,"");
    }
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

        if(sr==dr&&sc==dc){
            System.out.println(psf);
            return;
        }

        for(int h=1;h<=dc-sc;h++)printMazePaths(sr,sc+h,dr,dc,psf+"h"+h);

        for(int v=1;v<=dr-sr;v++) printMazePaths(sr+v,sc,dr,dc,psf+"v"+v);

        for(int d=1;d<=dr-sr&&d<=dc-sc;d++)printMazePaths(sr+d,sc+d,dr,dc,psf+"d"+d);
    }
}
