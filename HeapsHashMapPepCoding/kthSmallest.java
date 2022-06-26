package com.company.HeapsHashMapPepCoding;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthSmallest {
    public static void main(String[] args) {
        int[] a={7,10,4,3,20,15};
        int k = 3;
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < a.length; i++) {
            q.add(a[i]);
            if(q.size()>k)q.remove();
        }
        System.out.println(q.remove());
    }
}
