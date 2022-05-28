package com.company.RecursionPepCoding;

import java.util.Scanner;

public class PrintMazePaths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=3;
        int m=3;
        printMazePaths(1,1,n,m,"");
    }
    public static void printMazePaths(int sr, int sc, int dr,int dc, String psf) {
        //BASE CASE:
        if(sr==dr&&sc==dc){
            System.out.println(psf);
            return;
        }else if(sr>dr||sc>dc)return;

        //HORIZONTAL
        printMazePaths(sr,sc+1,dr,dc,psf+"h");
        //VERTICAL
        printMazePaths(sr+1,sc,dr,dc,psf+"v");
    }
}
