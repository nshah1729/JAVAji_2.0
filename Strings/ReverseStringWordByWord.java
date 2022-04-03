package com.company.Strings;

import java.util.ArrayList;

public class ReverseStringWordByWord {
    public static void main(String[] args) {
        String s="My name is Nishant Shah";
        String ans=rev(s);
        System.out.println(ans);
    }

    private static String rev(String s) {
        String[] temp=s.split(" ");
        StringBuilder ans= new StringBuilder();

        for (int i = temp.length-1; i >=0; i--) {
        ans.append(temp[i]).append(" ");
        }
return ans.toString();
    }
}
