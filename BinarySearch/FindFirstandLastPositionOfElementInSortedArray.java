package com.company.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindFirstandLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={5,7,7,7,8,8,10};
        int target=10;
        System.out.println(Arrays.toString(firstLast(a,target)));

    }

    private static int[] firstLast(int[] a, int target) {
        int[] ans=new int[2];
        ans[0]=search(a,target,true);
        if(ans[0]!=-1)ans[1]=search(a,target,false);
      return ans;
    }

    private static int search(int[] a, int target, boolean findStartIndex) {
        int ans=-1;
        int s=0,e=a.length-1;
        while(s<=e) {
            int m = s + (e - s) / 2;
            if (a[m] < target) s = m + 1;
            else if (a[m] > target) e = m - 1;
            else {
                ans = m;
                if (findStartIndex) e = m - 1;
                else s = m + 1;
            }
        }
        return ans;
    }
}
