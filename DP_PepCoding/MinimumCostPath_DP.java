import java.util.Arrays;

public class MinimumCostPath_DP {
    public static void main(String[] args) {
        int n=2;
        int[][] a= {{3,1},
                    {4,3}};
        int[][] dp=new int[n][n];
        for (int i = n-1; i >=0; i--) {
            for (int j = n-1; j >=0; j--) {
                if(i==n-1 && j==n-1)dp[i][j]=a[i][j];//Last Cell
                else if(i==n-1){//Last Row
                    dp[i][j]=a[i][j]+dp[i][j+1];
                }else if(j==n-1){
                    dp[i][j]=a[i][j]+dp[i+1][j];
                }else{
                    dp[i][j]=a[i][j]+Math.min(dp[i+1][j],dp[i][j+1]);
                }
            }
        }
        System.out.println((dp[0][0]));
    }

}
