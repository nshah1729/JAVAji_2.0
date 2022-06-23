package com.company.HeapsHashMapPepCoding;

import java.util.HashMap;

public class MaximumFrequencyCharacter {
    public static void main(String[] args) {
        String s="abracadabra";
        HashMap<Character,Integer> m=new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(m.containsKey(c)){
                int val=m.get(c);
                int newVal=val+1;
                m.put(c,newVal);
            }else {
                m.put(c,1);
            }
        }

        char mfc=s.charAt(0);
        for(char c:m.keySet()){
            if(m.get(c)>m.get(mfc)){
                mfc=c;
            }
        }
        System.out.println(mfc+" : "+m.get(mfc));
    }
}
