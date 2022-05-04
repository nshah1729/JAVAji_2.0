package com.company.LinkedListKunal;

public class mainOfCustomLL {
    public static void main(String[] args) {
        CustomLL l=new CustomLL();
        l.addBeg(4);
        l.addBeg(2);
        l.addEnd(232);
        l.addEnd(13);
        l.addEnd(44);
        l.insert(121,2);

        l.display();
        System.out.println();
        l.insertRecursion(1729,3);
        l.display();

    }
}
