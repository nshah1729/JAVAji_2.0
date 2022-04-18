package com.company.Assignments.Searching;

public class FloorCeilOfElement {
    public static void main(String[] args) {
        int[] a={2,5,10,14,20};
        int t=12;
        System.out.println("The Floor of "+t+" is "+flooring(a,t));
        System.out.println("The Ceil of "+t+" is "+ceiling(a,t));
    }

    private static int flooring(int[] a, int t) {
        int ans=0;
        int s=0,e=a.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(a[m]==t)return a[m];
            else if(a[m]>t)e=m-1;
            else s=m+1;
        }
        return a[e];
    }

    private static int ceiling(int[] a, int t) {
        int ans=0;
        int s=0,e=a.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(a[m]==t)return a[m];
            else if(a[m]<t)s=m+1;
            else e=m-1;
        }
        return a[s];
    }
}
