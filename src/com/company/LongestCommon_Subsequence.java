package com.company;

public class LongestCommon_Subsequence {

    public static void main(String[] args)
    {
        longestCommonSubSequence("abc","bcd");
    }

    public static void longestCommonSubSequence(String s1,String s2)
    {
        int[][] matrix=new int[s2.length()+1][s1.length()+1];

        //System.out.println(matrix[0][0]);
        for(int i=1;i<=s2.length();i++)
        {
            for(int j=1;j<=s1.length();j++)
            {
                if(s2.charAt(i-1)==s1.charAt(j-1))
                    matrix[i][j]=matrix[i-1][j-1]+1;
                else
                    matrix[i][j]=Math.max(matrix[i-1][j],matrix[i][j-1]);

            }
        }

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        int i=s2.length();
        int j=s1.length();
        String s="";

        while(i >0 && j>0)
        {
            if(matrix[i-1][j]==matrix[i][j])
            {i--;}
            else if(matrix[i][j-1]==matrix[i][j])
            {
                j--;
            }
//            else if(matrix[i-1][j-1]==matrix[i][j])
//            {
//                i--;
//                j--;
//            }
            else
            {
                s=s1.charAt(i)+""+s;
                i--;
                j--;
            }


        }

        System.out.println(matrix[s2.length()][s1.length()]);
        System.out.println(s);
    }
}
