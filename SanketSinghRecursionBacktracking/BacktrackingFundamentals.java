package com.company.SanketSinghRecursionBacktracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class BacktrackingFundamentals {
    public static void main(String[] args) {
//        findPaths(0,0,3,3,"");
//        System.out.println(totalPaths);
//        findPathsLinear(0,5,"");
//        System.out.println("Total Paths "+LinearTotalPaths);
//        permu2("aac","",new HashSet<String>());
        permu2("aaaaaaaaac","");
//        System.out.println(ans);

    }

    static int totalPaths = 0;

    private static void findPathss(int i, int j, int n, int m, String psf) {
        if (i == n - 1 && j == m - 1) {
            totalPaths++;
            System.out.println(psf);
            return;
        }
        if (i >= n || j >= m) return;
//        Horizonatal Paths(Move Right)
        findPathss(i, j + 1, n, m, psf + "H");

//        Vertical Paths(Move Down)
        findPathss(i + 1, j, n, m, psf + "V");

        //Diagonal Paths
        findPathss(i + 1, j + 1, n, m, psf + "D");

    }

    static int LinearTotalPaths = 0;

    private static void findPathsLinear(int i, int m, String psf) {
        if (i == m - 1) {
            System.out.println(psf);
            LinearTotalPaths++;
            return;
        }
        if (i >= m) return;//INVALID PATH

        for (int j = 1; j <= 6; j++) {
            findPathsLinear(i + j, m, psf + j);
        }
    }

    private static ArrayList<String> findPaths(int i, int j, int n, int m) {
        if (i > n || j > m) {
            return new ArrayList<>();
        } else if (i == n && j == m) {
            totalPaths++;
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> ans = new ArrayList<>();

        ArrayList<String> pathsH = findPaths(i, j + 1, n, m);
        ArrayList<String> pathsV = findPaths(i + 1, j, n, m);

//        for(String val:pathsH)ans.add("H"+val);
//        for(String val:pathsV)ans.add("V"+val);
        for (String val : pathsH) ans.add(val + "H");
        for (String val : pathsV) ans.add(val + "V");

        return ans;
    }

    public static ArrayList<String> permu(String a) {
        if (a.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            ArrayList<String> ros1 = permu(a.substring(0, i) + a.substring(i + 1, a.length()));
            for (String val : ros1) {
                ans.add(val + c);
            }
        }

        return ans;
    }

    public static void permu1(String a, String asf) {
        if (a.length() == 0) {
            System.out.println(asf);
            return;
        }

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < a.length(); i++) {
            char ch=a.charAt(i);
            String ros=a.substring(0,i)+a.substring(i+1);
            permu1(ros,asf+ch);
        }
    }
//    public static void permu2(String a, String asf,HashSet<String> set) {
//        if (a.length() == 0) {
//            if(!set.contains(asf)){
//                System.out.println(asf);
//                set.add(asf);
//            }
//
//            return;
//        }
//
//        ArrayList<String> ans = new ArrayList<>();
//
//        for (int i = 0; i < a.length(); i++) {
//            char ch=a.charAt(i);
//            String ros=a.substring(0,i)+a.substring(i+1);
//            permu2(ros,asf+ch,set);
//        }
//    }

    public static void permu2(String a, String asf){
        if(a.length()==0){
            System.out.println(asf);
            return;
        }
        HashSet<String> set=new HashSet<>();
        for (int i = 0; i < a.length(); i++) {
            char c=a.charAt(i);
            String ros=a.substring(0,i)+a.substring(i+1);
            if(!set.contains(ros))permu2(ros,asf+c);
            set.add(ros);
        }
    }
}
