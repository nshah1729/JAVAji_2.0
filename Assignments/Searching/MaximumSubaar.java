package com.company.Assignments.Searching;

public class MaximumSubaar {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        printSub(a);
        System.out.println(sum(a));
        System.out.println(sumSlide(a));
    }

    public static void printSub(int[] a){
        int k=3;
        int max=Integer.MIN_VALUE;
        //Printing all subarray of size 3:
        for (int i = 0; i <a.length-k ; i++) {
            for (int j = i; j <i+k; j++) {
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
    }
    //Brute-Force:
    public static int sum(int[] a){
        int k=3;
        int max=Integer.MIN_VALUE;
        //Max Sum
        for (int i = 0; i <a.length-k ; i++) {
            int sum=0;
            for (int j = i; j <i+k; j++) sum+=a[j];
            if(sum>max)max=sum;
        }
        return max;
    }

    //Sliding Window:
    public static int sumSlide(int[] a){
        int i=0,j=0;
        int size=3;
        int max=Integer.MIN_VALUE;
        int sum=0;
        while(i<a.length-size){
            if(j-i+1<size) {
                sum+=a[i];
                j++;
            }
            if(j-i+1==size){
                sum-=a[i];
                j++;
                sum+=a[j];
                i++;
            }
            if(sum>max)max=sum;
        }
        return sum;
    }
}

