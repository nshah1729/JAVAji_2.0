package _01KnapSack_DP;

import java.util.Arrays;

public class CountNumberOfSubsets_Variation3_DP {
    public static void main(String[] args) {
        int[] a={2,3,5,6,8,10};
        int sum=10;
        System.out.println( countSubsetsTab(a,sum,a.length));
    }
    static int count=0;
    private static void countSubsets(int[] a, int t,int idx ,int asf) {
        if(idx==-1){
            if(asf==t)count++;
            return;
        }
        if(asf>t)return;
        countSubsets(a,t,idx-1,asf+a[idx]);
        countSubsets(a,t,idx-1,asf);
    }

//    private static void countSubsetsMemo(int[] a, int t,int idx ,int asf){
//        int[][] dp=new int[a.length+1][t+1];
//        for (int i = 0; i < dp.length; i++) {
//            for (int j = 0; j < dp[0].length; j++) {
//                dp[i][j]=-1;
//            }
//        }
//        if(idx==-1){
//            if(asf==t){
//                dp[idx][asf]=;
//            }
//        }
//        if(dp[idx][asf+idx]!=-1)dp[idx][asf]=;
//        countSubsets(a,t,idx-1,asf+a[idx]);
//        countSubsets(a,t,idx-1,asf);
//    }

    private static int countSubsetsTab(int[] a,int t,int n){
        int[][] dp=new int[n+1][t+1];
        for (int i = 0; i <=t; i++) dp[0][i]=0;
        for (int i = 0; i <=n; i++) dp[i][0]=1;

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(a[i-1]<=j){
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-a[i-1]];
                }else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][t];
    }
}
