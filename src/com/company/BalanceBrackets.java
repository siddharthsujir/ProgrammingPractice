package com.company;

import java.util.Stack;

public class BalanceBrackets {


    static String isBalanced(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i = 0 ;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
                stack.push(s.charAt(i));
            else if(s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']')
            {
                if(!stack.isEmpty())
                {
                    Character c= stack.pop();
                    if(c=='(' && s.charAt(i)!=')')
                        return "NO";
                    if(c=='{' && s.charAt(i)!='}')
                        return "NO";
                    if(c=='[' && s.charAt(i)!=']')
                        return "NO";
                }

            }

        }
        if(!stack.isEmpty())
            return "NO";

            return "YES";

    }

    public static void main(String[] args)
    {

        System.out.println(isBalanced("[](){()}"));

    }
}
