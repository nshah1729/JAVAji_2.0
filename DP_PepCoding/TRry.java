public class TRry {
    public static void main(String[] args) {
        int n=45;
        System.out.println(fibTab(n));
        System.out.println(fibMemo(n,new int[n+1]));
        System.out.println(fib1(n));

    }

    private static int fib1(int n) {
        if(n<=1)return n;
        return fib1(n-1)+fib1(n-2);
    }

    private static int fibTab(int n) {
        int[] ans=new int[n+1];
        ans[0]=0;
        ans[1]=1;
        for (int i = 2; i <= n; i++) {
            ans[i]=ans[i-1]+ans[i-2];
        }
        return ans[n];
    }
    private static int fibMemo(int n,int[] dp) {
        if(dp[n]>0)return dp[n];
        if(n<=1)return n;
        int fibnm1=fibMemo(n-1,dp);
        int fibnm2=fibMemo(n-2,dp);
        int fibb=fibnm1+fibnm2;
        dp[n]=fibb;
        return fibb;
    }
}
