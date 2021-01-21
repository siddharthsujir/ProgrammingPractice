package com.company;

import java.util.Stack;

public class IB_MinimumParantheses {

    public static void main(String[] args) {
            System.out.println(countParantheses(")))))("));
    }

    public static int countParantheses(String s)
    {
        int count=0;
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                stack.push('(');
            else
            {
                if(stack.isEmpty())
                    stack.push(')');
                else
                {
                    if(stack.peek()=='(')
                        stack.pop();
                    else
                        stack.push(')');
                }

            }
        }

        count=stack.size();

        return count;
    }
}
