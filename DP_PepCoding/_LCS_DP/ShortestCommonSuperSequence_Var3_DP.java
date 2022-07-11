package _LCS_DP;

import java.util.HashMap;
import java.util.HashSet;

public class ShortestCommonSuperSequence_Var3_DP {
    public static void main(String[] args) {
//        int[] b={-1,2,-1,-3,2,-3,4};
        int[] a={1,2,5,6,7};
        System.out.println(hasArrayTwoCandidates(a,4));

    }

   public static boolean hasArrayTwoCandidates(int a[], int t) {
        HashSet<Integer> set=new HashSet<>();
        for(int x:a)set.add(x);
        for(int x:a){
            if(set.contains(t-x))return true;
        }
        return false;
    }
}
