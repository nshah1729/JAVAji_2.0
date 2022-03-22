package com.company.Sorting.CycleSort;
/*
Given an array nums containing n distinct numbers in the range [0, n],
 return the only number in the range that is missing from the array.
*/
class MissingNumber {

    public static void main(String[] args) {
        int[] a={3,0,1};
        System.out.println(missingNumber(a));
    }
        static int missingNumber(int[] a){
           int i=0;
           while(i< a.length){
               int correctIndex=a[i];
               if(a[i]<a.length&&a[i]!=a[correctIndex]){
                   swap(a,i,correctIndex);
               }else i++;
           }
           //checking missing element
            for (int j = 0; j < a.length; j++) {
                if(a[j]!=j)return j;
            }
            return a.length;
        }

    private static void swap(int[] a, int i, int correctIndex) {
        int temp=a[i];
        a[i]=a[correctIndex];
        a[correctIndex]=temp;
    }
}