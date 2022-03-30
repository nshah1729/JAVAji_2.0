package com.company.BinarySearch;

/*https://leetcode.com/problems/find-smallest-letter-greater-than-target

Given a characters array letters that is sorted in non-decreasing order and a character target,
return the smallest character in the array that is larger than target.
Note that the letters wrap around.
For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.*/

import java.util.HashSet;
import java.util.Scanner;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] letters={'a','b','f','h'};
        char c='a';
//        System.out.println(small_1(letters,c));
        System.out.println(small(letters,c));

    }
    //Method 1:
    private static char small(char[] letters, char c) {
        int s=0,e=letters.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(letters[m]>c)e=m-1;
            else s=m+1;
        }
        return letters[s % letters.length];
    }
    //Method 2:
    private static char small_1(char[] letters, char c) {
        int s=0,e=letters.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(letters[m]>c)e=m-1;
            else s=m+1;
            if(s==letters.length)return letters[0];
        }
        return letters[s];
    }
}
