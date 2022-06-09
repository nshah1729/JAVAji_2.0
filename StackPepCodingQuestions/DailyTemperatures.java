package com.company.StackPepCodingQuestions;

import java.util.Arrays;
import java.util.Stack;
/*Given an array of integers temperatures represents
the daily temperatures, return an array answer s.t
answer[i] is the number of days you have to wait after
the ith day to get a warmer temperature.
If there is no future day for which this
is possible, keep answer[i] == 0 instead.*/
public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temp={73,74,75,71,69,72,76,73};
        int[] ans=dailyTemperatures(temp);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] dailyTemperatures(int[] a) {
        int n=a.length;
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[n];
        ans[n-1]=0;
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0&&a[i]>=a[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                ans[i]=0;
            }
            else{
                ans[i]=st.peek()-i;
            }
            st.push(i);
        }
        return ans;
    }
}
