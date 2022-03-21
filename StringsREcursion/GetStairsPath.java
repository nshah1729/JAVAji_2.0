package com.company.StringsREcursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairsPath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        System.out.println(get(n));
    }

    private static ArrayList<String> get(int n) {

        if(n==0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        else if(n<0){
            ArrayList<String> bres=new ArrayList<>();
            return bres;
        }

        ArrayList<String> p1=get(n-1);
        ArrayList<String> p2=get(n-2);
        ArrayList<String> p3=get(n-3);
        ArrayList<String> p4=get(n-4);
        ArrayList<String> p5=get(n-5);
        ArrayList<String> paths=new ArrayList<>();

        for(String val:p1) paths.add(1+val);

        for(String val:p2) paths.add(2+val);

        for(String val:p3) paths.add(3+val);

        for(String val:p4) paths.add(4+val);

        for(String val:p5) paths.add(5+val);

        return paths;
    }
}
