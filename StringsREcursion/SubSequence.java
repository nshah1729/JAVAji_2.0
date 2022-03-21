package com.company.StringsREcursion;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=sc.nextLine();
        ArrayList<String> ans=getss(s);
        System.out.println(ans);
    }

    //Expectation:f(abc)->[---,a--,-b-,--c,ab-,-bc,a-c,abc]
    //Faith: f(bc)->[--,b-,-c,bc]
    //Relating faith to expectation:

    private static ArrayList<String> getss(String s) {
        if(s.length()==0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch=s.charAt(0);
        String ros=s.substring(1);
        ArrayList<String> res=getss(ros);//bc->[--,-c,b-,bc]
        ArrayList<String> finalRes=new ArrayList<>();
        for(String val:res){
            finalRes.add(val);
        }
        for(String val:res){
            finalRes.add(ch+val);
        }
        return finalRes;
    }
}
