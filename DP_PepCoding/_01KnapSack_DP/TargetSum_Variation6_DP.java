package _01KnapSack_DP;

import static _01KnapSack_DP.CountSubsetsWitGivenDifference_Variation5_DP.find;

public class TargetSum_Variation6_DP {
    public static void main(String[] args) {
        int[] a={1,1,2,3};
        int s=1;
//        System.out.println(find(a,s,a.length));
        findNormalRecursion(a,s,0,0);
        System.out.println(count);
        System.out.println(find(a,s, a.length));
    }

    static int count;
    private static void findNormalRecursion(int[] a, int s, int idx,int asf) {
        if(idx==a.length){
            if(asf==s){
                count++;
            }
            return;
        }
        findNormalRecursion(a,s,idx+1,asf+a[idx]);
        findNormalRecursion(a,s,idx+1,asf-a[idx]);
    }

}
