package com.company.StackPepCodingQuestions;

import java.util.Stack;

public class nnn {
    public static void main(String[] args) {
        String s="[(a + b) + {(c + d) * (e / f)}] ";
        String s1="[(a + b) + {(c + d) * (e / f)]} ";
        String s2="[(a + b) + {(c + d) * (e / f)} ";
        String s3="([(a + b) + {(c + d) * (e / f)}]";
        System.out.println(find(s));
        System.out.println(find(s1));
        System.out.println(find(s2));
        System.out.println(find(s3));
        System.out.println(find("]"));
    }

    private static boolean find(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
                if(c==')'){
                    if(st.size()==0)return false;
                    else if(st.peek()!='(')return false;
                    else st.pop();
            }else if(c=='}'){
                    if(st.size()==0)return false;
                    else if(st.peek()!='{')return false;
                    else st.pop();
                }else if(c==']'){
                    if(st.size()==0)return false;
                    else if(st.peek()!='[')return false;
                    else st.pop();
                }
           else if(c=='('||c=='{'||c=='['){
               st.push(c);
           }
        }
        return st.size() == 0;
    }
}
