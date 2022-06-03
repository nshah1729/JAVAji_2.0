package com.company.DP_PepCoding;

public class Tribonacci {
    public static void main(String[] args) {
        System.out.println( tMemo(35,new int[36]));
        System.out.println( tRec(35));
        System.out.println( tTab(35));
    }
    //Normal Recursion
    public static int tRec(int n) {

        if(n==0)return 0;
        if(n==1||n==2)return 1;

        return tRec(n-1)+tRec(n-2)+tRec(n-3);
    }
    //Memoization
    public static int tMemo(int n, int[] dp) {
        if(n==0)return 0;
        if(n==1||n==2)return 1;
        if(dp[n]!=0)return dp[n];
        int tbnm1=tMemo(n-1,dp);
        int tbnm2=tMemo(n-2,dp);
        int tbnm3=tMemo(n-3,dp);
        int tb=tbnm1+tbnm2+tbnm3;
        dp[n-1]=tbnm1;
        dp[n-2]=tbnm2;
        dp[n-3]=tbnm3;
        dp[n]=tb;
        return tb;
    }
    //Tabulation
    public static int tTab(int n){
        if(n==0)return 0;
        if(n==1||n==2)return 1;
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[2]=1;
        dp[1]=1;

        for (int i = 3; i < dp.length; i++) {
            dp[i]=dp[i-3]+dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
