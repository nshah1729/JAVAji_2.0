package com.company.StackPepCodingQuestions.NextElementVariations;

import java.util.*;

public class NextGreaterElementToRight {
    public static void main(String[] args) {
       int[] a={1,13,2,5,7,12,4,6};
       int[] b={5,5,3,8,-2,7};
       int[] ans=NGR(a);
//        for (int i = 0; i < a.length; i++) System.out.println("Next greater for "+a[i]+" is "+ ans[i]);

//        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(NGRAlt(b)));
    }

    private static int[] NGR(int[] a) { //O(n) since while loop rarely runs
        Stack<Integer> st = new Stack<>();
        int[] ans=new int[a.length];
        ans[a.length-1]=-1;
        st.push(a[a.length-1]);
        for (int i = a.length-2; i >=0; i--) {
            while(st.size()>0&&st.peek()<a[i]){
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
     //Aliter:
     private static int[] NGRAlt(int[] a) { //O(n) since while loop rarely runs
        int n=a.length;
        Stack<Integer> st = new Stack<>();
        int[] ans=new int[n];
        st.push(0);
         for (int i = 1; i < n; i++) {
             while(st.size()>0&&a[i]>a[st.peek()]){
                 ans[st.peek()]=a[i];
                 st.pop();
             }
             st.push(i);
         }
         while(st.size()>0){
             ans[st.peek()]=-1;
             st.pop();
         }

        return ans;
     }
}
