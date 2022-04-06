package com.company.NumberTheory;

public class AddDigitsTillISingleDigit {
    public static void main(String[] args) {
        int n=38;
        System.out.println(add(n));
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

//    private static int addRecursion(int n) {
//        //Base Case:
//        if(n<9)return return n;
//        return
//    }
}
