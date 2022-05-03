package com.company.RecursionPepCoding;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairsPath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int s=sc.nextInt();
        ArrayList<String> ans= getsp(s);
        System.out.println(ans);
    }

    private static ArrayList<String> getsp(int n) {

        if(n==0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        else if(n<0){
            ArrayList<String> bres=new ArrayList<>();
            return bres;
        }

        ArrayList<String> paths1=getsp(n-1);
        ArrayList<String> paths2=getsp(n-2);
        ArrayList<String> paths3=getsp(n-3);

        ArrayList<String> ans=new ArrayList<>();
        for(String str:paths1)ans.add(1+str);
        for(String str:paths2)ans.add(2+str);
        for(String str:paths3)ans.add(3+str);
        return ans;
    }
}
