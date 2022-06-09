package com.company.BinarySearch.BinarySearchOnAnswers;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] a = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(a,h));
    }
    public static int minEatingSpeed(int[] a, int h) {
        int s=0,e=a[0];
        for(int val:a)e=Math.max(e,val);
        if(h==a.length)return e;
        while (s < e) {
            int m=s+(e-s)/2;
            if(poss(a,m,h)){
                e=m;
            }else s=m+1;
        }
        return e;
    }

    private static boolean poss(int[] a, int m, int h) {
        int time=0;
        for(int val: a)time+=Math.ceil(val*1.0/m);
        return time<=h;
    }
}
