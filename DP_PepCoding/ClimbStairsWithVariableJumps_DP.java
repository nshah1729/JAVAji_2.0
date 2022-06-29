public class ClimbStairsWithVariableJumps_DP {
    public static void main(String[] args) {
        int n=6;
        int[] a={2,3,0,1,2,3};
        System.out.println(find(n,a));
    }

    private static int find(int n, int[] a) {
        int[] dp=new int[n+1];
        dp[n]=1;
        for (int i = n-1; i >=0 ; i--) {
            for (int j = 0; j <=a[i]&&i+j<=n ; j++) {
                dp[i]+=dp[i+j];
            }
        }
        return dp[0];
    }
}
