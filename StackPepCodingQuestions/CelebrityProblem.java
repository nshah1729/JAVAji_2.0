package com.company.StackPepCodingQuestions;

import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) {
        int[][] a= {{0,0,0,0},
                    {1,0,1,1},
                    {1,1,0,1},
                    {1,1,1,0}};
        System.out.println(celeb(a));
    }
    private static String celeb(int[][] a) {
        String celeb="";
        Stack<Integer> s=new Stack<>();
        for (int i = 0; i <= 3; i++)s.push(i);
        while(s.size()>=2){
            int i=s.pop();
            int j=s.pop();
            if(a[i][j]==1)s.push(j);//It means that i knows j ∴ i!=celeb
            
            else if(a[j][i]==1)s.push(i);//It means that j knows i ∴ j!=celeb
            
        }//Only 1 person will remain for contender to be a celebrity
        for (int i = 0; i <a.length ; i++) {
            if(a[s.peek()][i]==1){
                celeb="none";
                break;
            }
        }
        if(celeb.equals(""))celeb= String.valueOf(s.peek());
        return celeb;
    }
}
