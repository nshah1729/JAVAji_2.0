package com.company.DP_PepCodings;

public class ClimbStairs {
    public static void main(String[] args) {
        int n=10;

        int ans=countPathsDP(n,new int[n+1]);
        System.out.println(ans);

        int ans1= countPathsDPTab(n);
        System.out.println(ans1);
    }
    private static int countPaths(int n) {
        if(n==0){
            return 1;
        }
        else if(n<0)return 0;


        int pathnm1= countPaths(n-1);
        int pathnm2= countPaths(n-2);
        int pathnm3= countPaths(n-3);
        int paths=pathnm1+pathnm2+pathnm3;
        return paths;
    }

    private static int countPathsDP(int n, int[] dp) {
        if(n==0)return 1;
        else if(n<0)return 0;
        if(dp[n]!=0)return dp[n];

        int pathnm1= countPaths(n-1);
        int pathnm2= countPaths(n-2);
        int pathnm3= countPaths(n-3);
        int paths=pathnm1+pathnm2+pathnm3;

        dp[n]=paths;

        return paths;
    }

    private static int countPathsDPTab(int n) {
        int[] dp=new int[n+1];
        dp[0]=1;
        for (int i = 1; i <= n; i++) {
            if(i==1){
                dp[i]=dp[i-1];
            }else if(i==2){
                dp[i]=dp[i-1]+dp[i-2];
            }else if(i>=3){
                dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
            }
        }
        return dp[n];
    }
}
