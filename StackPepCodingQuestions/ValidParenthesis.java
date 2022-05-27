package com.company.StackPepCodingQuestions;

import java.util.Scanner;
import java.util.Stack;

//False means not balanced
//True means balanced
public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the line: ");
        String str = sc.nextLine();
        System.out.println(check(str));
    }

    private static boolean check(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[') s.push(c);

            else if (c == ')'){
                if(s.size()==0)return false;
                else if(s.peek()=='(')s.pop();
            }
            else if (c == '}'){
                if(s.size()==0)return false;
                else if(s.peek()=='{')s.pop(); 
            }
            else if (c == ']'){
                if(s.size()==0)return false;
                else if(s.peek()=='[')s.pop();
            }

        }
         if(s.size()>0)return false;
        return true;

    }
}
