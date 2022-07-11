package _LCS_DP;

import java.util.PriorityQueue;
import java.util.Scanner;

public class LCSubString_Var2_DP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Strings:");
        String a = sc.next();
        String b = sc.next();
        System.out.println("The length of LCSubstring is "+findTab(a,b,a.length(),b.length()));
    }

    private static int findTab(String a, String b, int n, int m) {
        int[][] dp=new int[n+1][m+1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m+1; j++) {
                if(i==0||j==0)dp[i][j]=0;
                else if(a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=0;
                }
            }
        }
        int max=-1;
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m+1; j++)
                max=Math.max(dp[i][j],max);
        }
//        return dp[n][m];
        return max;
    }
}
