package com.company;

public class LeetCode_ReverseString {

    public static void reverseString(char[] s) {

        int last=s.length-1;
        int start=0;
        while(start<last)
        {
            char temp=s[start];
            s[start]=s[last];
            s[last]=temp;
            last--;
            start++;
        }

        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }

    }

    public static void main(String[] args)
    {
        char[] c={'h','e','l','l','o','o'};
        reverseString(c);
    }
}
