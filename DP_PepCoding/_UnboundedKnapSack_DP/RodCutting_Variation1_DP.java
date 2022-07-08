package _UnboundedKnapSack_DP;

import java.util.Arrays;

public class RodCutting_Variation1_DP {
    public static void main(String[] args) {
        int l=8;
        int[] price={1,5,8,9,10,17,17,20};
        System.out.println(maxProfit(l,price));
    }


    private static int maxProfit(int n, int[] price) {
        int[] l=new int[n];
        for (int i = 0; i < n; i++) l[i]=i+1;
        int[][] dp=new int[n+1][n+1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if(i==0||j==0)dp[i][j]=0;
                else if(l[i-1]<=j){
                    dp[i][j]=Math.max(price[i-1]+dp[i][j-l[i-1]],dp[i-1][j]);
                }else dp[i][j]=dp[i-1][j];
            }
        }

        return dp[n][n];

    }
}
