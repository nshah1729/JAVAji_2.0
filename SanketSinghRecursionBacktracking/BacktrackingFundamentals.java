package com.company.SanketSinghRecursionBacktracking;

import java.util.ArrayList;

public class BacktrackingFundamentals {
    public static void main(String[] args) {
//        findPaths(0,0,3,3,"");
//        System.out.println(totalPaths);
//        findPathsLinear(0,10,"");
//        System.out.println("Total Paths "+LinearTotalPaths);
        ArrayList<String> ans=findPaths(0,0,3,3);
        System.out.println(ans);
    }
static int totalPaths=0;
//    private static void findPaths(int i,int j,int n, int m, String psf) {
//        if(i==n-1&&j==m-1){
//            totalPaths++;
//            System.out.println(psf);
//            return;
//        }
//        if(i>=n||j>=m)return;
////        Horizonatal Paths(Move Right)
//        findPaths(i,j+1,n,m,psf+"H");
//
////        Vertical Paths(Move Down)
//        findPaths(i+1,j,n,m,psf+"V");
//
//        //Diagonal Paths
//        findPaths(i+1,j+1,n,m,psf+"D");
//
//    }
static int LinearTotalPaths=0;
    private static void findPathsLinear(int i,int m, String psf) {
        if(i==m-1){
            System.out.println(psf);
            LinearTotalPaths++;
            return;
        }
        if(i>=m)return;

        //For "1" Jump
        findPathsLinear(i+1,m,psf+"1");
        //For "2" Jump
        findPathsLinear(i+2,m,psf+"2");
        //For "3" Jump
        findPathsLinear(i+3,m,psf+"3");
        //For "4" Jump
        findPathsLinear(i+4,m,psf+"4");
        //For "5" Jump
        findPathsLinear(i+5,m,psf+"5");
        //For "6" Jump
        findPathsLinear(i+6,m,psf+"6");
    }

    private static ArrayList<String> findPaths(int i, int j, int n, int m) {
        if(i==n-1&&j==m-1){
            totalPaths++;
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        if(i>=n||j>=m){
            return new ArrayList<>();
        }

//        Horizonatal Paths(Move Right)
           ArrayList<String> pathsH=findPaths(i,j+1,n,m);
        for(String val:pathsH)val+="H";
//        Vertical Paths(Move Down)
        ArrayList<String> pathsV=findPaths(i,j+1,n,m);
        for(String val:pathsH)val+="V";
        //Diagonal Paths
        ArrayList<String> pathsD=findPaths(i+1,j+1,n,m);
        for(String val:pathsH)val+="D";

        ArrayList<String> paths=new ArrayList<>();

        paths.addAll(pathsH);
        paths.addAll(pathsV);
        paths.addAll(pathsD);
        return paths;
    }
}
