package com.company.StackPepCodingQuestions;

import java.util.Arrays;
import java.util.Stack;

public class LargestAreaHistogram {
    public static void main(String[] args) {
        int[] a={2,1,5,6,2,3};
        System.out.println(maxArea(a));
        System.out.println(Arrays.toString(SmallestToLeft(a)));
        System.out.println(Arrays.toString(SmallestToRight(a)));
    }

    private static int maxArea(int[] a) {

        //Storing the index of the next Smallest element on the right
        int[] rb=SmallestToRight(a);
        //Storing the index of the next Smallest element on the left
        int[] lb=SmallestToLeft(a);

        int maxArea=0;

        for (int i = 0; i < a.length; i++) {
            maxArea=Math.max(maxArea,a[i]*(rb[i]-lb[i]-1));
        }
        return maxArea;
    }

    private static int[] SmallestToLeft(int[] a) {
        int n=a.length;
        int[] lb=new int[n];
        Stack<Integer> str=new Stack<>();
        str.push(0);
        lb[0]=-1;
        for (int i = 1; i < n; i++) {
            while(str.size()>0&&a[i]<=a[str.peek()]){
                str.pop();
            }
            if(str.size()==0)lb[i]=-1;
            else lb[i]= str.peek();
            str.push(i);
        }
        return lb;
    }

    private static int[] SmallestToRight(int[] a) {
        int n=a.length;
        int[] rb=new int[n];
        Stack<Integer> str=new Stack<>();
        str.push(n-1);
        rb[n-1]=n;
        for (int i = n-2; i >=0; i--) {
            while(str.size()>0&&a[i]<= a[str.peek()]){
                str.pop();
            }
            if(str.size()==0)rb[i]=n;
            else rb[i]= str.peek();
            str.push(i);
        }
        return rb;
    }
}
