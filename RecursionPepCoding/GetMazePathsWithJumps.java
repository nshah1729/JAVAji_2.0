package com.company.RecursionPepCoding;

import java.util.ArrayList;

public class GetMazePathsWithJumps {
    public static void main(String[] args) {
        ArrayList<String> ans= getmpwj(1,1,2,2);
        System.out.println(ans);
    }

    public static ArrayList<String> getmpwj(int sr, int sc, int dr, int dc) {
        if(sc==dc&&sr==dr){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        //ANSWER
        ArrayList<String> paths=new ArrayList<>();
        //HORIZONTAL
        for(int h=1;h<=dc-sc;h++){
            ArrayList<String> pathsH=getmpwj(sr,sc+h,dr,dc);
            for(String val:pathsH)paths.add("h"+h+val);
        }
        //VERTICAL
        for(int v=1;v<=dr-sr;v++){
            ArrayList<String> pathsH=getmpwj(sr+v,sc,dr,dc);
            for(String val:pathsH)paths.add("v"+v+val);
        }
        //DIAGONAL
        for(int d=1;d<=dr-sr&&d<=dc-sc;d++){
            ArrayList<String> pathsH=getmpwj(sr+d,sc+d,dr,dc);
            for(String val:pathsH)paths.add("d"+d+val);
        }
        return paths;
    }
}
