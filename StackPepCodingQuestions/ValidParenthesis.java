package com.company.StackPepCodingQuestions;

import java.util.*;

//False means not balanced
//True means balanced
public class ValidParenthesis {
    public static void main(String[] args) {
        String s3="([(a + b) + {(c + d) * (e / f)}]";
        System.out.println(check(s3));
        System.out.println(check("]"));
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
        return s.size() <= 0;

    }
}
