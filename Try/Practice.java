package com.company.Try;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println(fac(5));
//        System.out.println(po(5,2));
        pzz(3);
    }

    private static int fac(int i) {
        if(i==0)return 1;
        return i*fac(i-1);
    }
    private static int po(int n,int i) {
        if(i==0)return 1;
        return n*po(n,i-1);
    }
    private static void pzz(int i) {
        if(i==0)return;
        System.out.println("Pre"+i);
         pzz(i-1);
        System.out.println("In"+i);
         pzz(i-1);
        System.out.println("Post"+i);
    }

}