package com.company.StackQueueKunal;

public class Main {
    public static void main(String[] args) throws Exception {
        DynamicStack s = new DynamicStack(5);
        s.push(12);
        s.push(4);
        s.push(1);
        s.push(9);
        s.push(19);
        s.push(19);
        s.push(19);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
