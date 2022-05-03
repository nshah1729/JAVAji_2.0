package com.company.RecursionPepCoding;

import java.util.ArrayList;

public class GetSubSequence {
    public static void main(String[] args) {
        String s="123";
        ArrayList<String> ans=getss(s);
        System.out.println(ans);
    }

    private static ArrayList<String> getss(String s) {
        if(s.length()==0){
            ArrayList<String> base=new ArrayList<>();
            base.add(" ");
            return base;

        }
        char ch=s.charAt(0);
        String ros=s.substring(1);
        ArrayList<String> temp=getss(ros);
        ArrayList<String> ans=new ArrayList<>();
        for (int i = 0; i < temp.size(); i++) {
            ans.add(""+temp.get(i));
            ans.add(ch+temp.get(i));
        }
        return ans;
    }
}
