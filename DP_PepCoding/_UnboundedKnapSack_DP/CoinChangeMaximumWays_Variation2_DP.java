package _UnboundedKnapSack_DP;

import static _01KnapSack_DP.CountSubsetsWitGivenDifference_Variation5_DP.display;

public class CoinChangeMaximumWays_Variation2_DP {
    public static void main(String[] args) {
        int n=4;
        int[] s={1,2,3};
//        System.out.println(countingWays(s,n,s.length));
        System.out.println(counting(s,s.length,n));
    }
//    public static int countingWays(int[] s,int n,int idx){
//            if(idx<0&&n>0)return 0;
//            if(n==0) return 1;
//            if(n<0)return 0;
//
//            return countingWays(s,n-s[idx-1],idx-1)+countingWays(s,n,idx-1);
//    }
    public static int counting(int[] s,int n,int sum){
        int[][] dp=new int[n+1][sum+1];
        for (int i = 0; i < n+1; i++) dp[i][0]=1;
        for (int i = 1; i < sum+1; i++) dp[0][i]=0;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if(s[i-1]<=j){
                    dp[i][j]=dp[i-1][j]+dp[i][j-s[i-1]];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
//        display(dp);
        return dp[n][sum];
    }
}
