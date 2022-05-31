package com.company.PepCodingArrayListStrings;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans=toggle(s);
        System.out.println(ans);
    }
    public static String toggle(String s){
        StringBuilder sb=new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            char c=sb.charAt(i);
            if(c>='a'&&c<='z'){
                c=(char)('A'+c-'a');
                sb.setCharAt(i,c);
            }else if(c>='A'&&c<='Z'){
                c=(char)('a'+c-'A');
                sb.setCharAt(i,c);
            }
        }
        return sb.toString();
    }
}
