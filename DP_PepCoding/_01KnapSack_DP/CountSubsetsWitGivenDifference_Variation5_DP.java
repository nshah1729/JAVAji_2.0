package _01KnapSack_DP;

public class CountSubsetsWitGivenDifference_Variation5_DP {
    public static void main(String[] args) {
        int[] a={1,1,2,3};
        int d=1;
        System.out.println(find(a,d,a.length));
    }

    static int find(int[] a, int d, int n) {
        int sumOfArray=0;
        for (int i = 0; i < a.length; i++) sumOfArray+=a[i];
        int requiredSum=(d+sumOfArray)/2;
        int[][] dp=new int[n+1][requiredSum+1];

        for (int i = 0; i < dp.length; i++)dp[i][0]=1;
        for (int i = 1; i < dp[0].length; i++)dp[0][i]=0;

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {

                if(a[i-1]<=j) dp[i][j]=dp[i-1][j]+dp[i-1][j-a[i-1]];

                else dp[i][j]=dp[i-1][j];
            }
        }
//        display(dp);
        return dp[n][requiredSum];

    }
    public static void display(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
