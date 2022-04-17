package com.company.Assignments.Searching;

import java.util.Arrays;

public class NumberOfTimesASortedArrayIsRotated {
    public static void main(String[] args) {
        int[] a={11,12,14,2,5,6,8};
        int count=times(a);
        int count_1=timesAliter(a);
        System.out.println(count+1);
        System.out.println(count_1);
    }
    //Finding the peak element.
    private static int times(int[] a) {
        int s=0,e=a.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(a[m]>a[m+1])return m;
            else if(a[m]<a[m+1]&&a[m]<a[a.length-1])e=m-1;
            else s=m+1;
        }
        return -1;
    }
    //Finding the minimum element in the array:It's index will be the ans
    private static int timesAliter(int[] a) {
        int s=0,e=a.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            int prev=(m+a.length-1)%a.length;;
            int next=(m+1)%a.length;
            if(a[m]<a[next]&&a[m]<a[prev])return m;
            else if(a[m]>a[s])s=m+1;
            else e=m-1;
        }
        return -1;
    }
}
