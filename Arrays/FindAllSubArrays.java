package com.company.Arrays;

public class FindAllSubArrays {
    public static void main(String[] args) {
        String[] a={"a","b","c"};
        sub(a);
    }

    private static void sub(String[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }

        }
    }
}
