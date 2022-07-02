public class ClimbStairsWithMinimumMoves_DP {
    public static void main(String[] args) {
        int n=10;
        int[] a={1,1,1,4,9,8,1,1,10,1};
        Integer[] dp=new Integer[n+1];
        dp[n]=0;
        for (int i = n-1; i >=0 ; i--) {
            if(a[i]>0){
                int sp=Integer.MAX_VALUE;
                for (int j = 1; j <=a[i]&&i+j<=n ; j++) {
                    if (dp[i+j]!=null)
                    sp=Math.min(sp,dp[i+j]);
                }
                if(sp!=Integer.MAX_VALUE){
                    dp[i]=1+sp;
                }
            }
        }
        System.out.println(dp[0]);
    }
}
