package _01KnapSack_DP;

public class _01Knapsack_DP {
    public static void main(String[] args) {
        int[] w={10,20,30};
        int[] val={60,100,120};
        int n=w.length;
        int W=50;
        System.out.println(knapSack(W,w,val,w.length));
        System.out.println(knapSackMemo(W,w,val,w.length,new int[n+1][W+1]));
        System.out.println(knapSackTab(W,w,val,w.length));
    }

    static int knapSack(int W, int wt[], int val[], int n)
    {
    // Base Case
    if (n == 0 || W == 0)
        return 0;

    // If weight of the nth item is
    // more than Knapsack capacity W,
    // then this item cannot be included
    // in the optimal solution
    if (wt[n - 1] > W)
        return knapSack(W, wt, val, n - 1);

        // Return the maximum of two cases:
        // (1) nth item included
        // (2) not included
    else
        return Math.max(val[n - 1]
                        + knapSack(W - wt[n - 1], wt,
                        val, n - 1),
                knapSack(W, wt, val, n - 1));
}

    static int knapSackMemo(int W, int wt[], int val[], int n,int[][] dp)
    {
    if (n == 0 || W == 0) return 0;

    if(dp[n][W]>0)return dp[n][W];

    if (wt[n - 1] > W)return dp[n][W]=knapSackMemo(W, wt, val, n - 1,dp);

    else
        return dp[n][W]=Math.max(val[n - 1]
                        + knapSackMemo(W - wt[n - 1], wt,
                        val, n - 1,dp),
                knapSackMemo(W, wt, val, n - 1,dp));
}

    static int knapSackTab(int W, int wt[], int val[], int n){
        int[][] dp=new int[n+1][W+1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < W+1; j++) {
                if(i==0||j==0)dp[i][j]=0;
                else if(wt[i-1]<=j){
                    dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                }else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
}
