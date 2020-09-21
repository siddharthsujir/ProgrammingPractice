package com.company;

public class LongestCommonSubString {

    public static void main(String[] args)
    {
       longestCommonSubstring("abcdaf","zbcdf");
    }

    public static void longestCommonSubstring(String s1, String s2)
    {
        int[][] matrix=new int[s1.length()+1][s2.length()+1];
        int max=Integer.MIN_VALUE;
        int max_i=0;
        int max_j=0;
        for(int i=1;i<=s1.length();i++)
        {
            for(int j=1;j<=s2.length();j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    matrix[i][j]=matrix[i-1][j-1]+1;
                    if(max<matrix[i][j])
                    {
                        max=matrix[i][j];
                        max_i=i;
                        max_j=j;
                    }
                }

            }
        }

        System.out.println(max);
    }
}
