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

    private static String findTab(String a, String b, int length, int length1) {
        return "fgd";
    }
}
