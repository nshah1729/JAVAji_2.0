package _LCS_DP;

import java.util.Scanner;

public class _LCS_OriginalProblem_DP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Strings:");
        String a= sc.next();
        String b= sc.next();
//        System.out.println("The length of LCS is "+findRecursion(a,b,a.length(),b.length()));
        int[][] dp=new int[a.length()+1][b.length()+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++)
                dp[i][j] = -1;
        }
        System.out.println("The length of LCS is "+findMemo(a,b,a.length(),b.length(),dp));
    }

    private static int findRecursion(String a, String b,int n,int m) {
        if(n==0||m==0)return 0;
        if(a.charAt(n-1)==b.charAt(m-1))return 1+findRecursion(a,b,n-1,m-1);
        else{
            return Math.max(findRecursion(a,b,n,m-1),findRecursion(a,b,n-1,m));
        }
    }
    private static int findMemo(String a, String b,int n,int m,int[][] dp){
        if(n==0||m==0)return 0;
        if(dp[n][m]!=-1)return dp[n][m];
        if(a.charAt(n-1)==b.charAt(m-1))return dp[n][m]= 1+findMemo(a,b,n-1,m-1,dp);
        else{
//            dp[n][m-1]=findMemo(a,b,n,m-1,dp);
//            dp[n-1][m]=findMemo(a,b,n-1,m,dp);
//            return Math.max(dp[n][m-1],dp[n-1][m]);
            return Math.max(dp[n][m-1]=findMemo(a,b,n,m-1,dp),dp[n-1][m]=findMemo(a,b,n-1,m,dp));
        }
    }
//    public static int findTab(String a, String b,int n,int m){
//
//    }
}
