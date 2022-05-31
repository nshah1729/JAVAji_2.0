package com.company.PepCodingArrayListStrings;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        String ans=c1(s);
        String ans1=c2(s);
        System.out.println(ans);
        System.out.println(ans1);
    }
    public static String c1(String s){
        String ans=s.charAt(0)+"";
        for (int i = 1; i < s.length(); i++) {
            char curr=s.charAt(i);
            char prev=s.charAt(i-1);
            if (curr != prev)ans+=curr;
        }
        return ans;
    }

    public static String c2(String s){
        String ans=s.charAt(0)+"";
        int k=1;
        for (int i = 1; i < s.length(); i++) {
            char curr=s.charAt(i);
            char prev=s.charAt(i-1);
            if(curr==prev)k++;
            else{
                if(k>1){
                    ans+=k;
                    k=1;
                }
                ans+=curr;
            }
        }
        if(k>1)ans+=k;
        return ans;
    }
}
