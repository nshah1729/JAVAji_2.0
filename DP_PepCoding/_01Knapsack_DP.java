public class _01Knapsack_DP {
    public static void main(String[] args) {
        int[] w={10,20,30};
        int[] val={60,100,120};
        int capacity=50;
        System.out.println(knp0_1(w,val,capacity,w.length));
//        System.out.println(knapSack(capacity,w,val,w.length));
    }

    private static int knp0_1(int[] w, int[] val, int capacity, int n) {
        if(n==0||capacity==0)return 0;
        if(w[n-1]<=capacity){
            return Math.max(val[n-1]+knp0_1(w,val,capacity-w[n-1],n-1),knp0_1(w,val,capacity,n-1));
        }
       else return knp0_1(w,val,capacity,n-1);
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

}
