package com.company.PepCodingArrayListStrings;

import java.util.Scanner;

/*
1. You are given a string that contains only lowercase and uppercase alphabets.
2. You have to form a string that contains the difference of ASCII values of every
two consecutive characters between those characters.
   For "abecd", the answer should be "a1b3e-2c1d", as
   'b'-'a' = 1
   'e'-'b' = 3
   'c'-'e' = -2
   'd'-'c' = 1
*/
public class StringWithDifference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans=find(s);
        System.out.println(ans);
    }
    public static String find(String s){
        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char curr=s.charAt(i);
            char prev=s.charAt(i-1);
           int diff=curr-prev;
           sb.append(diff);
           sb.append(curr);
        }
        return sb.toString();
    }
}
