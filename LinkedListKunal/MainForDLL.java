package com.company.LinkedListKunal;

public class MainForDLL {
    public static void main(String[] args) {
        CustomDoublyLL l=new CustomDoublyLL();
        l.insertFirst(12);
        l.insertFirst(11);
        l.insertFirst(232);
        l.insertFirst(1);
        l.insertLast(9);
        l.insertLast(10);
        l.display();
        System.out.println();
//        l.displayRev();
        System.out.println();
        l.insertIndex(1729,2);
        l.display();
    }

}
