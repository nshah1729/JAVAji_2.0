package com.company.HeapsHashMapPepCoding;

import java.util.HashMap;
import java.util.HashSet;

public class GetCommonElements1 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> m=new HashMap<>();

        int[] a={1,1,2,2,2,3,5};
        int[] b={1,1,1,2,2,4,5};
        setSoultion(a,b);
        System.out.println();
        mapSoultion(a,b);
    }
    public static void setSoultion(int[] a,int[] b){
        HashSet<Integer> set= new HashSet<>();
        HashSet<Integer> set2= new HashSet<>();
        for(int val:a)set.add(val);

        for (int val:b){
            if(set.contains(val)&&!set2.contains(val)){
                System.out.print(val+" ");
            }
            set2.add(val);
    }
  }

    public static void mapSoultion(int[] a,int[] b){
      HashMap<Integer,Integer> m=new HashMap<>();

        for(int val:a){
            if(m.containsKey(val)){
                int x=m.get(val);
                x+=1;
                m.put(val,x);
            }
            else{
                m.put(val,1);
            }
        }

        for(int val:b){
            if(m.containsKey(val)){
                System.out.print(val+" ");
                m.remove(val);
            }
        }
  }
}
