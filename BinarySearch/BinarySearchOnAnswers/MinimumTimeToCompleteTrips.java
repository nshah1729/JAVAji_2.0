package com.company.BinarySearch.BinarySearchOnAnswers;

public class MinimumTimeToCompleteTrips {
    public static void main(String[] args) {
       int[] time ={5,10,10};
       int totalTrips = 9;
       long ans=minimumTime(time,totalTrips);
        System.out.println(ans);
    }
    public static long minimumTime(int[] a, int totalTrips) {
        long s=0, e=(long)Math.pow(10,14);
        while(s<e){
            long m=s+(e-s)/2;
            long cnt=0;
            for (int i = 0; i < a.length; i++) cnt+=m/a[i];
            if(cnt>=totalTrips)e=m;
           else{
                s=m+1;
            }
        }
        return e;
    }
}
