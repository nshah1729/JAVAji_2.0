package com.company.HeapsHashMapPepCoding;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class SortNearlyKSortedArray {
    public static void main(String[] args) {
        int[] a={6,5,3,2,8,10,9};
        int k = 3;
        PriorityQueue<Integer> q=new PriorityQueue<>();

        ArrayList<Integer> ans=sortt(a,k);
        System.out.println(ans);
    }

    private static ArrayList<Integer> sortt(int[] a, int k) {
        ArrayList<Integer> ans=new ArrayList<>();
        PriorityQueue<Integer> q=new PriorityQueue<>();

        for (int i = 0; i <=k; i++) q.add(a[i]);

        for (int i = k+1; i <a.length ; i++) {
            ans.add(q.remove());
            q.add(a[i]);
        }
        while(q.size()>0)ans.add(q.remove());

        return ans;
    }
}
