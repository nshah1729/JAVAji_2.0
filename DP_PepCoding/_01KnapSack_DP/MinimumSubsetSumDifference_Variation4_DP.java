package _01KnapSack_DP;

public class MinimumSubsetSumDifference_Variation4_DP {
    public static void main(String[] args) {
        int[] a={1,2,7};
        System.out.println(find(a,a.length));
    }
    public static int find(int[]a,int n){
        int sum=0;
        for (int i = 0; i < a.length; i++)sum+=a[i];
        boolean[][] dp=new boolean[n+1][sum+1];
        for (int i = 0; i < n+1; i++) dp[i][0]=true;
        for (int i = 1; i < sum+1; i++) dp[0][i]=false;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum+1; j++) {
                if(a[i-1]<=j){
                    dp[i][j]=dp[i-1][j-a[i-1]]||dp[i-1][j];
                }else dp[i][j]=dp[i-1][j];
            }
        }

        int min=Integer.MAX_VALUE;
        for (int j = 0;j <= sum/2; j++) {
            if(dp[n][j])min=Math.min(min,(sum-(2*j)));
        }
        return min;
    }
    public static void display(boolean[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
