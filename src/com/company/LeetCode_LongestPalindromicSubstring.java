package com.company;

public class LeetCode_LongestPalindromicSubstring {


    public static String allSubStrings(String srt) {
        int len = srt.length();
        int maxLength=0;
        String maxSubString="";

        for (int i = 0; i < len; i++)
        {
            for(int j=i+1;j<=len;j++)
            {

                String subStr=srt.substring(i,j);
             //   System.out.println(subStr);
                if(isPalindrome(subStr))
                {
                    if(subStr.length()>maxLength)
                    {
                        maxLength=subStr.length();
                        maxSubString=subStr;
                    }

                }
            }
        }

        return maxSubString;
    }

    public static boolean isPalindrome(String str)
    {
        int j=str.length()-1;
        int i=0;

        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args)
    {

        //System.out.println(isPalindrome("bab"));
        System.out.println(allSubStrings("babad"));
    }
}
