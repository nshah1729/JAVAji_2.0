package com.company.PepCodingArrayListStrings;

import java.util.ArrayList;

public class RemovePrimesFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();

        a.add(12);a.add(21);a.add(122);a.add(42);
        a.add(3);a.add(5);a.add(45);a.add(29);

        System.out.println(a);
        ArrayList<Integer> ans=remPrimes(a);
        System.out.println(ans);
    }
/*The main idea is to run loop from behind so that on removing an element ,
 the indexing(after that element) also changes and we might not be able to
 check some elements...But, on running from behind we don't care even if the
 index changes(since we've already checked those elements*/
    private static ArrayList<Integer> remPrimes(ArrayList<Integer> a) {
        for (int i = a.size()-1; i >= 0; i--) {
            if(isPrime(a.get(i)))a.remove(i);
        }
        return a;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i*i <= n; i++) {
            if(n%i==0)return false;
        }
        return true;
    }
}
