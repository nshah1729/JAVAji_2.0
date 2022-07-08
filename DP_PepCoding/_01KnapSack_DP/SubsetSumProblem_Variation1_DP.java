package _01KnapSack_DP;

public class SubsetSumProblem_Variation1_DP {
    public static void main(String[] args) {
        int[] a = {57, 68, 27, 100, 69, 49, 100, 51, 71, 63, 77, 20, 63, 4, 11, 31, 21, 23, 94, 5, 56, 54, 15, 88, 61, 89, 5, 22, 83, 55, 90, 39, 74, 16, 38, 42, 17, 37, 93, 39, 52, 69, 59, 14, 24, 21, 96, 96, 43, 89, 100, 51, 95, 15, 38, 7, 55, 42, 28, 37, 49, 69, 75, 74, 36, 12, 16, 52, 1, 60, 43, 52, 80, 53, 65, 55, 73, 12, 50, 68, 100, 50, 18, 94, 16, 7, 100, 70, 1, 79, 58, 49, 47, 32, 74, 35, 95, 89, 38, 47};
        int sum = 5142;
        System.out.println(isSubsetSumPresent(a, sum, a.length));
        System.out.println(isSubsetSumPresentTab(a, a.length, sum));
    }

    private static boolean isSubsetSumPresent(int[] a, int sum, int n) {
        if (n == 0) {
            if (sum == 0) return true;
            return false;
        }
        return isSubsetSumPresent(a, sum - a[n - 1], n - 1) || isSubsetSumPresent(a, sum, n - 1);
    }


    //It's obtained by just tweaking some lines of the KnappSack Problem
    //Since, here also we're given the choice to include the element or not

    private static boolean isSubsetSumPresentTab(int[] a, int n, int sum) {
        boolean[][] dp = new boolean[n + 1][sum + 1];

        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i]=false;
        }
        for (int i = 0; i < dp.length; i++) {
            dp[i][0]=true;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
               if (a[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - a[i - 1]] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];
    }
}
