package com.company.RecursionPepCoding;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKeyPadCombination {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        String s=sc.nextLine();
        ArrayList<String> ans= getkp(s);
        System.out.println(ans);
    }
    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    private static ArrayList<String> getkp(String s) {

        //Base Case:
        if(s.length()==0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch=s.charAt(0);
        String ros=s.substring(1);
        ArrayList<String> temp=getkp(ros);
        ArrayList<String> res=new ArrayList<>();
        String var=codes[(int)ch-'0'];
        for (int i = 0; i < var.length(); i++) {
            for(String str:temp){
                res.add(var.charAt(i)+str);
            }
        }
        return res;

    }
}
