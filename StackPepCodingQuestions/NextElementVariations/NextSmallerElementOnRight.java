package com.company.StackPepCodingQuestions.NextElementVariations;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElementOnRight {
    public static void main(String[] args) {
        int[] a={1,13,2,5,7,12,4,6};
        int[] b={5,5,3,8,-2,7};
        int[] ans=NSR(a);
        System.out.println(Arrays.toString(NSR(b)));
    }

    private static int[] NSR(int[] a) { //O(n) since while loop rarely runs
        Stack<Integer> st = new Stack<>();
        int[] ans=new int[a.length];
        ans[a.length-1]=-1;
        st.push(a[a.length-1]);
        for (int i = a.length-2; i >=0; i--) {
            while(st.size()>0&&st.peek()>=a[i]){
                st.pop();
            }
            if(st.size()==0){
                st.push(a[i]);
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
                st.push(a[i]);
            }

        }
        return ans;
    }
}
