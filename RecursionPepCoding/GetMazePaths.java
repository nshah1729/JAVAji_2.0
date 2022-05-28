package com.company.RecursionPepCoding;

import java.util.ArrayList;

public class GetMazePaths {
    public static void main(String[] args) {
        ArrayList<String> ans= getmp(1,1,3,3);
        System.out.println(ans);
    }

    public static ArrayList<String> getmp(int sr, int sc, int dr, int dc) {
        if(sc>dc||sr>dr){
            return new ArrayList<>();
        }else if(sc==dc&&sr==dr){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> pathsH=getmp(sr,sc+1,dr,dc);
        ArrayList<String> pathsV=getmp(sr+1,sc,dr,dc);

        ArrayList<String> ans=new ArrayList<>();
        for(String str:pathsH)ans.add("h"+str);
        for(String str:pathsV)ans.add("v"+str);
        return ans;
    }
}
