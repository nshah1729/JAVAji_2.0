package com.company.PepCodingArrayListStrings;

public class PalindromicSubStrings {
    public static void main(String[] args) {
        String s="abccbc";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String str=s.substring(i,j);
                if(checkPalindrome(str)) System.out.println(str);
            }
        }

    }
    private static boolean checkPalindrome(String str) {
        int s=0,e=str.length()-1;
        while(s<=e){
            if(str.charAt(s)==str.charAt(e)){
                s++;
                e--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
