package com.company.PepCodingArrayListStrings;

import java.util.*;
public class PermutationsOfAString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] ans= premu(s).toArray(new String[0]);
        System.out.println(Arrays.toString(ans));
    }
    public static ArrayList<String> premu(String s){
        ArrayList<String> ans=new ArrayList<>();
        int f=fac(s.length());
        for (int i = 0; i < f; i++) {
            StringBuilder sb=new StringBuilder(s);
            int temp=i;
            for (int div = s.length(); div>=1 ; div--) {
                int q=temp/div;
                int r=temp%div;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp=q;
            }
            System.out.println();
        }
        return ans;
    }

    private static int fac(int n) {
        if(n==0)return 1;
        return n*fac(n-1);
    }
}
