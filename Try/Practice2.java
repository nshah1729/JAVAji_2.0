package com.company.Try;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        toh(3,'A','B','C');
    }

    private static void toh(int i, char i1, char i2, char i3) {
        if(i==0)return;
        toh(i-1,i1,i3,i2);
        System.out.println(i+"["+i1+"-->"+i2+"]");
        toh(i-1,i3,i2,i1);
    }
}
