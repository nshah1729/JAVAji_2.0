package com.company.Assignments.Searching;

public class ArrangeCoins {
    public static void main(String[] args) {
        System.out.println(arr(5));
    }

    private static int arr(int n) {

        int k=1,count=0;
        while(n>=k){
            n-=k;
            k++;
            count++;
        }
        return count;
    }
}
