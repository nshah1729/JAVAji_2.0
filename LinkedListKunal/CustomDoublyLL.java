package com.company.LinkedListKunal;

public class CustomDoublyLL {

    Node head;
    int size;

    public CustomDoublyLL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null) head.prev=node;
        head=node;
        size++;
    }
    public void insertLast(int val){
        if(head==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
        node.next=null;

        size++;
    }
    public void insertIndex(int val,int index){
        if(head==null|index==0){
            insertFirst(val);
            return;
        }
        if(index==size-1){
            insertLast(val);
            return;
        }
        Node node=new Node(val);
        Node temp=head;
        int k=0;
        while(k<index){
            temp=temp.next;
            k++;
        }
        Node tempNext=head;
        k=0;
        while(k<=index){
            tempNext=tempNext.next;
            k++;
        }
        temp.next=node;
        node.prev=temp;
        node.next=tempNext;
        tempNext.prev=node;

        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.print("END");
    }
    public void displayRev(){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.prev;
        }
        System.out.print("END");
    }

   private class Node{
       int val;
       Node next;
       Node prev;

       public Node(int val) {
           this.val = val;
       }

       public Node(int val, Node next, Node prev) {
           this.val = val;
           this.next = next;
           this.prev = prev;
       }
   }
}
