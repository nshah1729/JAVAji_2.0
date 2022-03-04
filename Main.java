package com.company;

public class Main {
//--------------*RECURSION Example*--------------
    public static void main(String[] args) {
        call(10);
    }

    private static int call(int i) {
        if(i<=1) {System.out.println("1");return 1;}
        System.out.println(i);
        return call(i-1);
    }
}
