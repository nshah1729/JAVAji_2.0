package com.company.HeapsHashMapPepCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Revision {
    public static void main(String[] args) {

        String s="abracadabra";
        maxFC(s);
        System.out.println("==============================");
        int[] a={1,1,2,2,2,3,5};
        int[] b={1,1,1,2,2,4,5};
        getCommonElements1(a,b);
        System.out.println("\n==============================");
        getCommonElements2(a,b);
        System.out.println("\n==============================");
        int[] c={2,3,5,1,77,4,21};
        int k=5;
        kLargestElementsInArray(c,k);
        System.out.println("\n==============================");
        System.out.println( maxProduct(a));

    }

    public static void maxFC(String s){
        HashMap<Character,Integer> m=new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(!m.containsKey(c))m.put(c,1);
            else{
                int x=m.get(c);
                int nx=x+1;
                m.put(c,nx);
            }
        }
        char maxfc=s.charAt(0);
        for (char c:m.keySet()){
            if(m.get(c)>m.get(maxfc))maxfc=c;
        }

        System.out.println("Max Frequncy of "+maxfc+" is "+m.get(maxfc));
    }

    public static void getCommonElements1(int[] a,int[] b){
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int val:a){
            if(!m.containsKey(val))m.put(val,1);
            else{
                int f=m.get(val);
                int newf=f+1;
                m.put(val,newf);
            }
        }

        for(int val:b){
            if(m.containsKey(val)){
                System.out.print(val+" ");
                m.remove(val);
            }
        }
    }

    public static void getCommonElements2(int[] a,int[] b){
        HashMap<Integer,Integer> m=new HashMap<>();

        for(int val:a){
            if(!m.containsKey(val))m.put(val,1);
            else{
                int f=m.get(val);
                int newf=f+1;
                m.put(val,newf);
            }
        }

        for (int val:b){
            if(m.containsKey(val)&&m.get(val)>0){
                System.out.print(val+" ");
                int f=m.get(val);
                int newf=f-1;
                m.put(val,newf);
            }
        }
    }

    public static void kLargestElementsInArray(int[] a,int k){
        PriorityQueue<Integer> q= new PriorityQueue<>(Collections.reverseOrder());

        for(int x:a)q.add(x);
        for (int i = 0; i < k; i++) {
            System.out.print(q.remove()+" ");
        }
    }

/*
Given the array of integers a,
you will choose two different indices i and j of that array.
Return the maximum value of (a[i]-1)*(a[j]-1).
*/
    public static int maxProduct(int[] a){
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:a)q.add(x);
       int p=q.remove()-1;
       p*=q.remove()-1;
        return p;
    }

    public static int findKthLargest(int[] a, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:a)q.add(x);
        for(int i=0;i<k-1;i++)q.remove();
        return q.remove();
    }
}
