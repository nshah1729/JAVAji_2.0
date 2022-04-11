package com.company.Assignments.Searching;

public class NumberOfTimesASortedArrayIsRotated {
    public static void main(String[] args) {
        int[] a={11,12,14,2,5,6,8};
        int count=times(a);
        System.out.println(count+1);
    }

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
}
