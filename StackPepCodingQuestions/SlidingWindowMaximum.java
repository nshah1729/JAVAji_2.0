package com.company.StackPepCodingQuestions;

import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] a={2, 9, 3, 8, 1, 7, 12, 6, 14, 4, 32, 0, 7, 19, 8, 12 ,6};
        System.out.println(maxWindow(a,4));
    }

    private static int[] maxWindow(int[] a,int k) {
        int n=a.length;
        int[] ans=new int[n-3];
        for (int i = 0; i < n-k; i++) {
            Stack<Integer> s=new Stack<>();
            int limit=0;
            while(s.size()>0&&limit<=k&&a[i]>s.peek()){
                s.pop();
                limit++;
            }
//            if()
        }
        return ans;
    }
}
