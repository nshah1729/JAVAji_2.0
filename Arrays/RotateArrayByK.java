package com.company.Arrays;

import java.util.Arrays;

public class RotateArrayByK {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
//        rotate(a,1);
        int[] ans=rotateBrute(a,4);
        System.out.println(Arrays.toString(ans));
    }

    private static void rotate(int[] a, int k) {
        k=k%a.length;
        //Reversing the First Part:
       int s=0,e=a.length-k-1;
        while(s<=e){
            int temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;e--;
        }
        //Reversing the Second Part:
         e=a.length-1;s=a.length-k;
        while(s<=e){
            int temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;e--;
        }
        //Reversing the Whole:
        e=a.length-1;s=0;
        while(s<=e){
            int temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;e--;
        }
    }

    private static int[] rotateBrute(int[] a, int k){
        int[] ans=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int correctIndex=(i+k)%a.length;
            ans[correctIndex]=a[i];
        }

        return ans;
    }
}
