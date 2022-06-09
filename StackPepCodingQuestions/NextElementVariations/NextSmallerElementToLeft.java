package com.company.StackPepCodingQuestions.NextElementVariations;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElementToLeft {
    public static void main(String[] args) {
        int[] a={1,13,2,5,7,12,4,6};
        int[] b={5,5,3,8,-2,7};
        System.out.println(Arrays.toString(NSEL(b)));
    }

    private static int[] NSEL(int[] a) { //O(n) since while loop rarely runs
        int n=a.length;
        Stack<Integer> st = new Stack<>();
        int[] ans=new int[a.length];
        ans[0]=-1;
        st.push(a[0]);
        for (int i = 1; i<n;i++) {
            while(st.size()>0&&a[i]<=st.peek()){
                st.pop();
            }
            if(st.size()==0)ans[i]=-1;

            else ans[i]=st.peek();

            st.push(a[i]);
        }
        return ans;
    }
}
