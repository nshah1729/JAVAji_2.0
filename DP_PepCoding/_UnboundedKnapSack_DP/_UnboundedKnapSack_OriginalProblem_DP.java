package _UnboundedKnapSack_DP;

import java.util.Scanner;

public class _UnboundedKnapSack_OriginalProblem_DP {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] w={10,20,30};
        int[] val={60,100,120};
        int n=w.length;
        int W=50;
        System.out.println(knapSack(W,w,val,w.length));
    }

    private static int knapSack(int W, int[] wt, int[] val, int n) {
        int[][] dp=new int[n+1][W+1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                if(i==0||j==0)dp[i][j]=0;
                else if(wt[i-1]<=j){
                    dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j]);
                }else dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][W];
    }
}
