package com.company.Arrays;

public class RotateMAtrixBy90 {
    public static void main(String[] args) {
        int[][] a={{1,2,3},
                   {4,5,6},
                   {7,8,9}
        };
        int[][] ans=rotate(a);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]+"\t");
            }
            System.out.println();
        }
    }

    private static int[][] rotate(int[][] a) {
       int[][] t= transpose(a);

        //Reversing Row-Wise:
        for (int i = 0; i < t.length; i++) {
            int s=0,e=t.length-1;
            while(s<=e){
                int temp=t[i][s];
                t[i][s]=t[i][e];
                t[i][e]=temp;
                s++;e--;
            }
        }
        return t;
    }

    private static int[][] transpose(int[][] a) {
        int[][] trans=new int[a.length][a[0].length];
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                trans[i][j]=a[j][i];
            }
        }
        return trans;
    }

}
