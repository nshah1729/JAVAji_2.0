package com.company.StringsREcursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKeypadCombination {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=sc.nextLine();
        ArrayList<String> ans=kc(s);
        System.out.println(ans);
    }

   static String[] codes= {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    private static ArrayList<String> kc(String s) {

        char ch=s.charAt(0);
        String ros=s.substring(1);

        ArrayList<String> res=kc(ros);
        ArrayList<String> finalRes=new ArrayList<>();

        String codeforch=codes[ch];
        for(int i=0;i<codeforch.length();i++){
            char temp=codeforch.charAt(i);
            for(String str:res){
                finalRes.add(temp+str);
            }
        }
        return finalRes;
    }
}
