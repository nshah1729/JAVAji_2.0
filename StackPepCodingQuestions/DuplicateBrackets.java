package com.company.StackPepCodingQuestions;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.print("Enter the line: ");
            String str = sc.nextLine();
            System.out.println(check(str));
    }

    private static boolean check(String str) {
        Stack<Character> s=new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(c==')'){
                if(s.peek()=='(')return true;
                else{
                    while(s.peek()!='(')s.pop();
                    s.pop();
                }
            }
            else{
                s.push(c);
            }
        }
        return false;
    }
}
