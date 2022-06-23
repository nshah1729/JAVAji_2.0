package com.company.HeapsHashMapPepCoding;

import java.util.HashMap;

public class GetCommonElements2 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> m=new HashMap<>();

        int[] a={1,1,2,2,2,3,5};
        int[] b={1,1,1,2,2,4,5};
        System.out.println();

        mapSoultion(a,b);
    }

    private static void mapSoultion(int[] a, int[] b) {
        HashMap<Integer,Integer> m= new HashMap<>();

        for(int val:a){
            if(m.containsKey(val)){
                int x=m.get(val);
                int newx=x+1;
                m.put(val,newx);
            }else{
                m.put(val,1);
            }
        }

        for(int val:b){
            if(m.containsKey(val)&&m.get(val)>0){
                System.out.print(val+" ");
                int x=m.get(val);
                int xNew=x-1;
                m.put(val,xNew);
            }
        }
    }
}
