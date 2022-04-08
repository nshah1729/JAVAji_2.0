package com.company.Arrays;

import java.util.Arrays;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int[] a={869,758,27,589,391,49,169,138,199,111,308,126,489,667,957,278,848,629,570,368,320,413,213,835,996,225,838,826,290,970,480,64,274,756,763,928,844,32,172,828,270,763,607,907,677,544,195,699,589,677,577,847,993,290,993,495,846,887,763,627,287,534,92,965,172,423};
        System.out.println(stock_BruteForce(a));
        System.out.println((stock(a)));
    }

    private static int stock_BruteForce(int[] a) {
        int max_Profit=Integer.MIN_VALUE;
        for (int buy = 0; buy < a.length-1; buy++) {
            for (int sell = buy+1; sell < a.length; sell++) {
                if((a[sell]-a[buy])>max_Profit)max_Profit=a[sell]-a[buy];
            }
        }
        return max_Profit;
    }
    ////////////////////////////
    //Optimised Solution:O(N)//
   ///////////////////////////
    private static int stock(int[] a) {
        int leastSoFar=Integer.MAX_VALUE;
        int profitIfSoldToday=0;
        int overallMaxProfit=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<leastSoFar)leastSoFar=a[i];
            profitIfSoldToday=a[i]-leastSoFar;
            if(profitIfSoldToday>overallMaxProfit)overallMaxProfit=profitIfSoldToday;
        }
        return overallMaxProfit;
    }
}
