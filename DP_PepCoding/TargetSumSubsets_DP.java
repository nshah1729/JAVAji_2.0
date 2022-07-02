public class TargetSumSubsets_DP {
    public static void main(String[] args) {

        int[] a={10,20,30,40,50,60,70,80,90,100,110,120};
//        printSubset(a,0,0,150,"");
        System.out.println( printSubset_Tab(a,a.length,111));
    }

    private static void printSubset(int[] a, int idx, int sum,int t,String asf) {
        if(idx==a.length){
            if(sum==t) System.out.println(asf);
            return;
        }
        if(sum>t)return;
        printSubset(a,idx+1,sum+a[idx],t,asf+a[idx]+" ");
        printSubset(a,idx+1,sum,t,asf);
    }
    private static boolean printSubset_Tab(int[] a,int n,int t){
        boolean[][] dp=new boolean[n+1][t+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if(i==0&&j==0){
                    dp[i][j]=true;
                }else if(i==0){
                    dp[i][j]=false;
                }else if(j==0){
                    dp[i][j]=true;
                }else{
                    if(dp[i-1][j])dp[i][j]=true;
                    else {
                        int val=a[i-1];
                        if(j>=val){
                            if(dp[i-1][j-val]){
                                dp[i][j]=true;
                            }
                        }
                    }
                }
            }
        }
        return dp[n][t];
    }
}
