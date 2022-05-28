package com.company.RecursionPepCoding;

import java.util.*;

public class PrintSubSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        printSS("abc","");
    }

    public static void printSS(String s,String ans) {
        if(s.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char ch=s.charAt(0);
        String ros=s.substring(1);
        printSS(ros,ans+ch);
        printSS(ros,ans+"");
    }
}
