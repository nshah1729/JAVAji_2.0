import java.util.Scanner;

public class PathWithMaximumGold_DP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=6;
        int[][] a=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        int[][] dp=new int[n][n];
        for (int j = n-1; j >=0 ; j--) {
            for (int i = 0; i < n; i++) {
                if(j==n-1)dp[i][j]=a[i][j];//Last Column
                else if(i==0)dp[i][j]=a[i][j]+Math.max(dp[i][j+1],dp[i+1][j+1]);//First Row
                else if(i==n-1)dp[i][j]=a[i][j]+Math.max(dp[i-1][j+1],dp[i][j+1]);
                else{
                    dp[i][j]=a[i][j]+Math.max(Math.max(dp[i+1][j+1],dp[i][j+1]),dp[i-1][j+1]);
                }
            }
        }
        int max=Integer.MIN_VALUE;
        for (int i = 0,j=0; i < n; i++) {
            max=Math.max(max,dp[i][j]);
        }
        System.out.println(max);
    }
}
