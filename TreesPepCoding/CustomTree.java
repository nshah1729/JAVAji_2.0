package com.company.TreesPepCoding;

import java.util.*;

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
            Node child=node.children.get(i);
            if(child.children.size()==0){
                node.children.remove(child);
            }
        }
        for(Node child:node.children){
            removeLeaves(child);
        }
    }

    public static void linearize(Node node){
        for(Node child:node.children){
            linearize(child);
        }
        while(node.children.size()>1){
            Node lc=node.children.remove(node.children.size()-1);
            Node slc=node.children.get(node.children.size()-1);
            Node tail=getTail(slc);
            tail.children.add(lc);
        }
    }

    public static boolean find(Node node,int t){
        boolean ans=node.data==t;
        for (Node child: node.children){
            ans=ans||find(child,t);
        }
        return ans;
    }

    public static boolean findAliter(Node node,int t){
        if(node.data==t)return true;

        for (Node child: node.children){
            if(find(child,t))return true;
        }
        return false;
    }

    public static ArrayList<Integer> nodeToRootPath(Node node,int t){
        if(node.data==t){
            ArrayList<Integer> ans=new ArrayList<>();
            ans.add(node.data);
            return ans;
        }
        for (Node child: node.children){
            ArrayList<Integer> ptc=nodeToRootPath(child,t);
            if(ptc.size()>0){
                ptc.add(node.data);
                return ptc;
            }
        }
        return new ArrayList<>();

    }

    public static int LCA(Node node,int t1,int t2){
        ArrayList<Integer> l1=nodeToRootPath(node,t1);
        ArrayList<Integer> l2=nodeToRootPath(node,t2);
       int i=l1.size()-1;
       int j=l2.size()-1;
       while(i>=0&&j>=0&&l1.get(i)==l2.get(j)){
           i--;j--;
       }
       i++;j++;
        return l1.get(i);
    }

    public static int distanceBetweenNodes(Node node,int t1,int t2){
        ArrayList<Integer> l1=nodeToRootPath(node,t1);
        ArrayList<Integer> l2=nodeToRootPath(node,t2);
        int i=l1.size()-1;
        int j=l2.size()-1;
        while(i>=0&&j>=0&&l1.get(i)==l2.get(j)){
            i--;j--;
        }
        i++;j++;
        return i+j;
    }

    public static boolean similar(Node n1,Node n2){
        if(n1.children.size()!=n2.children.size())return false;
        for(int i=0;i<n1.children.size();i++){
            Node c1=n1.children.get(i);
            Node c2=n2.children.get(i);
            if(!similar(c1,c2))return false;
        }
        return true;
    }

    public static boolean mirror(Node n1,Node n2){
        if(n1.children.size()!=n2.children.size())return false;
        for(int i=0;i<n1.children.size();i++){
            Node c1=n1.children.get(i);
            Node c2=n2.children.get(n1.children.size()-i-1);
            if(!similar(c1,c2))return false;
        }
        return true;
    }

    private static Node getTail(Node node) {
        while(node.children.size()>0){
            node=node.children.get(0);
        }
        return node;
    }

    public static void main(String[] args) {
//        int[] a={10,20,40,-1,50,-1,-1,30,60,-1,70,-1,-1};
        int[] a={10,20,40,80,-1,90,-1,-1,50,-1,-1,30,60,-1,70,-1,-1};
        int[] b={10,20,40,50,-1,-1,30,60,-1,70,80,-1,90,-1,-1,-1};
//        int[] b={22,21,45,-1,10,-1,-1,0,630,-1,790,-1,-1};
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

        Stack<Node> s1=new Stack<>();
        Node root2 = null;
        for (int i = 0; i < b.length; i++) {
            if(b[i]==-1){
                s1.pop();
            }else{
                Node t=new Node(b[i]);
                if(s1.size()>0){
                    s1.peek().children.add(t);
                    s1.push(t);
                }
                else{
                    s1.push(t);
                    root2=t;
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
//        linearize(root);
//        display(root);
//        System.out.println(LCA(root,60,30));
//        System.out.println(distanceBetweenNodes(root,60,70));
//        System.out.println(similar(root,root2));
        System.out.println(mirror(root,root2));
    }
}
