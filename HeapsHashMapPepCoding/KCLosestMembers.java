package com.company.HeapsHashMapPepCoding;

import java.util.*;

public class KCLosestMembers {
    public static void main(String[] args) {
        int[] a={7,10,4,3,20,15};
        int k = 3;
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k-1; i++) q.add(a[i]);

        for (int i = k; i <a.length ; i++) {
            q.remove();
            q.add(a[i]);
        }
        System.out.println(q.remove());
    }
}
