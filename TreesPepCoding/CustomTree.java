package com.company.TreesPepCoding;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class CustomTree {

    static class Node{
        int data;
        Node(int data){
            this.data=data;
        }
        ArrayList<Node> children= new ArrayList<>();

    }

    public static void display(Node node){
        if(node==null){
            return;
        }
        String s=node.data+"->";
        for(Node child: node.children){
            s+=child.data+",";
        }
        System.out.println(s+'.');

        for(Node child: node.children){
            display(child);
        }
    }

    public static int size(Node node){
//        if(node==null)return 0;
        int s=0;
        for(Node child: node.children){
            s+=size(child);
        }
        s+=1;
        return s;
    }

    public static int maximum(Node node){
        int max= node.data;
        for (Node child: node.children){
            max=Math.max(max,maximum(child));
        }
        return max;
    }

    //Height in terms of edges:
    public static int height(Node node){
        int h= -1;
        for (Node child: node.children){
            h=Math.max(h,height(child));
        }
        h+=1;
        return h;
    }

    public static void traversal(Node node){
//        Area 1:
        System.out.println("Node Pre "+node.data);
        for (Node child:node.children){
            //Edge Pre Area
            System.out.println("Edge Pre "+node.data+"--"+child.data);

            traversal(child);

            System.out.println("Edge Post "+node.data+"--"+child.data);

            //Edge Post Area
        }
        System.out.println("Node Post "+node.data);
//        Area 2:

    }

    public static void levelOrdertraversal(Node node){
        Queue<Node> q=new ArrayDeque<>();
        q.add(node);
        while(!q.isEmpty()){
            node=q.remove();
            System.out.println(node.data+" ");
            for(Node child:node.children)q.add(child);
        }
    }

    public static void levelOrdertraversalLineWise(Node node){
        Queue<Node> mq=new ArrayDeque<>();
        Queue<Node> cq=new ArrayDeque<>();
        mq.add(node);
        while (!mq.isEmpty()){
            node=mq.remove();
            System.out.print(node.data+" ");
            for (Node child: node.children)cq.add(child);
            if(mq.isEmpty()){
                mq=cq;
                cq=new ArrayDeque<>();
                System.out.println( );
            }
        }
    }

    public static void levelOrdertraversalLineWiseZigZag(Node node){
        Stack<Node> ms=new Stack<>();
        Stack<Node> cs=new Stack<>();
        ms.push(node);
        while (ms.size()>0){
            node=ms.pop();
            System.out.print(node.data+" ");
            for (Node child: node.children)cs.push(child);
            if(ms.isEmpty()){
                ms=cs;
                cs=new Stack<>();
                System.out.println( );
            }
        }
    }

    public static void removeLeaves(Node node){
        for (int i = node.children.size()-1; i >=0; i--) {
            if()
        }
        for(Node child:node.children){
            removeLeaves(child);
        }
    }

    public static void main(String[] args) {
        int[] a={10,20,40,-1,50,-1,-1,30,60,-1,70,-1,-1};
//        int[] a={10};
        Stack<Node> s=new Stack<>();
        Node root = null;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==-1){
                s.pop();
            }else{
                Node t=new Node(a[i]);
                if(s.size()>0){
                    s.peek().children.add(t);
                    s.push(t);
                }
                else{
                    s.push(t);
                    root=t;
                }

            }
        }
        
//        display(root);
//        System.out.println("Size of the Tree is: "+size(root));
//        System.out.println("Maximum element is: "+maximum(root));
//        System.out.println("Height is: "+height(root));
//        traversal(root);
//        levelOrdertraversalLineWise(root);
//        levelOrdertraversalLineWiseZigZag(root);
        removeLeaves(root);
        display(root);
    }
}
