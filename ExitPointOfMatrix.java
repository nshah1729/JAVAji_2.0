package com.company;

import java.util.Scanner;

public class ExitPointOfMatrix {
    public static void main(String[] args) {
            int[][] a= {{0,0,1,0},
                        {1,0,0,1},
                        {0,0,0,1},
                        {1,0,1,0}};
            int dir=0,i=0,j=0;
            while(i<a.length&&j<a.length){
                dir=(dir+a[i][j])%4;
                if(dir==0){
                    j++;
                }else if(dir==1){
                    i++;
                }else if(dir==2){
                    j--;
                }else{
                    i--;
                }
                if(i==a.length){
                    i--;
                    break;
                }else if(j==a.length){
                    j--;
                    break;
                }else if(i==-1){
                    i++;
                    break;
                }else if(j==-1){
                    j++;
                    break;
                }
            }
        System.out.println(i+" "+j);
    }
}
