package com.company.LinkedListKunal;

public class CustomLL {

    private Node head;
    private Node tail;

    private int size;
    public CustomLL(){
        this.size=0;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"-> ");
            temp=temp.next;
        }
        System.out.print("END");
    }
    public void addBeg(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null)tail=head;
        size++;
    }
    public void insert(int val,int index){
        if(index==0){
            addBeg(val);
            return;
        }
        if(index==size){
            addEnd(val);
            return;
        }

        Node temp=head;
        int k=0;
        while(k<index){
            temp=temp.next;
            k++;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }
    public void addEnd(int val){
    if(tail==null){
        addBeg(val);
        return;
    }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public int delFirst(){
        int val=head.val;
        head=head.next;
        if(head==null)tail=null;
        size--;
        return val;
    }
    public void delLast(){
        Node temp=head;
        while(temp.next!=tail){
            temp=temp.next;
        }
        tail=temp;
        temp.next=null;
        size--;
    }
    public void deleteIndex(int index){
        Node prev=head;
        Node nexxt=head;
        int k=0;
        while(k<index-1){
            prev=prev.next;
            k++;
        }
        k=0;
        while(k<=index){
            nexxt=nexxt.next;
            k++;
        }
        prev.next=nexxt;
    }

    private class Node{
       private int val;
       private Node next;


        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
