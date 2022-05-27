package com.company.RecursionPepCoding;

import java.util.ArrayList;
import java.util.Scanner;

public class nnew {
    public static void main(String[] args) {
//        System.out.println(sumTill(100));
//        System.out.println(sumDigi(123457));
//        System.out.println(fac(9));
//        patternDob(5);
//        System.out.println(Fibo(5));
//        int[] a={1,2,3,4,3,4,5,2};
//        all(a,0,2);
//        ArrayList<String> ans=gss("abc");
//        System.out.println(ans);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        String s=sc.nextLine();
        ArrayList<String> ans= getKPC(s);
        System.out.println(ans);
    }

    private static void all(int[] a, int n,int target) {
        if(n==a.length)return;

        if(a[n]==target) System.out.println("Index: "+n);
        all(a,n+1,target);
    }

    private static int sumTill(int n) {
        if(n==0)return 0;
       int sumTillN_1=sumTill(n-1);
       return sumTillN_1+n;
    }
    private static int sumDigi(int n) {
        if(n==0)return 0;
       int rem=n%10;
       int sum=0;
       sum+=rem;
       sum+=sumDigi(n/10);
       return sum;
    }
    private static int fac(int n) {
        if(n==0)return 1;
        return n*fac(n-1);
    }
    private static void pattern(int n){
        if(n==0)return;
        pattern(n-1);
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    private static void patternRev(int n){
        if(n==0)return;

        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        patternRev(n-1);
    }
    private static void patternDob(int n){
        if(n==1){
            System.out.println(1);
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        patternDob(n-1);
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    private static int Fibo(int n){
        if(n==1)return 0;
        if(n==2)return 1;
        return Fibo(n-1)+Fibo(n-2);
    }
    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> rres=gss(ros);
        ArrayList<String> ans=new ArrayList<>();
        for(String val:rres){
            ans.add(""+val);
            ans.add(ch+val);
        }
        return ans;
    }
    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);

        ArrayList<String> rres=getKPC(ros);
        ArrayList<String> ans=new ArrayList<>();

        String var=codes[ch-'0'];
        for(int i=0;i<var.length();i++){
            for(String val:rres){
                ans.add(var.charAt(i)+val);
            }
        }
        return ans;
    }
}
