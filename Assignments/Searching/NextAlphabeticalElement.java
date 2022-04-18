package com.company.Assignments.Searching;

public class NextAlphabeticalElement {
    public static void main(String[] args) {
        char[] a={'a','a','a','a','a','a','a','a','b','b','b','b','d','z'};
        char t='b';
        System.out.println(next(a,t));
    }

    private static char next(char[] a, char t) {
        char ans = '#';
        int s = 0, e = a.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if(a[m]==t)s=m+1;
            else if(a[m]>t){
                ans=a[m];
                e=m-1;
            }
            else s=m+1;
        }
        return ans;
    }
}
