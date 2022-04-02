package com.company.Arrays;

public class WaveTraversal {
    public static void main(String[] args) {
        int[][] a={{1,2,3},
                {4,5,6},
                {7,8,9}
        };
        wave(a);
    }

    private static void wave(int[][] a) {
        for (int col = 0; col < a[0].length; col++) {
            boolean isEven=col%2==0;
            if(isEven){
                for (int row = 0; row < a.length; row++) {
                    System.out.println(a[row][col]);
                }
            }
            else{
                for (int row =  a.length-1; row >=0; row--) {
                    System.out.println(a[row][col]);
                }
            }
        }
    }

}
