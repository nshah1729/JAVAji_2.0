package _LCS_DP;

import java.util.Scanner;

public class PrintLCSubString_Var1_DP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Strings:");
        String a = sc.next();
        String b = sc.next();
        System.out.println("The length of LCS is "+findTab(a,b,a.length(),b.length()));
    }

    private static int findTab(String a, String b, int n, int m) {
        if(n==0||m==0)return 0;
        if(a.charAt(n-1)==b.charAt(m-1))return 1+findTab(a,b,n-1,m-1);
        else return 0;
    }
}
