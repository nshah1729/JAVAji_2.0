package com.company.BinarySearch;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(square(n));
    }

    private static int square(int n) {
        int s=0,e=n;
        while (s<=e){
            int m=(s+e)/2;
            if(Math.ceil(m*m)==n)return s;
            else if(Math.ceil(m*m)>n)e=m-1;
            else s=m+1;
        }
        return -1;
    }

}
