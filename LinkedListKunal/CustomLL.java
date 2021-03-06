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
    public void insertRecursion(int val,int index){
        Node n=head;
        n=n.next;
        if(index==06){
            Node node=new Node(val);
            node.next=n.next;
            n.next=node;
            return;
        }
        insertRecursion(val,index-1);
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
    public static CustomLL merge(CustomLL first,CustomLL second){
        Node f=first.head;
        Node s=second.head;
        CustomLL ans=new CustomLL();
        while(f!=null&&s!=null){
            if(f.val>s.val){
                ans.addEnd(s.val);
                s=s.next;
            }else{
                ans.addEnd(f.val);
                f=f.next;
            }
        }
        while(f!=null){
            ans.addEnd(f.val);
            f=f.next;
        }
        while(s!=null){
            ans.addEnd(s.val);
            s=s.next;
        }
        return ans;
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
