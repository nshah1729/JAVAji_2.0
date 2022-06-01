package com.company.StackPepCodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementToRight {
    public static void main(String[] args) {
       int[] a={1,13,2,5,7,12,4,6};
       int[] b={5,5,3,8,-2,7};
       int[] ans=NGR(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Next greater for "+a[i]+" is "+ ans[i]);
        }
        System.out.println(Arrays.toString(ans));
    }

    private static int[] NGR(int[] a) {
        Stack<Integer> st = new Stack<>();
        int[] ans=new int[a.length];
//        ArrayList<Integer> ans=new ArrayList<>();
        ans[a.length-1]=-1;
        st.push(Math.max(-1, a[a.length - 1]));
        for (int i = a.length-2; i >=0; i--) {
        if(st.peek()>a[i]){
            ans[i]=(st.peek());
        }
        else{
            st.push(a[i]);
            ans[i]=(a[i]);
        }
    }
        return ans;
     }
}
