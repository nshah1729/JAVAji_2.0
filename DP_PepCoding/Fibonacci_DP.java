public class Fibonacci_DP {
    public static void main(String[] args) {
        int n=30;
        System.out.println( printFibo(n,new int[n+1]));
    }

    private static int printFibo(int n,int[] dp) {
        if(n==1||n==0)return n;
        if(dp[n]>0)return dp[n];
        System.out.println("Hello "+n);
        int fbnm1=printFibo(n-1,dp);
        int fbnm2=printFibo(n-2,dp);
        int fbn=fbnm1+fbnm2;

        dp[n]=fbn;
        return fbnm1+fbnm2;
    }
}
