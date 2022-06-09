package com.company.BinarySearch.BinarySearchOnAnswers;

public class CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
       int[] w = {1,2,3,1,1};
       int d = 4;
        System.out.println(shipWithinDays(w,d));
    }
    public static int shipWithinDays(int[] w, int d) {
        int s=0;
        int e=w[0];
        for(int val:w)e+=val;
        for(int val:w)s=Math.max(s,val);
        while(s<e){
            int m=s+(e-s)/2;
            if(isPossible(w,m,d))e=m;
                else s=m+1;
        }
        return e;
    }

    private static boolean isPossible(int[] w, int m, int d) {
        int days=1;
        int sum=0;
        for (int i = 0; i < w.length; i++) {
            sum+=w[i];
            if(sum>m){
                days++;
                sum=w[i];
            }
        }
        return days<=d;
    }
}
