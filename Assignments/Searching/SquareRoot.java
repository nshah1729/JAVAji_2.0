package com.company.Assignments.Searching;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(square(2147395599));
    }

    private static double square(int n) {
        int sr=-1;
          if(n<4)return 1;
          int s=0,e=n/2;
          while(s<=e){
              int m=s+(e-s)/2;
              int msq=m*m;
              if(msq>n)e=m-1;
              else if(msq<=n){
                  sr=m;
                  s=m+1;
              }
          }
        return (int)sr;
    }
}
