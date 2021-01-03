package com.company;

public class IB_LengthOfLastWord {

    public static void main(String[] args)
    {
        System.out.println(lengthOfLastWord("Hello World"));
    }

    public static int lengthOfLastWord(final String A) {

        int j=A.length()-1;
        String output="";
        if(j==0)
            return 1;
        if(j==-1)
            return 0;
        while(j>0)
        {
            if(A.charAt(j)==' ')
            {
                j--;
                continue;
            }


            int i=j;

            while(i>=0 && A.charAt(i)!=' ')
            {
                i--;
            }

            //output=output+A.substring(i,j+1);
            return j-i;
        }

        return 0;
    }
}
