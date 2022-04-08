package com.company.BinarySearch;

public class FindPeakInMountainArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,1,0};
        System.out.println(peak(a));
    }

    private static int peak(int[] a) {
        int s=0,e=a.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            //You're in the Descending part of the array...
            // but the answer might lie on the lhs...
            // though this might be a potential ans
            if(a[mid]>a[mid+1]){
                e=mid;
            }
            else s=mid+1;//Bcoz, we know that a[m+1]>a[m]
            // that's why we're ignoring a[m]
            }
        return s;//In the end ,s will be equal to end and
        // will be pointing to the largest number
        //Because start and end always strive to find the largest element...therefore, when they
        //point to a single element , it means that element is the largest.
    }
}
