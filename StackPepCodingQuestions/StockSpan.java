package com.company.StackPepCodingQuestions;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] a={2 ,5, 9, 3, 1, 12, 6, 8, 7};
        int n=a.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        st.push(a[0]);
        for (int i = 0; i<n; i++) {
            int k=1;
            while(st.size()>0&&st.peek()<a[i]){
                st.pop();
                k++;
            }
            if(st.size()==0){
                ans[i]=i+1;
            }else{
                ans[i]=k;
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
