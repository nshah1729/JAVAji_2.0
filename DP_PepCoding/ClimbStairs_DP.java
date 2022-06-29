public class ClimbStairs_DP {
    public static void main(String[] args) {
        int n=10;
//        System.out.println(CountPaths(n));
//        System.out.println(CountPathsDP(n,new int[n+1]));
        System.out.println(CountPathsDP_Tab(n));
    }

    private static int CountPaths(int n) {
        if(n==0)return 1;
        if (n<0)return 0;
        System.out.println("Hello "+n);
        int nm1=CountPaths(n-1);
        int nm2=CountPaths(n-2);
        int nm3=CountPaths(n-3);
        return nm1+nm2+nm3;
    }

    private static int CountPathsDP(int n,int[] dp) {
        if(n==0)return 1;
        if (n<0)return 0;
        if (dp[n]>0)return dp[n];
        int nm1=CountPathsDP(n-1,dp);
        int nm2=CountPathsDP(n-2,dp);
        int nm3=CountPathsDP(n-3,dp);
        int ans=nm1+nm2+nm3;
        dp[n]=ans;
        return ans;
    }

    private static int CountPathsDP_Tab(int n) {
        int[] dp=new int[n+1];
        dp[0]=1;
        for (int i = 1; i <= n; i++) {
            if(i==1){
                dp[i]=dp[i-1];
            }else if(i==2){
                dp[i]=dp[i-1]+dp[i-2];
            }else {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
        }
        return dp[n];
    }
}
