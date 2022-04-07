package com.company.Arrays;

import java.util.*;

public class LastStoneWeight {
    public static void main(String[] args) {
        int[] a={2,7,4,1,8,1};
        System.out.println(stone(a));
    }

    private static int stone(int[] a) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int val:a)list.add(val);
        while(list.size()>1){
            int l= list.size();
            Collections.sort(list);
            int res= list.get(l-1)-list.get(l-2);
            if(res==0) {
                list.remove(l-1);
                list.remove(l-2);
            }
            else {
                list.set(l-1,res);
                list.remove(l-2);
            }
        }
        if(list.isEmpty())return 0;
        return list.get(0);

    }
}
