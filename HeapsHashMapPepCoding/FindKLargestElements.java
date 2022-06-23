package com.company.HeapsHashMapPepCoding;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKLargestElements {
    public static void main(String[] args) {
        int[] a={2,10,5,17,7,18,6,4};
        int k=3;
        solution(a,k);
        solutionAliter(a,k);
    }

    public static void solution(int[] a,int k){
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());

        for(int val:a)q.add(val); //O(nlogn)

        for (int i = 0; i < k; i++) {//O(klogn)
            System.out.print(q .peek()+" ");
            q.remove();
        }
        System.out.println();
    }

    public static void solutionAliter(int[] a,int k){
        PriorityQueue<Integer> q=new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            q.add(a[i]);
        }
        for (int i = k; i <a.length ; i++) {
            if(q.peek()<a[i]){
                q.remove();
                q.add(a[i]);
            }
        }
        for (int val:q){
            System.out.print(val+" ");
        }

    }
}
