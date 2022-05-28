package com.company.RecursionPepCoding;

import java.util.Scanner;

public class PrintStairsPath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        printStairPath(30,"");
    }

    public static void printStairPath(int n,String ans) {
        if(n==0){
            System.out.println(ans);
            return;
        }else if(n<0)return;
        printStairPath(n-1,"1"+ans);
        printStairPath(n-2,"2"+ans);
        printStairPath(n-3,"3"+ans);
    }
}
