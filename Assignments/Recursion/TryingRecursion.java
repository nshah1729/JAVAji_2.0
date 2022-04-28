package com.company.Assignments.Recursion;

public class TryingRecursion {
    public static void main(String[] args) {
//        pdi(5);
//        System.out.println(fac(10));
//        zigzag(2);
//        toh(3,1,2,3);
        int[] a={1,4,2,3,4,3,4,1};
//        printReverse(a, a.length-1);
//        System.out.println(max(a,0));
//        System.out.println(min(a,0));
//        System.out.println(firstIndex(a,0,4));
//        System.out.println(firstIndexAliter(a,0,4));
//        System.out.println(LastIndex(a,a.length-1,4));
//        System.out.println(LastIndexAliter(a,a.length-1,4));
//        AllIndices(a,0,4);
//        System.out.println(AllIndices(a,a.length-1,4));
    }

    private static int max(int[] a,int idx){
        if(idx==a.length-1)return a[a.length-1];
        return Math.max(a[idx], max(a, idx + 1));
    }

    private static int min(int[] a,int idx){
        if(idx==a.length-1)return a[a.length-1];
        return Math.min(a[idx], min(a, idx + 1));
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

    private static int firstIndex(int[] a,int idx,int target){
        if(idx==a.length-1)return idx;
        int first=-1;
        if(a[idx]==target)first=idx;
        else first=firstIndex(a,idx+1,target);
        return first;
    }

    private static int firstIndexAliter(int[] a,int idx,int target){
        if(idx==a.length)return -1;
        if(a[idx]==target)return idx;
        else return firstIndexAliter(a,idx+1,target);

    }

    private static int LastIndex(int[] a,int idx,int target){
        if(idx==0)return a[idx];
            int last=-1;
            if(a[idx]==target)last=idx;
            else last=LastIndex(a,idx-1,target);
            return last;
    }

    private static int LastIndexAliter(int[] a,int idx,int target){
        if(idx==-1)return -1;
            int last=-1;
            if(a[idx]==target)return idx;
            else return LastIndexAliter(a,idx-1,target);
    }

    private static void AllIndices(int[] a,int idx,int target){
        if(idx==a.length)return;

       if(a[idx]==target) System.out.println(idx);
        AllIndices(a,idx+1,target);
    }

}
