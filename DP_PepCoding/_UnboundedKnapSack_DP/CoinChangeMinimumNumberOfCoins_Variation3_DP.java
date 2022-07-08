package _UnboundedKnapSack_DP;

public class CoinChangeMinimumNumberOfCoins_Variation3_DP {
    public static void main(String[] args) {
        int n=4;
        int[] s={1,2,3};
        System.out.println(counting(s,s.length,n));
    }

    private static int counting(int[] s, int length, int n) {
        int[][] dp=new int[length+1][n+1];
        for (int i = 0; i < dp[0].length; i++) dp[0][i]=Integer.MAX_VALUE-1;
        for (int i = 1; i < dp.length; i++) dp[i][0]=0;
        for (int i = 1; i <dp[0].length ; i++) {
            if(i%s[0]==0) dp[1][i]=i/s[0];
            else dp[1][i]=Integer.MAX_VALUE-1;
        }
        for (int i = 2; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(s[i-1]<=j){
                    dp[i][j]=Math.min(1+dp[i][j-s[i-1]],dp[i-1][j]);
                }else dp[i][j]=dp[i-1][j];
            }
        }
        return dp[length][n];
    }
}
