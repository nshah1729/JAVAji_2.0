package com.company.BinaryTreePepcoding;

import java.lang.reflect.Parameter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class CustomClass {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data,Node left,Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    public static int size(Node node){
        if(node==null)return 0;
        return size(node.left)+size(node.right)+1;
    }
    public static int sum(Node node){
        if(node==null)return 0;
        return node.data+sum(node.left)+sum(node.right);
    }
    public static int max(Node node){
        if(node==null)return Integer.MIN_VALUE;
        return Math.max(node.data,Math.max(max(node.left),max(node.right)));
    }
    public static int height(Node node){
        if(node==null)return 0;//-1 for height in terms of edges
        return 1+Math.max(height(node.right),height(node.left));
    }
    public static void PreOrderTraversal(Node node){
        if(node==null)return;
        System.out.println(node.data);
        PreOrderTraversal(node.left);
        PreOrderTraversal(node.right);
    }
    public static void InOrderTraversal(Node node){
        if(node==null)return;

        InOrderTraversal(node.left);
        System.out.println(node.data);
        InOrderTraversal(node.right);
    }
    public static void iterativePrePostInOrder(Node node){
        Stack<Pair> s=new Stack<>();
        Pair p=new Pair(node,1);
        s.add(p);
        while (s.size()>0){
           Pair top=s.peek();
           if(top.state==1){//PRE:print,state++,left
               System.out.println("PRE "+top.node.data);
               top.state++;
               if(top.node.left!=null)s.add(new Pair(top.node.left,1));
           }else if(top.state==2){//IN:print,state++,right
               System.out.println("IN "+top.node.data);
               top.state++;
               if(top.node.right!=null)s.add(new Pair(top.node.right,1));
           }else{//POST:print,pop
               System.out.println(top.node.data+"POST ");
               s.pop();
           }
        }
    }
    public static void levelOrderTraversal(Node node){
        if(node==null)return;
        Queue<Node> pq=new ArrayDeque<>();

        pq.add(node);
        while(pq.size()>0){
            int count=pq.size();
            for (int i = 0; i < count; i++) {
                node=pq.remove();
                System.out.print(node.data+" ");
                if(node.left!=null)pq.add(node.left);
                if(node.right!=null)pq.add(node.right);
            }
            System.out.println();
        }

    }
    public static void PostOrderTraversal(Node node){
        if(node==null)return;
        PostOrderTraversal(node.left);
        PostOrderTraversal(node.right);
        System.out.println(node.data);
    }
    static ArrayList<Integer> path;
    public static boolean nodeToRootPath(Node node, int t){
       if(node==null)return false;
       if(node.data==t){
           path.add(node.data);
           return true;
       }
           boolean firc=nodeToRootPath(node.left,t);
           if(firc){
               path.add(node.data);
               return true;
           }
           boolean filc=nodeToRootPath(node.right,t);
           if(filc){
               path.add(node.data);
               return true;
           }
           return false;

    }
    public static void display(Node node){
        if(node==null)return;
        String s="";
        s+=node.left==null?".":node.left.data;
        s+="->"+node.data+"<-";
        s+=node.right==null?".":node.right.data;
        System.out.println(s);
        display(node.left);
        display(node.right);
    }
    public static void printKLevelsDown(Node node,int k){
        if(k<0&&node==null)return;
        if(k==0){
            System.out.print(node.data+" ");
        }
        printKLevelsDown(node.left,k-1);
        printKLevelsDown(node.right,k-1);
    }
    public static void pathLeafFromRoot(Node node,String path,int sum,int s,int e){
        if(node.left==null&&node.right==null){
            path+=" "+node.data;
            sum+=node.data;
            if(sum>s&&sum<e){
                System.out.println(path);
            }
            return;
        }
        if (node.left!=null)pathLeafFromRoot(node.left,path+" "+node.data,sum+node.data,s,e);
        if (node.right!=null)pathLeafFromRoot(node.right,path+" "+node.data,sum+node.data,s,e);

    }
    public static class Pair{
        Node node;
        int state;
        Pair(Node node,int state){
            this.node=node;
            this.state=state;
        }
    }


    public static void main(String[] args) {
//        Integer[] a={50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        Integer[] a={50,25,12,null,null,37,null,null,75,62,null,null,87,null,null};
        Node root=new Node(a[0],null,null);
        Pair rtp=new Pair(root,1);
        Stack<Pair> st=new Stack<>();

        st.push(rtp);
        int i=0;
        while (st.size()>0){
            Pair top=st.peek();
            if(top.state==1){
               i++;
               if(a[i]!=null){
                   top.node.left=new Node(a[i],null,null);
                   Pair leftPair=new Pair(top.node.left,1);
                   st.push(leftPair);
               }else{
                   top.node.left=null;
               }
                top.state++;

            }else if(top.state==2){
                i++;
                if(a[i]!=null){
                    top.node.right=new Node(a[i],null,null);
                    Pair rightPair=new Pair(top.node.right,1);
                    st.push(rightPair);

                }else{
                    top.node.right=null;
                }
                top.state++;
            }else{
                st.pop();
            }
        }

//        display(root);
//        System.out.println("Size: "+size(root));
//        System.out.println("Sum: "+sum(root));
//        System.out.println("Height: "+height(root));
//        System.out.println("Max: "+max(root));
//        PreOrderTraversal(root);
//        InOrderTraversal(root);
//        PostOrderTraversal(root);
//        levelOrderTraversal(root);
//        iterativePrePostInOrder(root);
//        path=new ArrayList<>();
//        System.out.println( nodeToRootPath(root,87));
//        System.out.println(path);
//        printKLevelsDown(root,2);
        pathLeafFromRoot(root,"",0,50,112);
    }

}
