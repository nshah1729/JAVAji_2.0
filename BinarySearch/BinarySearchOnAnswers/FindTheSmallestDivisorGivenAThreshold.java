package com.company.BinarySearch.BinarySearchOnAnswers;

public class FindTheSmallestDivisorGivenAThreshold {
    public static void main(String[] args) {
        int[] a={1,2,5,9};
        int t=6;
        System.out.println(smallestDivisor(a,t));
    }
    public static int smallestDivisor(int[] a, int t) {
        int max=a[0];
        for (int val : a) max=Math.max(max,val);
        int s=1,e=max;
        if(t==a.length)return max;
        while(s<e){
            int m=s+(e-s)/2;

            if(summa(a,m,t))e=m;
            else s=m+1;
        }
        return e;
    }

    private static boolean summa(int[] a, int m, int t) {
        int sum=0;
        for (int val : a) {
            sum += Math.ceil(val * 1.0 / m);
        }
        return sum<=t;
    }
}
