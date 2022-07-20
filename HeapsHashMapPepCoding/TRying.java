package com.company.HeapsHashMapPepCoding;

import java.util.*;
public class TRying {
    public static void main(String[] args) {
int[] a={13, 9, 25, 1, 1 ,0, 22, 13, 22, 20, 3, 8, 11, 25, 10, 3, 15, 11, 19, 20, 2, 4, 25, 14 ,23, 14};
        System.out.println(duplicates(a));
    }
    public static ArrayList<Integer> duplicates(int arr[]) {
        // code here
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> ans=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        set.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            int x=arr[i];
            if(set.contains(x)&&ans.size()>0&&ans.get(ans.size()-1)!=x)ans.add(x);
            else set.add(x);
        }
        ArrayList<Integer> defans=new ArrayList<>();
        defans.add(-1);
        if(ans.size()==0)return defans;
        return ans;
    }
}
