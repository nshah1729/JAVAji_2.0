package com.company.Assignments.Recursion;

public class TryingRecursion {
    public static void main(String[] args) {
//        pdi(5);
//        System.out.println(fac(10));
//        System.out.println(powerLog(2,3));
//        zigzag(2);
//        toh(3,1,2,3);
        int[] a={1,2,3,4};
//        printReverse(a, a.length-1);
        System.out.println(max(a,0));
    }

    private static int max(int[] a,int idx){
        if(idx==a.length-1)return a[a.length-1];
        return Math.max(a[idx], max(a, idx + 1));
    }

    private static void toh(int n,int a,int b,int c){
        if(n==0)return;
        toh(n-1,a,c,b);
        System.out.println(n+"["+a+"-->"+b+"]");
        toh(n-1,c,b,a);
    }

    private static void zigzag(int n){
        if(n==0)return;
        System.out.println("Pre"+n);
        zigzag(n-1);
        System.out.println("In"+n);
        zigzag(n-1);
        System.out.println("Post"+n);
    }

    private static int powerLog(int x, int n) {

        if (n==0)return 1;

        int xnby2=power(x,n/2);
        int xpn=xnby2*xnby2;
        if(n%2==1)xpn*=x;
        return xpn;
    }

    private static int power(int x, int n) {
        if(x==1)return 1;
        if (n==0)return 1;
        return x*power(x,n-1);
    }

    private static int fac(int n) {
        if(n==0)return 1;
        return n*fac(n-1);
    }

    private static void pdi(int n) {

        //Base Case:
        if(n==0)return;

        //Operations to be performed:
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }

    private static void printReverse(int[] a,int i){
        if(i==-1)return;
        System.out.print(a[i]+" ");
        printReverse(a,i-1);
    }
}
