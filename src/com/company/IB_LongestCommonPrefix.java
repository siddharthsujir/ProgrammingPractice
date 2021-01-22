package com.company;

import java.util.Arrays;

public class IB_LongestCommonPrefix {

    public static void main(String[] args) {
        String[] str={"aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"};
        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] str)
    {
        String output="";
        if(str.length==1)
            return str[0];

        for(int i=0;i<str.length-1;i++)
        {
            String s=str[i];
            String s2=str[i+1];
            int j=0,k=0;
            String temp="";
            while (j<s.length() && k<s2.length())
            {
                if(s.charAt(j)==s2.charAt(k))
                    temp=temp+s.charAt(j);
                else
                    break;

                j++;
                k++;
            }

            if(temp.length()>output.length() && temp.length()>=1)
                output=temp;
            else
            {
                if(temp.length()==0)
                    output="";
                break;
            }
        }
        return output;
    }
}
