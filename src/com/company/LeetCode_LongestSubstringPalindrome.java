package com.company;

public class LeetCode_LongestSubstringPalindrome {

    public static String longestPalindrome(String srt) {


        String maxSubString="";

        for(int i=0;i<srt.length();i++)
        {
            for(int j=i+1;j<=srt.length();j++ )
            {
                String temp="";
                //System.out.println(srt.substring(i,j));
                temp=srt.substring(i,j);
                //System.out.println(temp+" " +isPalindrome(temp));
                if(temp.length()>maxSubString.length() && isPalindrome(temp))
                {
                    maxSubString=temp;
                }
            }
        }

        return maxSubString;
    }

    public static boolean isPalindrome(String str)
    {
        int i=0;
        int j=str.length()-1;
        if(str.length()==1)
            return true;
        else
        {
            while(i<j)
            {
                if(str.charAt(i)!=str.charAt(j))
                    return false;
                i++;
                j--;
            }

        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(longestPalindrome("babad"));;
    }
}
