package com.company.BinarySearch;

public class CheckIfDoubleExists {
    public static void main(String[] args) {
        int[] a={-2,0,10,-19,4,6,-8};
        System.out.println(checkIfExist(a));
    }
    public static boolean checkIfExist(int[] a) {
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[j]==2*a[i])return true;
            }
        }
        return false;
    }
}

