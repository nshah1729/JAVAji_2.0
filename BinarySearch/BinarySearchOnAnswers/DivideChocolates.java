package com.company.BinarySearch.BinarySearchOnAnswers;

public class DivideChocolates {
    public static void main(String[] args) {
        int[] a={5,6,7,8,9,1,2,3,4};
        int k=8;
        System.out.println(FindMaxDivide(a,k));
    }

    private static int FindMaxDivide(int[] a, int k) {
        int s=1,e=0;
        for(int val:a)s=Math.min(s,val);
        for(int val:a)e+=val;
        while(s<e){
            int m=s+(e-s)/2;
            if(blackBox(a,m,k+1)){
                e=m;
            }else{
               s=m+1;
            }
        }
        return e;
    }

    private static boolean blackBox(int[] a, int m, int k) {
        int sa=1;
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
            if(sum>m){
                sa++;
                sum=a[i];
            }
        }
        return sa>=k;
    }
}
