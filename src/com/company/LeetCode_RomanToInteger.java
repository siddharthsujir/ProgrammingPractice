package com.company;

public class LeetCode_RomanToInteger {

    public static int romanToInt(String s) {

        int output=0;
        int prev=Integer.MAX_VALUE;
        int diff=0;
        if(s.length()==1)
            return returnInteger(s.charAt(0));

        for(int i=0;i<s.length();i++)
        {
            int temp=returnInteger(s.charAt(i));
            if(prev<temp)
            {
                output=output-prev;
                temp=temp-prev;
                output=output+temp;
            }
            else
                output=output+temp;
            prev=temp;
        }
        return output;
    }

    public static int returnInteger(Character c)
    {
        switch (c)
        {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;

        }
    }
    public static void main(String[] args)
    {
        System.out.println(romanToInt("MCMXCIV"));
    }

}
