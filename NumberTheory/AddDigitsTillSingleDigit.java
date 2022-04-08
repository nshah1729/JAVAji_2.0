package com.company.NumberTheory;

public class AddDigitsTillSingleDigit {
    public static void main(String[] args) {
        int n=38;
//        System.out.println(add(n));
        System.out.println(addRecursion(38));
    }

    private static int add(int n) {
        int sum=0;
        while(n>9){
            while(n!=0){
                sum+=n%10;
                n/=10;
            }
            n=sum;
            sum=0;
        }
        return n;
    }


    private static int addRecursion(int n) {
        //Base Case:
        if(n<10)return n;

        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return addRecursion(sum);
    }
}