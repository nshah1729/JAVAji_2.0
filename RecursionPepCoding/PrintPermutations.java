package com.company.RecursionPepCoding;

import java.util.Scanner;

public class PrintPermutations {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        printPermutations("abc","");
    }
    public static void printPermutations(String s, String ans) {
        if(s.length()==0){
            System.out.println(ans+" ");
            return;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            String qLeftPart=s.substring(0,i);
            String qRightPart=s.substring(i+1);
            String ros=qLeftPart+qRightPart;
            printPermutations(ros,ans+c);
        }
    }
}
